package a6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public Function2 f866r;

    /* renamed from: s, reason: collision with root package name */
    public int f867s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.q f868t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.google.firebase.messaging.q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f868t = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f868t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f867s
            r2 = 2
            r3 = 1
            com.google.firebase.messaging.q r4 = r6.f868t
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            ue.c.H(r7)
            goto L5d
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.jvm.functions.Function2 r1 = r6.f866r
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            ue.c.H(r7)
            goto L51
        L22:
            ue.c.H(r7)
            java.lang.Object r7 = r4.f33806d
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L6a
        L2f:
            java.lang.Object r7 = r4.f33803a
            ao2.j0 r7 = (ao2.j0) r7
            kotlin.coroutines.CoroutineContext r7 = r7.getCoroutineContext()
            ao2.m0.t(r7)
            java.lang.Object r7 = r4.f33804b
            r1 = r7
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            java.lang.Object r7 = r4.f33805c
            co2.q r7 = (co2.q) r7
            r5 = r1
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r6.f866r = r5
            r6.f867s = r3
            java.lang.Object r7 = r7.p(r6)
            if (r7 != r0) goto L51
            return r0
        L51:
            r5 = 0
            r6.f866r = r5
            r6.f867s = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L5d
            return r0
        L5d:
            java.lang.Object r7 = r4.f33806d
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2f
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L6a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
