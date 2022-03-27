
def url = 'https://github.com/Sonal0409/DevOpsCodeDemo.git'
for(i in 0..3)
{
  job('job-test-${i}')
{
  scm{
   git(url) 
  }
  steps{
   shell ('echo mutiplejobs') 
  }
  
}
