pipeline {
    agent any 
    stages {
        options 
        {
            ansiColor('xterm')
        }

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