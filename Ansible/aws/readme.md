Provision an AWS EC2 instance using Ansible
To use AWS related module we will need to install and configure boto module of python which acts as an API(Application program interface) to access AWS. This has to be installed on the Ansible control machine.

On Redhat Linux

	$ sudo yum install -y python python-dev python-pip

On Ubuntu

	$ apt-get install -y python python-dev python-pip

Once the above is done, install boto

	$ sudo pip install boto boto3
Once the above is done we also have to provide AWS user credentials. You can export the AWS Access and Secret Key environment variables

export AWS_ACCESS_KEY_ID='AK123'
export AWS_SECRET_ACCESS_KEY='abc123'
Playbook we have will be used to

Create a security group
Create key pair and the PEM file
Create EC2 instance
Save the EC2 instance IP address to the ansible inventory file
