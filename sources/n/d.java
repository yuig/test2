package n;

import android.content.Context;
import android.view.MenuItem;
import g1.o0;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88570a;

    /* renamed from: b, reason: collision with root package name */
    public o0 f88571b;

    public d(Context context) {
        this.f88570a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof h5.b)) {
            return menuItem;
        }
        h5.b bVar = (h5.b) menuItem;
        if (this.f88571b == null) {
            this.f88571b = new o0();
        }
        MenuItem menuItem2 = (MenuItem) this.f88571b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        v vVar = new v(this.f88570a, bVar);
        this.f88571b.put(bVar, vVar);
        return vVar;
    }
}
