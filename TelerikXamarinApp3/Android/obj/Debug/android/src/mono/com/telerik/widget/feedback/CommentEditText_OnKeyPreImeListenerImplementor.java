package mono.com.telerik.widget.feedback;


public class CommentEditText_OnKeyPreImeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.telerik.widget.feedback.CommentEditText.OnKeyPreImeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onKeyPreIme:(ILandroid/view/KeyEvent;)V:GetOnKeyPreIme_ILandroid_view_KeyEvent_Handler:Com.Telerik.Widget.Feedback.CommentEditText/IOnKeyPreImeListenerInvoker, Telerik.Xamarin.Android.Feedback\n" +
			"";
		mono.android.Runtime.register ("Com.Telerik.Widget.Feedback.CommentEditText+IOnKeyPreImeListenerImplementor, Telerik.Xamarin.Android.Feedback, Version=2018.1.405.0, Culture=neutral, PublicKeyToken=null", CommentEditText_OnKeyPreImeListenerImplementor.class, __md_methods);
	}


	public CommentEditText_OnKeyPreImeListenerImplementor ()
	{
		super ();
		if (getClass () == CommentEditText_OnKeyPreImeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Telerik.Widget.Feedback.CommentEditText+IOnKeyPreImeListenerImplementor, Telerik.Xamarin.Android.Feedback, Version=2018.1.405.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onKeyPreIme (int p0, android.view.KeyEvent p1)
	{
		n_onKeyPreIme (p0, p1);
	}

	private native void n_onKeyPreIme (int p0, android.view.KeyEvent p1);

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
