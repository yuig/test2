package yc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f138609r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f138610s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f138611t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f138612u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ pc.f f138613v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pc.v f138614w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ad.b f138615x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z13, l lVar, pc.f fVar, pc.v vVar, ad.b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f138611t = z13;
        this.f138612u = lVar;
        this.f138613v = fVar;
        this.f138614w = vVar;
        this.f138615x = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f138611t, this.f138612u, this.f138613v, this.f138614w, this.f138615x, cVar);
        dVar.f138610s = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f138609r
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L30
            if (r1 == r5) goto L28
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            goto L24
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            java.lang.Object r1 = r10.f138610s
            do2.j r1 = (do2.j) r1
            ue.c.H(r11)
            goto L7d
        L24:
            ue.c.H(r11)
            goto L8a
        L28:
            java.lang.Object r1 = r10.f138610s
            do2.j r1 = (do2.j) r1
            ue.c.H(r11)
            goto L4d
        L30:
            ue.c.H(r11)
            java.lang.Object r11 = r10.f138610s
            r1 = r11
            do2.j r1 = (do2.j) r1
            boolean r11 = r10.f138611t
            pc.v r7 = r10.f138614w
            pc.f r8 = r10.f138613v
            yc.l r9 = r10.f138612u
            if (r11 == 0) goto L58
            r10.f138610s = r1
            r10.f138609r = r5
            java.lang.Object r11 = yc.l.b(r9, r8, r7, r10)
            if (r11 != r0) goto L4d
            return r0
        L4d:
            r10.f138610s = r6
            r10.f138609r = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L8a
            return r0
        L58:
            r10.f138610s = r1
            r10.f138609r = r3
            r9.getClass()
            int r11 = cd.b.f27547a
            long r3 = java.lang.System.currentTimeMillis()
            ad.b r11 = r10.f138615x
            do2.i r11 = r11.a(r8)
            yc.k r5 = new yc.k
            r5.<init>(r9, r8, r7, r6)
            do2.s0 r11 = lb.l0.Q0(r5, r11)
            yc.j r5 = new yc.j
            r5.<init>(r11, r3)
            if (r5 != r0) goto L7c
            return r0
        L7c:
            r11 = r5
        L7d:
            do2.i r11 = (do2.i) r11
            r10.f138610s = r6
            r10.f138609r = r2
            java.lang.Object r11 = lb.l0.Z(r10, r11, r1)
            if (r11 != r0) goto L8a
            return r0
        L8a:
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
