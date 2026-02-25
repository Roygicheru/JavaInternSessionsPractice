pipeline {
    agent any

    tools {
        // This MUST match the name you gave Java in 'Manage Jenkins > Tools'
        jdk 'java-25'
    }

    stages {
        stage('Build & Test Assignments') {
            // Jenkins will only run this if changes were made in your Assignments folder
            when {
                changeset "**/Assignments/**"
            }
            steps {
                echo 'Changes detected in Assignments. Running targeted tests...'

                // This tells Maven to only run tests for your BankAccount code
                sh 'mvn clean test -Dtest="io.github.roygicheru.Assignments.**"'
            }
        }
    }

    post {
        success {
            echo '✅ Success! HabitHarvest logic is verified.'
        }
        failure {
            echo '❌ Failure. Check the Console Output for Java errors.'
        }
    }
}