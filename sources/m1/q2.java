package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class q2 extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public long f85529s;

    /* renamed from: t, reason: collision with root package name */
    public int f85530t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f85531u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n3.q f85532v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(n3.q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f85532v = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q2 q2Var = new q2(this.f85532v, cVar);
        q2Var.f85531u = obj;
        return q2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q2) create((n3.l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.f85530t
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f85529s
            java.lang.Object r1 = r7.f85531u
            n3.l0 r1 = (n3.l0) r1
            ue.c.H(r8)
            goto L40
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            ue.c.H(r8)
            java.lang.Object r8 = r7.f85531u
            n3.l0 r8 = (n3.l0) r8
            n3.q r1 = r7.f85532v
            long r3 = r1.f89108b
            t3.e4 r1 = r8.d()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L32:
            r7.f85531u = r1
            r7.f85529s = r3
            r7.f85530t = r2
            r8 = 3
            java.lang.Object r8 = m1.n3.c(r1, r7, r8)
            if (r8 != r0) goto L40
            return r0
        L40:
            n3.q r8 = (n3.q) r8
            long r5 = r8.f89108b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L32
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.q2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
