package n;

import android.view.MenuItem;

/* loaded from: classes2.dex */
public final class u implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f88707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f88708b;

    public u(v vVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f88708b = vVar;
        this.f88707a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f88707a.onMenuItemClick(this.f88708b.c(menuItem));
    }
}
