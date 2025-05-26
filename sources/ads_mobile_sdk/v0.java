package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class v0 implements a.kb {

    /* renamed from: a, reason: collision with root package name */
    public final ss2 f12263a;

    /* renamed from: b, reason: collision with root package name */
    public final wi.k f12264b;

    /* renamed from: c, reason: collision with root package name */
    public final h92 f12265c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12266d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12267e;

    /* renamed from: f, reason: collision with root package name */
    public final r0 f12268f;

    /* renamed from: g, reason: collision with root package name */
    public final vo f12269g;

    /* renamed from: h, reason: collision with root package name */
    public final cf2 f12270h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12271i;

    public v0(ss2 traceMetaSet, wi.k baseRequest, h92 requestType, long j13, int i13, r0 adConfiguration, vo commonConfiguration, cf2 serverTransaction, String uniqueRenderId) {
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(uniqueRenderId, "uniqueRenderId");
        this.f12263a = traceMetaSet;
        this.f12264b = baseRequest;
        this.f12265c = requestType;
        this.f12266d = j13;
        this.f12267e = i13;
        this.f12268f = adConfiguration;
        this.f12269g = commonConfiguration;
        this.f12270h = serverTransaction;
        this.f12271i = uniqueRenderId;
    }

    public final a.n3 a(a.n3 componentBuilder, boolean z13) {
        Intrinsics.checkNotNullParameter(componentBuilder, "componentBuilder");
        return (a.n3) ((a.n3) ((a.n3) ((a.n3) ((a.n3) ((a.n3) ((a.n3) ((a.n3) ((a.n3) ((a.n3) ((a.n3) ((a.n3) componentBuilder.a(this.f12268f)).a(this.f12269g)).a(this.f12270h)).a(this.f12263a.f11215a)).a(this.f12263a.f11216b)).a(this.f12263a.f11217c)).a(this.f12263a.f11218d)).a(this.f12265c)).a(this.f12264b)).a(this.f12266d)).a(z13)).a(this.f12267e);
    }

    public abstract Object a(boolean z13, bl2.c cVar);

    public final r0 c() {
        return this.f12268f;
    }

    public final cf2 d() {
        return this.f12270h;
    }

    @Override // a.kb
    public final Object a(String str, int i13, bl2.c cVar) {
        return a(this, str, i13, cVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:3|(11:5|6|7|(1:(4:10|11|12|13)(2:58|59))(6:60|61|62|63|64|(1:66)(1:67))|14|15|16|17|(1:19)|21|22))|7|(0)(0)|14|15|16|17|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x002c, B:17:0x00c5, B:19:0x00c9), top: B:11:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db A[Catch: all -> 0x00eb, TryCatch #6 {all -> 0x00eb, blocks: (B:32:0x00d4, B:34:0x00db, B:36:0x00e2, B:38:0x00e6, B:40:0x00ea, B:41:0x00ed, B:42:0x00f2, B:43:0x00f3, B:44:0x00fa, B:45:0x00fb, B:46:0x0102, B:47:0x0103), top: B:31:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103 A[Catch: all -> 0x00eb, TRY_LEAVE, TryCatch #6 {all -> 0x00eb, blocks: (B:32:0x00d4, B:34:0x00db, B:36:0x00e2, B:38:0x00e6, B:40:0x00ea, B:41:0x00ed, B:42:0x00f2, B:43:0x00f3, B:44:0x00fa, B:45:0x00fb, B:46:0x0102, B:47:0x0103), top: B:31:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v24, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.v0 r8, java.lang.String r9, int r10, bl2.c r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.v0.a(ads_mobile_sdk.v0, java.lang.String, int, bl2.c):java.lang.Object");
    }
}
