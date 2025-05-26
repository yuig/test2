package t72;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.j0;

/* loaded from: classes4.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public j0 f116639r;

    /* renamed from: s, reason: collision with root package name */
    public int f116640s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f116641t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f116642u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j0 f116643v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f116644w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j0 j0Var, h hVar, j0 j0Var2, f0 f0Var, bl2.c cVar) {
        super(2, cVar);
        this.f116641t = j0Var;
        this.f116642u = hVar;
        this.f116643v = j0Var2;
        this.f116644w = f0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f116641t, this.f116642u, this.f116643v, this.f116644w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008b -> B:6:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a2 -> B:6:0x00a5). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r11.f116640s
            kotlin.jvm.internal.j0 r2 = r11.f116643v
            r3 = 2
            kotlin.jvm.internal.f0 r4 = r11.f116644w
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1d
            if (r1 != r3) goto L15
            ue.c.H(r12)
            goto La5
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            kotlin.jvm.internal.j0 r1 = r11.f116639r
            ue.c.H(r12)
            goto L3e
        L23:
            ue.c.H(r12)
        L26:
            t72.h r12 = r11.f116642u
            s72.c r12 = r12.f116657b
            java.lang.Object r1 = r2.f80434a
            java.util.List r1 = (java.util.List) r1
            kotlin.jvm.internal.j0 r6 = r11.f116641t
            r11.f116639r = r6
            r11.f116640s = r5
            j72.s r12 = (j72.s) r12
            java.io.Serializable r12 = r12.a(r1, r11)
            if (r12 != r0) goto L3d
            return r0
        L3d:
            r1 = r6
        L3e:
            r6 = r12
            java.util.Map r6 = (java.util.Map) r6
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L4e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L76
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getValue()
            r72.a1 r9 = (r72.a1) r9
            java.lang.String r9 = r9.f106435a
            java.lang.String r10 = "succeeded"
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r10)
            if (r9 == 0) goto L4e
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r8 = r8.getValue()
            r7.put(r9, r8)
            goto L4e
        L76:
            int r6 = r7.size()
            java.lang.Object r7 = r2.f80434a
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            if (r6 != r7) goto L86
            r6 = r5
            goto L87
        L86:
            r6 = 0
        L87:
            r4.f80424a = r6
            r1.f80434a = r12
            if (r6 != 0) goto La5
            zn2.a r12 = zn2.b.f142311b
            zn2.d r12 = zn2.d.SECONDS
            long r6 = dl2.b.P2(r5, r12)
            long r6 = zn2.b.e(r6)
            r12 = 0
            r11.f116639r = r12
            r11.f116640s = r3
            java.lang.Object r12 = lb.l0.S(r6, r11)
            if (r12 != r0) goto La5
            return r0
        La5:
            boolean r12 = r4.f80424a
            if (r12 == 0) goto L26
            kotlin.Unit r12 = kotlin.Unit.f80348a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t72.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
