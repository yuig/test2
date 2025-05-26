package rq;

import androidx.media3.ui.LegacyPlayerControlView;
import com.pinterest.activity.pin.view.modules.PinCloseupVideoModule;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q4 extends ic2.d {

    /* renamed from: c, reason: collision with root package name */
    public long f109495c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f109496d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f109497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PinCloseupVideoModule f109498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PinterestVideoView f109499g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f109500h;

    public q4(PinCloseupVideoModule pinCloseupVideoModule, PinterestVideoView pinterestVideoView, boolean z13) {
        boolean z14;
        this.f109498f = pinCloseupVideoModule;
        this.f109499g = pinterestVideoView;
        this.f109500h = z13;
        z14 = pinCloseupVideoModule.isPromoted;
        this.f109496d = z14;
    }

    @Override // n7.c
    public final void O(n7.b eventTime, a7.i1 tracks) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        if (tracks.f1079a.isEmpty()) {
            return;
        }
        tracks.a();
    }

    @Override // ic2.d, n7.c
    public final void P(n7.b eventTime, int i13) {
        lh0.a0 a0Var;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        super.P(eventTime, i13);
        PinCloseupVideoModule pinCloseupVideoModule = this.f109498f;
        if (i13 == 4) {
            a0Var = pinCloseupVideoModule.closeupExperiments;
            a0Var.getClass();
            lh0.z3 z3Var = lh0.a4.f83297a;
            lh0.g1 g1Var = (lh0.g1) a0Var.f83294a;
            if (!g1Var.o("android_video_block_video_pin_loop_vps_log", "enabled", z3Var) && !g1Var.l("android_video_block_video_pin_loop_vps_log")) {
                pinCloseupVideoModule.shouldStartVideoFromBeginning();
            }
        }
        if (i13 == 3 && Intrinsics.d(this.f72115b, Boolean.TRUE) && !this.f109497e) {
            nx.d0 viewPinalytics = pinCloseupVideoModule.getViewPinalytics();
            f30 pin = pinCloseupVideoModule.getPin();
            if (viewPinalytics == null || pin == null) {
                return;
            }
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            kh2.c3.g0(viewPinalytics, uid, b40.C0(pin), null, null);
            this.f109497e = true;
        }
    }

    @Override // ic2.d
    public final void X(long j13) {
        long j14;
        LegacyPlayerControlView legacyPlayerControlView;
        boolean z13 = this.f109496d;
        PinCloseupVideoModule pinCloseupVideoModule = this.f109498f;
        if (!z13 && j13 >= this.f109495c) {
            this.f109496d = true;
            pinCloseupVideoModule.refreshExperience();
        }
        boolean z14 = this.f109500h;
        PinterestVideoView pinterestVideoView = this.f109499g;
        if (z14 && ((legacyPlayerControlView = pinterestVideoView.f18945j) == null || !legacyPlayerControlView.e())) {
            pinterestVideoView.C(pinterestVideoView.B());
        }
        n7.m0 c03 = pinterestVideoView.J0.c0();
        long j15 = c03 != null ? c03.N[3] : 0L;
        j14 = pinCloseupVideoModule.musicTotalPlayTimeMs;
        if (j14 < 0) {
            pinCloseupVideoModule.musicPlayStartMs = j15;
        }
        pinCloseupVideoModule.musicTotalPlayTimeMs = j15;
    }

    @Override // n7.c
    public final void v(n7.b eventTime, Object output) {
        String str;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(output, "output");
        m60.w o03 = this.f109499g.o0();
        str = this.f109498f.pinId;
        o03.d(new ls1.i(str, System.currentTimeMillis() * 1000000));
    }

    @Override // ic2.d
    public final void z(long j13, long j14) {
        this.f109495c = j14 / 2;
    }
}
