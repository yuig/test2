package n5;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import d7.l0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f89228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f89229b;

    public k(m mVar, Activity activity) {
        this.f89228a = mVar;
        this.f89229b = activity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        WindowInsets build;
        View rootView;
        if (l0.s(view2)) {
            SplashScreenView child = l0.i(view2);
            m mVar = this.f89228a;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(child, "child");
            build = i.f().build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            rootView = child.getRootView();
            mVar.f89233j = (build == rootView.computeSystemWindowInsets(build, rect) && rect.isEmpty()) ? false : true;
            ((ViewGroup) this.f89229b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
