package jo2;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import uj2.r;

/* loaded from: classes4.dex */
public final class g extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f77232r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f77233s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ do2.i f77234t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f77235u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(do2.i iVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f77234t = iVar;
        this.f77235u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        g gVar = new g(this.f77234t, this.f77235u, cVar);
        gVar.f77233s = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.f77232r
            r2 = 1
            uj2.r r3 = r7.f77235u
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r7.f77233s
            ao2.j0 r0 = (ao2.j0) r0
            ue.c.H(r8)     // Catch: java.lang.Throwable -> L13
            goto L39
        L13:
            r8 = move-exception
            goto L44
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            ue.c.H(r8)
            java.lang.Object r8 = r7.f77233s
            ao2.j0 r8 = (ao2.j0) r8
            do2.i r1 = r7.f77234t     // Catch: java.lang.Throwable -> L40
            y1.b r4 = new y1.b     // Catch: java.lang.Throwable -> L40
            r5 = 23
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L40
            r7.f77233s = r8     // Catch: java.lang.Throwable -> L40
            r7.f77232r = r2     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.collect(r4, r7)     // Catch: java.lang.Throwable -> L40
            if (r1 != r0) goto L38
            return r0
        L38:
            r0 = r8
        L39:
            r8 = r3
            fk2.f r8 = (fk2.f) r8     // Catch: java.lang.Throwable -> L13
            r8.b()     // Catch: java.lang.Throwable -> L13
            goto L5d
        L40:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L44:
            boolean r1 = r8 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L58
            fk2.f r3 = (fk2.f) r3
            boolean r1 = r3.a(r8)
            if (r1 != 0) goto L5d
            kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
            kh2.m2.a1(r0, r8)
            goto L5d
        L58:
            fk2.f r3 = (fk2.f) r3
            r3.b()
        L5d:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jo2.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
