pipeline {
    agent any 
    options 
        {
            ansiColor('xterm')
        }
    
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
                sh "docker build -t webapp:latest Docker/"
                sh "docker tag webapp:latest webapp:old" 
            }
        }

        stage('Test') 
        { 
            steps {
                sh "docker ps -a" 
            }
        }

        stage('Deploy') 
        { 
            steps {
                sh "docker run -d -p 3000:3000 webapp:latest" 
            }
        }
    }
}