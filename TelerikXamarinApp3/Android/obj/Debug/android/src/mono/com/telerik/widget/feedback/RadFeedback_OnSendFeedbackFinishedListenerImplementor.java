package mono.com.telerik.widget.feedback;


public class RadFeedback_OnSendFeedbackFinishedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.telerik.widget.feedback.RadFeedback.OnSendFeedbackFinishedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_sendFeedbackFinished:()V:GetSendFeedbackFinishedHandler:Com.Telerik.Widget.Feedback.RadFeedback/IOnSendFeedbackFinishedListenerInvoker, Telerik.Xamarin.Android.Feedback\n" +
			"";
		mono.android.Runtime.register ("Com.Telerik.Widget.Feedback.RadFeedback+IOnSendFeedbackFinishedListenerImplementor, Telerik.Xamarin.Android.Feedback, Version=2018.1.405.0, Culture=neutral, PublicKeyToken=null", RadFeedback_OnSendFeedbackFinishedListenerImplementor.class, __md_methods);
	}


	public RadFeedback_OnSendFeedbackFinishedListenerImplementor ()
	{
		super ();
		if (getClass () == RadFeedback_OnSendFeedbackFinishedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Telerik.Widget.Feedback.RadFeedback+IOnSendFeedbackFinishedListenerImplementor, Telerik.Xamarin.Android.Feedback, Version=2018.1.405.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void sendFeedbackFinished ()
	{
		n_sendFeedbackFinished ();
	}

	private native void n_sendFeedbackFinished ();

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
