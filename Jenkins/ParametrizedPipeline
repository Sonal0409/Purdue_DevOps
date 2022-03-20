pipeline {
    
    agent any
    
    tools{
        jdk 'myjava'
        maven 'mymaven'
    }

    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
        text(name: 'BIOGRAPHY', defaultValue: 'jenkins documentation', description: 'Enter some information about the person')
 }
     
     
     stages{
         
         stage ('print Name'){
           
           steps{
             echo "Hello ${params.PERSON}"
           }  
              }
              
              stage('print text and Name')
              {
                  steps{
                      echo "Print Bio name: ${params.BIOGRAPHY}"
                      echo "Print name: ${params.PERSON}"
                  }
              }
         
     }
   
   
}
