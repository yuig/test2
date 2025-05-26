package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes2.dex */
public class g0 extends o implements SubMenu {
    public final q A;

    /* renamed from: z, reason: collision with root package name */
    public final o f88603z;

    public g0(Context context, o oVar, q qVar) {
        super(context);
        this.f88603z = oVar;
        this.A = qVar;
    }

    @Override // n.o
    public final boolean e(q qVar) {
        return this.f88603z.e(qVar);
    }

    @Override // n.o
    public final boolean f(o oVar, MenuItem menuItem) {
        return super.f(oVar, menuItem) || this.f88603z.f(oVar, menuItem);
    }

    @Override // n.o
    public final boolean g(q qVar) {
        return this.f88603z.g(qVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // n.o
    public final String k() {
        q qVar = this.A;
        int i13 = qVar != null ? qVar.f88675a : 0;
        if (i13 == 0) {
            return null;
        }
        return a.a.d("android:menu:actionviewstates:", i13);
    }

    @Override // n.o
    public final o l() {
        return this.f88603z.l();
    }

    @Override // n.o
    public final boolean n() {
        return this.f88603z.n();
    }

    @Override // n.o
    public final boolean o() {
        return this.f88603z.o();
    }

    @Override // n.o
    public final boolean p() {
        return this.f88603z.p();
    }

    @Override // n.o, android.view.Menu
    public final void setGroupDividerEnabled(boolean z13) {
        this.f88603z.setGroupDividerEnabled(z13);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i13) {
        y(0, null, i13, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i13) {
        y(i13, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        y(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // n.o, android.view.Menu
    public final void setQwertyMode(boolean z13) {
        this.f88603z.setQwertyMode(z13);
    }

    @Override // n.o
    public final void x(m mVar) {
        throw null;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i13) {
        this.A.setIcon(i13);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        y(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        y(0, charSequence, 0, null, null);
        return this;
    }
}
