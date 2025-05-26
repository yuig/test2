package j1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class s0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f74225r;

    /* renamed from: s, reason: collision with root package name */
    public int f74226s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f74227t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f74228u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u0 f74229v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(i2.q1 q1Var, u0 u0Var, bl2.c cVar) {
        super(2, cVar);
        this.f74228u = q1Var;
        this.f74229v = u0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        s0 s0Var = new s0(this.f74228u, this.f74229v, cVar);
        s0Var.f74227t = obj;
        return s0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0053 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0059 -> B:6:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0075 -> B:6:0x003a). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r11.f74226s
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2a
            if (r1 == r2) goto L1f
            if (r1 != r3) goto L17
            kotlin.jvm.internal.g0 r1 = r11.f74225r
            java.lang.Object r4 = r11.f74227t
            ao2.j0 r4 = (ao2.j0) r4
            ue.c.H(r12)
            r12 = r4
            goto L3a
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            kotlin.jvm.internal.g0 r1 = r11.f74225r
            java.lang.Object r4 = r11.f74227t
            ao2.j0 r4 = (ao2.j0) r4
            ue.c.H(r12)
            r12 = r4
            goto L54
        L2a:
            ue.c.H(r12)
            java.lang.Object r12 = r11.f74227t
            ao2.j0 r12 = (ao2.j0) r12
            kotlin.jvm.internal.g0 r1 = new kotlin.jvm.internal.g0
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f80425a = r4
        L3a:
            j1.p0 r4 = new j1.p0
            r10 = 0
            i2.q1 r6 = r11.f74228u
            j1.u0 r7 = r11.f74229v
            r5 = r4
            r8 = r1
            r9 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r11.f74227t = r12
            r11.f74225r = r1
            r11.f74226s = r2
            java.lang.Object r4 = j1.e.t(r4, r11)
            if (r4 != r0) goto L54
            return r0
        L54:
            float r4 = r1.f80425a
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L3a
            j1.q0 r4 = new j1.q0
            r5 = 0
            r4.<init>(r12, r5)
            pb.k r4 = bs1.c.Z1(r4)
            j1.r0 r5 = new j1.r0
            r6 = 0
            r5.<init>(r3, r6)
            r11.f74227t = r12
            r11.f74225r = r1
            r11.f74226s = r3
            java.lang.Object r4 = lb.l0.g0(r4, r5, r11)
            if (r4 != r0) goto L3a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
