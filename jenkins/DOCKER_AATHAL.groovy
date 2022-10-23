pipeline {
    agent any 
    stages {
        stage('Checkout SCM') 
        {
            steps {
                checkout scm
            }
        }
        stage('Build') 
        { 
            steps {
                // 
            }
        }
        stage('Test') 
        { 
            steps {
                // 
            }
        }
        stage('Deploy') 
        { 
            steps {
                // 
            }
        }
    }
}