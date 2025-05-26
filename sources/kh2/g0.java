package kh2;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.Layout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.oc;
import com.pinterest.api.model.qk0;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zq;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.a4;
import lh0.f4;
import lh0.o4;
import lh0.z3;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class g0 {
    public static final float A(long j13) {
        return Float.intBitsToFloat((int) (j13 & 4294967295L));
    }

    public static final List B(f30 f30Var, lh0.a0 closeupExperiments) {
        bc2.c cVar;
        bc2.c cVar2;
        List d2;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(closeupExperiments, "closeupExperiments");
        cc J3 = f30Var.J3();
        boolean z13 = true;
        if (J3 != null && (d2 = J3.d()) != null && !d2.isEmpty()) {
            closeupExperiments.getClass();
            z3 z3Var = a4.f83298b;
            lh0.g1 g1Var = (lh0.g1) closeupExperiments.f83294a;
            if (g1Var.o("android_video_in_carousel", "enabled", z3Var) || g1Var.l("android_video_in_carousel")) {
                String uid = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                Boolean d53 = f30Var.d5();
                Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
                return pk.a0.T(J3, uid, true, d53.booleanValue(), df.j1.z0(f30Var), false);
            }
            String uid2 = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            Boolean d54 = f30Var.d5();
            Intrinsics.checkNotNullExpressionValue(d54, "getIsPromoted(...)");
            return pk.a0.S(J3, uid2, true, d54.booleanValue());
        }
        bc2.q S0 = dl2.b.S0(f30Var, null);
        int z03 = (S0 == null || (cVar2 = S0.f22677f) == null) ? bs1.c.z0(f30Var) : cVar2.f22648a;
        int x03 = (S0 == null || (cVar = S0.f22677f) == null) ? bs1.c.x0(f30Var) : cVar.f22649b;
        String o03 = bs1.c.o0(f30Var);
        if (o03 == null) {
            o03 = "";
        }
        String str = o03;
        String z43 = f30Var.z4();
        String D = com.bumptech.glide.c.D(f30Var);
        String h43 = f30Var.h4();
        String r43 = f30Var.r4();
        String c43 = f30Var.c4();
        String uid3 = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
        Boolean d55 = f30Var.d5();
        Intrinsics.checkNotNullExpressionValue(d55, "getIsPromoted(...)");
        if (!d55.booleanValue()) {
            Boolean F4 = f30Var.F4();
            Intrinsics.checkNotNullExpressionValue(F4, "getIsDownstreamPromotion(...)");
            if (!F4.booleanValue()) {
                z13 = false;
            }
        }
        boolean z14 = z13;
        Boolean p63 = f30Var.p6();
        Intrinsics.checkNotNullExpressionValue(p63, "getShouldMute(...)");
        boolean booleanValue = p63.booleanValue();
        closeupExperiments.getClass();
        z3 z3Var2 = a4.f83298b;
        lh0.g1 g1Var2 = (lh0.g1) closeupExperiments.f83294a;
        return kotlin.collections.e0.b(new m21.b(z03, x03, str, S0, z43, D, h43, r43, c43, uid3, null, null, z14, false, null, booleanValue, false, null, null, (g1Var2.o("android_load_medium_res_image_in_pdp_closeup", "enabled", z3Var2) || g1Var2.l("android_load_medium_res_image_in_pdp_closeup")) ? bs1.c.p0(f30Var) : null, false, 2809856));
    }

    public static void C(u81.r rVar, es.a aVar) {
        rVar.f121077j1 = aVar;
    }

    public static void D(u81.r rVar, es.h hVar) {
        rVar.f121075i1 = hVar;
    }

    public static void E(u81.r rVar, yk1.a aVar) {
        rVar.T0 = aVar;
    }

    public static void F(rh1.b0 b0Var, qh1.e eVar) {
        b0Var.Z0 = eVar;
    }

    public static void G(u81.r rVar, ContextWrapper contextWrapper) {
        rVar.R0 = contextWrapper;
    }

    public static void H(u81.r rVar, hf0.c cVar) {
        rVar.U0 = cVar;
    }

    public static void I(rh1.b0 b0Var, nr0.m mVar) {
        b0Var.X0 = mVar;
    }

    public static void J(u81.r rVar, nr0.m mVar) {
        rVar.f121062b1 = mVar;
    }

    public static void K(rh1.b0 b0Var, lh0.l0 l0Var) {
        b0Var.f108112a1 = l0Var;
    }

    public static void L(u81.r rVar, o81.a aVar) {
        rVar.W0 = aVar;
    }

    public static void M(dx1.f fVar, gw1.f fVar2) {
        fVar.f56505x0 = fVar2;
    }

    public static void N(u81.r rVar, c91.e eVar) {
        rVar.X0 = eVar;
    }

    public static void O(u81.r rVar, m60.g0 g0Var) {
        rVar.V0 = g0Var;
    }

    public static void P(u81.r rVar, ny1.w wVar) {
        rVar.f121064c1 = wVar;
    }

    public static void Q(rh1.b0 b0Var, x02.i2 i2Var) {
        b0Var.Y0 = i2Var;
    }

    public static void R(u81.r rVar, x02.i2 i2Var) {
        rVar.Y0 = i2Var;
    }

    public static void S(u81.r rVar, nx.f0 f0Var) {
        rVar.Z0 = f0Var;
    }

    public static void T(u81.r rVar, ll.j jVar) {
        rVar.f121066d1 = jVar;
    }

    public static void U(u81.r rVar, lb0.r rVar2) {
        rVar.f121073h1 = rVar2;
    }

    public static void V(rh1.b0 b0Var, uk1.e eVar) {
        b0Var.W0 = eVar;
    }

    public static void W(u81.r rVar, uk1.e eVar) {
        rVar.f121060a1 = eVar;
    }

    public static void X(u81.r rVar, u81.b0 b0Var) {
        rVar.f121069f1 = b0Var;
    }

    public static void Y(u81.r rVar, f4 f4Var) {
        rVar.f121071g1 = f4Var;
    }

    public static void Z(aa1.q qVar, i92.k kVar) {
        qVar.f1671i0 = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x037c, code lost:
    
        if (r12.h(r54) != false) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03d2, code lost:
    
        if (r12.h(r55) == false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03f2, code lost:
    
        if (r12.f(r5) == false) goto L685;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x040a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0486 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x055a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(u2.q r41, s1.o0 r42, p1.x0 r43, boolean r44, m1.f1 r45, m1.o3 r46, boolean r47, int r48, float r49, s1.p r50, m3.a r51, kotlin.jvm.functions.Function1 r52, u2.c r53, u2.d r54, n1.n r55, kl2.m r56, i2.o r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 1553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.g0.a(u2.q, s1.o0, p1.x0, boolean, m1.f1, m1.o3, boolean, int, float, s1.p, m3.a, kotlin.jvm.functions.Function1, u2.c, u2.d, n1.n, kl2.m, i2.o, int, int, int):void");
    }

    public static void a0(dx1.f fVar, so.b1 b1Var) {
        fVar.f56504w0 = b1Var;
    }

    public static Object b(String str, Function1 block) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!kotlin.text.z.j(str)) {
            return block.invoke(str);
        }
        return null;
    }

    public static void b0(u81.r rVar, b60.b bVar) {
        rVar.f121067e1 = bVar;
    }

    public static final boolean c(List list) {
        List<o82.y0> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (o82.y0 y0Var : list2) {
            if (!Intrinsics.d(y0Var.f93757b, o82.u.f93720e)) {
                if (Intrinsics.d(y0Var.f93757b, o82.w.f93734e)) {
                }
            }
            return true;
        }
        return false;
    }

    public static void c0(u81.r rVar, o4 o4Var) {
        rVar.S0 = o4Var;
    }

    public static final ArrayList d(List list, int i13, hs1.q imageCache, int i14, int i15) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        ArrayList arrayList = new ArrayList();
        for (int i16 = 0; arrayList.size() < i13 && i16 < list.size(); i16++) {
            Bitmap x13 = x(imageCache, (String) list.get(i16), i14, i15);
            if (x13 != null) {
                arrayList.add(x13);
            }
        }
        return arrayList;
    }

    public static final boolean d0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean d53 = f30Var.d5();
        Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
        return d53.booleanValue();
    }

    public static final String e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer intOrNull = StringsKt.toIntOrNull(str);
        int intValue = (intOrNull != null ? intOrNull.intValue() : 0) - 4;
        return intValue <= 0 ? "" : intValue >= 100 ? "+100" : a.a.d("+", intValue);
    }

    public static final boolean e0(zq sticker) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        return sticker.x().intValue() == a42.u.ANIMATED.getValue();
    }

    public static final ff.d f(String str, String str2) {
        ff.d dVar = new ff.d();
        dVar.f62093b = ff.b.AnrReport;
        Context a13 = le.v.a();
        String str3 = null;
        try {
            PackageInfo packageInfo = a13.getPackageManager().getPackageInfo(a13.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        dVar.f62095d = str3;
        dVar.f62096e = str;
        dVar.f62097f = str2;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        dVar.f62098g = valueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        dVar.f62092a = stringBuffer2;
        return dVar;
    }

    public static boolean f0(String str) {
        bb.b bVar = bb.k.f22453a;
        Set<bb.d> unmodifiableSet = Collections.unmodifiableSet(bb.c.f22445c);
        HashSet hashSet = new HashSet();
        for (bb.d dVar : unmodifiableSet) {
            if (((bb.c) dVar).f22446a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            bb.c cVar = (bb.c) ((bb.d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ff.d g(java.lang.Throwable r7, ff.b r8) {
        /*
            java.lang.String r0 = "t"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            ff.d r0 = new ff.d
            r0.<init>()
            r0.f62093b = r8
            android.content.Context r1 = le.v.a()
            java.lang.String r2 = r1.getPackageName()
            r3 = 0
            r4 = 0
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            if (r1 != 0) goto L22
        L20:
            r1 = r4
            goto L24
        L22:
            java.lang.String r1 = r1.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
        L24:
            r0.f62095d = r1
            if (r7 != 0) goto L2a
            r1 = r4
            goto L3d
        L2a:
            java.lang.Throwable r1 = r7.getCause()
            if (r1 != 0) goto L35
            java.lang.String r1 = r7.toString()
            goto L3d
        L35:
            java.lang.Throwable r1 = r7.getCause()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L3d:
            r0.f62096e = r1
            if (r7 != 0) goto L42
            goto L6f
        L42:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L47:
            if (r7 == 0) goto L6b
            if (r7 == r4) goto L6b
            java.lang.StackTraceElement[] r2 = r7.getStackTrace()
            java.lang.String r4 = "t.stackTrace"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            int r4 = r2.length
            r5 = r3
        L56:
            if (r5 >= r4) goto L64
            r6 = r2[r5]
            int r5 = r5 + 1
            java.lang.String r6 = r6.toString()
            r1.put(r6)
            goto L56
        L64:
            java.lang.Throwable r2 = r7.getCause()
            r4 = r7
            r7 = r2
            goto L47
        L6b:
            java.lang.String r4 = r1.toString()
        L6f:
            r0.f62097f = r4
            long r1 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r7
            long r1 = r1 / r3
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r0.f62098g = r7
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r8 = r8.getLogPrefix()
            r1.append(r8)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r1.append(r7)
            java.lang.String r7 = ".json"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r8 = "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r0.f62092a = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.g0.g(java.lang.Throwable, ff.b):ff.d");
    }

    public static final boolean g0(oc ocVar) {
        Intrinsics.checkNotNullParameter(ocVar, "<this>");
        if (df.j1.U0(ocVar.e()) && df.j1.U0(ocVar.f())) {
            Integer h10 = ocVar.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getPinCount(...)");
            if (h10.intValue() >= 7) {
                return true;
            }
        }
        return false;
    }

    public static final long h(int i13, i2.o oVar) {
        return x3.a.f131598a.a((Context) ((i2.s) oVar).m(AndroidCompositionLocals_androidKt.f17455b), i13);
    }

    public static float h0(float f13, float f14, float f15) {
        return (f15 * f14) + ((1.0f - f15) * f13);
    }

    public static final String i(String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }

    public static final ff.d i0(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        ff.d dVar = new ff.d();
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        dVar.f62092a = name;
        dVar.f62093b = kotlin.text.z.p(name, "crash_log_", false) ? ff.b.CrashReport : kotlin.text.z.p(name, "shield_log_", false) ? ff.b.CrashShield : kotlin.text.z.p(name, "thread_check_log_", false) ? ff.b.ThreadCheck : kotlin.text.z.p(name, "analysis_log_", false) ? ff.b.Analysis : kotlin.text.z.p(name, "anr_log_", false) ? ff.b.AnrReport : ff.b.Unknown;
        JSONObject M0 = m0.M0(name);
        if (M0 != null) {
            dVar.f62098g = Long.valueOf(M0.optLong("timestamp", 0L));
            dVar.f62095d = M0.optString("app_version", null);
            dVar.f62096e = M0.optString("reason", null);
            dVar.f62097f = M0.optString("callstack", null);
            dVar.f62094c = M0.optJSONArray("feature_names");
        }
        return dVar;
    }

    public static final int j(ro1.b bVar) {
        int i13 = lf1.e.f83140a[bVar.ordinal()];
        return i13 != 1 ? i13 != 2 ? i13 != 3 ? yp1.a.idea_pin_visit_button : m60.x0.visit_board : m60.x0.visit_profile : yp1.a.idea_pin_ad_visit_site_button;
    }

    public static final z9.g0 j0(Function1 optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        z9.h0 h0Var = new z9.h0();
        optionsBuilder.invoke(h0Var);
        boolean z13 = h0Var.f141201b;
        l8.p pVar = h0Var.f141200a;
        pVar.getClass();
        boolean z14 = h0Var.f141202c;
        pVar.getClass();
        int i13 = h0Var.f141203d;
        boolean z15 = h0Var.f141204e;
        pVar.getClass();
        pVar.getClass();
        pVar.getClass();
        pVar.getClass();
        return new z9.g0(z13, z14, i13, false, z15, pVar.f82075a, pVar.f82076b, pVar.f82077c, pVar.f82078d);
    }

    public static float k(float f13, float f14, float f15, float f16) {
        return (float) Math.hypot(f15 - f13, f16 - f14);
    }

    public static final void k0(l82.e eVar, h32.i0 i0Var, h32.f1 f1Var, h32.u0 u0Var, h32.g0 g0Var, HashMap hashMap) {
        pb1.s[] sVarArr = new pb1.s[1];
        sVarArr[0] = new pb1.q(new zy.f0(new zy.a(h32.i0.a(i0Var, null, null, g0Var == null ? i0Var.f67084d : g0Var, u0Var, 87), f1Var, null, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION)));
        eVar.d(sVarArr);
    }

    public static float l(float f13, float f14, float f15, float f16) {
        float k13 = k(f13, f14, 0.0f, 0.0f);
        float k14 = k(f13, f14, f15, 0.0f);
        float k15 = k(f13, f14, f15, f16);
        float k16 = k(f13, f14, 0.0f, f16);
        return (k13 <= k14 || k13 <= k15 || k13 <= k16) ? (k14 <= k15 || k14 <= k16) ? k15 > k16 ? k15 : k16 : k14 : k13;
    }

    public static /* synthetic */ void l0(l82.e eVar, h32.i0 i0Var, h32.f1 f1Var, h32.u0 u0Var, h32.g0 g0Var, int i13) {
        if ((i13 & 8) != 0) {
            g0Var = null;
        }
        k0(eVar, i0Var, f1Var, u0Var, g0Var, null);
    }

    public static boolean m(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static final u2.q m0(u2.q qVar, float f13) {
        return f13 == 0.0f ? qVar : androidx.compose.ui.graphics.a.o(qVar, 0.0f, 0.0f, 0.0f, f13, null, false, 130815);
    }

    public static final boolean n(int i13, int i14) {
        return i13 == i14;
    }

    public static final o82.x0 n0(o82.a0 a0Var, int i13) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Iterator it = a0Var.f93524a.iterator();
        int i14 = 0;
        int i15 = 0;
        while (it.hasNext()) {
            int i16 = i14 + 1;
            int i17 = ((o82.y0) it.next()).f93760e + i15;
            if (i13 < i17) {
                return new o82.x0(i14, i13 - i15);
            }
            i14 = i16;
            i15 = i17;
        }
        return null;
    }

    public static String o(List list, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = list.get(i14);
            i13++;
            if (i13 > 1) {
                sb3.append((CharSequence) str);
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) String.valueOf(obj));
            }
        }
        sb3.append((CharSequence) "");
        return sb3.toString();
    }

    public static final boolean o0(f30 f30Var, b60.b activeUserManager, hs.d moduleViewabilityHelper) {
        wy0 f13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        Boolean Q3 = f30Var.Q3();
        Intrinsics.checkNotNullExpressionValue(Q3, "getCommentsDisabled(...)");
        if (Q3.booleanValue() || moduleViewabilityHelper.c()) {
            return false;
        }
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        if (hf0.b.n()) {
            return false;
        }
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        boolean[] zArr = f30Var.f37485h3;
        if (zArr.length > 80 && zArr[80]) {
            Boolean G4 = f30Var.G4();
            Intrinsics.checkNotNullExpressionValue(G4, "getIsEligibleForAggregatedComments(...)");
            if (!G4.booleanValue()) {
                return false;
            }
        }
        b60.d dVar = (b60.d) activeUserManager;
        wy0 f14 = dVar.f();
        return (f14 != null && Intrinsics.d(f14.G3(), Boolean.TRUE)) || !((f13 = dVar.f()) == null || dl2.b.O1(f13, false));
    }

    public static final void p(x02.i2 i2Var, String uid, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        Intrinsics.checkNotNullParameter(uid, "uid");
        if (str != null) {
            n00.c cVar = n00.c.PIN_CLOSEUP_AD_PREVIEW;
            if (!z13) {
                cVar = null;
            }
            i2Var = b0.d2(i2Var, str, cVar);
        }
        uj2.q Q = i2Var.Q(uid);
        x02.a2 a2Var = x02.i2.Q;
        Q.F(a2Var, a2Var, ck2.i.f27923c, ck2.i.f27924d);
    }

    public static final boolean p0(f30 f30Var) {
        jo0 q13;
        qk0 qk0Var = null;
        boolean z13 = (f30Var != null ? b40.Y0(f30Var) : null) != null;
        if (f30Var == null || !b40.Q0(f30Var)) {
            return z13;
        }
        dl0 v63 = f30Var.v6();
        if (v63 != null && (q13 = v63.q()) != null) {
            qk0Var = q13.k();
        }
        return z13 && !qg1.d.c(qk0Var);
    }

    public static final String q(int i13, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String quantityString = resources.getQuantityString(nz1.e.plural_followers, i13);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return df.j1.Y(quantityString, new Object[]{Integer.valueOf(i13)}, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        if (com.pinterest.api.model.b40.f0(r4) > 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        if (r4.A6() == null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean q0(com.pinterest.api.model.f30 r4, b60.b r5, lh0.a0 r6, hs.d r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r1 = "activeUserManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.String r1 = "experiments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r2 = "moduleViewabilityHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            boolean r5 = o0(r4, r5, r7)
            if (r5 == 0) goto La4
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            boolean r5 = hf0.b.q()
            if (r5 != 0) goto La4
            lh0.z3 r5 = lh0.z3.ACTIVATE_EXPERIMENT
            r6.getClass()
            java.lang.String r7 = "activate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            lh0.z0 r2 = r6.f83294a
            lh0.g1 r2 = (lh0.g1) r2
            java.lang.String r3 = "ce_android_community_insights_v2"
            java.lang.String r3 = r2.g(r3, r5)
            if (r3 == 0) goto L43
            goto L5a
        L43:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            java.lang.String r3 = "ce_android_style_decoder"
            java.lang.String r3 = r2.g(r3, r5)
            if (r3 == 0) goto L4f
            goto L5a
        L4f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            java.lang.String r7 = "ce_android_timely_insight_v2"
            java.lang.String r5 = r2.g(r7, r5)
            if (r5 == 0) goto L67
        L5a:
            int r5 = com.pinterest.api.model.b40.f0(r4)
            if (r5 > 0) goto L6d
            com.pinterest.api.model.dw0 r5 = r4.A6()
            if (r5 == 0) goto La4
            goto L6d
        L67:
            int r5 = com.pinterest.api.model.b40.f0(r4)
            if (r5 <= 0) goto La4
        L6d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r5 = r4.s5()
            if (r5 == 0) goto L7f
            boolean r5 = kotlin.text.z.j(r5)
            if (r5 == 0) goto La2
        L7f:
            java.lang.Boolean r5 = r4.d5()
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto La2
            com.pinterest.api.model.rj0 r4 = r4.u6()
            if (r4 != 0) goto La2
            lh0.z3 r4 = lh0.z3.DO_NOT_ACTIVATE_EXPERIMENT
            java.lang.String r5 = "enabled_none"
            boolean r5 = r6.T(r5, r4)
            if (r5 != 0) goto La4
            java.lang.String r5 = "enabled_no_metadata_comments"
            boolean r4 = r6.T(r5, r4)
            if (r4 == 0) goto La2
            goto La4
        La2:
            r4 = 1
            goto La5
        La4:
            r4 = 0
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.g0.q0(com.pinterest.api.model.f30, b60.b, lh0.a0, hs.d):boolean");
    }

    public static final so1.a r(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = context;
        while (obj instanceof ContextWrapper) {
            if (obj instanceof uo1.a) {
                return ((uo1.a) obj).getBaseActivityComponent();
            }
            Context baseContext = ((ContextWrapper) obj).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
            obj = baseContext;
        }
        throw new IllegalArgumentException("Cannot derive BaseActivity Context from the View");
    }

    public static final yl1.b r0(cn1.g gVar, Context context) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = eo1.a.comp_searchfield_trailing_button_size;
        return new yl1.b(gVar.f28191a, gVar.f28192b, null, gVar.f28193c, gVar.f28194d, dn1.b.values()[dl2.b.O0(context, i13)].getValue(), null, null, gVar.f28195e, null, 708);
    }

    public static final h32.i0 s(nx.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        h32.i0 source = d0Var.p();
        if (source == null) {
            return new h32.i0(d4.PIN, h32.a4.PIN_PRODUCT, null, h32.g0.SHOP_YOUR_SAVES_STL, null, null);
        }
        Intrinsics.checkNotNullParameter(source, "source");
        d4 d4Var = source.f67081a;
        if (d4Var == null) {
            d4Var = d4.PIN;
        }
        d4 d4Var2 = d4Var;
        h32.a4 a4Var = source.f67082b;
        if (a4Var == null) {
            a4Var = h32.a4.PIN_PRODUCT;
        }
        return new h32.i0(d4Var2, a4Var, source.f67083c, h32.g0.SHOP_YOUR_SAVES_STL, source.f67085e, source.f67086f);
    }

    public static final om1.c s0(cn1.c cVar) {
        int idRes;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        rm1.q qVar = cVar.f28144a;
        om1.e eVar = GestaltSearchField.f49505z;
        int i13 = cn1.w.f28238a[cVar.f28147d.ordinal()];
        if (i13 == 1) {
            idRes = dn1.a.LEADING_ICON_BUTTON.getIdRes();
        } else if (i13 == 2) {
            idRes = dn1.a.END_ACTION_BUTTONS_ONE.getIdRes();
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            idRes = dn1.a.END_ACTION_BUTTONS_TWO.getIdRes();
        }
        int i14 = idRes;
        return new om1.c(qVar, eVar, cVar.f28145b, null, cVar.f28146c, cVar.f28148e, i14, 712);
    }

    public static final wa2.m t() {
        wa2.i p13 = ve.h.p(ue1.t.SHOPPING_PIN_REP);
        p13.O = true;
        p13.f128764c0 = new wa2.g0(false, false, false, false, false, false, null, null, h32.g0.SHOP_YOUR_SAVES_STL, false, true, true, false, 0, true, true, false, false, false, true, true, false, 22868711);
        p13.f128766d0 = new bb2.e(1.0f, bb2.f.FILL, 2);
        return m60.f0.i0(p13);
    }

    public static String t0(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String m13;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            length = objArr.length;
            if (i14 >= length) {
                break;
            }
            Object obj = objArr[i14];
            if (obj == null) {
                m13 = "null";
            } else {
                try {
                    m13 = obj.toString();
                } catch (Exception e13) {
                    String D = a.a.D(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(D), (Throwable) e13);
                    m13 = a.a.m("<", D, " threw ", e13.getClass().getName(), ">");
                }
            }
            objArr[i14] = m13;
            i14++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i15 = 0;
        while (true) {
            length2 = objArr.length;
            if (i13 >= length2 || (indexOf = str.indexOf("%s", i15)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i15, indexOf);
            sb3.append(objArr[i13]);
            i15 = indexOf + 2;
            i13++;
        }
        sb3.append((CharSequence) str, i15, str.length());
        if (i13 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i13]);
            for (int i16 = i13 + 1; i16 < objArr.length; i16++) {
                sb3.append(", ");
                sb3.append(objArr[i16]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static final String u(GestaltText gestaltText, int i13) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        Layout layout = gestaltText.getLayout();
        CharSequence text = gestaltText.getText();
        if (layout == null || text == null) {
            return null;
        }
        int ellipsisStart = layout.getEllipsisStart(i13);
        return ellipsisStart > 0 ? text.subSequence(0, ellipsisStart).toString() : text.toString();
    }

    public static final int v(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        return df.j1.c1(df.j1.x0(theme)) ? dl2.b.a1(context, eo1.a.comp_iconbutton_xl_rounding) : eo1.c.space_400;
    }

    public static final String w(f30 pin, String domain, boolean z13, wy0 wy0Var) {
        String Z2;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(domain, "domain");
        String E = b40.E(pin);
        String Y = b40.Y(pin);
        if (z13 && wy0Var != null) {
            return wy0Var.Z2();
        }
        if (df.j1.U0(E)) {
            return E;
        }
        if (pin.t5() == null) {
            wy0 F = b40.F(pin);
            if (F != null && (Z2 = F.Z2()) != null) {
                return Z2;
            }
            wy0 I5 = pin.I5();
            if (I5 != null) {
                return I5.Z2();
            }
        } else {
            if (df.j1.U0(Y)) {
                return Y;
            }
            if (df.j1.d1(domain)) {
                return domain;
            }
        }
        return null;
    }

    public static final Bitmap x(hs1.q qVar, String str, int i13, int i14) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Bitmap bitmap = null;
        if (str != null && (!kotlin.text.z.j(str))) {
            try {
                bitmap = ((hs1.m) qVar).l(Integer.valueOf(i13), Integer.valueOf(i14), str);
                if (bitmap == null) {
                    d.O0("ImageLoadException", "Pin Image Bitmap is NULL");
                }
            } catch (Exception e13) {
                String message = e13.getMessage() != null ? e13.getMessage() : "";
                Intrinsics.f(message);
                d.O0("ImageLoadException", message);
            }
        }
        return bitmap;
    }

    public static final zy.a y(h32.i0 pinalyticsContext, vh dynamicStory, String clientTrackingParams, h32.v2 source, Integer num) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        Intrinsics.checkNotNullParameter(source, "storyImpression");
        Intrinsics.checkNotNullParameter(source, "source");
        Long l13 = source.f67311a;
        Long l14 = dynamicStory.f42843a;
        String uid = dynamicStory.getUid();
        Short valueOf = Short.valueOf((short) dynamicStory.f42865w.size());
        h32.v2 v2Var = new h32.v2(l14, source.f67312b, uid, source.f67314d, num != null ? Short.valueOf((short) num.intValue()) : null, valueOf, source.f67317g, source.f67318h, source.f67319i, clientTrackingParams);
        String uid2 = dynamicStory.getUid();
        h32.f1 f1Var = h32.f1.STORY_IMPRESSION_ONE_PIXEL;
        Boolean bool = Boolean.FALSE;
        return new zy.a(pinalyticsContext, f1Var, uid2, d.E(dynamicStory), new h32.c1(null, bool, null, Boolean.TRUE, bool, null, v2Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
    }

    public static final float z(long j13) {
        return Float.intBitsToFloat((int) (j13 >> 32));
    }
}
