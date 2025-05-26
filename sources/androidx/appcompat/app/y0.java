package androidx.appcompat.app;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f3;
import androidx.appcompat.widget.h3;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class y0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final h3 f16151a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f16152b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f16153c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16154d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16155e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16156f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f16157g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final z f16158h = new z(this, 1);

    public y0(Toolbar toolbar, CharSequence charSequence, g0 g0Var) {
        w0 w0Var = new w0(this);
        toolbar.getClass();
        h3 h3Var = new h3(toolbar, false);
        this.f16151a = h3Var;
        g0Var.getClass();
        this.f16152b = g0Var;
        h3Var.f16591k = g0Var;
        toolbar.I = w0Var;
        if (!h3Var.f16587g) {
            h3Var.f16588h = charSequence;
            if ((h3Var.f16582b & 8) != 0) {
                Toolbar toolbar2 = h3Var.f16581a;
                toolbar2.D(charSequence);
                if (h3Var.f16587g) {
                    q5.v0.p(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f16153c = new w0(this);
    }

    @Override // androidx.appcompat.app.a
    public final boolean a() {
        androidx.appcompat.widget.n nVar;
        ActionMenuView actionMenuView = this.f16151a.f16581a.f16469a;
        return (actionMenuView == null || (nVar = actionMenuView.f16254t) == null || !nVar.k()) ? false : true;
    }

    @Override // androidx.appcompat.app.a
    public final boolean b() {
        n.q qVar;
        f3 f3Var = this.f16151a.f16581a.M;
        if (f3Var == null || (qVar = f3Var.f16562b) == null) {
            return false;
        }
        if (f3Var == null) {
            qVar = null;
        }
        if (qVar == null) {
            return true;
        }
        qVar.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final void c(boolean z13) {
        if (z13 == this.f16156f) {
            return;
        }
        this.f16156f = z13;
        ArrayList arrayList = this.f16157g;
        if (arrayList.size() <= 0) {
            return;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public final int d() {
        return this.f16151a.f16582b;
    }

    @Override // androidx.appcompat.app.a
    public final Context e() {
        return this.f16151a.f16581a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public final boolean f() {
        h3 h3Var = this.f16151a;
        Toolbar toolbar = h3Var.f16581a;
        z zVar = this.f16158h;
        toolbar.removeCallbacks(zVar);
        Toolbar toolbar2 = h3Var.f16581a;
        WeakHashMap weakHashMap = q5.v0.f102521a;
        toolbar2.postOnAnimation(zVar);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final void g() {
    }

    @Override // androidx.appcompat.app.a
    public final void h() {
        this.f16151a.f16581a.removeCallbacks(this.f16158h);
    }

    @Override // androidx.appcompat.app.a
    public final boolean i(int i13, KeyEvent keyEvent) {
        n.o p13 = p();
        if (p13 == null) {
            return false;
        }
        p13.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return p13.performShortcut(i13, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final boolean k() {
        return this.f16151a.f16581a.F();
    }

    @Override // androidx.appcompat.app.a
    public final void l(boolean z13) {
    }

    @Override // androidx.appcompat.app.a
    public final void m(boolean z13) {
    }

    @Override // androidx.appcompat.app.a
    public final void n(CharSequence charSequence) {
        h3 h3Var = this.f16151a;
        if (h3Var.f16587g) {
            return;
        }
        h3Var.f16588h = charSequence;
        if ((h3Var.f16582b & 8) != 0) {
            Toolbar toolbar = h3Var.f16581a;
            toolbar.D(charSequence);
            if (h3Var.f16587g) {
                q5.v0.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final n.o p() {
        boolean z13 = this.f16155e;
        h3 h3Var = this.f16151a;
        if (!z13) {
            x0 x0Var = new x0(this);
            w0 w0Var = new w0(this);
            Toolbar toolbar = h3Var.f16581a;
            toolbar.N = x0Var;
            toolbar.O = w0Var;
            ActionMenuView actionMenuView = toolbar.f16469a;
            if (actionMenuView != null) {
                actionMenuView.f16255u = x0Var;
                actionMenuView.f16256v = w0Var;
            }
            this.f16155e = true;
        }
        return h3Var.f16581a.n();
    }
}
