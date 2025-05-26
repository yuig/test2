package j1;

import i2.v3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public co2.e f74087r;

    /* renamed from: s, reason: collision with root package name */
    public int f74088s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f74089t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ co2.q f74090u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f74091v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v3 f74092w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v3 f74093x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(co2.q qVar, d dVar, v3 v3Var, v3 v3Var2, bl2.c cVar) {
        super(2, cVar);
        this.f74090u = qVar;
        this.f74091v = dVar;
        this.f74092w = v3Var;
        this.f74093x = v3Var2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f74090u, this.f74091v, this.f74092w, this.f74093x, cVar);
        hVar.f74089t = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r12.f74088s
            co2.q r2 = r12.f74090u
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            co2.e r1 = r12.f74087r
            java.lang.Object r4 = r12.f74089t
            ao2.j0 r4 = (ao2.j0) r4
            ue.c.H(r13)
            goto L36
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            ue.c.H(r13)
            java.lang.Object r13 = r12.f74089t
            ao2.j0 r13 = (ao2.j0) r13
            co2.e r1 = r2.iterator()
            r4 = r13
        L29:
            r12.f74089t = r4
            r12.f74087r = r1
            r12.f74088s = r3
            java.lang.Object r13 = r1.d(r12)
            if (r13 != r0) goto L36
            return r0
        L36:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L62
            java.lang.Object r13 = r1.e()
            java.lang.Object r5 = r2.m()
            java.lang.Object r5 = co2.t.b(r5)
            if (r5 != 0) goto L4e
            r7 = r13
            goto L4f
        L4e:
            r7 = r5
        L4f:
            j1.g r13 = new j1.g
            j1.d r8 = r12.f74091v
            i2.v3 r9 = r12.f74092w
            i2.v3 r10 = r12.f74093x
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r5 = 3
            r6 = 0
            kotlin.jvm.internal.j.z(r4, r6, r6, r13, r5)
            goto L29
        L62:
            kotlin.Unit r13 = kotlin.Unit.f80348a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
