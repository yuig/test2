package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import xk2.s;

/* loaded from: classes2.dex */
public abstract class ds0 {

    /* renamed from: a, reason: collision with root package name */
    public final Adapter f4426a;

    public ds0(Adapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f4426a = adapter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final ArrayList a(ds0 ds0Var, n6 n6Var) {
        AdFormat adFormat;
        ds0Var.getClass();
        List<q6> s13 = n6Var.s();
        Intrinsics.checkNotNullExpressionValue(s13, "getInitializationDataList(...)");
        ArrayList arrayList = new ArrayList(g0.q(s13, 10));
        for (q6 q6Var : s13) {
            String s14 = q6Var.s();
            Intrinsics.checkNotNullExpressionValue(s14, "getFormat(...)");
            switch (s14.hashCode()) {
                case -1396342996:
                    if (s14.equals("banner")) {
                        adFormat = AdFormat.BANNER;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                case -1052618729:
                    if (s14.equals("native")) {
                        adFormat = AdFormat.NATIVE;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                case -239580146:
                    if (s14.equals("rewarded")) {
                        adFormat = AdFormat.REWARDED;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                case 604727084:
                    if (s14.equals("interstitial")) {
                        adFormat = AdFormat.INTERSTITIAL;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                case 1167692200:
                    if (s14.equals("app_open")) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                case 1778294298:
                    if (s14.equals("app_open_ad")) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                case 1911491517:
                    if (s14.equals("rewarded_interstitial")) {
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                default:
                    adFormat = AdFormat.UNKNOWN;
                    break;
            }
            Bundle bundle = new Bundle();
            Map r13 = q6Var.r();
            Intrinsics.checkNotNullExpressionValue(r13, "getExtrasMap(...)");
            for (Map.Entry entry : r13.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            arrayList.add(new MediationConfiguration(adFormat, bundle));
        }
        return arrayList;
    }

    public final VersionInfo b() {
        return this.f4426a.getVersionInfo();
    }

    public final Object b(Context context, n6 n6Var, bl2.c frame) {
        if (!Intrinsics.d(Looper.getMainLooper(), Looper.myLooper())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        try {
            this.f4426a.initialize(context, new cs0(oVar), a(this, n6Var));
        } catch (Throwable th3) {
            xk2.q qVar = s.f135225b;
            oVar.resumeWith(new kk0(th3, yx0.f14453k, "Exception caught initializing adapter: ".concat(th3.getClass().getName())));
        }
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    public final VersionInfo a() {
        return this.f4426a.getSDKVersionInfo();
    }

    public Object a(Context context, n6 n6Var, bl2.c cVar) {
        return b(context, n6Var, cVar);
    }
}
