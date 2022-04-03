node {
    stage('Checkout') {
        checkout scm
    }

    stage('Try different branch') {
        sh '''
        pwd
        cp ../scripts/test.sh .
        cat test.sh
        '''
        print "Hello World!\n"
        print "What is your name? "
    }
}