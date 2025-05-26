package pc2;

import androidx.media3.ui.s0;
import androidx.media3.ui.t0;
import com.pinterest.video.view.SimplePlayerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class a implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final SimplePlayerView f99623a;

    public a(SimplePlayerView playerView) {
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        this.f99623a = playerView;
    }

    @Override // androidx.media3.ui.s0
    public void a(t0 timeBar, long j13) {
        Intrinsics.checkNotNullParameter(timeBar, "timeBar");
    }

    @Override // androidx.media3.ui.s0
    public final void b(t0 timeBar, long j13) {
        Intrinsics.checkNotNullParameter(timeBar, "timeBar");
    }

    @Override // androidx.media3.ui.s0
    public void c(t0 timeBar, long j13, boolean z13) {
        Intrinsics.checkNotNullParameter(timeBar, "timeBar");
    }

    public /* bridge */ /* synthetic */ void d() {
    }

    public /* bridge */ /* synthetic */ void e() {
    }

    public boolean f() {
        SimplePlayerView simplePlayerView = this.f99623a;
        simplePlayerView.P(!simplePlayerView.getB());
        return simplePlayerView.getB();
    }

    public /* bridge */ /* synthetic */ void g(boolean z13) {
    }
}
