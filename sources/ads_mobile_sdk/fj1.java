package ads_mobile_sdk;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fj1 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final xf1 f5163a;

    public fj1(xf1 nativeAdCore) {
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        this.f5163a = nativeAdCore;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        nm.u uVar;
        xf1 xf1Var;
        a.pf pfVar = (a.pf) this.f5163a.f13640b.get();
        if (pfVar != null) {
            yh1 yh1Var = (yh1) pfVar;
            synchronized (yh1Var) {
                if (yh1Var.f14249d.get()) {
                    uVar = new nm.u();
                } else {
                    InternalNativeAd internalNativeAd = yh1Var.f14254i;
                    if (internalNativeAd == null || (xf1Var = internalNativeAd.f32087o) == null) {
                        uVar = new nm.u();
                    } else {
                        FrameLayout frameLayout = yh1Var.f14247b;
                        LinkedHashMap linkedHashMap = yh1Var.f14253h;
                        ImageView.ScaleType scaleType = yh1Var.f14251f;
                        if (scaleType == null) {
                            scaleType = ci1.f3919i;
                        }
                        uVar = xf1Var.b(frameLayout, scaleType, linkedHashMap);
                    }
                }
            }
        } else {
            uVar = new nm.u();
        }
        Object a13 = ym0Var.a(uVar, "nativeClickMetaReady", cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_NATIVE_CLICK_META;
    }
}
