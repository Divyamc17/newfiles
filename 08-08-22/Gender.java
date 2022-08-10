enum Gender
{
  FEMALE('F'),MALE('M'),OTHER('O');
  
  char acutalValue; 
  Gender (char acutalValue)
  {
	this.acutalValue=acutalValue;  
  }
}