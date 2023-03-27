pipeline {
    agent none
    stages {
        stage('Hello World') {
            steps {
                echo "Hello, World!"
            }
        }
    }
}
