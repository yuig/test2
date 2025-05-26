package nx;

import com.pinterest.api.model.gw;
import com.pinterest.api.model.wy0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f92420a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f92421b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.e f92422c;

    /* renamed from: d, reason: collision with root package name */
    public final vb0.c f92423d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f92424e;

    /* renamed from: f, reason: collision with root package name */
    public final gz1.b f92425f;

    public l0(e0 pinalyticsManager, d1 trackingParamAttacher, m60.e applicationInfoProvider, tb0.h crashReporting, vy.m analyticsApi, gw modelHelper, vb0.c applicationUtils, b60.b activeUserManager, gz1.b googlePlayServices) {
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter(applicationUtils, "applicationUtils");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(googlePlayServices, "googlePlayServices");
        this.f92420a = pinalyticsManager;
        this.f92421b = trackingParamAttacher;
        this.f92422c = applicationInfoProvider;
        this.f92423d = applicationUtils;
        this.f92424e = activeUserManager;
        this.f92425f = googlePlayServices;
    }

    public final h32.w0 c(h32.i0 context, h32.f1 et2, String str, h32.c1 c1Var, HashMap hashMap, h32.v0 v0Var, boolean z13, boolean z14) {
        String str2;
        String uid;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(et2, "et");
        if (v0Var == null) {
            v0Var = new h32.v0();
        }
        v0Var.f67286i = hf0.b.a();
        m60.d dVar = (m60.d) this.f92422c;
        v0Var.f67297t = dVar.f85891a.getContextEnum();
        v0Var.f67278a = ep.b.f(1000000L);
        v0Var.f67279b = et2;
        v0Var.f67293p = this.f92423d.a();
        v0Var.f67285h = context;
        if (str != null && str.length() != 0) {
            v0Var.f67295r = str;
            h32.w0 a13 = v0Var.a();
            d1 d1Var = this.f92421b;
            String str3 = a13.G;
            if ((str3 == null || str3.length() == 0) && z14) {
                v0Var.G = d1Var.c(str);
            } else if (z13) {
                v0Var.G = d1Var.c(str);
            }
        }
        wy0 f13 = ((b60.d) this.f92424e).f();
        if (f13 != null && (uid = f13.getUid()) != null) {
            v0Var.f67294q = uid;
        }
        HashMap auxData = hashMap != null ? new HashMap(hashMap) : new HashMap();
        dVar.e();
        dVar.f85896f.getClass();
        dVar.h();
        tb0.r release = tb0.r.PRODUCTION;
        Intrinsics.checkNotNullExpressionValue(release, "getReleaseStage(...)");
        Intrinsics.checkNotNullParameter(release, "release");
        int i13 = k0.f92419a[release.ordinal()];
        if (i13 == 1) {
            str2 = "alpha";
        } else if (i13 == 2) {
            str2 = "prod";
        } else if (i13 == 3) {
            str2 = "ota";
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "fastdev";
        }
        auxData.put("stage", str2);
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        HashMap hashMap2 = new HashMap(auxData);
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry : hashMap2.entrySet()) {
            String str4 = (String) entry.getValue();
            if (str4 != null) {
                Object key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                hashMap3.put(key, str4);
            } else {
                Objects.toString(entry.getKey());
            }
        }
        v0Var.f67282e = hashMap3;
        if (c1Var != null) {
            v0Var.f67283f = c1Var;
        }
        return ((o0) this.f92420a).k(v0Var.a());
    }
}
