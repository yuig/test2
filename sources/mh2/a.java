package mh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements dj2.a {

    /* renamed from: a, reason: collision with root package name */
    public final n f87166a;

    /* renamed from: b, reason: collision with root package name */
    public final dj2.a f87167b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f87168c;

    public a(n logSink, dj2.a externalLogRecordExporter, sh2.i exportCheck) {
        Intrinsics.checkNotNullParameter(logSink, "logSink");
        Intrinsics.checkNotNullParameter(externalLogRecordExporter, "externalLogRecordExporter");
        Intrinsics.checkNotNullParameter(exportCheck, "exportCheck");
        this.f87166a = logSink;
        this.f87167b = externalLogRecordExporter;
        this.f87168c = exportCheck;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (r5 == null) goto L20;
     */
    @Override // dj2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zi2.c b(java.util.ArrayList r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.a.b(java.util.ArrayList):zi2.c");
    }

    @Override // dj2.a
    public final zi2.c shutdown() {
        zi2.c cVar = zi2.c.f142036e;
        Intrinsics.checkNotNullExpressionValue(cVar, "ofSuccess()");
        return cVar;
    }
}
