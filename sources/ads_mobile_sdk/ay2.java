package ads_mobile_sdk;

import ao2.j0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ay2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final a.j3 f2598a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f2599b;

    public ay2(a.j3 traceLogger, j0 uiScope) {
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.f2598a = traceLogger;
        this.f2599b = uiScope;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        sn0 c13;
        String str;
        mn0 mn0Var;
        try {
            c13 = ym0Var.c();
            str = (String) map.get("duration");
        } catch (NumberFormatException e13) {
            Intrinsics.checkNotNullParameter("Exception handling video metadata", "message");
            cs2 a13 = qs2.a();
            a13.f().f6994p.add("Exception handling video metadata");
            a13.f().f6988j = false;
            a13.a(e13);
            ((ks2) this.f2598a).a("VideoMetadataGmsgHandler.onGmsg", e13);
        }
        if (str == null) {
            Intrinsics.checkNotNullParameter("Invalid videoMeta gmsg with no duration.", "message");
            ft2.a(true, "Invalid videoMeta gmsg with no duration.", null);
            return Unit.f80348a;
        }
        float parseFloat = Float.parseFloat(str);
        if (c13 == null) {
            boolean d2 = Intrinsics.d(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, map.get("customControlsAllowed"));
            Intrinsics.d(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, map.get("clickToExpandAllowed"));
            sn0 sn0Var = new sn0(this.f2599b, ym0Var, parseFloat, d2);
            synchronized (ym0Var) {
                try {
                    if (ym0Var.c() != null) {
                        gk0.a("Attempt to create multiple GmaWebViewVideoController.", null);
                    } else {
                        ym0Var.f14330p = sn0Var;
                    }
                    Unit unit = Unit.f80348a;
                } finally {
                }
            }
            c13 = sn0Var;
        }
        boolean d13 = Intrinsics.d(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, map.get("muted"));
        String str2 = (String) map.get("playbackState");
        if (str2 == null) {
            Intrinsics.checkNotNullParameter("Invalid videoMeta gmsg with no playback state.", "message");
            ft2.a(true, "Invalid videoMeta gmsg with no playback state.", null);
            return Unit.f80348a;
        }
        int parseInt = Integer.parseInt(str2);
        mn0[] values = mn0.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                mn0Var = null;
                break;
            }
            mn0Var = values[i13];
            if (mn0Var.f8298a != parseInt) {
                i13++;
            }
        }
        if (mn0Var == null) {
            mn0Var = mn0.f8293b;
        }
        String str3 = (String) map.get("aspectRatio");
        if (str3 != null) {
            c13.a(parseFloat, mn0Var, d13, Float.parseFloat(str3));
            return Unit.f80348a;
        }
        Intrinsics.checkNotNullParameter("Invalid videoMeta gmsg with no aspect ratio.", "message");
        ft2.a(true, "Invalid videoMeta gmsg with no aspect ratio.", null);
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_VIDEO_METADATA;
    }
}
