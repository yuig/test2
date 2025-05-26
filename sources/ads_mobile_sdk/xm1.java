package ads_mobile_sdk;

import a.bf;
import android.view.View;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xm1 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final xf1 f13725a;

    /* renamed from: b, reason: collision with root package name */
    public final if1 f13726b;

    public xm1(xf1 nativeAdCore, if1 nativeAdAssets) {
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        this.f13725a = nativeAdCore;
        this.f13726b = nativeAdAssets;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        yh1 yh1Var;
        View b13;
        gf1 gf1Var = this.f13726b.f6369b;
        int i13 = gf1Var == null ? -1 : bf.f26a[gf1Var.ordinal()];
        if (i13 == -1) {
            return Unit.f80348a;
        }
        if (i13 == 1) {
            a.pf pfVar = (a.pf) this.f13725a.f13640b.get();
            if (pfVar != null && (b13 = (yh1Var = (yh1) pfVar).b("3010")) != null) {
                yh1Var.onClick(b13);
            }
        } else if (i13 == 2) {
            this.f13725a.a("_videoMediaView");
        }
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_NATIVE_VIDEO_CLICKED;
    }
}
