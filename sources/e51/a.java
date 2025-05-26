package e51;

import b41.c;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import kotlin.jvm.internal.Intrinsics;
import vq0.h;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends h {
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        LegoEmptyStateView view = (LegoEmptyStateView) nVar;
        b model = (b) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        view.e(model.f57478a);
        c cVar = model.f57479b;
        if (cVar != null) {
            view.b(cVar);
        }
        if (model.f57480c) {
            view.i();
        } else {
            view.a();
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        b model = (b) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
