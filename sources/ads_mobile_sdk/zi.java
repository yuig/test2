package ads_mobile_sdk;

import a.wc;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class zi extends v0 implements wc {

    /* renamed from: j, reason: collision with root package name */
    public final a.v7 f14782j;

    /* renamed from: k, reason: collision with root package name */
    public final dz f14783k;

    /* renamed from: l, reason: collision with root package name */
    public final lz2 f14784l;

    /* renamed from: m, reason: collision with root package name */
    public final j0 f14785m;

    /* renamed from: n, reason: collision with root package name */
    public final tp0 f14786n;

    /* renamed from: o, reason: collision with root package name */
    public final hf f14787o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(int i13, long j13, wi.k baseRequest, r0 adConfiguration, hf appSettings, vo commonConfiguration, h92 requestType, cf2 serverTransaction, ss2 traceMetaSet, dz csiTicker, tp0 htmlUtil, lz2 webViewFactory, String renderId, a.o8 adComponentProvider, j0 uiScope) {
        super(traceMetaSet, baseRequest, requestType, j13, i13, adConfiguration, commonConfiguration, serverTransaction, renderId);
        Intrinsics.checkNotNullParameter(adComponentProvider, "adComponentProvider");
        Intrinsics.checkNotNullParameter(csiTicker, "csiTicker");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(htmlUtil, "htmlUtil");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        this.f14782j = adComponentProvider;
        this.f14783k = csiTicker;
        this.f14784l = webViewFactory;
        this.f14785m = uiScope;
        this.f14786n = htmlUtil;
        this.f14787o = appSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0295 A[Catch: all -> 0x02a5, TryCatch #2 {all -> 0x02a5, blocks: (B:106:0x028e, B:108:0x0295, B:110:0x029c, B:112:0x02a0, B:114:0x02a4, B:115:0x02a8, B:116:0x02ad, B:117:0x02ae, B:118:0x02b5, B:119:0x02b6, B:120:0x02bd, B:121:0x02be), top: B:105:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02be A[Catch: all -> 0x02a5, TRY_LEAVE, TryCatch #2 {all -> 0x02a5, blocks: (B:106:0x028e, B:108:0x0295, B:110:0x029c, B:112:0x02a0, B:114:0x02a4, B:115:0x02a8, B:116:0x02ad, B:117:0x02ae, B:118:0x02b5, B:119:0x02b6, B:120:0x02bd, B:121:0x02be), top: B:105:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x020b A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #4 {all -> 0x0066, blocks: (B:21:0x005e, B:23:0x0205, B:25:0x020b), top: B:20:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x025b A[Catch: all -> 0x026b, TryCatch #5 {all -> 0x026b, blocks: (B:35:0x0254, B:37:0x025b, B:39:0x0262, B:41:0x0266, B:43:0x026a, B:44:0x026e, B:45:0x0273, B:46:0x0274, B:47:0x027b, B:48:0x027c, B:49:0x0283, B:50:0x0284), top: B:34:0x0254 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0284 A[Catch: all -> 0x026b, TRY_LEAVE, TryCatch #5 {all -> 0x026b, blocks: (B:35:0x0254, B:37:0x025b, B:39:0x0262, B:41:0x0266, B:43:0x026a, B:44:0x026e, B:45:0x0273, B:46:0x0274, B:47:0x027b, B:48:0x027c, B:49:0x0283, B:50:0x0284), top: B:34:0x0254 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f2 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #7 {all -> 0x00ad, blocks: (B:89:0x00a9, B:90:0x00ec, B:92:0x00f2), top: B:88:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0142  */
    /* JADX WARN: Type inference failed for: r1v15, types: [ads_mobile_sdk.ln0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ads_mobile_sdk.cs2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v11, types: [a.dg] */
    /* JADX WARN: Type inference failed for: r4v13, types: [a.dg] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v36, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.zi r18, bl2.c r19) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zi.a(ads_mobile_sdk.zi, bl2.c):java.lang.Object");
    }

    @Override // a.kb
    public final boolean b() {
        fs0 fs0Var = this.f12268f.H;
        return (fs0Var != null ? fs0Var.f5264a : null) != null;
    }

    @Override // a.wc
    public final hf a() {
        return this.f14787o;
    }

    @Override // ads_mobile_sdk.v0
    public final Object a(boolean z13, bl2.c cVar) {
        return a(this, cVar);
    }
}
