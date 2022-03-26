pipeline {
    
    tools{
        jdk 'myjava'
        maven 'mymaven'
    }
    
    agent any
    
    stages{
        
        stage('CloneRepo')
        {
            steps{
            git 'https://github.com/Sonal0409/DevOpsClassCodes.git'
            }
        }
        
        stage('Review the code'){
            parallel{
            stage('Code Review'){
                steps{
                    sh 'mvn pmd:pmd'
                }
            }
            stage('Package'){
                steps{
                     sh 'mvn package'
                }
            }
            }
        }
    }
   
}
