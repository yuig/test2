package cb2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f27355r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27356s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f27357t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f27358u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j13, long j14, bl2.c cVar) {
        super(2, cVar);
        this.f27357t = j13;
        this.f27358u = j14;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q qVar = new q(this.f27357t, this.f27358u, cVar);
        qVar.f27356s = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0054 -> B:12:0x003d). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f27355r
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L20
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.f27356s
            do2.j r1 = (do2.j) r1
            ue.c.H(r7)
            goto L4a
        L20:
            java.lang.Object r1 = r6.f27356s
            do2.j r1 = (do2.j) r1
            ue.c.H(r7)
            goto L3d
        L28:
            ue.c.H(r7)
            java.lang.Object r7 = r6.f27356s
            r1 = r7
            do2.j r1 = (do2.j) r1
            r6.f27356s = r1
            r6.f27355r = r4
            long r4 = r6.f27357t
            java.lang.Object r7 = lb.l0.T(r4, r6)
            if (r7 != r0) goto L3d
            return r0
        L3d:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            r6.f27356s = r1
            r6.f27355r = r3
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L4a
            return r0
        L4a:
            r6.f27356s = r1
            r6.f27355r = r2
            long r4 = r6.f27358u
            java.lang.Object r7 = lb.l0.T(r4, r6)
            if (r7 != r0) goto L3d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cb2.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
