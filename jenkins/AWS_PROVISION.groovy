node {
    stage('Checkout') {
        checkout scm
    }

    stage('Try different branch') {
        sh '''
        sleep 10;
        pwd
        cp scripts/test.sh .
        cat test.sh
        '''
        print "Hello World!\n"
        print "What is your name? "
    }

    stage("Clean Workspace"){
        cleanWs()
    }
}