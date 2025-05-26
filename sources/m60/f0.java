package m60;

import J.N;
import am2.c1;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.y2;
import com.apollographql.apollo3.exception.CacheMissException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.chromium.net.NetworkChangeNotifier;
import pn2.b1;
import pn2.f1;
import pn2.g1;
import pn2.h1;
import pn2.i1;
import pn2.l1;
import pn2.t1;
import pn2.w1;
import so.oa;
import t3.s1;

/* loaded from: classes.dex */
public class f0 implements wp2.a, uj2.v, nd.j, zs1.a, pc.d0, m3.a, oa.e, c02.l, ak2.f, q8.u, z10.a, ld2.b, x72.k, wc.d, wc.e, yk1.e {

    /* renamed from: a */
    public static final /* synthetic */ int f85900a = 0;

    public static String U(String metricName, String str, String str2) {
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        if (str2 != null && str2.length() != 0 && str != null && str.length() != 0 && kotlin.text.z.h(str2, str, false)) {
            str2 = str2.substring(0, StringsKt.L(str2, str, 0, false, 6));
            Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2 != null ? str2.concat("-") : "");
        sb3.append(metricName);
        if (str == null) {
            str = "";
        }
        sb3.append(str);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static h1 V(c1 parameter, pn2.c typeAttr, f1 typeParameterUpperBoundEraser, pn2.b0 erasedUpperBound) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof nm2.a)) {
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
            Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
            Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
            return new i1(erasedUpperBound, w1.OUT_VARIANCE);
        }
        nm2.a aVar = (nm2.a) typeAttr;
        if (!aVar.f91522c) {
            aVar = aVar.h(nm2.b.INFLEXIBLE);
        }
        int i13 = nm2.d.f91527a[aVar.f91521b.ordinal()];
        if (i13 == 1) {
            return new i1(erasedUpperBound, w1.INVARIANT);
        }
        if (i13 != 2 && i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!parameter.r().getAllowsOutPosition()) {
            return new i1(fn2.d.e(parameter).o(), w1.INVARIANT);
        }
        List parameters = erasedUpperBound.w0().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        return parameters.isEmpty() ^ true ? new i1(erasedUpperBound, w1.OUT_VARIANCE) : t1.o(parameter, aVar);
    }

    public static Application W() {
        Context context = kb0.a.f79058b;
        if (context != null) {
            return (Application) context;
        }
        throw new IllegalStateException("CommonApplication.onCreate has not been called".toString());
    }

    public static Context X() {
        Context context = kb0.a.f79058b;
        if (context == null && (context = kb0.a.f79060d) == null) {
            throw new IllegalStateException("CommonApplication.attachBaseContext has not been called".toString());
        }
        return context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x003c, code lost:
    
        if (r0 <= r1.f126212c) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static mn2.d Y(ym2.c r7, on2.u r8, am2.d0 r9, java.io.InputStream r10) {
        /*
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "module"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            um2.a r0 = um2.a.f122800f     // Catch: java.lang.Throwable -> L7c
            um2.a r6 = re2.h.i(r10)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = "ourVersion"
            um2.a r1 = um2.a.f122800f     // Catch: java.lang.Throwable -> L7c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)     // Catch: java.lang.Throwable -> L7c
            int r0 = r6.f126212c     // Catch: java.lang.Throwable -> L7c
            int r2 = r6.f126211b     // Catch: java.lang.Throwable -> L7c
            r3 = 0
            if (r2 != 0) goto L36
            int r2 = r1.f126211b     // Catch: java.lang.Throwable -> L7c
            if (r2 != 0) goto L7e
            int r2 = r1.f126212c     // Catch: java.lang.Throwable -> L7c
            if (r0 != r2) goto L7e
            goto L3e
        L36:
            int r4 = r1.f126211b     // Catch: java.lang.Throwable -> L7c
            if (r2 != r4) goto L7e
            int r2 = r1.f126212c     // Catch: java.lang.Throwable -> L7c
            if (r0 > r2) goto L7e
        L3e:
            zm2.k r0 = new zm2.k     // Catch: java.lang.Throwable -> L7c
            r0.<init>()     // Catch: java.lang.Throwable -> L7c
            um2.b.a(r0)     // Catch: java.lang.Throwable -> L7c
            tm2.a r2 = tm2.g0.f118267k     // Catch: java.lang.Throwable -> L7c
            r2.getClass()     // Catch: java.lang.Throwable -> L7c
            zm2.h r4 = new zm2.h     // Catch: java.lang.Throwable -> L7c
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L7c
            zm2.t r0 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L7c
            int r2 = r4.f142213f     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L78 java.lang.Throwable -> L7c
            if (r2 != 0) goto L73
            boolean r2 = r0.isInitialized()     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L62
            tm2.g0 r0 = (tm2.g0) r0     // Catch: java.lang.Throwable -> L7c
            r5 = r0
            goto L7f
        L62:
            kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException r7 = new kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException     // Catch: java.lang.Throwable -> L7c
            r7.<init>()     // Catch: java.lang.Throwable -> L7c
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r8 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L7c
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L7c
            r8.f80460a = r0     // Catch: java.lang.Throwable -> L7c
            throw r8     // Catch: java.lang.Throwable -> L7c
        L73:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r7 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.a()     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L78 java.lang.Throwable -> L7c
            throw r7     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L78 java.lang.Throwable -> L7c
        L78:
            r7 = move-exception
            r7.f80460a = r0     // Catch: java.lang.Throwable -> L7c
            throw r7     // Catch: java.lang.Throwable -> L7c
        L7c:
            r7 = move-exception
            goto Laf
        L7e:
            r5 = r3
        L7f:
            dl2.b.J(r10, r3)
            if (r5 == 0) goto L8e
            mn2.d r10 = new mn2.d
            r1 = r10
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return r10
        L8e:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Kotlin built-in definition format version is not supported: expected "
            r8.<init>(r9)
            r8.append(r1)
            java.lang.String r9 = ", actual "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ". Please update Kotlin"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Laf:
            throw r7     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r8 = move-exception
            dl2.b.J(r10, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.f0.Y(ym2.c, on2.u, am2.d0, java.io.InputStream):mn2.d");
    }

    public static pn2.c1 a0(f0 f0Var, Map map) {
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new pn2.c1(map, false);
    }

    public static zy.a b0(String failReason, String errorCode) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        h32.i0 i0Var = new h32.i0(null, null, null, null, null, null);
        h32.f1 f1Var = h32.f1.PIN_HANDSHAKE_ERROR;
        HashMap x13 = a.a.x("fail_reason", failReason, "handshake_error_code", errorCode);
        x13.put("shopping_integration_type", String.valueOf(gb0.f.TARGET_HANDSHAKE.getValue()));
        Unit unit = Unit.f80348a;
        return new zy.a(i0Var, f1Var, null, x13, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
    }

    public static zy.a c0(y82.g step) {
        Intrinsics.checkNotNullParameter(step, "step");
        h32.i0 i0Var = new h32.i0(null, null, null, null, null, null);
        h32.f1 f1Var = h32.f1.PIN_HANDSHAKE_STEP;
        HashMap hashMap = new HashMap();
        String lowerCase = step.f138078a.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        hashMap.put("handshake_step", lowerCase);
        hashMap.put("shopping_integration_type", String.valueOf(gb0.f.TARGET_HANDSHAKE.getValue()));
        Unit unit = Unit.f80348a;
        return new zy.a(i0Var, f1Var, null, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
    }

    public static zy.a d0(String str, String errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        h32.i0 i0Var = new h32.i0(null, null, null, null, null, null);
        h32.f1 f1Var = h32.f1.PIN_HANDSHAKE_WEBVIEW_ERROR;
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "pdp_failed_load";
        }
        hashMap.put("fail_reason", str);
        hashMap.put("handshake_error_code", errorCode);
        hashMap.put("shopping_integration_type", String.valueOf(gb0.f.TARGET_HANDSHAKE.getValue()));
        Unit unit = Unit.f80348a;
        return new zy.a(i0Var, f1Var, null, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007f, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static wo2.m e0(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.f0.e0(java.lang.String):wo2.m");
    }

    public static wo2.m f0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i13 * 2;
            bArr[i13] = (byte) (xo2.b.a(str.charAt(i14 + 1)) + (xo2.b.a(str.charAt(i14)) << 4));
        }
        return new wo2.m(bArr);
    }

    public static wo2.m h0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        wo2.m mVar = new wo2.m(bytes);
        mVar.f130715c = str;
        return mVar;
    }

    public static wa2.m i0(wa2.i legacy) {
        Intrinsics.checkNotNullParameter(legacy, "legacy");
        u50.n nVar = legacy.f128800u0;
        boolean z13 = legacy.f128759a;
        boolean z14 = legacy.f128761b;
        boolean z15 = legacy.f128763c;
        boolean z16 = legacy.f128765d;
        boolean z17 = legacy.f128769f;
        boolean z18 = legacy.f128773h;
        boolean z19 = legacy.f128777j;
        boolean z23 = legacy.f128779k;
        boolean z24 = legacy.f128781l;
        boolean z25 = legacy.f128783m;
        boolean z26 = legacy.f128787o;
        boolean z27 = legacy.f128789p;
        boolean z28 = legacy.f128791q;
        boolean z29 = legacy.f128793r;
        boolean z33 = legacy.f128795s;
        boolean z34 = legacy.f128797t;
        boolean z35 = legacy.f128799u;
        boolean z36 = legacy.f128801v;
        boolean z37 = legacy.f128803w;
        boolean z38 = legacy.f128804x;
        boolean z39 = legacy.f128805y;
        boolean z43 = legacy.A;
        boolean z44 = legacy.B;
        boolean z45 = legacy.C;
        boolean z46 = legacy.D;
        boolean z47 = legacy.F;
        boolean z48 = legacy.f128788o0;
        boolean z49 = legacy.I;
        h32.g0 g0Var = legacy.K;
        boolean z53 = legacy.O;
        wa2.g0 g0Var2 = legacy.f128764c0;
        bb2.e eVar = legacy.f128766d0;
        qa2.d0 d0Var = legacy.f128768e0;
        boolean z54 = legacy.f128770f0;
        int i13 = legacy.f128772g0;
        wa2.z zVar = legacy.f128780k0;
        y32.f fVar = legacy.f128790p0;
        String str = legacy.f128792q0;
        boolean z55 = legacy.f128806z;
        boolean z56 = legacy.W;
        boolean z57 = legacy.X;
        boolean z58 = legacy.Y;
        boolean z59 = legacy.V;
        boolean z63 = legacy.f128802v0;
        boolean z64 = legacy.f128762b0;
        return new wa2.m(i13, legacy.f128774h0, nVar, legacy.f128776i0, g0Var, fVar, legacy.f128760a0, d0Var, zVar, g0Var2, eVar, legacy.T, legacy.H, legacy.S, str, legacy.f128784m0, legacy.f128798t0, z13, z14, z15, z16, legacy.f128767e, z17, legacy.f128771g, z18, z48, legacy.f128775i, z19, z23, z24, z25, legacy.f128785n, z26, z27, z28, z29, z33, z34, z35, z36, z37, z38, z39, z43, z44, z45, z46, legacy.E, z47, legacy.G, z49, legacy.f128758J, legacy.L, legacy.M, legacy.N, z53, legacy.P, legacy.Q, legacy.R, legacy.U, z59, z56, z57, z58, legacy.Z, z64, z54, legacy.f128778j0, legacy.f128786n0, legacy.f128782l0, legacy.f128794r0, z55, legacy.f128796s0, z63);
    }

    public static kb0.a j0() {
        kb0.a aVar = kb0.a.f79059c;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("CommonApplication.onCreate has not been called");
    }

    public static boolean n0(Activity activity, String permissionId, boolean z13, lb0.q prefsManagerPersisted) {
        Set h10;
        Set h13;
        Set h14;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissionId, "permissionId");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        if (z13 && pk.a0.G0(activity, permissionId)) {
            return false;
        }
        if (activity.shouldShowRequestPermissionRationale(permissionId)) {
            Set h15 = prefsManagerPersisted.h("PREF_PERMISSION_RATIONAL_WAS_NEEDED", new LinkedHashSet());
            if (h15 != null) {
                LinkedHashSet I0 = CollectionsKt.I0(h15);
                I0.add(permissionId);
                prefsManagerPersisted.j("PREF_PERMISSION_RATIONAL_WAS_NEEDED", I0);
            }
            return false;
        }
        if (Intrinsics.d(permissionId, "android.permission.POST_NOTIFICATIONS")) {
            Set h16 = prefsManagerPersisted.h("PREF_APP_PERMISSION_REQUESTS", null);
            return h16 != null && h16.contains(permissionId) && (h14 = prefsManagerPersisted.h("PREF_PERMISSION_RATIONAL_WAS_NEEDED", null)) != null && h14.contains(permissionId);
        }
        if (Build.VERSION.SDK_INT == 34) {
            if (Intrinsics.d(permissionId, "android.permission.READ_MEDIA_IMAGES")) {
                Set h17 = prefsManagerPersisted.h("PREF_APP_PERMISSION_REQUESTS", null);
                return h17 != null && h17.contains(permissionId) && (h13 = prefsManagerPersisted.h("PREF_PERMISSION_RATIONAL_WAS_NEEDED", null)) != null && h13.contains(permissionId);
            }
            if (Intrinsics.d(permissionId, "android.permission.READ_MEDIA_VIDEO")) {
                Set h18 = prefsManagerPersisted.h("PREF_APP_PERMISSION_REQUESTS", null);
                return h18 != null && h18.contains(permissionId) && (h10 = prefsManagerPersisted.h("PREF_PERMISSION_RATIONAL_WAS_NEEDED", null)) != null && h10.contains(permissionId);
            }
        }
        Set h19 = prefsManagerPersisted.h("PREF_APP_PERMISSION_REQUESTS", null);
        if (h19 != null) {
            return h19.contains(permissionId);
        }
        return false;
    }

    public static wo2.m q0(byte[] bArr) {
        wo2.m mVar = wo2.m.f130712d;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        wo2.b.b(bArr.length, 0, length);
        return new wo2.m(kotlin.collections.z.m(bArr, 0, length));
    }

    public static void u0(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Context context = kb0.a.f79058b;
        LinkedHashMap linkedHashMap = ((ib0.b) ((oa) ((ib0.a) ep.b.g(ib0.a.class))).P9.get()).f72011a;
        int intValue = ((Number) linkedHashMap.getOrDefault(instance.getClass(), 0)).intValue() + 1;
        linkedHashMap.put(instance.getClass(), Integer.valueOf(intValue));
        if (intValue > 1) {
            instance.toString();
            vb0.j.f125466a.F("Error, more than one instance of a singleton created, " + instance, tb0.p.UNSPECIFIED, new Object[0]);
        }
    }

    @Override // q8.u
    public void A() {
        throw new UnsupportedOperationException();
    }

    @Override // q8.u
    public q8.k0 D(int i13, int i14) {
        throw new UnsupportedOperationException();
    }

    public void E(String detailedExceptionMessage, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(detailedExceptionMessage, "detailedExceptionMessage");
        r0(new AssertionError(throwable.getMessage(), throwable), detailedExceptionMessage, true, tb0.p.UNSPECIFIED);
    }

    public void F(String errorMessage, tb0.p productFlow, Object... args) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        Intrinsics.checkNotNullParameter(args, "args");
        s0(j1.W(errorMessage, args), productFlow);
    }

    public void G(String errorMessage, Object... args) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(args, "args");
        s0(j1.W(errorMessage, args), tb0.p.UNSPECIFIED);
    }

    public void H(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        I(throwable, "DevUtils:ReportAssertionFailed", tb0.p.UNSPECIFIED);
    }

    public void I(Throwable throwable, String detailedExceptionMessage, tb0.p productFlow) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(detailedExceptionMessage, "detailedExceptionMessage");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        r0(new AssertionError(message, throwable), detailedExceptionMessage, true, productFlow);
    }

    public void J(Throwable throwable, tb0.p productFlow) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        I(throwable, "DevUtils:ReportAssertionFailed", productFlow);
    }

    public void K(boolean z13, String errorMessage, tb0.p productFlow, Object... args) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        Intrinsics.checkNotNullParameter(args, "args");
        t0(j1.W(errorMessage, args), z13, productFlow);
    }

    public void M(Object obj, String errorMessage, tb0.p productFlow, Object... args) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        Intrinsics.checkNotNullParameter(args, "args");
        if (obj == null) {
            s0(j1.W(errorMessage, args), productFlow);
        }
    }

    public void N(Object obj, String errorMessage, Object... args) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(args, "args");
        if (obj == null) {
            s0(j1.W(errorMessage, args), tb0.p.UNSPECIFIED);
        }
    }

    public void O(String callingMethodName, tb0.p productFlow) {
        Intrinsics.checkNotNullParameter(callingMethodName, "callingMethodName");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            s0(callingMethodName.concat(" called from main thread instead of a worker thread"), productFlow);
        }
    }

    public void P(String callingMethodName, tb0.p productFlow) {
        Intrinsics.checkNotNullParameter(callingMethodName, "callingMethodName");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        s0(a.a.l(callingMethodName, " called from thread ", Thread.currentThread().getName(), " instead of main thread"), productFlow);
    }

    public void R(boolean z13, String errorMessage, tb0.p productFlow, Object... args) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        Intrinsics.checkNotNullParameter(args, "args");
        if (z13) {
            return;
        }
        s0(j1.W(errorMessage, args), productFlow);
    }

    public void S(boolean z13, String errorMessage, Object... args) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(args, "args");
        if (z13) {
            return;
        }
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        s0(s1.e(copyOf, copyOf.length, locale, errorMessage, "format(...)"), tb0.p.UNSPECIFIED);
    }

    public void T(boolean z13, String errorMessage, Object... args) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(args, "args");
        if (z13) {
            return;
        }
        t0(j1.W(errorMessage, args), false, tb0.p.UNSPECIFIED);
    }

    public l1 Z(b1 typeConstructor, List argumentsList) {
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        Intrinsics.checkNotNullParameter(argumentsList, "arguments");
        List parameters = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        c1 c1Var = (c1) CollectionsKt.d0(parameters);
        if (c1Var == null || !c1Var.F()) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(argumentsList, "argumentsList");
            return new pn2.y((c1[]) parameters.toArray(new c1[0]), (g1[]) argumentsList.toArray(new g1[0]), false);
        }
        List parameters2 = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
        List list = parameters2;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1) it.next()).e());
        }
        return a0(this, kotlin.collections.z0.m(CollectionsKt.N0(arrayList, argumentsList)));
    }

    @Override // uj2.v
    public void a() {
    }

    @Override // ak2.f
    public Object apply(Object obj) {
        List updateUiChanges = (List) obj;
        Intrinsics.checkNotNullParameter(updateUiChanges, "updateUiChanges");
        return CollectionsKt.H0(updateUiChanges);
    }

    @Override // uj2.v
    public void b(xj2.c d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
    }

    @Override // uj2.v
    public void c(Object obj) {
        xu1.e.f135956a.a(((Boolean) obj).booleanValue());
    }

    @Override // c02.l
    public void d(y2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // c02.l
    public ViewPropertyAnimator e(ViewPropertyAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        return animator;
    }

    @Override // c02.l
    public void f(y2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // nd.j
    public void g(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    public String g0(int i13, Method method) {
        return "parameter #" + (i13 + 1);
    }

    @Override // c02.m
    public long getDuration() {
        return 0L;
    }

    @Override // ld2.b
    public od2.c h(ld2.g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i13 = sd2.a.f112318c[type.ordinal()];
        if (i13 == 1) {
            return kh2.n.q();
        }
        if (i13 == 2) {
            return kh2.n.o();
        }
        if (i13 == 3) {
            return kh2.n.A();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // q8.u
    public void j(q8.e0 e0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // wc.e
    public Object k(pc.m field, ja.c0 variables, Map parent, String key) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(variables, "variables");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(key, "parentId");
        b7.c cVar = field.f99583b;
        b7.c cVar2 = cVar instanceof pc.r ? ((pc.r) cVar).f99600g : cVar;
        ArrayList arrayList = null;
        if ((cVar2 instanceof pc.q) && pc.o.c((pc.q) cVar2)) {
            Intrinsics.checkNotNullParameter(field, "field");
            Intrinsics.checkNotNullParameter(variables, "variables");
            String str = (String) field.c(variables);
            wc.c cVar3 = str != null ? new wc.c(str) : null;
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (cVar2 instanceof pc.p) {
            b7.c cVar4 = ((pc.p) cVar2).f99596g;
            if (cVar4 instanceof pc.r) {
                cVar4 = ((pc.r) cVar4).f99600g;
            }
            if ((cVar4 instanceof pc.q) && pc.o.c((pc.q) cVar4)) {
                Intrinsics.checkNotNullParameter(field, "field");
                Intrinsics.checkNotNullParameter(variables, "variables");
                cVar.G().getClass();
                Object c13 = field.c(variables);
                if (c13 instanceof List) {
                    ArrayList Q = CollectionsKt.Q((Iterable) c13);
                    arrayList = new ArrayList(kotlin.collections.g0.q(Q, 10));
                    Iterator it = Q.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Intrinsics.g(next, "null cannot be cast to non-null type kotlin.String");
                        arrayList.add(new wc.c((String) next));
                    }
                }
                if (arrayList != null) {
                    return arrayList;
                }
            }
        }
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(variables, "variables");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(key, "parentId");
        String a13 = field.a(variables);
        if (parent.containsKey(a13)) {
            return parent.get(a13);
        }
        Intrinsics.checkNotNullParameter(key, "key");
        throw new CacheMissException(key, a13, false);
    }

    public synchronized r70.b k0() {
        r70.b bVar;
        bVar = r70.b.f106350j;
        if (bVar == null) {
            bVar = new r70.b();
            r70.b.f106350j = bVar;
        }
        return bVar;
    }

    public Object l0(Class cls, Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean m0(Method method) {
        return false;
    }

    @Override // x72.k
    public x72.j n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return x72.i.b(context);
    }

    @Override // c02.m
    public Interpolator o() {
        return new LinearInterpolator();
    }

    public void o0(long j13, NetworkChangeNotifier networkChangeNotifier, int i13) {
        N.Mg0W7eRL(j13, networkChangeNotifier, i13);
    }

    @Override // uj2.v
    public void onError(Throwable e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    @Override // x72.k
    public x72.j p(ViewStub stub) {
        Intrinsics.checkNotNullParameter(stub, "stub");
        return x72.i.a(stub);
    }

    public void p0(long j13, NetworkChangeNotifier networkChangeNotifier, int i13) {
        N.Mt26m31j(j13, networkChangeNotifier, i13);
    }

    @Override // oa.e
    public oa.f q(oa.d configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new pa.i(configuration.f93836a, configuration.f93837b, configuration.f93838c, configuration.f93839d, configuration.f93840e);
    }

    @Override // wc.d
    public wc.c r(Map obj, tb.e context) {
        String obj2;
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj3 = obj.get("id");
        return (obj3 == null || (obj2 = obj3.toString()) == null) ? wc.n.f129097a.r(obj, context) : new wc.c(obj2);
    }

    public void r0(AssertionError assertionError, String str, boolean z13, tb0.p pVar) {
        if (z13) {
            ob0.a aVar = ob0.b.f93978b;
            if (aVar != null) {
                ((tb0.h) aVar).q(assertionError, str, pVar);
            } else {
                Intrinsics.r("crashReporter");
                throw null;
            }
        }
    }

    public void s0(String str, tb0.p pVar) {
        AssertionError assertionError = new AssertionError(a.a.j("[DevUtils.assert] ", str));
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length - 2;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[length];
        System.arraycopy(stackTrace, 2, stackTraceElementArr, 0, length);
        assertionError.setStackTrace(stackTraceElementArr);
        r0(assertionError, "DevUtils:ReportAssertionFailed", true, pVar);
    }

    @Override // ld2.b
    public nd2.b t(ld2.e type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (sd2.a.f112319d[type.ordinal()]) {
            case 1:
            case 2:
                return kh2.j.t();
            case 3:
            case 4:
                return kh2.j.E2();
            case 5:
                return kh2.j.a0("tornPaper");
            case 6:
                return kh2.j.a0("stamp");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public void t0(String str, boolean z13, tb0.p pVar) {
        AssertionError assertionError = new AssertionError("[DevUtils.assert] ".concat(str));
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length - 2;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[length];
        System.arraycopy(stackTrace, 2, stackTraceElementArr, 0, length);
        assertionError.setStackTrace(stackTraceElementArr);
        r0(assertionError, "DevUtils:ReportAssertionFailed", z13, pVar);
    }

    @Override // z10.a
    public String u() {
        return c60.d.a();
    }

    @Override // ld2.b
    public nd2.b v(od2.a effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        return new nd2.b(effect.b(), kotlin.collections.e0.b(CollectionsKt.Z(kotlin.collections.f0.j(kotlin.text.z.n(effect.d(), "{{name}}", "{{name}}_impl_colorFilter"), "", kotlin.text.t.b("\n        vec4 {{name}}(vec2 uv, in sampler2D orig, in sampler2D src) {\n            FragmentEffectInput effectData;\n            effectData.color = texture(orig, uv);\n            effectData.position = vec3(2.0 * (uv - vec2(0.5)), 1.0);\n            effectData.texturePosition = uv;\n            effectData.time = 0.0;\n            effectData.size = vec2(textureSize(orig, 0));\n            effectData.itemID = 0;\n            \n            return {{name}}_impl_colorFilter(effectData);\n        }\n        ")), "\n", null, null, 0, null, null, 62)), "", effect.c(), effect.a());
    }

    @Override // c02.m
    public long w() {
        return 0L;
    }

    @Override // ld2.b
    public od2.a y(ld2.c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (sd2.a.f112316a[type.ordinal()]) {
            case 1:
                return kg.t.l();
            case 2:
                return kg.t.Q0();
            case 3:
                return kg.t.d1();
            case 4:
                return kg.t.c1();
            case 5:
                return kg.t.x();
            case 6:
                return kg.t.N0(ed2.a.chrome, "chrome");
            case 7:
                return kg.t.N0(ed2.a.instant, "instant");
            case 8:
                return kg.t.N0(ed2.a.invert, "invert");
            case 9:
                return kg.t.N0(ed2.a.linear, "linear");
            case 10:
                return kg.t.N0(ed2.a.mono, "mono");
            case 11:
                return kg.t.N0(ed2.a.noir, "noir");
            case 12:
                return kg.t.N0(ed2.a.process, "process");
            case 13:
                return kg.t.N0(ed2.a.sepia, "sepia");
            case 14:
                return kg.t.N0(ed2.a.tonal, "tonal");
            case 15:
                return kg.t.N0(ed2.a.tone, "tone");
            case 16:
                return kg.t.N0(ed2.a.transfer, "transfer");
            case 17:
                return kg.t.N0(ed2.a.washed, "washed");
            case 18:
                Pair[] pairs = {new Pair("color", new pd2.f(new id2.c())), new Pair("opacity", new pd2.k(0.5f).c(0.0f, 1.0f))};
                Intrinsics.checkNotNullParameter(pairs, "pairs");
                Intrinsics.checkNotNullParameter(pairs, "<this>");
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.y0.a(2));
                kotlin.collections.z0.q(linkedHashMap, pairs);
                return new od2.a("colorize", "vec4 {{name}}(FragmentEffectInput data) {\n    vec4 origColor = data.color;\n    vec4 newColor = {{settings.color}};\n\n    origColor.rgb = mix(origColor.rgb, newColor.rgb, {{settings.opacity}} * origColor.a);\n    return origColor;\n}", new pd2.q0(linkedHashMap));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // ld2.b
    public od2.b z(ld2.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (sd2.a.f112317b[type.ordinal()]) {
            case 1:
                return kh2.d.g1();
            case 2:
                return kh2.d.V0();
            case 3:
                return kh2.d.d1();
            case 4:
                return kh2.d.m1();
            case 5:
                return kh2.d.r();
            case 6:
                return kh2.d.l1();
            case 7:
                return kh2.d.N0();
            case 8:
                return kh2.d.Z0();
            case 9:
                return kh2.d.f1();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
