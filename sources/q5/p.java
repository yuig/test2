package q5;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f102492a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f102493b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f102494c = new HashMap();

    public p(Runnable runnable) {
        this.f102492a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f102493b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.n0) ((q) it.next())).f18383a.r(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(q qVar) {
        this.f102493b.remove(qVar);
        o oVar = (o) this.f102494c.remove(qVar);
        if (oVar != null) {
            oVar.a();
        }
        this.f102492a.run();
    }
}
