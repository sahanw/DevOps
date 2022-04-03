pipeline {
    agent any 

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Create AWS EC2 Instance') {
            steps {
                sh '''
                pwd
                cp scripts/test.sh .
                cat test.sh
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
                sh "terraform plan"
            }
        }
    
        stage('Terraform Apply') {
            steps {
                input 'Apply Plan'
                sh "terraform apply -input=false terraform/AWS_PROV.tf -autoapprove"
            }
        }
        stage("Clean Workspace"){
            steps {
                cleanWs()
            }
        }
    }
}