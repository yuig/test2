package fe1;

import android.view.View;
import com.pinterest.gestalt.text.GestaltText;
import de1.u;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rq.p;
import yk1.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class g extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final v f62059a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f62060b;

    public g(v viewResources, u getRules) {
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(getRules, "getRules");
        this.f62059a = viewResources;
        this.f62060b = getRules;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        fm1.c cVar;
        yk1.h view = (yk1.h) nVar;
        zd1.i model = (zd1.i) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        if (i13 == 0) {
            view.setPaddingRelative(view.getPaddingStart(), 0, view.getPaddingEnd(), view.getPaddingBottom());
        }
        View childAt = view.getChildAt(0);
        Intrinsics.g(childAt, "null cannot be cast to non-null type GestaltComponent of com.pinterest.framework.mvp.GestaltMvpView");
        GestaltText gestaltText = (GestaltText) childAt;
        String str = model.f141731d;
        if (str == null) {
            zd1.j jVar = model.f141730c;
            int i14 = jVar == null ? -1 : f.f62058a[jVar.ordinal()];
            v vVar = this.f62059a;
            str = i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? "" : ((yk1.a) vVar).f139224a.getString(mz1.g.sort_filter_header) : ((yk1.a) vVar).f139224a.getString(mz1.g.category_filter_header) : ((yk1.a) vVar).f139224a.getString(mz1.g.domain_filter_header) : ((yk1.a) vVar).f139224a.getString(mz1.g.price_filter_header);
        }
        List list = (List) this.f62060b.invoke();
        if (list == null || CollectionsKt.L(list, model.f141728a)) {
            gestaltText.getLayoutParams().height = -2;
            cVar = fm1.c.VISIBLE;
        } else {
            gestaltText.getLayoutParams().height = 0;
            cVar = fm1.c.GONE;
        }
        gestaltText.i(new p(str, cVar, 3));
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        zd1.i model = (zd1.i) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
