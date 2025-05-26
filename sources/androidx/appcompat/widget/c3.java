package androidx.appcompat.widget;

import android.view.MenuItem;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class c3 implements n.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f16537a;

    public /* synthetic */ c3(Toolbar toolbar) {
        this.f16537a = toolbar;
    }

    @Override // n.m
    public final boolean h(n.o oVar, MenuItem menuItem) {
        n.m mVar = this.f16537a.O;
        return mVar != null && mVar.h(oVar, menuItem);
    }

    @Override // n.m
    public final void w(n.o oVar) {
        Toolbar toolbar = this.f16537a;
        n nVar = toolbar.f16469a.f16254t;
        if (nVar == null || !nVar.l()) {
            Iterator it = toolbar.G.f102493b.iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.n0) ((q5.q) it.next())).f18383a.v(oVar);
            }
        }
        n.m mVar = toolbar.O;
        if (mVar != null) {
            mVar.w(oVar);
        }
    }
}
