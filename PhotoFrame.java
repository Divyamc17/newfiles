class PhotoFrame{

int size;
PhotoFrameMaterial material;
double price;
int warrenty;
String[] color;
String shape;

 PhotoFrame(int size,PhotoFrameMaterial material,double price,int warrenty)
 {
	this.size=size; 
	this.material=material; 
	this.price=price; 
	this.warrenty=warrenty; 
	 
 }
void setShape(String shape)
{
	this.shape=shape;
}
void setColor(String[] color)
{
    this.color=color;
}
void printData()
{
	System.out.println(this.size);
	System.out.println(this.material);
	System.out.println(this.price);
	System.out.println(this.warrenty);
	for (int jam=0;jam<this.color.length;jam++)
	{
		System.out.println(this.color[jam]);
	}
}
}