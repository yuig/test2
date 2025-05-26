package nk1;

import com.pinterest.api.model.zs;
import dl1.s;
import h32.f1;
import kg.t;
import kotlin.jvm.internal.Intrinsics;
import x02.v1;

/* loaded from: classes5.dex */
public final class j extends f {

    /* renamed from: p, reason: collision with root package name */
    public final v1 f91137p;

    /* renamed from: q, reason: collision with root package name */
    public final f1 f91138q;

    /* renamed from: r, reason: collision with root package name */
    public final f1 f91139r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(com.pinterest.api.model.zs r11, nk1.g r12, kotlin.jvm.functions.Function2 r13, int r14) {
        /*
            r10 = this;
            r14 = r14 & 4
            ok1.b r6 = ok1.b.f95453i
            if (r14 == 0) goto L8
            r4 = r6
            goto L9
        L8:
            r4 = r13
        L9:
            ok1.a r7 = ok1.a.f95450j
            nk1.a r8 = nk1.a.f91100l
            android.content.Context r13 = kb0.a.f79058b
            java.lang.Class<so1.b> r13 = so1.b.class
            java.lang.Object r13 = ep.b.g(r13)
            so1.b r13 = (so1.b) r13
            so.oa r13 = (so.oa) r13
            bf2.d r13 = r13.f113960v4
            java.lang.Object r13 = r13.get()
            x02.v1 r13 = (x02.v1) r13
            java.lang.String r14 = "followableInterest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r14)
            java.lang.String r14 = "followActionLoggingContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r14)
            java.lang.String r14 = "followActionSuccess"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r14)
            java.lang.String r14 = "followActionFailure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r14)
            java.lang.String r14 = "followActionInitiated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r14)
            java.lang.String r14 = "followActionNotAllowed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r14)
            java.lang.String r14 = "isFollowActionAllowed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r14)
            java.lang.String r14 = "interestRepository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r14)
            r9 = 3840(0xf00, float:5.381E-42)
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f91137p = r13
            h32.f1 r11 = h32.f1.INTEREST_FOLLOW
            r10.f91138q = r11
            h32.f1 r11 = h32.f1.INTEREST_UNFOLLOW
            r10.f91139r = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nk1.j.<init>(com.pinterest.api.model.zs, nk1.g, kotlin.jvm.functions.Function2, int):void");
    }

    @Override // nk1.f
    public final uj2.q c(s sVar) {
        zs model = (zs) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        uj2.f a13 = t.a1(this.f91137p, model, true);
        uj2.q a14 = a13 instanceof dk2.c ? ((dk2.c) a13).a() : new cl1.e(a13, 1);
        Intrinsics.checkNotNullExpressionValue(a14, "toObservable(...)");
        return a14;
    }

    @Override // nk1.f
    public final f1 d() {
        return this.f91138q;
    }

    @Override // nk1.f
    public final f1 e() {
        return this.f91139r;
    }

    @Override // nk1.f
    public final uj2.q i(s sVar) {
        zs model = (zs) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        uj2.f a13 = t.a1(this.f91137p, model, false);
        uj2.q a14 = a13 instanceof dk2.c ? ((dk2.c) a13).a() : new cl1.e(a13, 1);
        Intrinsics.checkNotNullExpressionValue(a14, "toObservable(...)");
        return a14;
    }
}
