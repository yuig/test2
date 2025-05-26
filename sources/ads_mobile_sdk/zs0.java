package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zs0 {

    /* renamed from: a, reason: collision with root package name */
    public final z6 f14908a;

    /* renamed from: b, reason: collision with root package name */
    public final a.j3 f14909b;

    /* renamed from: c, reason: collision with root package name */
    public final mo2.a f14910c;

    /* renamed from: d, reason: collision with root package name */
    public final nm.q f14911d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14912e;

    public zs0(z6 adapterInitializer, a.j3 traceLogger) {
        Intrinsics.checkNotNullParameter(adapterInitializer, "adapterInitializer");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.f14908a = adapterInitializer;
        this.f14909b = traceLogger;
        fi.b bVar = mo2.d.f87812a;
        this.f14910c = new mo2.c(false);
        this.f14911d = new nm.q();
    }

    public static nm.u a(String str, xi.b bVar, aj.c cVar) {
        String str2;
        String str3;
        nm.u uVar = new nm.u();
        uVar.u("adapterClassName", str);
        String str4 = "";
        if (cVar == null || (str2 = cVar.adapterVersion) == null) {
            str2 = "";
        }
        uVar.u("version", str2);
        if (cVar != null && (str3 = cVar.sdkVersion) != null) {
            str4 = str3;
        }
        uVar.u("sdkVersion", str4);
        uVar.s(Integer.valueOf(bVar.getInitializationState() == xi.a.COMPLETE ? 1 : 0), "status");
        uVar.u("description", bVar.getDescription());
        uVar.s(Integer.valueOf(bVar.getLatency()), "initializationLatencyMillis");
        uVar.t("supportsInitialization", Boolean.valueOf(cVar != null));
        return uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8 A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #1 {all -> 0x00b0, blocks: (B:13:0x00a4, B:15:0x00a8, B:19:0x00b2, B:20:0x00c0, B:22:0x00c6, B:24:0x00d8, B:29:0x00eb, B:32:0x00f5), top: B:12:0x00a4, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2 A[Catch: all -> 0x00b0, TRY_ENTER, TryCatch #1 {all -> 0x00b0, blocks: (B:13:0x00a4, B:15:0x00a8, B:19:0x00b2, B:20:0x00c0, B:22:0x00c6, B:24:0x00d8, B:29:0x00eb, B:32:0x00f5), top: B:12:0x00a4, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0063 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #3 {all -> 0x006b, blocks: (B:63:0x005f, B:65:0x0063, B:68:0x006e), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006e A[Catch: all -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x006b, blocks: (B:63:0x005f, B:65:0x0063, B:68:0x006e), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v11, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.zs0 r7, bl2.c r8) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zs0.a(ads_mobile_sdk.zs0, bl2.c):java.lang.Object");
    }
}
