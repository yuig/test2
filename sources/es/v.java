package es;

import android.net.Uri;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.e7;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g;
import com.pinterest.api.model.h80;
import com.pinterest.api.model.i3;
import com.pinterest.api.model.ld;
import com.pinterest.api.model.ln;
import com.pinterest.api.model.md;
import com.pinterest.api.model.oe0;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.st;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.xh0;
import df.j1;
import h32.g0;
import h32.j0;
import h32.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lh0.a4;
import lh0.g1;
import lh0.z0;
import lh0.z3;

/* loaded from: classes.dex */
public final class v implements h {

    /* renamed from: a, reason: collision with root package name */
    public final lh0.d f60008a;

    /* renamed from: b, reason: collision with root package name */
    public final a f60009b;

    /* renamed from: c, reason: collision with root package name */
    public final ws1.a f60010c;

    /* renamed from: d, reason: collision with root package name */
    public final np1.a f60011d;

    /* renamed from: e, reason: collision with root package name */
    public final z82.c f60012e;

    /* renamed from: f, reason: collision with root package name */
    public final hf0.b f60013f;

    /* renamed from: g, reason: collision with root package name */
    public final tb0.h f60014g;

    public v(lh0.d adFormatsLibraryExperiments, a adFormats, ws1.a linkValidation, np1.a handshakeManager, z82.c targetHandshakeDataReader, hf0.b device, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(adFormatsLibraryExperiments, "adFormatsLibraryExperiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(linkValidation, "linkValidation");
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        Intrinsics.checkNotNullParameter(targetHandshakeDataReader, "targetHandshakeDataReader");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f60008a = adFormatsLibraryExperiments;
        this.f60009b = adFormats;
        this.f60010c = linkValidation;
        this.f60011d = handshakeManager;
        this.f60012e = targetHandshakeDataReader;
        this.f60013f = device;
        this.f60014g = crashReporting;
    }

    public static boolean Q(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Integer V = b40.V(pin);
        return ((double) b40.W(pin)) >= 0.5d && V != null && V.intValue() >= 11;
    }

    public static String u(f30 pin) {
        List y13;
        we0 we0Var;
        xh0 w13;
        List r13;
        h80 h80Var;
        xh0 r14;
        String g13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        oe0 f63 = pin.f6();
        if (f63 != null && (r13 = f63.r()) != null && (h80Var = (h80) CollectionsKt.firstOrNull(r13)) != null && (r14 = h80Var.r()) != null && (g13 = r14.g()) != null) {
            return g13;
        }
        se0 g63 = pin.g6();
        if (g63 == null || (y13 = g63.y()) == null || (we0Var = (we0) CollectionsKt.firstOrNull(y13)) == null || (w13 = we0Var.w()) == null) {
            return null;
        }
        return w13.g();
    }

    public final ArrayList A(f30 pin, lh0.d experiments, Boolean bool) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        return z(pin, experiments.j(), experiments.h(), bool);
    }

    public final boolean B(f30 pin) {
        Boolean bool;
        Boolean bool2;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!pin.d5().booleanValue()) {
            return false;
        }
        com.pinterest.api.model.g t33 = pin.t3();
        if (t33 == null || (bool = t33.l0()) == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        com.pinterest.api.model.g t34 = pin.t3();
        if (t34 == null || (bool2 = t34.m0()) == null) {
            bool2 = Boolean.FALSE;
        }
        boolean booleanValue2 = bool2.booleanValue();
        u22.a aVar = u22.c.Companion;
        com.pinterest.api.model.g t35 = pin.t3();
        int intValue = (t35 != null ? t35.M() : 0).intValue();
        aVar.getClass();
        u22.c a13 = u22.a.a(intValue);
        if (a13 == null) {
            a13 = u22.c.DEFAULT;
        }
        return booleanValue || booleanValue2 || a13 != u22.c.DEFAULT;
    }

    public final boolean C(f30 f30Var, boolean z13, Function0 activateExperiment) {
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        if (((c) this.f60009b).H(f30Var)) {
            activateExperiment.invoke();
            if (z13) {
                return true;
            }
        }
        return false;
    }

    public final boolean D() {
        return ((np1.i) this.f60011d.f91765a).f91797i != null;
    }

    public final boolean E(f30 f30Var, g0 g0Var) {
        if (f30Var != null && n60.o.B(f30Var, "getIsPromoted(...)") && !b40.T0(f30Var) && g0Var != g0.ADS_ONLY_CAROUSEL) {
            com.pinterest.api.model.g t33 = f30Var.t3();
            if ((t33 != null ? t33.W() : null) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean F(f30 f30Var, boolean z13, Function0 activateBrandNameReorderExperiment) {
        Intrinsics.checkNotNullParameter(activateBrandNameReorderExperiment, "activateBrandNameReorderExperiment");
        if (f30Var == null) {
            return false;
        }
        if (n60.o.B(f30Var, "getIsPromoted(...)") && !b40.w0(f30Var)) {
            return false;
        }
        activateBrandNameReorderExperiment.invoke();
        return z13;
    }

    public final boolean G(f30 pin, boolean z13, boolean z14, boolean z15, boolean z16) {
        com.pinterest.api.model.g t33;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (B(pin) && J(pin, z15, z16) && !pin.h5().booleanValue() && (t33 = pin.t3()) != null && Intrinsics.d(t33.l0(), Boolean.TRUE)) {
            return z13 || z14;
        }
        return false;
    }

    public final boolean H(f30 pin, boolean z13, boolean z14, boolean z15, boolean z16) {
        com.pinterest.api.model.g t33;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (B(pin) && J(pin, z15, z16) && !pin.h5().booleanValue() && (t33 = pin.t3()) != null && Intrinsics.d(t33.m0(), Boolean.TRUE)) {
            return z13 || z14;
        }
        return false;
    }

    public final boolean I(f30 pin, boolean z13, boolean z14, boolean z15, boolean z16, Function0 activateAdsDlCtaDecouplingExperiment, Function0 isPinTagDecanEnabledAndActivate) {
        String h10;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateAdsDlCtaDecouplingExperiment, "activateAdsDlCtaDecouplingExperiment");
        Intrinsics.checkNotNullParameter(isPinTagDecanEnabledAndActivate, "isPinTagDecanEnabledAndActivate");
        if (z13 || z14) {
            return false;
        }
        c cVar = (c) this.f60009b;
        if (cVar.A(pin) || cVar.Q(pin)) {
            return false;
        }
        Integer g13 = cVar.g(pin);
        int value = u22.l.DIRECT_TO_DESTINATION.getValue();
        if (g13 == null || g13.intValue() != value || N(pin, z16, isPinTagDecanEnabledAndActivate)) {
            return false;
        }
        com.pinterest.api.model.g t33 = pin.t3();
        if (t33 != null && Intrinsics.d(t33.c0(), Boolean.TRUE)) {
            return false;
        }
        Boolean b53 = pin.b5();
        Intrinsics.checkNotNullExpressionValue(b53, "getIsPremiere(...)");
        if (b53.booleanValue() || (h10 = cVar.h(pin)) == null || h10.length() == 0) {
            return false;
        }
        activateAdsDlCtaDecouplingExperiment.invoke();
        return z15;
    }

    public final boolean J(f30 pin, boolean z13, boolean z14) {
        com.pinterest.api.model.g t33;
        Intrinsics.checkNotNullParameter(pin, "pin");
        a aVar = this.f60009b;
        return ((c) aVar).R(pin) && !(((t33 = pin.t3()) != null && Intrinsics.d(t33.c0(), Boolean.TRUE)) || ((c) aVar).A(pin) || pin.i5().booleanValue() || z13 || z14);
    }

    public final boolean K(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (((c) this.f60009b).U(pin)) {
            this.f60013f.getClass();
            if (hf0.b.q()) {
                return true;
            }
        }
        return false;
    }

    public final boolean L(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (z13) {
            String M5 = pin.M5();
            ((ws1.b) this.f60010c).getClass();
            if (M5 != null && (!z.j(M5))) {
                Uri parse = Uri.parse(M5);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                if (j1.f1(parse)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        r2 = t(r2, lh0.d.f83320b.b());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M(com.pinterest.api.model.f30 r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Boolean r0 = r2.U5()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L26
            java.lang.String r0 = "getIsPromoted(...)"
            boolean r0 = n60.o.B(r2, r0)
            if (r0 == 0) goto L26
            java.util.ArrayList r2 = es.h.d(r1, r2)
            if (r2 == 0) goto L26
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L24
            goto L26
        L24:
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: es.v.M(com.pinterest.api.model.f30):boolean");
    }

    public final boolean N(f30 pin, boolean z13, Function0 experimentCheckAndActivate) {
        ArrayList s13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(experimentCheckAndActivate, "experimentCheckAndActivate");
        return (pin.U5().booleanValue() || !n60.o.B(pin, "getIsPromoted(...)") || (s13 = s(pin, ((Boolean) experimentCheckAndActivate.invoke()).booleanValue(), z13)) == null || s13.isEmpty()) ? false : true;
    }

    public final boolean O(f30 pin, boolean z13, boolean z14, Function0 activatePinTagDecanExperiment) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activatePinTagDecanExperiment, "activatePinTagDecanExperiment");
        if (pin.U5().booleanValue() || !n60.o.B(pin, "getIsPromoted(...)")) {
            return false;
        }
        ArrayList s13 = s(pin, z14, z13);
        boolean z15 = s13 == null || s13.isEmpty();
        activatePinTagDecanExperiment.invoke();
        return !z15;
    }

    public final boolean P() {
        b92.a aVar = ((z82.j) this.f60012e.f141104a).f141135i;
        return (aVar.f22246a == null || aVar.a()) ? false : true;
    }

    public final void R(f30 pin, boolean z13) {
        String str;
        List N;
        List m13;
        String E;
        List N2;
        List m14;
        Intrinsics.checkNotNullParameter(pin, "pin");
        md O3 = pin.O3();
        f3 z33 = pin.z3();
        if (z13) {
            if (this.f60008a.e(a4.f83297a)) {
                Integer num = null;
                if (Intrinsics.d(O3 != null ? O3.k() : null, z33 != null ? z33.E() : null)) {
                    if (Intrinsics.d((O3 == null || (m14 = O3.m()) == null) ? null : Integer.valueOf(m14.size()), (z33 == null || (N2 = z33.N()) == null) ? null : Integer.valueOf(N2.size()))) {
                        return;
                    }
                }
                tb0.k kVar = new tb0.k();
                kVar.c("metric_type", "collectionPin_vs_aggregatedPinData_discrepancy");
                String uid = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                kVar.c("identifier", uid);
                String i63 = pin.i6();
                if (i63 == null) {
                    i63 = "";
                }
                kVar.c("root_pin_id", i63);
                kVar.c("pin_promotion_id", String.valueOf(pin.F5()));
                md O32 = pin.O3();
                String str2 = "null";
                if (O32 == null || (str = O32.k()) == null) {
                    str = "null";
                }
                kVar.c("collection_pin.collections_header_text", str);
                f3 z34 = pin.z3();
                if (z34 != null && (E = z34.E()) != null) {
                    str2 = E;
                }
                kVar.c("aggregated_pin_data.collections_header_text", str2);
                md O33 = pin.O3();
                kVar.c("collection_pin.item_data.count", String.valueOf((O33 == null || (m13 = O33.m()) == null) ? null : Integer.valueOf(m13.size())));
                f3 z35 = pin.z3();
                if (z35 != null && (N = z35.N()) != null) {
                    num = Integer.valueOf(N.size());
                }
                kVar.c("aggregated_pin_data.pin_tags_chips.count", String.valueOf(num));
                this.f60014g.k("apd_to_cpd_discrepancy", kVar.f117102a);
            }
        }
    }

    public final boolean S(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        lh0.d dVar = this.f60008a;
        dVar.getClass();
        z3 z3Var = a4.f83297a;
        z0 z0Var = dVar.f83323a;
        g1 g1Var = (g1) z0Var;
        g1 g1Var2 = (g1) z0Var;
        g1 g1Var3 = (g1) z0Var;
        return T(pin, g1Var.o("android_ads_short_video_letterbox", "enabled", z3Var) || g1Var.l("android_ads_short_video_letterbox"), new u(dVar, 0), g1Var2.o("ads_amazon_native_video_new_chin", "enabled", z3Var) || g1Var2.l("ads_amazon_native_video_new_chin"), new u(dVar, 1), g1Var3.o("android_ads_short_video_letterbox_pharma_finserv", "enabled", z3Var) || g1Var3.l("android_ads_short_video_letterbox_pharma_finserv"), new u(dVar, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r10 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean T(com.pinterest.api.model.f30 r5, boolean r6, kotlin.jvm.functions.Function0 r7, boolean r8, kotlin.jvm.functions.Function0 r9, boolean r10, kotlin.jvm.functions.Function0 r11) {
        /*
            r4 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r1 = "activateLetterBoxExperiment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "activateAmazonNativeVideoNewChinExperiment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "activatePharmaFinservExperiment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            java.lang.Boolean r1 = r5.d5()
            java.lang.String r2 = "getIsPromoted(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto La0
            es.a r1 = r4.f60009b
            es.c r1 = (es.c) r1
            boolean r2 = r1.S(r5)
            if (r2 != 0) goto La0
            boolean r2 = r1.P(r5)
            if (r2 != 0) goto La0
            boolean r2 = r1.K(r5)
            if (r2 != 0) goto La0
            com.pinterest.api.model.b01 r2 = r5.M6()
            if (r2 == 0) goto L44
            java.util.Map r2 = r2.g()
            goto L45
        L44:
            r2 = 0
        L45:
            if (r2 == 0) goto La0
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4e
            goto La0
        L4e:
            r1.getClass()
            java.lang.Boolean r2 = r5.Q5()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r2 != 0) goto La0
            java.lang.Boolean r2 = r5.b5()
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto La0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Boolean r0 = r5.i5()
            java.lang.String r2 = "getIsThirdPartyAd(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L82
            lh0.d r0 = r4.f60008a
            boolean r0 = r0.f()
            if (r0 != 0) goto L82
            goto La0
        L82:
            boolean r8 = r4.C(r5, r8, r9)
            if (r8 != 0) goto La0
            boolean r8 = com.pinterest.api.model.b40.E0(r5)
            if (r8 == 0) goto La0
            boolean r5 = r1.I(r5)
            if (r5 != 0) goto L99
            r11.invoke()
            if (r10 == 0) goto La0
        L99:
            r7.invoke()
            if (r6 == 0) goto La0
            r5 = 1
            goto La1
        La0:
            r5 = 0
        La1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: es.v.T(com.pinterest.api.model.f30, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0):boolean");
    }

    public final boolean U(f30 pin, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        lh0.d dVar = this.f60008a;
        dVar.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) dVar.f83323a;
        return V(pin, z13, z14, g1Var.o("android_handshake_show_badge", "enabled", z3Var) || g1Var.l("android_handshake_show_badge"), new t(this, 1));
    }

    public final boolean V(f30 pin, boolean z13, boolean z14, boolean z15, Function0 activateExperiment) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        if (!z13 && !z14) {
            com.pinterest.api.model.g t33 = pin.t3();
            List N = t33 != null ? t33.N() : null;
            if (N != null && !N.isEmpty() && b40.p0(pin)) {
                lh0.d dVar = this.f60008a;
                dVar.getClass();
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) dVar.f83323a;
                if (!g1Var.o("android_handshake_bypass_link_check", "enabled", z3Var) && !g1Var.l("android_handshake_bypass_link_check") && !D()) {
                    return false;
                }
                activateExperiment.invoke();
                return z15;
            }
        }
        return false;
    }

    public final boolean W(f30 pin, boolean z13, boolean z14, boolean z15, Function0 activateExperiment) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        if (z13 || z14 || !b40.p0(pin) || u(pin) == null) {
            return false;
        }
        activateExperiment.invoke();
        return z15;
    }

    public final boolean X(f30 pin, boolean z13, boolean z14, boolean z15, Function0 activateExperiment) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        Boolean h53 = pin.h5();
        Intrinsics.checkNotNullExpressionValue(h53, "getIsSubtleAd(...)");
        if (h53.booleanValue() || z13 || z14 || !b40.p0(pin) || b40.J(pin) == null) {
            return false;
        }
        activateExperiment.invoke();
        return z15;
    }

    public final boolean Y(f30 pin, boolean z13, boolean z14, boolean z15, Function0 activateExperiment) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        Boolean h53 = pin.h5();
        Intrinsics.checkNotNullExpressionValue(h53, "getIsSubtleAd(...)");
        if (h53.booleanValue() || z13 || z14 || !b40.p0(pin) || !Q(pin)) {
            return false;
        }
        activateExperiment.invoke();
        return z15;
    }

    public final boolean Z(f30 pin, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (z13 || z14 || !pin.d5().booleanValue()) {
            return false;
        }
        com.pinterest.api.model.g t33 = pin.t3();
        if (t33 != null && Intrinsics.d(t33.c0(), Boolean.TRUE)) {
            return false;
        }
        Boolean h53 = pin.h5();
        Intrinsics.checkNotNullExpressionValue(h53, "getIsSubtleAd(...)");
        return h53.booleanValue();
    }

    public final boolean a0(f30 pin, boolean z13, boolean z14, boolean z15, lf.a aVar, boolean z16, boolean z17, boolean z18, boolean z19) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        boolean z23 = z13 || z14;
        a aVar2 = this.f60009b;
        String h10 = ((c) aVar2).h(pin);
        boolean K = (h10 == null || z.j(h10)) ? ((c) aVar2).K(pin) : true;
        Boolean b53 = pin.b5();
        Intrinsics.checkNotNullExpressionValue(b53, "getIsPremiere(...)");
        return (b53.booleanValue() || !z15 || z18 || z17 || (!K && !((c) aVar2).S(pin) && !((c) aVar2).P(pin)) || z23 || z16 || z19) ? false : true;
    }

    public final boolean b0(f30 pin, boolean z13, boolean z14, Function0 activateAdCollageAlphaExperiment, Function0 activateBetaExperiment) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateAdCollageAlphaExperiment, "activateAdCollageAlphaExperiment");
        Intrinsics.checkNotNullParameter(activateBetaExperiment, "activateBetaExperiment");
        if (((c) this.f60009b).x(pin)) {
            activateAdCollageAlphaExperiment.invoke();
            if (z13) {
                com.pinterest.api.model.g t33 = pin.t3();
                if ((t33 != null ? t33.P() : null) == g.a.AWARENESS) {
                    activateBetaExperiment.invoke();
                    if (z14) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        lh0.d dVar = this.f60008a;
        dVar.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) dVar.f83323a;
        return d0(pin, g1Var.o("android_dynamic_corner_badge_killswitch", "enabled", z3Var) || g1Var.l("android_dynamic_corner_badge_killswitch"), new t(this, 6));
    }

    public final boolean d0(f30 pin, boolean z13, Function0 activateExperiment) {
        e7 O;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        if (((t33 == null || (O = t33.O()) == null) ? null : O.h()) == e7.b.CORNER && j1.U0(x(pin))) {
            activateExperiment.invoke();
            if (!z13) {
                return true;
            }
        }
        return false;
    }

    public final boolean e0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!B(pin)) {
            return false;
        }
        com.pinterest.api.model.g t33 = pin.t3();
        Boolean l03 = t33 != null ? t33.l0() : null;
        if (l03 == null) {
            return false;
        }
        return l03.booleanValue();
    }

    public final u22.c f(f30 pin, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        u22.c i13 = i(pin);
        return z13 ? (!z15 || (i13 == u22.c.DEFAULT && !z14)) ? u22.c.SHORT : i13 : i13;
    }

    public final boolean f0(f30 pin, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        z3 z3Var = a4.f83297a;
        lh0.d dVar = this.f60008a;
        return g0(pin, z13, z14, z15, z16, dVar.l("enabled_price_on_search_no_rp", z3Var), dVar.l("enabled_price_on_search_and_rp", z3Var), dVar.l("enabled_price_and_ratings_on_search_no_rp", z3Var), dVar.l("enabled_price_and_ratings_on_search_and_rp", z3Var), new t(this, 7));
    }

    public final k0 g(f30 f30Var, boolean z13, boolean z14) {
        com.pinterest.api.model.g t33;
        f3.a I;
        Short valueOf;
        ArrayList arrayList;
        long j13;
        long j14;
        f3.a I2;
        md.a l13;
        ArrayList arrayList2 = null;
        if (f30Var == null || !Intrinsics.d(f30Var.N5(), Boolean.TRUE)) {
            if (((f30Var == null || (t33 = f30Var.t3()) == null) ? null : t33.R()) == null) {
                return null;
            }
        }
        Boolean N5 = f30Var.N5();
        Intrinsics.checkNotNullExpressionValue(N5, "getPromotedIsAutoAssembled(...)");
        Integer k43 = N5.booleanValue() ? f30Var.k4() : null;
        com.pinterest.api.model.g t34 = f30Var.t3();
        String R = t34 != null ? t34.R() : null;
        com.pinterest.api.model.g t35 = f30Var.t3();
        String b03 = t35 != null ? t35.b0() : null;
        if (z14) {
            md O3 = f30Var.O3();
            if (O3 == null || (l13 = O3.l()) == null) {
                f3 z33 = f30Var.z3();
                if (z33 != null && (I2 = z33.I()) != null) {
                    valueOf = Short.valueOf((short) I2.getValue());
                }
                valueOf = null;
            } else {
                valueOf = Short.valueOf((short) l13.getValue());
            }
        } else {
            f3 z34 = f30Var.z3();
            if (z34 != null && (I = z34.I()) != null) {
                valueOf = Short.valueOf((short) I.getValue());
            }
            valueOf = null;
        }
        ArrayList s13 = s(f30Var, z13, z14);
        if (s13 != null) {
            arrayList = new ArrayList(kotlin.collections.g0.q(s13, 10));
            Iterator it = s13.iterator();
            while (it.hasNext()) {
                try {
                    String uid = ((f30) it.next()).getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    j14 = Long.parseLong(uid);
                } catch (Exception unused) {
                    j14 = -1;
                }
                arrayList.add(Long.valueOf(j14));
            }
        } else {
            arrayList = null;
        }
        if (s13 != null) {
            if (!s13.isEmpty()) {
                Iterator it2 = s13.iterator();
                while (it2.hasNext()) {
                    if (((f30) it2.next()).r5() == null) {
                    }
                }
            }
            j0 j0Var = new j0();
            j0Var.f67119a = k43;
            j0Var.f67120b = R;
            j0Var.f67121c = valueOf;
            j0Var.f67122d = b03;
            j0Var.f67124f = arrayList;
            j0Var.f67123e = arrayList2;
            return j0Var.a();
        }
        if (s13 != null) {
            arrayList2 = new ArrayList(kotlin.collections.g0.q(s13, 10));
            Iterator it3 = s13.iterator();
            while (it3.hasNext()) {
                String r53 = ((f30) it3.next()).r5();
                if (r53 != null) {
                    try {
                        j13 = Long.parseLong(r53);
                    } catch (Exception unused2) {
                        j13 = -1;
                    }
                } else {
                    j13 = 0;
                }
                arrayList2.add(Long.valueOf(j13));
            }
        }
        j0 j0Var2 = new j0();
        j0Var2.f67119a = k43;
        j0Var2.f67120b = R;
        j0Var2.f67121c = valueOf;
        j0Var2.f67122d = b03;
        j0Var2.f67124f = arrayList;
        j0Var2.f67123e = arrayList2;
        return j0Var2.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g0(com.pinterest.api.model.f30 r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, kotlin.jvm.functions.Function0 r13) {
        /*
            r3 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "activateExperiment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            boolean r0 = com.pinterest.api.model.b40.p0(r4)
            r1 = 0
            if (r0 != 0) goto L42
            java.lang.Boolean r0 = r4.h5()
            java.lang.String r2 = "getIsSubtleAd(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L21
            goto L42
        L21:
            boolean r4 = r3.J(r4, r7, r8)
            if (r4 == 0) goto L42
            r4 = 1
            if (r5 == 0) goto L34
            if (r9 != 0) goto L32
            if (r10 != 0) goto L32
            if (r11 != 0) goto L32
            if (r12 == 0) goto L3b
        L32:
            r1 = r4
            goto L3b
        L34:
            if (r6 == 0) goto L3b
            if (r10 != 0) goto L32
            if (r12 == 0) goto L3b
            goto L32
        L3b:
            if (r5 != 0) goto L3f
            if (r6 == 0) goto L42
        L3f:
            r13.invoke()
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: es.v.g0(com.pinterest.api.model.f30, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0):boolean");
    }

    public final boolean h(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return v(pin) > 0;
    }

    public final boolean h0(f30 pin, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        z3 z3Var = a4.f83297a;
        lh0.d dVar = this.f60008a;
        return i0(pin, z13, z14, z15, z16, dVar.l("enabled_price_and_ratings_on_search_no_rp", z3Var), dVar.l("enabled_price_and_ratings_on_search_and_rp", z3Var), new t(this, 8));
    }

    public final u22.c i(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!B(pin)) {
            return u22.c.DEFAULT;
        }
        u22.a aVar = u22.c.Companion;
        com.pinterest.api.model.g t33 = pin.t3();
        int intValue = (t33 != null ? t33.M() : 0).intValue();
        aVar.getClass();
        u22.c a13 = u22.a.a(intValue);
        return a13 == null ? u22.c.DEFAULT : a13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r6 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i0(com.pinterest.api.model.f30 r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, kotlin.jvm.functions.Function0 r11) {
        /*
            r3 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "activateExperiment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            boolean r0 = com.pinterest.api.model.b40.p0(r4)
            r1 = 0
            if (r0 != 0) goto L42
            java.lang.Boolean r0 = r4.h5()
            java.lang.String r2 = "getIsSubtleAd(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L21
            goto L42
        L21:
            boolean r7 = r3.J(r4, r7, r8)
            if (r7 == 0) goto L42
            boolean r4 = Q(r4)
            if (r4 == 0) goto L39
            if (r5 == 0) goto L36
            if (r9 != 0) goto L33
            if (r10 == 0) goto L39
        L33:
            r4 = 1
            r10 = r4
            goto L3a
        L36:
            if (r6 == 0) goto L39
            goto L3a
        L39:
            r10 = r1
        L3a:
            if (r5 != 0) goto L3e
            if (r6 == 0) goto L41
        L3e:
            r11.invoke()
        L41:
            return r10
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: es.v.i0(com.pinterest.api.model.f30, boolean, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0):boolean");
    }

    public final d j(g.b bVar) {
        int i13 = bVar == null ? -1 : j.f59987b[bVar.ordinal()];
        if (i13 == 2 || i13 == 3) {
            return d.ORIGINAL;
        }
        if (i13 == 5 || i13 == 6) {
            return d.FORMAT_EXPANSION;
        }
        return null;
    }

    public final boolean j0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!B(pin)) {
            return false;
        }
        com.pinterest.api.model.g t33 = pin.t3();
        Boolean m03 = t33 != null ? t33.m0() : null;
        if (m03 == null) {
            return false;
        }
        return m03.booleanValue();
    }

    public final float k(List pins, List possibleMediaAspectRatios) {
        int i13;
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(possibleMediaAspectRatios, "possibleMediaAspectRatios");
        List list = possibleMediaAspectRatios;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            i13 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ((Number) next).floatValue();
            linkedHashMap.put(next, 0);
        }
        Iterator it2 = pins.iterator();
        while (true) {
            Object obj = null;
            r3 = null;
            r3 = null;
            Float f13 = null;
            if (!it2.hasNext()) {
                Iterator it3 = linkedHashMap.entrySet().iterator();
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (it3.hasNext()) {
                        int intValue = ((Number) ((Map.Entry) obj).getValue()).intValue();
                        do {
                            Object next2 = it3.next();
                            int intValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                            if (intValue < intValue2) {
                                obj = next2;
                                intValue = intValue2;
                            }
                        } while (it3.hasNext());
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry != null) {
                    return ((Number) entry.getKey()).floatValue();
                }
                Float f14 = (Float) CollectionsKt.firstOrNull(possibleMediaAspectRatios);
                if (f14 != null) {
                    return f14.floatValue();
                }
                return 1.0f;
            }
            Map A4 = ((f30) it2.next()).A4();
            if (A4 != null) {
                String str = (String) CollectionsKt.c0(A4.keySet());
                sr srVar = (sr) A4.get(str);
                Double k13 = srVar != null ? srVar.k() : null;
                sr srVar2 = (sr) A4.get(str);
                Double h10 = srVar2 != null ? srVar2.h() : null;
                if (k13 != null && h10 != null) {
                    f13 = Float.valueOf((float) (h10.doubleValue() / k13.doubleValue()));
                }
            }
            if (f13 != null) {
                float floatValue = f13.floatValue();
                Iterator it4 = list.iterator();
                if (!it4.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object obj2 = it4.next();
                while (it4.hasNext()) {
                    float floatValue2 = ((Number) it4.next()).floatValue();
                    float floatValue3 = ((Number) obj2).floatValue();
                    if (Math.abs(floatValue3 - floatValue) <= Math.abs(floatValue2 - floatValue)) {
                        floatValue2 = floatValue3;
                    }
                    obj2 = Float.valueOf(floatValue2);
                }
                linkedHashMap.computeIfPresent(Float.valueOf(((Number) obj2).floatValue()), new i(i13, m.f59996i));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r4.equals("employee") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r4.equals("enabled") != false) goto L20;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final es.w k0(lh0.z0 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "experimentsActivator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            lh0.z3 r0 = lh0.a4.f83297a
            lh0.g1 r4 = (lh0.g1) r4
            java.lang.String r1 = "android_pinrep_one_line_title"
            java.lang.String r4 = r4.g(r1, r0)
            r0 = 0
            if (r4 == 0) goto L50
            int r1 = r4.hashCode()
            r2 = 1
            switch(r1) {
                case -1609594047: goto L42;
                case -378759623: goto L33;
                case 1193469614: goto L2a;
                case 1551864628: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L50
        L1b:
            java.lang.String r1 = "enabled_organic_only2"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L24
            goto L50
        L24:
            es.w r4 = new es.w
            r4.<init>(r2, r0)
            goto L55
        L2a:
            java.lang.String r1 = "employee"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L4a
            goto L50
        L33:
            java.lang.String r1 = "enabled_ads_only2"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3c
            goto L50
        L3c:
            es.w r4 = new es.w
            r4.<init>(r0, r2)
            goto L55
        L42:
            java.lang.String r1 = "enabled"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L50
        L4a:
            es.w r4 = new es.w
            r4.<init>(r2, r2)
            goto L55
        L50:
            es.w r4 = new es.w
            r4.<init>(r0, r0)
        L55:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: es.v.k0(lh0.z0):es.w");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r0 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String l(x32.e r5, com.pinterest.api.model.f30 r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            if (r5 != 0) goto L8
            r5 = -1
            goto L10
        L8:
            int[] r1 = es.j.f59986a
            int r5 = r5.ordinal()
            r5 = r1[r5]
        L10:
            r1 = 1
            if (r5 == r1) goto L52
            r1 = 2
            if (r5 == r1) goto L1f
            r1 = 3
            if (r5 == r1) goto L1a
            goto L73
        L1a:
            java.lang.String r0 = u(r6)
            goto L73
        L1f:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            es.a r1 = r4.f60009b
            es.c r1 = (es.c) r1
            java.lang.String r2 = r1.k(r6)
            java.lang.String r3 = "price"
            if (r2 == 0) goto L42
            r5.put(r3, r2)
            java.lang.String r1 = r1.j(r6)
            if (r1 == 0) goto L40
            java.lang.String r0 = "standard_price"
            r5.put(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.f80348a
        L40:
            if (r0 != 0) goto L4d
        L42:
            java.lang.String r6 = com.pinterest.api.model.b40.J(r6)
            if (r6 == 0) goto L4d
            r5.put(r3, r6)
            kotlin.Unit r6 = kotlin.Unit.f80348a
        L4d:
            java.lang.String r0 = r5.toString()
            goto L73
        L52:
            float r5 = com.pinterest.api.model.b40.W(r6)
            java.lang.Integer r6 = com.pinterest.api.model.b40.V(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = " ("
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: es.v.l(x32.e, com.pinterest.api.model.f30):java.lang.String");
    }

    public final g.b m(f30 f30Var, boolean z13) {
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        lh0.d dVar = this.f60008a;
        return n(f30Var, dVar.d("enabled_flicker", z3Var), dVar.d("enabled_overlay", z3Var), dVar.c("enabled_expansion_overlay", z3Var), dVar.c("enabled_expansion_icon", z3Var), z13 ? new n(dVar) : o.f59997i, z13 ? new p(dVar) : q.f59998i);
    }

    public final g.b n(f30 f30Var, boolean z13, boolean z14, boolean z15, boolean z16, Function0 activateExperiment, Function0 activateFormatExpansionExperiment) {
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        Intrinsics.checkNotNullParameter(activateFormatExpansionExperiment, "activateFormatExpansionExperiment");
        return p(f30Var, false, z13, z14, false, z15, z16, activateExperiment, activateFormatExpansionExperiment);
    }

    public final Short o(f30 f30Var) {
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        lh0.d dVar = this.f60008a;
        g.b p13 = p(f30Var, dVar.d("control", z3Var), dVar.d("enabled_flicker", z3Var), dVar.d("enabled_overlay", z3Var), dVar.c("control", z3Var), dVar.c("enabled_expansion_overlay", z3Var), dVar.c("enabled_expansion_icon", z3Var), r.f59999j, r.f60000k);
        if (p13 != null) {
            return Short.valueOf((short) p13.getValue());
        }
        return null;
    }

    public final g.b p(f30 f30Var, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, Function0 function0, Function0 function02) {
        com.pinterest.api.model.g t33;
        if (f30Var == null || !Intrinsics.d(f30Var.d5(), Boolean.TRUE) || !b40.w0(f30Var)) {
            return null;
        }
        ((c) this.f60009b).getClass();
        g.b a03 = (f30Var == null || (t33 = f30Var.t3()) == null) ? null : t33.a0();
        switch (a03 == null ? -1 : j.f59987b[a03.ordinal()]) {
            case 1:
            case 2:
            case 3:
                function0.invoke();
                break;
            case 4:
            case 5:
            case 6:
                function02.invoke();
                break;
            default:
                return null;
        }
        if ((a03 == g.b.CONTROL && z13) || ((a03 == g.b.ENABLED_FLICKER && z14) || ((a03 == g.b.ENABLED_OVERLAY && z15) || ((a03 == g.b.CONTROL_EXPANSION && z16) || ((a03 == g.b.ENABLED_EXPANSION_OVERLAY && z17) || (a03 == g.b.ENABLED_EXPANSION_ICON && z18)))))) {
            return a03;
        }
        return null;
    }

    public final u22.f q(f30 pin) {
        ln e03;
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        Integer h10 = (t33 == null || (e03 = t33.e0()) == null) ? null : e03.h();
        return (h10 != null && h10.intValue() == 0) ? u22.f.ARROW : u22.f.CHEVRON;
    }

    public final x32.b r(f30 pin, x32.e eVar, String str, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!b40.p0(pin)) {
            if (!b40.S0(pin)) {
                return null;
            }
            x32.a aVar = new x32.a();
            aVar.f131650d = Short.valueOf((short) gb0.f.TARGET_HANDSHAKE.getValue());
            aVar.f131649c = bool2;
            return aVar.a();
        }
        x32.a aVar2 = new x32.a();
        aVar2.f131650d = Short.valueOf((short) gb0.f.AMAZON_HANDSHAKE.getValue());
        aVar2.f131649c = bool;
        if (eVar != x32.e.NONE && eVar != null) {
            aVar2.f131647a = eVar;
            aVar2.f131648b = str;
        }
        return aVar2.a();
    }

    public final ArrayList s(f30 pin, boolean z13, boolean z14) {
        ArrayList arrayList;
        List N;
        ArrayList<f30> arrayList2;
        boolean z15;
        List m13;
        List N2;
        f30 f30Var;
        List N3;
        f30 f30Var2;
        List N4;
        f30 f30Var3;
        List N5;
        f30 f30Var4;
        List N6;
        f30 f30Var5;
        List N7;
        f30 f30Var6;
        List N8;
        f30 f30Var7;
        List N9;
        f30 f30Var8;
        Intrinsics.checkNotNullParameter(pin, "pin");
        R(pin, z13);
        md O3 = pin.O3();
        List m14 = O3 != null ? O3.m() : null;
        f3 z33 = pin.z3();
        int i13 = 0;
        boolean z16 = true;
        if (!z13 || m14 == null || !(!m14.isEmpty()) || (pin.N5().booleanValue() && !z14)) {
            arrayList = null;
            if (z33 != null && (N = z33.N()) != null) {
                List list = N;
                arrayList2 = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e30 R6 = ((f30) it.next()).R6();
                    i3 i3Var = new i3(0);
                    f3 z34 = pin.z3();
                    i3Var.f38619i = z34 != null ? z34.I() : null;
                    boolean[] zArr = i3Var.f38629s;
                    if (zArr.length > 8) {
                        zArr[8] = true;
                    }
                    R6.h(i3Var.a());
                    arrayList2.add(R6.a());
                }
            }
            arrayList2 = arrayList;
        } else {
            md O32 = pin.O3();
            if (O32 == null || (m13 = O32.m()) == null) {
                arrayList = null;
                arrayList2 = arrayList;
            } else {
                List list2 = m13;
                arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                int i14 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    st stVar = (st) next;
                    e30 r33 = f30.r3();
                    r33.m1(stVar.q());
                    String r13 = stVar.r();
                    if (r13 == null) {
                        r13 = (z33 == null || (N9 = z33.N()) == null || (f30Var8 = (f30) CollectionsKt.U(i14, N9)) == null) ? null : f30Var8.s5();
                    }
                    r33.n1(r13);
                    Map o13 = stVar.o();
                    if (o13 == null) {
                        o13 = (z33 == null || (N8 = z33.N()) == null || (f30Var7 = (f30) CollectionsKt.U(i14, N8)) == null) ? null : f30Var7.A4();
                    }
                    r33.j0(o13);
                    String w13 = stVar.w();
                    if (w13 == null) {
                        w13 = (z33 == null || (N7 = z33.N()) == null || (f30Var6 = (f30) CollectionsKt.U(i14, N7)) == null) ? null : f30Var6.z6();
                    }
                    r33.q2(w13);
                    String s13 = stVar.s();
                    if (s13 == null) {
                        s13 = (z33 == null || (N6 = z33.N()) == null || (f30Var5 = (f30) CollectionsKt.U(i14, N6)) == null) ? null : f30Var5.getUid();
                    }
                    if (s13 == null) {
                        s13 = "";
                    }
                    r33.x2(s13);
                    String n13 = stVar.n();
                    if (n13 == null) {
                        n13 = (z33 == null || (N5 = z33.N()) == null || (f30Var4 = (f30) CollectionsKt.U(i14, N5)) == null) ? null : f30Var4.z4();
                    }
                    r33.i0(n13);
                    String m15 = stVar.m();
                    if (m15 == null) {
                        m15 = (z33 == null || (N4 = z33.N()) == null || (f30Var3 = (f30) CollectionsKt.U(i14, N4)) == null) ? null : f30Var3.i4();
                    }
                    r33.Y = m15;
                    boolean[] zArr2 = r33.f37101h3;
                    if (zArr2.length > 50) {
                        zArr2[50] = z16;
                    }
                    r33.G1(stVar.v() ? stVar.u() : (z33 == null || (N2 = z33.N()) == null || (f30Var = (f30) CollectionsKt.U(i14, N2)) == null) ? null : f30Var.K5());
                    String t13 = stVar.t();
                    if (t13 == null) {
                        t13 = (z33 == null || (N3 = z33.N()) == null || (f30Var2 = (f30) CollectionsKt.U(i14, N3)) == null) ? null : f30Var2.J5();
                    }
                    r33.F1(t13);
                    ld ldVar = new ld(i13);
                    md O33 = pin.O3();
                    md.a l13 = O33 != null ? O33.l() : null;
                    ldVar.f39715e = l13;
                    boolean[] zArr3 = ldVar.f39720j;
                    if (zArr3.length > 4) {
                        zArr3[4] = z16;
                    }
                    Iterator it3 = it2;
                    r33.C = new md(ldVar.f39711a, ldVar.f39712b, ldVar.f39713c, ldVar.f39714d, l13, ldVar.f39716f, ldVar.f39717g, ldVar.f39718h, ldVar.f39719i, zArr3, 0);
                    boolean[] zArr4 = r33.f37101h3;
                    if (zArr4.length > 28) {
                        zArr4[28] = true;
                    }
                    arrayList2.add(r33.a());
                    it2 = it3;
                    i14 = i15;
                    i13 = 0;
                    z16 = true;
                }
                arrayList = null;
            }
        }
        if (arrayList2 == null) {
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(arrayList2, 10));
        for (f30 subPin : arrayList2) {
            Intrinsics.f(subPin);
            Intrinsics.checkNotNullParameter(subPin, "subPin");
            e30 R62 = subPin.R6();
            R62.f37078d = pin.t3();
            boolean[] zArr5 = R62.f37101h3;
            if (zArr5.length > 3) {
                zArr5[3] = true;
            }
            if (j1.U0(pin.M5())) {
                R62.c2(pin.m6());
            }
            R62.W1 = pin.N5();
            boolean[] zArr6 = R62.f37101h3;
            if (zArr6.length > 152) {
                z15 = true;
                zArr6[152] = true;
            } else {
                z15 = true;
            }
            R62.f37064a0 = pin.k4();
            boolean[] zArr7 = R62.f37101h3;
            if (zArr7.length > 52) {
                zArr7[52] = z15;
            }
            R62.V0(pin.d5());
            f30 a13 = R62.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            arrayList3.add(a13);
        }
        return arrayList3;
    }

    public final ArrayList t(f30 pin, lh0.d experiments) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        return s(pin, experiments.j(), experiments.h());
    }

    public final int v(f30 pin) {
        Map W;
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        Object obj = (t33 == null || (W = t33.W()) == null) ? null : W.get("max_title_lines");
        if (obj instanceof Double) {
            return (int) ((Number) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        return 3;
    }

    public final String w(String originalName) {
        Intrinsics.checkNotNullParameter(originalName, "originalName");
        if (originalName.length() <= 50) {
            return originalName;
        }
        String substring = originalName.substring(0, 50);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return a.a.C(StringsKt.j0(substring).toString(), " …");
    }

    public final String x(f30 pin) {
        e7 O;
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        if (t33 == null || (O = t33.O()) == null) {
            return null;
        }
        return O.f();
    }

    public final x32.e y(f30 pin, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        if (pin == null) {
            return x32.e.NONE;
        }
        if (Y(pin, z13, z14, z16, r.f60001l)) {
            return x32.e.RATING;
        }
        if (X(pin, z13, z14, z17, r.f60002m)) {
            return x32.e.PRICE;
        }
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!z13 && !z14) {
            com.pinterest.api.model.g t33 = pin.t3();
            List N = t33 != null ? t33.N() : null;
            if (N != null && !N.isEmpty() && b40.p0(pin) && z18) {
                return x32.e.BADGE;
            }
        }
        return W(pin, z13, z14, z15, r.f60003n) ? x32.e.DELIVERY : x32.e.NONE;
    }

    public final ArrayList z(f30 pin, boolean z13, boolean z14, Boolean bool) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        ArrayList s13 = s(pin, z13, z14);
        int size = s13 != null ? s13.size() : 0;
        if (size >= 3) {
            return s13;
        }
        if (!Intrinsics.d(bool, Boolean.TRUE) || size <= 0) {
            return null;
        }
        return s13;
    }
}
