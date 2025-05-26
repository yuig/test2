package g1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d0 extends dl2.i implements Function2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ g0 C;
    public final /* synthetic */ e0 D;

    /* renamed from: s, reason: collision with root package name */
    public e0 f63248s;

    /* renamed from: t, reason: collision with root package name */
    public g0 f63249t;

    /* renamed from: u, reason: collision with root package name */
    public long[] f63250u;

    /* renamed from: v, reason: collision with root package name */
    public int f63251v;

    /* renamed from: w, reason: collision with root package name */
    public int f63252w;

    /* renamed from: x, reason: collision with root package name */
    public int f63253x;

    /* renamed from: y, reason: collision with root package name */
    public int f63254y;

    /* renamed from: z, reason: collision with root package name */
    public long f63255z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, e0 e0Var, bl2.c cVar) {
        super(2, cVar);
        this.C = g0Var;
        this.D = e0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d0 d0Var = new d0(this.C, this.D, cVar);
        d0Var.B = obj;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((yn2.p) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0090 -> B:5:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:15:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0093). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 1
            r5 = 8
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L26
            int r2 = r0.f63254y
            int r6 = r0.f63253x
            long r7 = r0.f63255z
            int r9 = r0.f63252w
            int r10 = r0.f63251v
            long[] r11 = r0.f63250u
            g1.g0 r12 = r0.f63249t
            g1.e0 r13 = r0.f63248s
            java.lang.Object r14 = r0.B
            yn2.p r14 = (yn2.p) r14
            ue.c.H(r22)
            goto L93
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            ue.c.H(r22)
            java.lang.Object r2 = r0.B
            yn2.p r2 = (yn2.p) r2
            g1.g0 r6 = r0.C
            long[] r7 = r6.f63285a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La3
            g1.e0 r9 = r0.D
            r10 = 0
        L41:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L9e
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L64:
            if (r2 >= r6) goto L96
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L93
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.f63257a = r15
            java.lang.Object[] r4 = r12.f63286b
            r4 = r4[r15]
            r0.B = r14
            r0.f63248s = r13
            r0.f63249t = r12
            r0.f63250u = r11
            r0.f63251v = r10
            r0.f63252w = r9
            r0.f63255z = r7
            r0.f63253x = r6
            r0.f63254y = r2
            r0.A = r3
            cl2.a r4 = r14.b(r4, r0)
            if (r4 != r1) goto L93
            return r1
        L93:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L64
        L96:
            if (r6 != r5) goto La3
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        L9e:
            if (r10 == r8) goto La3
            int r10 = r10 + 1
            goto L41
        La3:
            kotlin.Unit r1 = kotlin.Unit.f80348a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
