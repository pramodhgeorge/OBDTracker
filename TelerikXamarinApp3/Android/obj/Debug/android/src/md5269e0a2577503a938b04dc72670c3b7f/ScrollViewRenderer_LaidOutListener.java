package md5269e0a2577503a938b04dc72670c3b7f;


public class ScrollViewRenderer_LaidOutListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.telerik.widget.primitives.panels.ScrollViewLaidOutListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLaidOut:()V:GetOnLaidOutHandler:Com.Telerik.Widget.Primitives.Panels.IScrollViewLaidOutListenerInvoker, Telerik.Xamarin.Android.Primitives\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.PrimitivesRenderer.Android.ScrollViewRenderer+LaidOutListener, Telerik.XamarinForms.Primitives, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", ScrollViewRenderer_LaidOutListener.class, __md_methods);
	}


	public ScrollViewRenderer_LaidOutListener ()
	{
		super ();
		if (getClass () == ScrollViewRenderer_LaidOutListener.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.PrimitivesRenderer.Android.ScrollViewRenderer+LaidOutListener, Telerik.XamarinForms.Primitives, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onLaidOut ()
	{
		n_onLaidOut ();
	}

	private native void n_onLaidOut ();

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
