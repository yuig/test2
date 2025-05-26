package ac;

import ao2.j0;
import ao2.o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f1795r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f1796s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1 f1797t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1798u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1799v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f1800w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, o1 o1Var, int i13, int i14, j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f1796s = nVar;
        this.f1797t = o1Var;
        this.f1798u = i13;
        this.f1799v = i14;
        this.f1800w = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f1796s, this.f1797t, this.f1798u, this.f1799v, this.f1800w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r5.f1795r
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            ue.c.H(r6)
            goto L5c
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            ue.c.H(r6)
        L18:
            int[] r6 = ac.c.f1794a
            ac.n r1 = r5.f1796s
            int r1 = r1.ordinal()
            r6 = r6[r1]
            int r1 = r5.f1798u
            if (r6 != r2) goto L31
            ao2.o1 r6 = r5.f1797t
            boolean r6 = r6.isActive()
            if (r6 == 0) goto L2f
            goto L31
        L2f:
            int r1 = r5.f1799v
        L31:
            r5.f1795r = r2
            ac.j r6 = r5.f1800w
            r6.getClass()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L48
            ac.g r3 = new ac.g
            r4 = 0
            r3.<init>(r6, r1, r4)
            java.lang.Object r6 = j1.e.t(r3, r5)
            goto L59
        L48:
            ac.g r3 = new ac.g
            r3.<init>(r6, r1, r2)
            kotlin.coroutines.CoroutineContext r6 = r5.getContext()
            i2.i1 r6 = bs1.c.K0(r6)
            java.lang.Object r6 = r6.d(r3, r5)
        L59:
            if (r6 != r0) goto L5c
            return r0
        L5c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L18
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
