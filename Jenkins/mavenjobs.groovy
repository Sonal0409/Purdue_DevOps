job("maven-compile')
    {
      scm{
        git('https://github.com/Sonal0409/DevOpsClassCodes.git')
      }
      steps{
        maven('compile')
      }
      publishers{
        
        downstream('maven-test', 'SUCCESS')
      }
    }
    
    job("maven-test')
    {
      scm{
        git('https://github.com/Sonal0409/DevOpsClassCodes.git')
      }
      steps{
        maven('test')
      }
    
    }
