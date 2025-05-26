package m;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import q5.v0;

/* loaded from: classes2.dex */
public final class f extends c implements n.m {

    /* renamed from: c, reason: collision with root package name */
    public final Context f85189c;

    /* renamed from: d, reason: collision with root package name */
    public final ActionBarContextView f85190d;

    /* renamed from: e, reason: collision with root package name */
    public final b f85191e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f85192f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f85193g;

    /* renamed from: h, reason: collision with root package name */
    public final n.o f85194h;

    public f(Context context, ActionBarContextView actionBarContextView, b bVar) {
        this.f85189c = context;
        this.f85190d = actionBarContextView;
        this.f85191e = bVar;
        n.o oVar = new n.o(actionBarContextView.getContext());
        oVar.f88659l = 1;
        this.f85194h = oVar;
        oVar.f88652e = this;
    }

    @Override // m.c
    public final void a() {
        if (this.f85193g) {
            return;
        }
        this.f85193g = true;
        this.f85191e.e(this);
    }

    @Override // m.c
    public final View b() {
        WeakReference weakReference = this.f85192f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // m.c
    public final n.o c() {
        return this.f85194h;
    }

    @Override // m.c
    public final MenuInflater d() {
        return new l(this.f85190d.getContext());
    }

    @Override // m.c
    public final CharSequence e() {
        return this.f85190d.f16212j;
    }

    @Override // m.c
    public final CharSequence f() {
        return this.f85190d.f16211i;
    }

    @Override // m.c
    public final void g() {
        this.f85191e.b(this, this.f85194h);
    }

    @Override // n.m
    public final boolean h(n.o oVar, MenuItem menuItem) {
        return this.f85191e.j(this, menuItem);
    }

    @Override // m.c
    public final boolean i() {
        return this.f85190d.f16221s;
    }

    @Override // m.c
    public final void j(View view) {
        this.f85190d.l(view);
        this.f85192f = view != null ? new WeakReference(view) : null;
    }

    @Override // m.c
    public final void k(int i13) {
        l(this.f85189c.getString(i13));
    }

    @Override // m.c
    public final void l(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.f85190d;
        actionBarContextView.f16212j = charSequence;
        actionBarContextView.d();
    }

    @Override // m.c
    public final void m(int i13) {
        n(this.f85189c.getString(i13));
    }

    @Override // m.c
    public final void n(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.f85190d;
        actionBarContextView.f16211i = charSequence;
        actionBarContextView.d();
        v0.p(actionBarContextView, charSequence);
    }

    @Override // m.c
    public final void o(boolean z13) {
        this.f85182b = z13;
        ActionBarContextView actionBarContextView = this.f85190d;
        if (z13 != actionBarContextView.f16221s) {
            actionBarContextView.requestLayout();
        }
        actionBarContextView.f16221s = z13;
    }

    @Override // n.m
    public final void w(n.o oVar) {
        g();
        androidx.appcompat.widget.n nVar = this.f85190d.f16206d;
        if (nVar != null) {
            nVar.n();
        }
    }
}
