node {
    stage('Checkout') {
        checkout scm
    }

        stage('Create AWS EC2 Instance') {
            sh '''
            sleep 10;
            pwd
            cp scripts/test.sh .
            cat test.sh
            aws ec2 describe-instances
            '''
            print "Hello World!\n"
            print "What is your name? "    
        }

        stage('Terraform Init') {
                sh "terraform init -input=false"
        }
    
        stage('Terraform Plan') {
                sh "terraform plan -out=tfplan -input=false -var-file='dev.tfvars'"
        }
    
        stage('Terraform Apply') {
                input 'Apply Plan'
                sh "terraform apply -input=false terraform/AWS_PROV.tf"
        }
            stage("Clean Workspace"){
            cleanWs()
        }
}