
public class ImageUtil 
{
	public static String getNewImageName()
	{
		return "PDF_" + Math.random()*1000000 + "_" + Math.random()*100000 + ".pdf";
	}
}
