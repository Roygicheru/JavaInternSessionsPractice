pipeline {
    agent any

    tools {
        jdk 'java-25'
        maven 'maven-latest'
    }

    stages {
        stage('Build & Test') {
            when { changeset "**/Assignments/**" }
            steps {
                sh 'mvn clean test -Dtest="io.github.roygicheru.Assignments.**"'
            }
        }
    }

    post {
        always {
            // This is the magic line!
            // It grabs the test results even if the build fails.
            junit '**/target/surefire-reports/*.xml'
        }
        success {
            echo '✅ Success! Logic verified.'
        }
    }
}