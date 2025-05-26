package ni1;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public final ro1.c f90628a;

    /* renamed from: b */
    public final j80.b f90629b;

    /* renamed from: c */
    public final Activity f90630c;

    /* renamed from: d */
    public final c82.d f90631d;

    /* renamed from: e */
    public final nx.d1 f90632e;

    /* renamed from: f */
    public final nx.b0 f90633f;

    /* renamed from: g */
    public final ur.a f90634g;

    /* renamed from: h */
    public final lh0.r2 f90635h;

    /* renamed from: i */
    public final HashMap f90636i;

    public d(ro1.c deepLinkAdUtil, j80.b carouselUtil, Activity activity, c82.d siteApi, nx.d1 trackingParamAttacher, nx.b0 pinAuxHelper, ur.a adsCoreDependencies, lh0.r2 experiments) {
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(siteApi, "siteApi");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f90628a = deepLinkAdUtil;
        this.f90629b = carouselUtil;
        this.f90630c = activity;
        this.f90631d = siteApi;
        this.f90632e = trackingParamAttacher;
        this.f90633f = pinAuxHelper;
        this.f90634g = adsCoreDependencies;
        this.f90635h = experiments;
        this.f90636i = new HashMap();
    }

    public static /* synthetic */ void e(d dVar, f30 f30Var, es.h hVar, es.a aVar, boolean z13, boolean z14, int i13) {
        if ((i13 & 4) != 0) {
            aVar = null;
        }
        dVar.d(f30Var, hVar, aVar, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14, null, null, null);
    }

    public final boolean a(f30 pin, String str, h32.c1 c1Var, Integer num, String str2, boolean z13, boolean z14, es.a adFormats) {
        boolean a13;
        String str3;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        if (((es.c) adFormats).y(pin)) {
            ps0.y yVar = ro1.c.f108967f;
            a13 = this.f90628a.b(pin, this.f90630c, str, c1Var, num, null);
        } else {
            a13 = ro1.c.a(this.f90628a, pin, this.f90630c, this.f90629b, str, c1Var, str2, null, z13, z14, RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL);
        }
        if (a13) {
            if (str == null) {
                str3 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(str3, "getUid(...)");
            } else {
                str3 = str;
            }
            this.f90636i.put(str3, Boolean.TRUE);
        }
        return a13;
    }

    public final void c(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f90636i.put(uid, Boolean.FALSE);
    }

    public final void d(f30 pin, es.h adsCommonDisplay, es.a aVar, boolean z13, boolean z14, h32.c1 c1Var, Integer num, String str) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        ComponentCallbacks2 componentCallbacks2 = this.f90630c;
        if (componentCallbacks2 instanceof os1.b) {
            String b13 = this.f90632e.b(pin);
            Short o13 = ((es.v) adsCommonDisplay).o(pin);
            ur.b bVar = (ur.b) this.f90634g;
            h32.e f13 = ek1.c2.f(pin, aVar, bVar.f123059b, z13, z14, this.f90635h.V());
            ((os1.b) componentCallbacks2).setDeepLinkClickthroughData(new os1.a(System.currentTimeMillis() * 1000000, pin, Boolean.FALSE, b13, str, num, c1Var != null ? c1Var.V : null, null, null, o13, null, ((vr.b) bVar.f123059b).b(f13, pin, Integer.valueOf(h32.n0.NATIVE_BROWSER.value()), com.bumptech.glide.c.D(pin)), 1408));
        }
    }
}
