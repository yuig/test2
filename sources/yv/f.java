package yv;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.r;
import com.pinterest.api.model.wy0;
import ew.m;
import h32.f1;
import ho2.q;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import lh0.g1;
import lh0.z0;
import lh0.z3;
import net.quikkly.android.utils.BitmapUtils;
import nx.c0;
import tb0.p;

/* loaded from: classes3.dex */
public final class f extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final m f140168a;

    /* renamed from: b, reason: collision with root package name */
    public final lh0.h f140169b;

    /* renamed from: c, reason: collision with root package name */
    public final dw.b f140170c;

    /* renamed from: d, reason: collision with root package name */
    public final tb0.h f140171d;

    /* renamed from: e, reason: collision with root package name */
    public final es.a f140172e;

    /* renamed from: f, reason: collision with root package name */
    public f30 f140173f;

    /* renamed from: g, reason: collision with root package name */
    public int f140174g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f140175h;

    /* renamed from: i, reason: collision with root package name */
    public int f140176i;

    /* renamed from: j, reason: collision with root package name */
    public c0 f140177j;

    /* renamed from: k, reason: collision with root package name */
    public int f140178k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m adsGmaManager, lh0.h adsGmaExperiments, dw.b analytics, tb0.h crashReporting, es.a adFormats) {
        super(0);
        Intrinsics.checkNotNullParameter(adsGmaManager, "adsGmaManager");
        Intrinsics.checkNotNullParameter(adsGmaExperiments, "adsGmaExperiments");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f140168a = adsGmaManager;
        this.f140169b = adsGmaExperiments;
        this.f140170c = analytics;
        this.f140171d = crashReporting;
        this.f140172e = adFormats;
    }

    public static void D3(f fVar, bj.f fVar2) {
        if (fVar.f140175h) {
            j.z(zc0.a.f141581a, q.f69782a, null, new e(fVar, fVar2, null, null), 2);
        }
    }

    public final void B3() {
        com.pinterest.api.model.g t33;
        f30 f30Var = this.f140173f;
        Integer num = null;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        if (!Intrinsics.d(f30Var.Q5(), Boolean.TRUE) || (t33 = f30Var.t3()) == null || t33.V().intValue() != 12) {
            z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
            lh0.h hVar = this.f140169b;
            hVar.getClass();
            Intrinsics.checkNotNullParameter("enabled_zero_loop", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            z0 z0Var = hVar.f83376a;
            if (((g1) z0Var).o("android_ad_gma_video_iteration", "enabled_zero_loop", activate)) {
                num = 0;
            } else {
                Intrinsics.checkNotNullParameter("enabled_one_loop", "group");
                Intrinsics.checkNotNullParameter(activate, "activate");
                if (((g1) z0Var).o("android_ad_gma_video_iteration", "enabled_one_loop", activate)) {
                    num = 1;
                }
            }
        }
        if (num == null) {
            h hVar2 = (h) getViewIfBound();
            if (hVar2 != null) {
                hVar2.o2();
                return;
            }
            return;
        }
        if (this.f140178k < num.intValue()) {
            this.f140178k++;
            h hVar3 = (h) getViewIfBound();
            if (hVar3 != null) {
                hVar3.o2();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    @Override // yk1.b
    /* renamed from: onBind */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r3(yk1.n r30) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yv.f.r3(yk1.n):void");
    }

    @Override // yk1.b
    public final void onUnbind() {
        this.f140175h = false;
        ((h) getView()).q3();
        super.onUnbind();
    }

    public final String p3() {
        r n03;
        f30 f30Var = this.f140173f;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        com.pinterest.api.model.g t33 = f30Var.t3();
        if (t33 == null || (n03 = t33.n0()) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(n03, "<this>");
        Map m13 = n03.m();
        return (String) (m13 != null ? m13.get(String.valueOf(h92.c.GAM_AD_CHOICE_URL.getValue())) : null);
    }

    public final boolean q3() {
        r n03;
        Map m13;
        f30 f30Var = this.f140173f;
        Object obj = null;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        com.pinterest.api.model.g t33 = f30Var.t3();
        if (t33 != null && (n03 = t33.n0()) != null && (m13 = n03.m()) != null) {
            obj = m13.get(String.valueOf(h92.c.IS_GAM_ADVERTISER_PRESENT.getValue()));
        }
        return Intrinsics.d((String) obj, "true");
    }

    public final int r3() {
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        lh0.h hVar = this.f140169b;
        return ((!hVar.a("enabled", z3Var) || hVar.a("enabled_organic_only2", z3Var)) && !hVar.a("employee", z3Var)) ? 3 : 1;
    }

    public final String s3() {
        f30 f30Var = this.f140173f;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return uid;
    }

    public final String t3() {
        f30 f30Var = this.f140173f;
        if (f30Var != null) {
            String h10 = ((es.c) this.f140172e).h(f30Var);
            return h10 == null ? "" : h10;
        }
        Intrinsics.r("pin");
        throw null;
    }

    public final String u3() {
        f30 f30Var = this.f140173f;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        String r43 = f30Var.r4();
        if (r43 == null) {
            f30 f30Var2 = this.f140173f;
            if (f30Var2 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            r43 = f30Var2.z6();
        }
        return r43 == null ? "" : r43;
    }

    public final String v3() {
        f30 f30Var = this.f140173f;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        wy0 N = b40.N(f30Var);
        String Z2 = N != null ? N.Z2() : null;
        return Z2 == null ? "" : Z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        ((lh0.g1) r17.f140169b.f83376a).c("android_ad_gma_video_iteration");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w3(long r18) {
        /*
            r17 = this;
            r1 = r17
            yk1.n r0 = r17.getViewIfBound()     // Catch: java.lang.Exception -> L16
            yv.h r0 = (yv.h) r0     // Catch: java.lang.Exception -> L16
            r2 = 0
            if (r0 == 0) goto L25
            boolean r3 = r0 instanceof cw.e     // Catch: java.lang.Exception -> L16
            if (r3 != 0) goto L18
            boolean r3 = r0 instanceof aw.f     // Catch: java.lang.Exception -> L16
            if (r3 == 0) goto L14
            goto L18
        L14:
            r0 = r2
            goto L18
        L16:
            r0 = move-exception
            goto L63
        L18:
            if (r0 == 0) goto L25
            lh0.h r0 = r1.f140169b     // Catch: java.lang.Exception -> L16
            java.lang.String r3 = "android_ad_gma_video_iteration"
            lh0.z0 r0 = r0.f83376a     // Catch: java.lang.Exception -> L16
            lh0.g1 r0 = (lh0.g1) r0     // Catch: java.lang.Exception -> L16
            r0.c(r3)     // Catch: java.lang.Exception -> L16
        L25:
            ew.m r0 = r1.f140168a     // Catch: java.lang.Exception -> L16
            com.pinterest.api.model.f30 r3 = r1.f140173f     // Catch: java.lang.Exception -> L16
            java.lang.String r4 = "pin"
            if (r3 == 0) goto L5f
            java.lang.String r3 = r3.getUid()     // Catch: java.lang.Exception -> L16
            java.lang.String r5 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)     // Catch: java.lang.Exception -> L16
            ew.j r0 = (ew.j) r0     // Catch: java.lang.Exception -> L16
            bj.f r14 = r0.b(r3)     // Catch: java.lang.Exception -> L16
            if (r14 == 0) goto L78
            dw.b r5 = r1.f140170c     // Catch: java.lang.Exception -> L16
            com.pinterest.api.model.f30 r8 = r1.f140173f     // Catch: java.lang.Exception -> L16
            if (r8 == 0) goto L5b
            int r11 = r1.f140174g     // Catch: java.lang.Exception -> L16
            int r12 = r1.f140176i     // Catch: java.lang.Exception -> L16
            r5.getClass()     // Catch: java.lang.Exception -> L16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)     // Catch: java.lang.Exception -> L16
            h32.f1 r7 = h32.f1.GMA_AD_RENDERED     // Catch: java.lang.Exception -> L16
            r6 = 0
            r13 = 0
            r15 = 1
            r16 = 256(0x100, float:3.59E-43)
            r9 = r18
            dw.b.f(r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L16
            goto L78
        L5b:
            kotlin.jvm.internal.Intrinsics.r(r4)     // Catch: java.lang.Exception -> L16
            throw r2     // Catch: java.lang.Exception -> L16
        L5f:
            kotlin.jvm.internal.Intrinsics.r(r4)     // Catch: java.lang.Exception -> L16
            throw r2     // Catch: java.lang.Exception -> L16
        L63:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to call onAdRendered: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            tb0.p r3 = tb0.p.ADS_GMA
            tb0.h r4 = r1.f140171d
            r4.q(r0, r2, r3)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yv.f.w3(long):void");
    }

    public final void x3() {
        try {
            m mVar = this.f140168a;
            f30 f30Var = this.f140173f;
            if (f30Var == null) {
                Intrinsics.r("pin");
                throw null;
            }
            String uid = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            bj.f nativeAd = ((ew.j) mVar).b(uid);
            if (nativeAd != null) {
                dw.b bVar = this.f140170c;
                f30 pin = this.f140173f;
                if (pin == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                int i13 = this.f140174g;
                int i14 = this.f140176i;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
                bVar.e(null, f1.GMA_AD_STEP, pin, 0L, i13, i14, "did_play_video", nativeAd, null, (r24 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : false);
            }
        } catch (Exception e13) {
            this.f140171d.q(e13, "Failed to call onDidVideoPlay: " + e13, p.ADS_GMA);
        }
    }

    public final void z3() {
        try {
            m mVar = this.f140168a;
            f30 f30Var = this.f140173f;
            if (f30Var == null) {
                Intrinsics.r("pin");
                throw null;
            }
            String uid = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            bj.f nativeAd = ((ew.j) mVar).b(uid);
            if (nativeAd != null) {
                dw.b bVar = this.f140170c;
                f30 pin = this.f140173f;
                if (pin == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                int i13 = this.f140174g;
                int i14 = this.f140176i;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
                bVar.e(null, f1.GMA_AD_STEP, pin, 0L, i13, i14, "did_start_video", nativeAd, null, (r24 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : false);
            }
        } catch (Exception e13) {
            this.f140171d.q(e13, "Failed to call onDidVideoStart: " + e13, p.ADS_GMA);
        }
    }
}
