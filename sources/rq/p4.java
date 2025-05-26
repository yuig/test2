package rq;

import com.pinterest.activity.pin.view.modules.PinCloseupVideoModule;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p4 extends ec2.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PinterestVideoView f109480c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PinCloseupVideoModule f109481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(PinterestVideoView pinterestVideoView, PinCloseupVideoModule pinCloseupVideoModule) {
        super(pinterestVideoView);
        this.f109480c = pinterestVideoView;
        this.f109481d = pinCloseupVideoModule;
    }

    @Override // pc2.a
    public final void d() {
        PinterestVideoView pinterestVideoView;
        pinterestVideoView = this.f109481d.videoView;
        if (pinterestVideoView != null) {
            pinterestVideoView.w0();
        }
    }

    @Override // ec2.e, pc2.a
    public final void e() {
        float f13;
        lh0.a0 a0Var;
        String str;
        float f14;
        PinCloseupVideoModule pinCloseupVideoModule = this.f109481d;
        f13 = pinCloseupVideoModule.pinAspectRatio;
        boolean z13 = f13 > 1.2f;
        a0Var = pinCloseupVideoModule.closeupExperiments;
        a0Var.getClass();
        lh0.z3 z3Var = lh0.a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) a0Var.f83294a;
        ScreenLocation screenLocation = (g1Var.o("android_sba_video_full_screen", "enabled", z3Var) || g1Var.l("android_sba_video_full_screen")) ? z13 ? (ScreenLocation) com.pinterest.screens.i0.f50927e.getValue() : (ScreenLocation) com.pinterest.screens.i0.f50928f.getValue() : z13 ? (ScreenLocation) com.pinterest.screens.i0.f50926d.getValue() : (ScreenLocation) com.pinterest.screens.i0.f50925c.getValue();
        m60.w o03 = this.f109480c.o0();
        NavigationImpl w13 = Navigation.w1(screenLocation);
        str = pinCloseupVideoModule.pinId;
        w13.m0("com.pinterest.EXTRA_VIDEO_SCREEN_PIN_ID", str);
        f14 = pinCloseupVideoModule.pinAspectRatio;
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_VIDEO_SCREEN_RATIO", "key");
        w13.f49942d.putFloat("com.pinterest.EXTRA_VIDEO_SCREEN_RATIO", f14);
        o03.d(w13);
    }

    @Override // ec2.e, pc2.a
    public final void g(boolean z13) {
        super.g(z13);
        if (z13) {
            return;
        }
        oc2.i.b(this.f109480c, 0L, 3);
    }
}
