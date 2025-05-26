package androidx.activity;

import a.ig;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class p extends Dialog implements androidx.lifecycle.z, k0, ma.i {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.b0 f15926a;

    /* renamed from: b, reason: collision with root package name */
    public final ma.h f15927b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f15928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, int i13) {
        super(context, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f15927b = new ma.h(this);
        this.f15928c = new i0(new ig(this, 3));
    }

    public static void a(p this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.b0 b() {
        androidx.lifecycle.b0 b0Var = this.f15926a;
        if (b0Var != null) {
            return b0Var;
        }
        androidx.lifecycle.b0 b0Var2 = new androidx.lifecycle.b0(this);
        this.f15926a = b0Var2;
        return b0Var2;
    }

    public final void c() {
        Window window = getWindow();
        Intrinsics.f(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        b7.c.Q(decorView, this);
        Window window2 = getWindow();
        Intrinsics.f(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        tb.f.e0(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.f(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        lb.l0.i1(decorView3, this);
    }

    @Override // androidx.lifecycle.z
    public final androidx.lifecycle.s getLifecycle() {
        return b();
    }

    @Override // androidx.activity.k0
    public final i0 getOnBackPressedDispatcher() {
        return this.f15928c;
    }

    @Override // ma.i
    public final ma.g getSavedStateRegistry() {
        return this.f15927b.f86760b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f15928c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher invoker;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            invoker = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(invoker, "onBackInvokedDispatcher");
            i0 i0Var = this.f15928c;
            i0Var.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            i0Var.f15906e = invoker;
            i0Var.c(i0Var.f15908g);
        }
        this.f15927b.b(bundle);
        b().e(androidx.lifecycle.q.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f15927b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().e(androidx.lifecycle.q.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().e(androidx.lifecycle.q.ON_DESTROY);
        this.f15926a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i13) {
        c();
        super.setContentView(i13);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
