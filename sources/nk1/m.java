package nk1;

import com.pinterest.api.model.wy0;
import dl1.s;
import h32.f1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends f {

    /* renamed from: p, reason: collision with root package name */
    public g f91145p;

    /* renamed from: q, reason: collision with root package name */
    public final ok1.f f91146q;

    /* renamed from: r, reason: collision with root package name */
    public final String f91147r;

    /* renamed from: s, reason: collision with root package name */
    public final f1 f91148s;

    /* renamed from: t, reason: collision with root package name */
    public final f1 f91149t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(com.pinterest.api.model.wy0 r19, nk1.g r20, kotlin.jvm.functions.Function2 r21, kotlin.jvm.functions.Function2 r22, kotlin.jvm.functions.Function2 r23, kotlin.jvm.functions.Function1 r24, x02.x2 r25, nx.d1 r26, java.lang.String r27, int r28) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nk1.m.<init>(com.pinterest.api.model.wy0, nk1.g, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, x02.x2, nx.d1, java.lang.String, int):void");
    }

    @Override // nk1.f
    public final uj2.q c(s sVar) {
        wy0 model = (wy0) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        uj2.q u13 = ok1.f.a(this.f91146q, model, this.f91147r, null, 4).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    @Override // nk1.f
    public final f1 d() {
        return this.f91148s;
    }

    @Override // nk1.f
    public final f1 e() {
        return this.f91149t;
    }

    @Override // nk1.f
    public final uj2.q i(s sVar) {
        wy0 model = (wy0) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        uj2.q u13 = this.f91146q.c(model, this.f91147r).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }
}
