package bd;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f22699r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f22700s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ do2.i f22701t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kl2.l f22702u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(do2.i iVar, kl2.l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f22701t = iVar;
        this.f22702u = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f22701t, this.f22702u, cVar);
        hVar.f22700s = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r5.f22699r
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r5.f22700s
            bd.g r0 = (bd.g) r0
            ue.c.H(r6)     // Catch: bd.a -> L11
            goto L46
        L11:
            r6 = move-exception
            goto L3d
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            ue.c.H(r6)
            java.lang.Object r6 = r5.f22700s
            do2.j r6 = (do2.j) r6
            do2.i r1 = r5.f22701t
            bd.g r3 = new bd.g
            kl2.l r4 = r5.f22702u
            r3.<init>(r4, r6)
            y1.b r6 = new y1.b     // Catch: bd.a -> L3b
            r6.<init>(r3, r2)     // Catch: bd.a -> L3b
            r5.f22700s = r3     // Catch: bd.a -> L3b
            r5.f22699r = r2     // Catch: bd.a -> L3b
            java.lang.Object r6 = r1.collect(r6, r5)     // Catch: bd.a -> L3b
            if (r6 != r0) goto L46
            return r0
        L3b:
            r6 = move-exception
            r0 = r3
        L3d:
            java.lang.String r1 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            do2.j r1 = r6.f22681a
            if (r1 != r0) goto L49
        L46:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L49:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
