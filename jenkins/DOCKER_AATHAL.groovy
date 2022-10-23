pipeline {
    agent any 
    stages {
        // options 
        // {
        //     ansiColor('xterm')
        // }

        stage('Checkout SCM') 
        {
            steps {
                checkout scm
            }
        }

        stage('Build') 
        { 
            steps {
                sh "hostname" 
            }
        }

        stage('Test') 
        { 
            steps {
                sh "hostname" 
            }
        }

        stage('Deploy') 
        { 
            steps {
                sh "hostname" 
            }
        }
    }
}