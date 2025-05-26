package ed1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58666i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f58667j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, int i13) {
        super(1);
        this.f58666i = i13;
        this.f58667j = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r3 = r2.G;
        r6 = p32.f.COPY_LINK;
        r7 = e0.t.f56747e;
        r10 = r2.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r10 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r3.i(r2.f58677e, r2.f58675c, r6, r7, r10);
        r2.r3(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r10 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r10 > 0.8f) goto L13;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f58666i
            r1 = 0
            ed1.q r2 = r9.f58667j
            switch(r0) {
                case 0: goto L4c;
                default: goto L8;
            }
        L8:
            java.util.Optional r10 = (java.util.Optional) r10
            java.lang.String r0 = "optionalDescription"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.Object r10 = kh2.m2.U0(r10)
            android.content.ClipDescription r10 = (android.content.ClipDescription) r10
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r0 < r3) goto L30
            if (r10 == 0) goto L49
            int r0 = a.i3.b(r10)
            r3 = 3
            if (r0 != r3) goto L49
            float r10 = a.i3.a(r10)
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 <= 0) goto L49
            goto L32
        L30:
            if (r10 == 0) goto L49
        L32:
            e82.h0 r3 = r2.G
            p32.f r6 = p32.f.COPY_LINK
            int r7 = e0.t.f56747e
            java.lang.String r10 = r2.Q
            if (r10 != 0) goto L3e
            java.lang.String r10 = ""
        L3e:
            r8 = r10
            com.pinterest.activity.sendapin.model.SendableObject r4 = r2.f58677e
            p32.c r5 = r2.f58675c
            r3.i(r4, r5, r6, r7, r8)
            r2.r3(r1)
        L49:
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        L4c:
            com.pinterest.api.model.v7 r10 = (com.pinterest.api.model.v7) r10
            kotlin.jvm.internal.Intrinsics.f(r10)
            r2.getClass()
            boolean r0 = kh2.w.h0(r10)
            boolean r3 = r10.H0()
            r4 = 1
            java.lang.String r5 = "getCollaboratedByMe(...)"
            if (r3 == 0) goto L6f
            java.lang.Boolean r3 = r10.G0()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L6f
            r1 = r4
        L6f:
            boolean r3 = r2.isBound()
            if (r3 == 0) goto Le1
            if (r0 != 0) goto L7a
            if (r1 != 0) goto L7a
            goto Le1
        L7a:
            yk1.n r0 = r2.getView()
            cd1.f r0 = (cd1.f) r0
            r0.f5()
            boolean r0 = kh2.w.h0(r10)
            if (r0 == 0) goto L8c
            com.pinterest.feature.board.permissions.a r0 = com.pinterest.feature.board.permissions.a.OWNER
            goto La3
        L8c:
            boolean r0 = r10.H0()
            if (r0 == 0) goto La2
            java.lang.Boolean r0 = r10.G0()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La2
            com.pinterest.feature.board.permissions.a r0 = com.pinterest.feature.board.permissions.a.COLLABORATOR
            goto La3
        La2:
            r0 = 0
        La3:
            gi.m r1 = r2.f58689q
            r1.getClass()
            y22.f r1 = gi.m.E(r10)
            int[] r3 = ed1.j.f58647a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            java.lang.String r3 = "getUid(...)"
            if (r1 == r4) goto Lcf
            r4 = 2
            if (r1 == r4) goto Lbc
            goto Le1
        Lbc:
            yk1.n r1 = r2.getView()
            cd1.f r1 = (cd1.f) r1
            java.lang.String r10 = r10.getUid()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
            com.pinterest.feature.board.permissions.d r2 = com.pinterest.feature.board.permissions.d.DO_EVERYTHING
            r1.E0(r10, r2, r0)
            goto Le1
        Lcf:
            yk1.n r1 = r2.getView()
            cd1.f r1 = (cd1.f) r1
            java.lang.String r10 = r10.getUid()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
            com.pinterest.feature.board.permissions.d r2 = com.pinterest.feature.board.permissions.d.SAVE_AND_COMMENT
            r1.E0(r10, r2, r0)
        Le1:
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ed1.n.invoke(java.lang.Object):java.lang.Object");
    }
}
