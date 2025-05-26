package ec2;

import androidx.media3.ui.t0;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.internal.Intrinsics;
import m60.u;

/* loaded from: classes2.dex */
public class e extends pc2.a {

    /* renamed from: b, reason: collision with root package name */
    public final PinterestVideoView f58444b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PinterestVideoView playerView) {
        super(playerView);
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        this.f58444b = playerView;
    }

    @Override // pc2.a, androidx.media3.ui.s0
    public final void a(t0 timeBar, long j13) {
        Intrinsics.checkNotNullParameter(timeBar, "timeBar");
        super.a(timeBar, j13);
        oc2.i.a(this.f58444b);
    }

    @Override // pc2.a, androidx.media3.ui.s0
    public final void c(t0 timeBar, long j13, boolean z13) {
        Intrinsics.checkNotNullParameter(timeBar, "timeBar");
        super.c(timeBar, j13, z13);
        PinterestVideoView pinterestVideoView = this.f58444b;
        bc2.k kVar = pinterestVideoView.L;
        String str = kVar != null ? kVar.f22657a : null;
        if (str == null) {
            pinterestVideoView.play();
        } else {
            nc2.h hVar = nc2.h.f90405a;
            com.bumptech.glide.d.t0(str, new ha2.j(this, 20));
        }
    }

    @Override // pc2.a
    public void e() {
        u.f85943a.d(dc2.a.f54388a);
    }

    @Override // pc2.a
    public final boolean f() {
        PinterestVideoView pinterestVideoView = this.f58444b;
        if (pinterestVideoView.Y0 || pinterestVideoView.Z0) {
            return true;
        }
        boolean f13 = super.f();
        nc2.h.f90406b = f13;
        boolean z13 = !f13;
        pinterestVideoView.q0().v(z13);
        if (pinterestVideoView.f()) {
            pinterestVideoView.W(z13);
        }
        if (f13) {
            u.f85943a.d(dc2.b.f54389a);
        } else {
            u.f85943a.d(dc2.c.f54390a);
        }
        return f13;
    }

    @Override // pc2.a
    public void g(boolean z13) {
        PinterestVideoView pinterestVideoView = this.f58444b;
        oc2.i.d(pinterestVideoView, z13);
        pinterestVideoView.W(z13);
    }
}
