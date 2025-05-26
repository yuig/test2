package androidx.appcompat.widget;

import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class b3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f16517b;

    public /* synthetic */ b3(Toolbar toolbar, int i13) {
        this.f16516a = i13;
        this.f16517b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f16516a;
        Toolbar toolbar = this.f16517b;
        switch (i13) {
            case 0:
                f3 f3Var = toolbar.M;
                n.q qVar = f3Var == null ? null : f3Var.f16562b;
                if (qVar != null) {
                    qVar.collapseActionView();
                    break;
                }
                break;
            default:
                Iterator it = toolbar.H.iterator();
                while (it.hasNext()) {
                    toolbar.n().removeItem(((MenuItem) it.next()).getItemId());
                }
                n.o n13 = toolbar.n();
                ArrayList l13 = toolbar.l();
                m.l lVar = new m.l(toolbar.getContext());
                Iterator it2 = toolbar.G.f102493b.iterator();
                while (it2.hasNext()) {
                    ((androidx.fragment.app.n0) ((q5.q) it2.next())).f18383a.m(n13, lVar);
                }
                ArrayList l14 = toolbar.l();
                l14.removeAll(l13);
                toolbar.H = l14;
                break;
        }
    }
}
