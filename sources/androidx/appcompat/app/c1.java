package androidx.appcompat.app;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class c1 extends m.c implements n.m {

    /* renamed from: c, reason: collision with root package name */
    public final Context f15959c;

    /* renamed from: d, reason: collision with root package name */
    public final n.o f15960d;

    /* renamed from: e, reason: collision with root package name */
    public m.b f15961e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f15962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d1 f15963g;

    public c1(d1 d1Var, Context context, a0 a0Var) {
        this.f15963g = d1Var;
        this.f15959c = context;
        this.f15961e = a0Var;
        n.o oVar = new n.o(context);
        oVar.f88659l = 1;
        this.f15960d = oVar;
        oVar.f88652e = this;
    }

    @Override // m.c
    public final void a() {
        d1 d1Var = this.f15963g;
        if (d1Var.f15979i != this) {
            return;
        }
        if (d1Var.f15986p) {
            d1Var.f15980j = this;
            d1Var.f15981k = this.f15961e;
        } else {
            this.f15961e.e(this);
        }
        this.f15961e = null;
        d1Var.p(false);
        ActionBarContextView actionBarContextView = d1Var.f15976f;
        if (actionBarContextView.f16213k == null) {
            actionBarContextView.e();
        }
        d1Var.f15973c.n(d1Var.f15991u);
        d1Var.f15979i = null;
    }

    @Override // m.c
    public final View b() {
        WeakReference weakReference = this.f15962f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // m.c
    public final n.o c() {
        return this.f15960d;
    }

    @Override // m.c
    public final MenuInflater d() {
        return new m.l(this.f15959c);
    }

    @Override // m.c
    public final CharSequence e() {
        return this.f15963g.f15976f.f16212j;
    }

    @Override // m.c
    public final CharSequence f() {
        return this.f15963g.f15976f.f16211i;
    }

    @Override // m.c
    public final void g() {
        if (this.f15963g.f15979i != this) {
            return;
        }
        n.o oVar = this.f15960d;
        oVar.B();
        try {
            this.f15961e.b(this, oVar);
        } finally {
            oVar.A();
        }
    }

    @Override // n.m
    public final boolean h(n.o oVar, MenuItem menuItem) {
        m.b bVar = this.f15961e;
        if (bVar != null) {
            return bVar.j(this, menuItem);
        }
        return false;
    }

    @Override // m.c
    public final boolean i() {
        return this.f15963g.f15976f.f16221s;
    }

    @Override // m.c
    public final void j(View view) {
        this.f15963g.f15976f.l(view);
        this.f15962f = new WeakReference(view);
    }

    @Override // m.c
    public final void k(int i13) {
        l(this.f15963g.f15971a.getResources().getString(i13));
    }

    @Override // m.c
    public final void l(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.f15963g.f15976f;
        actionBarContextView.f16212j = charSequence;
        actionBarContextView.d();
    }

    @Override // m.c
    public final void m(int i13) {
        n(this.f15963g.f15971a.getResources().getString(i13));
    }

    @Override // m.c
    public final void n(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.f15963g.f15976f;
        actionBarContextView.f16211i = charSequence;
        actionBarContextView.d();
        q5.v0.p(actionBarContextView, charSequence);
    }

    @Override // m.c
    public final void o(boolean z13) {
        this.f85182b = z13;
        ActionBarContextView actionBarContextView = this.f15963g.f15976f;
        if (z13 != actionBarContextView.f16221s) {
            actionBarContextView.requestLayout();
        }
        actionBarContextView.f16221s = z13;
    }

    @Override // n.m
    public final void w(n.o oVar) {
        if (this.f15961e == null) {
            return;
        }
        g();
        androidx.appcompat.widget.n nVar = this.f15963g.f15976f.f16206d;
        if (nVar != null) {
            nVar.n();
        }
    }
}
