pipeline {
    agent any 
    
    stage('Checkout') {
        checkout scm
    }

        stage('Create AWS EC2 Instance') {
            sh '''
            pwd
            cp scripts/test.sh .
            cat test.sh
            aws ec2 describe-instances
            '''   
        }

        stage('Terraform Init') {
                sh '''
                cd terraform
                terraform init -input=false
                '''
        }
    
        stage('Terraform Plan') {
                sh "terraform plan"
        }
    
        stage('Terraform Apply') {
                input 'Apply Plan'
                sh "terraform apply -input=false terraform/AWS_PROV.tf -autoapprove"
        }
            stage("Clean Workspace"){
            cleanWs()
        }
}