package q4;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f102339r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f102340s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f102341t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f102341t = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j jVar = new j(this.f102341t, cVar);
        jVar.f102340s = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r3.q() == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r8.f102339r
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r8.f102340s
            ao2.j0 r1 = (ao2.j0) r1
            ue.c.H(r9)
            goto L55
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            ue.c.H(r9)
            java.lang.Object r9 = r8.f102340s
            ao2.j0 r9 = (ao2.j0) r9
            r1 = r9
        L21:
            boolean r9 = dl2.b.x1(r1)
            if (r9 == 0) goto L6f
            q4.c r9 = q4.c.f102311k
            r8.f102340s = r1
            r8.f102339r = r2
            kotlin.coroutines.CoroutineContext r3 = r8.getContext()
            t3.q2 r4 = t3.q2.f116171a
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r4)
            t3.r2 r3 = (t3.r2) r3
            if (r3 != 0) goto L48
            kotlin.coroutines.CoroutineContext r3 = r8.getContext()
            i2.i1 r3 = bs1.c.K0(r3)
            java.lang.Object r9 = r3.d(r9, r8)
            goto L52
        L48:
            t3.s2 r4 = new t3.s2
            r5 = 0
            r4.<init>(r9, r5)
            java.lang.Object r9 = r3.q()
        L52:
            if (r9 != r0) goto L55
            return r0
        L55:
            q4.w r9 = r8.f102341t
            int[] r3 = r9.f102385y
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.f102370j
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L6b
            r3 = r3[r2]
            if (r6 == r3) goto L21
        L6b:
            r9.q()
            goto L21
        L6f:
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
