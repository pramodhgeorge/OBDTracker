package md5ee27b3e651744e4767d6b2bd39fa00cc;


public class DataFormGroup
	extends com.telerik.widget.dataform.visualization.ExpandableEditorGroup
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_expandEditors:()V:GetExpandEditorsHandler\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.DataForm.DataFormGroup, Telerik.XamarinForms.Input, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", DataFormGroup.class, __md_methods);
	}


	public DataFormGroup (android.content.Context p0, java.lang.String p1)
	{
		super (p0, p1);
		if (getClass () == DataFormGroup.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataForm.DataFormGroup, Telerik.XamarinForms.Input, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1 });
	}


	public DataFormGroup (android.content.Context p0, java.lang.String p1, int p2, boolean p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == DataFormGroup.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataForm.DataFormGroup, Telerik.XamarinForms.Input, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Boolean, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public DataFormGroup (android.content.Context p0, java.lang.String p1, boolean p2)
	{
		super (p0, p1, p2);
		if (getClass () == DataFormGroup.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.DataForm.DataFormGroup, Telerik.XamarinForms.Input, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Boolean, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void expandEditors ()
	{
		n_expandEditors ();
	}

	private native void n_expandEditors ();

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
