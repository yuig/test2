package b2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class z extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public int f21271s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f21272t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function1 f21273u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f21273u = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        z zVar = new z(this.f21273u, cVar);
        zVar.f21272t = obj;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((n3.l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r4.f21271s
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.f21272t
            n3.l0 r1 = (n3.l0) r1
            ue.c.H(r5)
            goto L2e
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            ue.c.H(r5)
            java.lang.Object r5 = r4.f21272t
            n3.l0 r5 = (n3.l0) r5
            r1 = r5
        L21:
            n3.k r5 = n3.k.Initial
            r4.f21272t = r1
            r4.f21271s = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            n3.j r5 = (n3.j) r5
            boolean r5 = f0.h.d0(r5)
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            kotlin.jvm.functions.Function1 r3 = r4.f21273u
            r3.invoke(r5)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
