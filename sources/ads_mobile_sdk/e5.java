package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e5 implements a.dc {

    /* renamed from: a, reason: collision with root package name */
    public final a.a5 f4610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4611b;

    /* renamed from: c, reason: collision with root package name */
    public final mh2 f4612c;

    /* renamed from: d, reason: collision with root package name */
    public final wi.k f4613d;

    /* renamed from: e, reason: collision with root package name */
    public final nm.o f4614e;

    public e5(a.a5 javascriptEngine, String adResponseBlob, mh2 signalGenerationData, wi.k baseRequest, nm.o gson) {
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        Intrinsics.checkNotNullParameter(adResponseBlob, "adResponseBlob");
        Intrinsics.checkNotNullParameter(signalGenerationData, "signalGenerationData");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f4610a = javascriptEngine;
        this.f4611b = adResponseBlob;
        this.f4612c = signalGenerationData;
        this.f4613d = baseRequest;
        this.f4614e = gson;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076 A[Catch: all -> 0x002d, TryCatch #4 {all -> 0x002d, blocks: (B:11:0x0029, B:12:0x006f, B:14:0x0076, B:15:0x00d2, B:17:0x00d6, B:22:0x0079, B:24:0x0093, B:25:0x00a5, B:27:0x00aa, B:28:0x00ad, B:31:0x009e), top: B:10:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #4 {all -> 0x002d, blocks: (B:11:0x0029, B:12:0x006f, B:14:0x0076, B:15:0x00d2, B:17:0x00d6, B:22:0x0079, B:24:0x0093, B:25:0x00a5, B:27:0x00aa, B:28:0x00ad, B:31:0x009e), top: B:10:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #4 {all -> 0x002d, blocks: (B:11:0x0029, B:12:0x006f, B:14:0x0076, B:15:0x00d2, B:17:0x00d6, B:22:0x0079, B:24:0x0093, B:25:0x00a5, B:27:0x00aa, B:28:0x00ad, B:31:0x009e), top: B:10:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb A[Catch: all -> 0x00fb, TryCatch #3 {all -> 0x00fb, blocks: (B:34:0x00e4, B:36:0x00eb, B:38:0x00f2, B:40:0x00f6, B:42:0x00fa, B:43:0x00fd, B:44:0x0102, B:45:0x0103, B:46:0x010a, B:47:0x010b, B:48:0x0112, B:49:0x0113), top: B:33:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113 A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #3 {all -> 0x00fb, blocks: (B:34:0x00e4, B:36:0x00eb, B:38:0x00f2, B:40:0x00f6, B:42:0x00fa, B:43:0x00fd, B:44:0x0102, B:45:0x0103, B:46:0x010a, B:47:0x010b, B:48:0x0112, B:49:0x0113), top: B:33:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // a.dc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r7) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.e5.a(bl2.c):java.lang.Object");
    }

    public final nm.u a() {
        nm.u uVar = new nm.u();
        nm.u uVar2 = new nm.u();
        nm.u uVar3 = new nm.u();
        uVar2.u("base_url", "");
        uVar2.r("signals", this.f4614e.o(this.f4612c.f8230c).i());
        uVar3.u("body", this.f4611b);
        uVar3.r("headers", new nm.u());
        uVar.r("request", uVar2);
        uVar.r("response", uVar3);
        uVar.r("flags", new nm.u());
        return uVar;
    }
}
