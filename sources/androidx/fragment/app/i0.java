package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class i0 implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f18350a;

    public i0(w0 w0Var) {
        this.f18350a = w0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        d1 i13;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        w0 w0Var = this.f18350a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, w0Var);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l6.c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(l6.c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(l6.c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(l6.c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !f0.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id3 = view != null ? view.getId() : 0;
        if (id3 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment E = resourceId != -1 ? w0Var.E(resourceId) : null;
        if (E == null && string != null) {
            E = w0Var.F(string);
        }
        if (E == null && id3 != -1) {
            E = w0Var.E(id3);
        }
        if (E == null) {
            E = w0Var.J().a(context.getClassLoader(), attributeValue);
            E.mFromLayout = true;
            E.mFragmentId = resourceId != 0 ? resourceId : id3;
            E.mContainerId = id3;
            E.mTag = string;
            E.mInLayout = true;
            E.mFragmentManager = w0Var;
            g0 g0Var = w0Var.f18470v;
            E.mHost = g0Var;
            E.onInflate(g0Var.f18325b, attributeSet, E.mSavedFragmentState);
            i13 = w0Var.b(E);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Fragment " + E + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (E.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id3) + " with another fragment for " + attributeValue);
            }
            E.mInLayout = true;
            E.mFragmentManager = w0Var;
            g0 g0Var2 = w0Var.f18470v;
            E.mHost = g0Var2;
            E.onInflate(g0Var2.f18325b, attributeSet, E.mSavedFragmentState);
            i13 = w0Var.i(E);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Retained Fragment " + E + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        m6.c.e(E, viewGroup);
        E.mContainer = viewGroup;
        i13.l();
        i13.j();
        View view2 = E.mView;
        if (view2 == null) {
            throw new IllegalStateException(a.a.k("Fragment ", attributeValue, " did not create a view."));
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (E.mView.getTag() == null) {
            E.mView.setTag(string);
        }
        E.mView.addOnAttachStateChangeListener(new h0(this, i13));
        return E.mView;
    }
}
