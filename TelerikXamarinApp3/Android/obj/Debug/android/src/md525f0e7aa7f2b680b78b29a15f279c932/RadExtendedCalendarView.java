package md525f0e7aa7f2b680b78b29a15f279c932;


public class RadExtendedCalendarView
	extends com.telerik.widget.calendar.RadCalendarView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Telerik.XamarinForms.InputRenderer.Android.RadExtendedCalendarView, Telerik.XamarinForms.Input, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", RadExtendedCalendarView.class, __md_methods);
	}


	public RadExtendedCalendarView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == RadExtendedCalendarView.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.RadExtendedCalendarView, Telerik.XamarinForms.Input, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public RadExtendedCalendarView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == RadExtendedCalendarView.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.RadExtendedCalendarView, Telerik.XamarinForms.Input, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public RadExtendedCalendarView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == RadExtendedCalendarView.class)
			mono.android.TypeManager.Activate ("Telerik.XamarinForms.InputRenderer.Android.RadExtendedCalendarView, Telerik.XamarinForms.Input, Version=2018.1.405.240, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}

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
