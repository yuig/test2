package ga;

import android.adservices.topics.GetTopicsRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f64584b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(android.content.Context r3, int r4) {
        /*
            r2 = this;
            r2.f64584b = r4
            r0 = 1
            java.lang.String r1 = "context"
            if (r4 == r0) goto L17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            android.adservices.topics.TopicsManager r3 = androidx.media3.ui.a0.i(r3)
            java.lang.String r4 = "get(context)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.<init>(r3)
            return
        L17:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.Class r4 = androidx.media3.ui.a0.z()
            java.lang.Object r3 = r3.getSystemService(r4)
            java.lang.String r4 = "context.getSystemService…opicsManager::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            android.adservices.topics.TopicsManager r3 = androidx.media3.ui.a0.j(r3)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.e.<init>(android.content.Context, int):void");
    }

    @Override // ga.i
    public final GetTopicsRequest b(a request) {
        switch (this.f64584b) {
            case 0:
                Intrinsics.checkNotNullParameter(request, "request");
                GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(request.f64578a).setShouldRecordObservation(request.f64579b).build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ion)\n            .build()");
                return build;
            default:
                Intrinsics.checkNotNullParameter(request, "request");
                GetTopicsRequest build2 = new GetTopicsRequest.Builder().setAdsSdkName(request.f64578a).setShouldRecordObservation(request.f64579b).build();
                Intrinsics.checkNotNullExpressionValue(build2, "Builder()\n            .s…ion)\n            .build()");
                return build2;
        }
    }
}
