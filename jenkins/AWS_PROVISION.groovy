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
                sh '''
                pwd
                cd terraform
                terraform plan -out tfplan
                '''
            }
        }
    
        stage('Terraform Apply') {
            steps {
                sh '''
                cd terraform
                terraform apply -auto-approve
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