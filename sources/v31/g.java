package v31;

import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import kotlin.jvm.internal.Intrinsics;
import vq0.h;
import yk1.n;

/* loaded from: classes5.dex */
public final class g extends h {
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        EmptyStateBannerView view = (EmptyStateBannerView) nVar;
        f model = (f) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        view.o(model.f123966a);
        model.f123966a.f123957g.invoke();
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        f model = (f) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
