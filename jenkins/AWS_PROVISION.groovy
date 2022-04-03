pipeline {
    agent any 
    options {
        ansiColor('xterm')
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Create AWS EC2 Instance') {
            steps {
                sh '''
                aws ec2 describe-instances
                '''   
            }
        }

        stage('Terraform Init') {
            steps {
                sh '''
                cd terraform
                terraform init -input=false
                '''
            }
        }
    
        stage('Terraform Plan') {
            steps {
                sh '''
                pwd
                cd terraform
                terraform plan -out tfplan -var secgroupname="secgroup"
                '''
            }
        }
    
        stage('Terraform Apply') {
            steps {
                sh '''
                cd terraform
                terraform apply -auto-approve
                ls -l
                sleep 10
                aws s3 cp terraform.tfstate s3://tfst
                '''
            }
        }
        
        stage('Terraform Destroy') {
            steps {
                sh '''
                cd terraform
                terraform destroy -auto-approve
                '''
            }
        }
        stage("Clean Workspace"){
            steps {
                cleanWs()
            }
        }
    }
}