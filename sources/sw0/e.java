package sw0;

import com.pinterest.api.model.k01;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final pw0.y f115428a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f115429b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f115430c;

    public e(pw0.y listener, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f115428a = listener;
        this.f115429b = z13;
        this.f115430c = z14;
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        pw0.z view = (pw0.z) nVar;
        k01 video = (k01) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(video, "model");
        view.e1(this.f115429b);
        if (video.a()) {
            view.g5(video);
        }
        view.B(this.f115428a, video);
        view.R(video.f39242e, video.e());
        if (this.f115430c) {
            Intrinsics.checkNotNullParameter(video, "video");
            view.j5(video.f39242e >= 1000);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        k01 model = (k01) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
