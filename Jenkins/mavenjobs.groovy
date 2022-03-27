job("CloneRepo")
    {
      scm{
        git('https://github.com/Sonal0409/DevOpsClassCodes.git')
      }
      
      publishers{ 
        downstream('maven-compile', 'SUCCESS')
      }
    }

mavenJob("maven-compile")
    {
 customWorkspace('/var/lib/jenkins/workspace/CloneRepo')
        mavenInstallation('Maven 3.8.5')
        goals('compile')
        
      publishers{
        
        downstream('maven-test', 'SUCCESS')
      }
    }
    
    mavenJob("maven-test")
    {
   customWorkspace('/var/lib/jenkins/workspace/CloneRepo')
        mavenInstallation('Maven 3.8.5')
       goals('test')
        
      publishers{
        
        downstream('maven-package', 'SUCCESS')
      }
    
    }

   mavenJob("maven-package")
    {
   customWorkspace('/var/lib/jenkins/workspace/CloneRepo')
        mavenInstallation('Maven 3.8.5')
       goals('package')
     
    }

