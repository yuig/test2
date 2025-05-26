package androidx.appcompat.app;

import android.R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class p0 extends androidx.activity.p implements o {

    /* renamed from: d, reason: collision with root package name */
    public n0 f16108d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f16109e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.appcompat.app.o0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p0(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L14
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = i.a.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L15
        L14:
            r1 = r6
        L15:
            r4.<init>(r5, r1)
            androidx.appcompat.app.o0 r1 = new androidx.appcompat.app.o0
            r1.<init>()
            r4.f16109e = r1
            androidx.appcompat.app.t r1 = r4.d()
            if (r6 != 0) goto L35
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r2 = i.a.dialogTheme
            r5.resolveAttribute(r2, r6, r0)
            int r6 = r6.resourceId
        L35:
            r5 = r1
            androidx.appcompat.app.n0 r5 = (androidx.appcompat.app.n0) r5
            r5.T = r6
            r5 = 0
            r1.f(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.p0.<init>(android.content.Context, int):void");
    }

    @Override // androidx.activity.p, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n0 n0Var = (n0) d();
        n0Var.B();
        ((ViewGroup) n0Var.A.findViewById(R.id.content)).addView(view, layoutParams);
        n0Var.f16093m.a(n0Var.f16092l.getCallback());
    }

    public final t d() {
        if (this.f16108d == null) {
            r rVar = t.f16128a;
            this.f16108d = new n0(getContext(), getWindow(), this, this);
        }
        return this.f16108d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return kotlin.jvm.internal.r.q(this.f16109e, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        b7.c.Q(getWindow().getDecorView(), this);
        lb.l0.i1(getWindow().getDecorView(), this);
        tb.f.e0(getWindow().getDecorView(), this);
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i13) {
        n0 n0Var = (n0) d();
        n0Var.B();
        return n0Var.f16092l.findViewById(i13);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().d();
    }

    @Override // androidx.activity.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().c();
        super.onCreate(bundle);
        d().f(bundle);
    }

    @Override // androidx.activity.p, android.app.Dialog
    public final void onStop() {
        super.onStop();
        n0 n0Var = (n0) d();
        n0Var.I();
        a aVar = n0Var.f16095o;
        if (aVar != null) {
            aVar.m(false);
        }
    }

    @Override // androidx.appcompat.app.o
    public final void onSupportActionModeFinished(m.c cVar) {
    }

    @Override // androidx.appcompat.app.o
    public final void onSupportActionModeStarted(m.c cVar) {
    }

    @Override // androidx.appcompat.app.o
    public final m.c onWindowStartingSupportActionMode(m.b bVar) {
        return null;
    }

    @Override // androidx.activity.p, android.app.Dialog
    public void setContentView(int i13) {
        e();
        d().k(i13);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().o(charSequence);
    }

    @Override // androidx.activity.p, android.app.Dialog
    public void setContentView(View view) {
        e();
        d().l(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i13) {
        super.setTitle(i13);
        d().o(getContext().getString(i13));
    }

    @Override // androidx.activity.p, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().m(view, layoutParams);
    }
}
