package ads_mobile_sdk;

import a.zb;
import ao2.j0;
import ao2.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hv1 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f6105a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f6106b;

    /* renamed from: c, reason: collision with root package name */
    public final d92 f6107c;

    /* renamed from: d, reason: collision with root package name */
    public final zb f6108d;

    /* renamed from: e, reason: collision with root package name */
    public final u72 f6109e;

    /* renamed from: f, reason: collision with root package name */
    public final a.p4 f6110f;

    /* renamed from: g, reason: collision with root package name */
    public List f6111g;

    /* renamed from: h, reason: collision with root package name */
    public cf2 f6112h;

    /* renamed from: i, reason: collision with root package name */
    public final mo2.a f6113i;

    /* renamed from: j, reason: collision with root package name */
    public pk0 f6114j;

    /* renamed from: k, reason: collision with root package name */
    public int f6115k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6116l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f6117m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f6118n;

    /* renamed from: o, reason: collision with root package name */
    public ao2.x f6119o;

    /* renamed from: p, reason: collision with root package name */
    public List f6120p;

    public hv1(j0 backgroundScope, CoroutineContext backgroundContext, d92 requestThrottler, zb clock, u72 renderingMonitor, a.p4 adRendererProvider) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(requestThrottler, "requestThrottler");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(renderingMonitor, "renderingMonitor");
        Intrinsics.checkNotNullParameter(adRendererProvider, "adRendererProvider");
        this.f6105a = backgroundScope;
        this.f6106b = backgroundContext;
        this.f6107c = requestThrottler;
        this.f6108d = clock;
        this.f6109e = renderingMonitor;
        this.f6110f = adRendererProvider;
        this.f6113i = mo2.d.a();
        this.f6115k = Integer.MAX_VALUE;
        this.f6117m = new HashSet();
        this.f6118n = new ArrayList();
        ao2.p1 b13 = m0.b();
        b13.e0();
        this.f6119o = b13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0038, B:15:0x00f4, B:17:0x00f8, B:38:0x00aa, B:40:0x00ae, B:41:0x00b5, B:43:0x00c9, B:45:0x00cf, B:47:0x00d3, B:48:0x00dc), top: B:13:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b A[Catch: all -> 0x012c, TryCatch #0 {all -> 0x012c, blocks: (B:20:0x0105, B:22:0x010b, B:23:0x012e), top: B:19:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0038, B:15:0x00f4, B:17:0x00f8, B:38:0x00aa, B:40:0x00ae, B:41:0x00b5, B:43:0x00c9, B:45:0x00cf, B:47:0x00d3, B:48:0x00dc), top: B:13:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0038, B:15:0x00f4, B:17:0x00f8, B:38:0x00aa, B:40:0x00ae, B:41:0x00b5, B:43:0x00c9, B:45:0x00cf, B:47:0x00d3, B:48:0x00dc), top: B:13:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r12v17, types: [mo2.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c7 -> B:18:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00cd -> B:18:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d3 -> B:18:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f1 -> B:15:0x00f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.hv1 r12, bl2.c r13) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hv1.a(ads_mobile_sdk.hv1, bl2.c):java.lang.Object");
    }

    public final String b() {
        cf2 cf2Var = this.f6112h;
        if (cf2Var == null) {
            Intrinsics.r("serverTransaction");
            throw null;
        }
        ck ckVar = cf2Var.f3893b.f14212b.f12582g;
        if (ckVar != null) {
            return String.valueOf(ckVar);
        }
        oc0 oc0Var = oc0.f9212b;
        return "No fill.";
    }

    public final r0 c() {
        Object obj;
        List list = this.f6120p;
        if (list == null) {
            Intrinsics.r("remainingAdConfigs");
            throw null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!CollectionsKt.L(this.f6117m, ((r0) obj).S)) {
                break;
            }
        }
        r0 r0Var = (r0) obj;
        if (r0Var == null || r0Var.f10397w > this.f6115k) {
            return null;
        }
        this.f6118n.add(r0Var);
        List list2 = this.f6120p;
        if (list2 == null) {
            Intrinsics.r("remainingAdConfigs");
            throw null;
        }
        list2.remove(r0Var);
        String str = r0Var.S;
        if (str != null && str.length() != 0) {
            this.f6117m.add(str);
        }
        if (r0Var.X) {
            this.f6119o = m0.b();
        }
        return r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r7) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hv1.b(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:18:0x0051, B:21:0x0058, B:29:0x0085, B:30:0x0088), top: B:17:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[Catch: all -> 0x0083, TRY_ENTER, TryCatch #0 {all -> 0x0083, blocks: (B:18:0x0051, B:21:0x0058, B:29:0x0085, B:30:0x0088), top: B:17:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.gv1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.gv1 r0 = (ads_mobile_sdk.gv1) r0
            int r1 = r0.f5716e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5716e = r1
            goto L18
        L13:
            ads_mobile_sdk.gv1 r0 = new ads_mobile_sdk.gv1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f5714c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5716e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            ue.c.H(r8)
            goto L7c
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            mo2.a r2 = r0.f5713b
            ads_mobile_sdk.hv1 r5 = r0.f5712a
            ue.c.H(r8)
            goto L51
        L3b:
            ue.c.H(r8)
            mo2.a r8 = r7.f6113i
            r0.f5712a = r7
            r0.f5713b = r8
            r0.f5716e = r5
            r2 = r8
            mo2.c r2 = (mo2.c) r2
            java.lang.Object r8 = r2.f(r3, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r5 = r7
        L51:
            ads_mobile_sdk.cf2 r8 = r5.f6112h     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "serverTransaction"
            if (r8 == 0) goto L85
            ads_mobile_sdk.ye2 r8 = r8.f3893b     // Catch: java.lang.Throwable -> L83
            java.util.List r8 = r8.f14211a     // Catch: java.lang.Throwable -> L83
            java.util.ArrayList r8 = kotlin.collections.CollectionsKt.H0(r8)     // Catch: java.lang.Throwable -> L83
            r5.f6120p = r8     // Catch: java.lang.Throwable -> L83
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L83
            mo2.c r2 = (mo2.c) r2
            r2.i(r3)
            ads_mobile_sdk.u72 r8 = r5.f6109e
            ads_mobile_sdk.cf2 r2 = r5.f6112h
            if (r2 == 0) goto L7f
            r0.f5712a = r3
            r0.f5713b = r3
            r0.f5716e = r4
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L7c
            return r1
        L7c:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        L7f:
            kotlin.jvm.internal.Intrinsics.r(r6)
            throw r3
        L83:
            r8 = move-exception
            goto L89
        L85:
            kotlin.jvm.internal.Intrinsics.r(r6)     // Catch: java.lang.Throwable -> L83
            throw r3     // Catch: java.lang.Throwable -> L83
        L89:
            mo2.c r2 = (mo2.c) r2
            r2.i(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hv1.c(bl2.c):java.lang.Object");
    }

    public final boolean a() {
        ArrayList arrayList = this.f6118n;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((r0) it.next()).f10397w < this.f6115k) {
                    break;
                }
            }
        }
        List list = this.f6120p;
        if (list != null) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((r0) it2.next()).f10397w < this.f6115k) {
                        return true;
                    }
                }
            }
            return false;
        }
        Intrinsics.r("remainingAdConfigs");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:19:0x007a, B:21:0x0082, B:26:0x0095, B:45:0x004e), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:19:0x007a, B:21:0x0082, B:26:0x0095, B:45:0x004e), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c1 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r11) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hv1.a(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #3 {all -> 0x0037, blocks: (B:70:0x0032, B:22:0x00ec, B:24:0x00f2), top: B:69:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d A[Catch: all -> 0x011d, TryCatch #4 {all -> 0x011d, blocks: (B:29:0x0106, B:31:0x010d, B:33:0x0114, B:35:0x0118, B:37:0x011c, B:38:0x011f, B:39:0x0124, B:40:0x0125, B:41:0x012c, B:42:0x012d, B:43:0x0134, B:44:0x0135), top: B:28:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0135 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #4 {all -> 0x011d, blocks: (B:29:0x0106, B:31:0x010d, B:33:0x0114, B:35:0x0118, B:37:0x011c, B:38:0x011f, B:39:0x0124, B:40:0x0125, B:41:0x012c, B:42:0x012d, B:43:0x0134, B:44:0x0135), top: B:28:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    /* JADX WARN: Type inference failed for: r10v0, types: [ads_mobile_sdk.cf2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.cf2 r10, bl2.c r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hv1.a(ads_mobile_sdk.cf2, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.r0 r14, bl2.c r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hv1.a(ads_mobile_sdk.r0, bl2.c):java.lang.Object");
    }
}
