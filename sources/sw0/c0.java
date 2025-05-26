package sw0;

import a7.v0;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.video.view.SimplePlayerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements com.google.android.material.appbar.h {

    /* renamed from: a, reason: collision with root package name */
    public final SimplePlayerView f115421a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f115422b;

    public c0(SimplePlayerView playerView) {
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        this.f115421a = playerView;
    }

    @Override // com.google.android.material.appbar.f
    public final void a(AppBarLayout layout, int i13) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        boolean z13 = 1.0f - (Math.abs((float) i13) / ((float) layout.h())) >= 0.25f;
        if (this.f115422b == z13) {
            return;
        }
        SimplePlayerView simplePlayerView = this.f115421a;
        if (z13 && bs1.c.o1(simplePlayerView)) {
            v0 v0Var = simplePlayerView.f18946k;
            if (v0Var != null) {
                v0Var.play();
            }
        } else {
            v0 v0Var2 = simplePlayerView.f18946k;
            if (v0Var2 != null) {
                v0Var2.pause();
            }
        }
        this.f115422b = z13;
    }

    public final boolean b() {
        return this.f115422b;
    }
}
