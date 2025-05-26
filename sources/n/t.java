package n;

import android.view.MenuItem;

/* loaded from: classes2.dex */
public final class t implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f88705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f88706b;

    public t(v vVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f88706b = vVar;
        this.f88705a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f88705a.onMenuItemActionCollapse(this.f88706b.c(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f88705a.onMenuItemActionExpand(this.f88706b.c(menuItem));
    }
}
