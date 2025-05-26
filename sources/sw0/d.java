package sw0;

import com.pinterest.api.model.d30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final pw0.r f115423a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f115424b;

    public d(pw0.r listener, boolean z13) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f115423a = listener;
        this.f115424b = z13;
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        pw0.s view = (pw0.s) nVar;
        d30 model = (d30) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        view.e1(this.f115424b);
        if (model.a()) {
            view.t4(model);
        }
        view.W1(this.f115423a, model);
        view.q5(model.e());
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        d30 model = (d30) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
