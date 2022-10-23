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
                sh "docker build -t webapp:latest Docker/"
                sh "docker tag webapp:latest webapp:old" 
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