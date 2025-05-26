package nk1;

import com.pinterest.api.model.v7;
import dl1.s;
import h32.f1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends f {

    /* renamed from: p, reason: collision with root package name */
    public final ok1.d f91103p;

    /* renamed from: q, reason: collision with root package name */
    public final f1 f91104q;

    /* renamed from: r, reason: collision with root package name */
    public final f1 f91105r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(com.pinterest.api.model.v7 r13, nk1.g r14, xb0.a r15, oh1.u r16, x02.x0 r17) {
        /*
            r12 = this;
            r10 = r12
            r2 = r14
            r3 = r17
            ok1.b r6 = ok1.b.f95453i
            nk1.a r8 = nk1.a.f91098j
            ok1.d r11 = new ok1.d
            r0 = 4
            r11.<init>(r14, r3, r0)
            java.lang.String r0 = "followableBoard"
            r1 = r13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "followActionLoggingContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "followActionSuccess"
            r4 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "followActionFailure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "followActionInitiated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "followActionNotAllowed"
            r7 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "isFollowActionAllowed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "boardRepository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "boardFollowActions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r9 = 3584(0xe00, float:5.022E-42)
            r0 = r12
            r2 = r14
            r3 = r17
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f91103p = r11
            h32.f1 r0 = h32.f1.BOARD_FOLLOW
            r10.f91104q = r0
            h32.f1 r0 = h32.f1.BOARD_UNFOLLOW
            r10.f91105r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nk1.b.<init>(com.pinterest.api.model.v7, nk1.g, xb0.a, oh1.u, x02.x0):void");
    }

    @Override // nk1.f
    public final uj2.q c(s sVar) {
        v7 model = (v7) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        String boardId = model.getUid();
        Intrinsics.checkNotNullExpressionValue(boardId, "getUid(...)");
        ok1.d dVar = this.f91103p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        uj2.q u13 = dVar.b(boardId, true).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    @Override // nk1.f
    public final f1 d() {
        return this.f91104q;
    }

    @Override // nk1.f
    public final f1 e() {
        return this.f91105r;
    }

    @Override // nk1.f
    public final uj2.q i(s sVar) {
        v7 model = (v7) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        String boardId = model.getUid();
        Intrinsics.checkNotNullExpressionValue(boardId, "getUid(...)");
        ok1.d dVar = this.f91103p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        uj2.q u13 = dVar.b(boardId, false).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }
}
