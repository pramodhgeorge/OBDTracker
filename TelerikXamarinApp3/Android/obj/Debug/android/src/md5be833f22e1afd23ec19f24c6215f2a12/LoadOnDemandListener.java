package md5be833f22e1afd23ec19f24c6215f2a12;


public class LoadOnDemandListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.telerik.widget.list.LoadOnDemandBehavior.LoadOnDemandListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLoadFinished:()V:GetOnLoadFinishedHandler:Com.Telerik.Widget.List.LoadOnDemandBehavior/ILoadOnDemandListenerInvoker, Telerik.Xamarin.Android.List\n" +
			"n_onLoadStarted:()V:GetOnLoadStartedHandler:Com.Telerik.Widget.List.LoadOnDemandBehavior/ILoadOnDemandListenerInvoker, Telerik.Xamarin.Android.List\n" +
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.DataControlsRenderer.Android.LoadOnDemandListener, Telerik.XamarinForms.DataControls, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", LoadOnDemandListener.class, __md_methods);
	}


	public LoadOnDemandListener ()
	{
		super ();
		if (getClass () == LoadOnDemandListener.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.DataControlsRenderer.Android.LoadOnDemandListener, Telerik.XamarinForms.DataControls, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onLoadFinished ()
	{
		n_onLoadFinished ();
	}

	private native void n_onLoadFinished ();


	public void onLoadStarted ()
	{
		n_onLoadStarted ();
	}

	private native void n_onLoadStarted ();

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
