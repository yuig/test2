package nk1;

import com.pinterest.api.model.wy0;
import dl1.s;
import h32.f1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends f {
    public final f1 A;

    /* renamed from: p, reason: collision with root package name */
    public final Function2 f91150p;

    /* renamed from: q, reason: collision with root package name */
    public final Function2 f91151q;

    /* renamed from: r, reason: collision with root package name */
    public final Function2 f91152r;

    /* renamed from: s, reason: collision with root package name */
    public final Function1 f91153s;

    /* renamed from: t, reason: collision with root package name */
    public final ok1.f f91154t;

    /* renamed from: u, reason: collision with root package name */
    public final String f91155u;

    /* renamed from: v, reason: collision with root package name */
    public final Function2 f91156v;

    /* renamed from: w, reason: collision with root package name */
    public final Function2 f91157w;

    /* renamed from: x, reason: collision with root package name */
    public final Function2 f91158x;

    /* renamed from: y, reason: collision with root package name */
    public final Function1 f91159y;

    /* renamed from: z, reason: collision with root package name */
    public final f1 f91160z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(z40.y r17, x02.x2 r18, nk1.g r19, ok1.f r20, java.lang.String r21, nx.d1 r22, f2.o r23, kotlin.jvm.functions.Function2 r24, kotlin.jvm.functions.Function2 r25, kotlin.jvm.functions.Function1 r26) {
        /*
            r16 = this;
            r12 = r16
            r0 = r17
            r3 = r18
            r2 = r19
            r13 = r20
            r1 = r23
            r14 = r24
            r15 = r25
            r11 = r26
            oa2.f r4 = oa2.f.f93878j
            kp.n r5 = new kp.n
            r6 = 12
            r5.<init>(r6)
            java.lang.String r6 = "apolloData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
            java.lang.String r7 = "converter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            java.lang.String r7 = "userRepository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            java.lang.String r7 = "followActionLoggingContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            java.lang.String r8 = "userFollowActions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r8)
            java.lang.String r8 = "trackingParamAttacher"
            r10 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r8)
            java.lang.String r8 = "isFollowActionAllowed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r8)
            java.lang.String r4 = "followActionSuccess"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r9 = "followActionFailure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r9)
            java.lang.String r10 = "followActionInitiated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r10)
            java.lang.String r13 = "followActionNotAllowed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r13)
            nk1.a r12 = nk1.a.f91099k
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
            java.lang.String r6 = "apolloPlankModelConverter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            java.lang.String r6 = "modelUpdatesSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r13)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r8)
            java.lang.Object r0 = r5.B(r0)
            r4 = r0
            dl1.s r4 = (dl1.s) r4
            nk1.i r6 = new nk1.i
            r0 = 0
            r6.<init>(r1, r5, r0)
            nk1.i r7 = new nk1.i
            r0 = 1
            r7.<init>(r14, r5, r0)
            nk1.i r8 = new nk1.i
            r0 = 2
            r8.<init>(r15, r5, r0)
            oh1.u r9 = new oh1.u
            r0 = 17
            r9.<init>(r11, r5, r0)
            nk1.i r10 = new nk1.i
            r0 = 3
            r10.<init>(r12, r5, r0)
            r12 = 0
            r13 = 0
            r0 = r16
            r1 = r4
            r2 = r19
            r3 = r18
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r12
            r10 = r13
            r12 = r11
            r11 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f91151q = r14
            r0.f91152r = r15
            r0.f91153s = r12
            r1 = r20
            r0.f91154t = r1
            r1 = r21
            r0.f91155u = r1
            r0.f91157w = r14
            r0.f91158x = r15
            r0.f91159y = r12
            h32.f1 r1 = h32.f1.USER_FOLLOW
            r0.f91160z = r1
            h32.f1 r1 = h32.f1.USER_UNFOLLOW
            r0.A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nk1.n.<init>(z40.y, x02.x2, nk1.g, ok1.f, java.lang.String, nx.d1, f2.o, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1):void");
    }

    @Override // nk1.f
    public final uj2.q c(s sVar) {
        wy0 model = (wy0) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        uj2.q u13 = ok1.f.a(this.f91154t, model, this.f91155u, null, 4).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    @Override // nk1.f
    public final f1 d() {
        return this.f91160z;
    }

    @Override // nk1.f
    public final f1 e() {
        return this.A;
    }

    @Override // nk1.f
    public final uj2.q i(s sVar) {
        wy0 model = (wy0) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        uj2.q u13 = this.f91154t.c(model, this.f91155u).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }
}
