package mono.com.telerik.widget.feedback;


public class RadFeedback_OnAuthorPromptConfirmedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.telerik.widget.feedback.RadFeedback.OnAuthorPromptConfirmedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAuthorPromptConfirmed:()V:GetOnAuthorPromptConfirmedHandler:Com.Telerik.Widget.Feedback.RadFeedback/IOnAuthorPromptConfirmedListenerInvoker, Telerik.Xamarin.Android.Feedback\n" +
			"";
		mono.android.Runtime.register ("Com.Telerik.Widget.Feedback.RadFeedback+IOnAuthorPromptConfirmedListenerImplementor, Telerik.Xamarin.Android.Feedback, Version=2018.1.405.0, Culture=neutral, PublicKeyToken=null", RadFeedback_OnAuthorPromptConfirmedListenerImplementor.class, __md_methods);
	}


	public RadFeedback_OnAuthorPromptConfirmedListenerImplementor ()
	{
		super ();
		if (getClass () == RadFeedback_OnAuthorPromptConfirmedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Telerik.Widget.Feedback.RadFeedback+IOnAuthorPromptConfirmedListenerImplementor, Telerik.Xamarin.Android.Feedback, Version=2018.1.405.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onAuthorPromptConfirmed ()
	{
		n_onAuthorPromptConfirmed ();
	}

	private native void n_onAuthorPromptConfirmed ();

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
