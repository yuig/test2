package ef1;

import android.view.View;
import com.pinterest.api.model.vh;
import com.pinterest.ui.imageview.WebImageView;
import eo1.c;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import uj2.q;
import uk1.d;
import vq0.h;
import we1.f;
import ye1.l;
import ye1.o;
import ye1.p;
import ye1.u;
import yk1.j;
import yk1.m;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final d f58832a;

    /* renamed from: b, reason: collision with root package name */
    public final q f58833b;

    public a(d presenterPinalytics, q networkStateStream) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f58832a = presenterPinalytics;
        this.f58833b = networkStateStream;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        p pVar;
        l view = (l) nVar;
        vh model = (vh) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "story");
        l lVar = view instanceof View ? view : null;
        if (lVar != null) {
            j.a().getClass();
            m b13 = j.b(lVar);
            if (!(b13 instanceof p)) {
                b13 = null;
            }
            pVar = (p) b13;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            ud1.a auxDataModel = new ud1.a(model.q(), model.f42852j, String.valueOf(i13), String.valueOf(model.f42843a), String.valueOf(i13), String.valueOf(model.f42865w.size()));
            u uVar = (u) pVar;
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(auxDataModel, "auxDataModel");
            uVar.f138893b = model;
            uVar.f138894c = auxDataModel;
        }
        o i03 = kg.a.i0(model);
        view.getClass();
        String title = i03.f138880b;
        Intrinsics.checkNotNullParameter(title, "title");
        a0.p(view.f138873e, title);
        List list = i03.f138879a;
        if (list.size() < 4) {
            list = null;
        }
        if (list != null) {
            int i14 = 0;
            List imageUrls = list.subList(0, 4);
            Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
            for (Object obj2 : imageUrls) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    f0.p();
                    throw null;
                }
                String str = (String) obj2;
                WebImageView webImageView = i14 != 0 ? i14 != 1 ? i14 != 2 ? i14 != 3 ? null : view.f138878j : view.f138877i : view.f138876h : view.f138875g;
                if (webImageView != null) {
                    float dimension = view.getResources().getDimension(c.rounding_300);
                    webImageView.g2(dimension, dimension, dimension, dimension);
                    webImageView.loadUrl(str);
                    webImageView.Y(new f(webImageView, view, i14, 1));
                }
                i14 = i15;
            }
        }
    }

    @Override // vq0.h
    public final m f() {
        return new u(this.f58832a, this.f58833b);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        vh model = (vh) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
