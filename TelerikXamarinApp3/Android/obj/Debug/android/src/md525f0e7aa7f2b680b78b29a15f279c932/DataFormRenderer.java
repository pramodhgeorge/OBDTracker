package md525f0e7aa7f2b680b78b29a15f279c932;


public class DataFormRenderer
	extends md5023acbff6cf2554d10c91d6bb3196d0e.AndroidRendererBase_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.DataFormRenderer, Telerik.XamarinForms.Input, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", DataFormRenderer.class, __md_methods);
	}


	public DataFormRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == DataFormRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataFormRenderer, Telerik.XamarinForms.Input, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public DataFormRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == DataFormRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataFormRenderer, Telerik.XamarinForms.Input, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public DataFormRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == DataFormRenderer.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataFormRenderer, Telerik.XamarinForms.Input, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
