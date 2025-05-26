package um0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class l0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f122731r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f122732s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n0 f122733t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g0 f122734u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u50.r f122735v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, g0 g0Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f122733t = n0Var;
        this.f122734u = g0Var;
        this.f122735v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l0 l0Var = new l0(this.f122733t, this.f122734u, this.f122735v, cVar);
        l0Var.f122732s = obj;
        return l0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f122731r
            um0.l r2 = um0.l.f122730a
            java.lang.String r3 = "getReorderedModelId(...)"
            u50.r r4 = r10.f122735v
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 != r5) goto L19
            java.lang.Object r0 = r10.f122732s
            ym0.a r0 = (ym0.a) r0
            ue.c.H(r11)     // Catch: java.lang.Throwable -> L17
            goto L83
        L17:
            r11 = move-exception
            goto L8a
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            ue.c.H(r11)
            java.lang.Object r11 = r10.f122732s
            ao2.j0 r11 = (ao2.j0) r11
            um0.n0 r11 = r10.f122733t
            xk2.v r1 = r11.f122745g
            java.lang.Object r1 = r1.getValue()
            ym0.b r1 = (ym0.b) r1
            um0.g0 r6 = r10.f122734u
            java.util.List r7 = r6.f122710a
            r1.getClass()
            int r1 = r6.f122711b
            ym0.a r1 = ym0.b.a(r1, r7)
            if (r1 == 0) goto La7
            java.lang.String r6 = "boardSectionRepository"
            x02.z0 r11 = r11.f122744f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r6)
            xk2.q r6 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = r1.f139397a     // Catch: java.lang.Throwable -> L88
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)     // Catch: java.lang.Throwable -> L88
            r11.getClass()     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = "movedSectionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)     // Catch: java.lang.Throwable -> L88
            j12.f r7 = new j12.f     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r1.f139398b     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = r1.f139399c     // Catch: java.lang.Throwable -> L88
            r7.<init>(r6, r8, r9)     // Catch: java.lang.Throwable -> L88
            r6 = 0
            uj2.l r11 = r11.G(r7, r6)     // Catch: java.lang.Throwable -> L88
            r11.getClass()     // Catch: java.lang.Throwable -> L88
            hk2.u r6 = new hk2.u     // Catch: java.lang.Throwable -> L88
            r6.<init>(r11)     // Catch: java.lang.Throwable -> L88
            java.lang.String r11 = "ignoreElement(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r11)     // Catch: java.lang.Throwable -> L88
            r10.f122732s = r1     // Catch: java.lang.Throwable -> L88
            r10.f122731r = r5     // Catch: java.lang.Throwable -> L88
            java.lang.Object r11 = kh2.j.o(r6, r10)     // Catch: java.lang.Throwable -> L88
            if (r11 != r0) goto L82
            return r0
        L82:
            r0 = r1
        L83:
            kotlin.Unit r11 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L17
            xk2.q r1 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L17
            goto L90
        L88:
            r11 = move-exception
            r0 = r1
        L8a:
            xk2.q r1 = xk2.s.f135225b
            xk2.r r11 = ue.c.m(r11)
        L90:
            boolean r11 = r11 instanceof xk2.r
            r11 = r11 ^ r5
            if (r11 == 0) goto La3
            um0.k r11 = new um0.k
            java.lang.String r0 = r0.f139397a
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r11.<init>(r0)
            r4.a(r11)
            goto Laa
        La3:
            r4.a(r2)
            goto Laa
        La7:
            r4.a(r2)
        Laa:
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: um0.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
