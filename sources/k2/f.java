package k2;

import dl2.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import yn2.p;

/* loaded from: classes2.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ g B;

    /* renamed from: s, reason: collision with root package name */
    public Object[] f78185s;

    /* renamed from: t, reason: collision with root package name */
    public long[] f78186t;

    /* renamed from: u, reason: collision with root package name */
    public int f78187u;

    /* renamed from: v, reason: collision with root package name */
    public int f78188v;

    /* renamed from: w, reason: collision with root package name */
    public int f78189w;

    /* renamed from: x, reason: collision with root package name */
    public int f78190x;

    /* renamed from: y, reason: collision with root package name */
    public long f78191y;

    /* renamed from: z, reason: collision with root package name */
    public int f78192z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, bl2.c cVar) {
        super(2, cVar);
        this.B = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.B, cVar);
        fVar.A = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((p) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0088 -> B:5:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:15:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:6:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006b -> B:5:0x008b). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f78192z
            r3 = 1
            r4 = 0
            r5 = 8
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            int r2 = r0.f78190x
            int r6 = r0.f78189w
            long r7 = r0.f78191y
            int r9 = r0.f78188v
            int r10 = r0.f78187u
            long[] r11 = r0.f78186t
            java.lang.Object[] r12 = r0.f78185s
            java.lang.Object r13 = r0.A
            yn2.p r13 = (yn2.p) r13
            ue.c.H(r21)
            goto L8b
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            ue.c.H(r21)
            java.lang.Object r2 = r0.A
            yn2.p r2 = (yn2.p) r2
            k2.g r6 = r0.B
            g1.m0 r6 = r6.f78193a
            java.lang.Object[] r7 = r6.f63286b
            long[] r6 = r6.f63285a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L99
            r9 = r4
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L94
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L62:
            if (r2 >= r6) goto L8e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8b
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            r0.A = r13
            r0.f78185s = r12
            r0.f78186t = r11
            r0.f78187u = r10
            r0.f78188v = r9
            r0.f78191y = r7
            r0.f78189w = r6
            r0.f78190x = r2
            r0.f78192z = r3
            cl2.a r14 = r13.b(r14, r0)
            if (r14 != r1) goto L8b
            return r1
        L8b:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L62
        L8e:
            if (r6 != r5) goto L99
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L94:
            if (r9 == r8) goto L99
            int r9 = r9 + 1
            goto L41
        L99:
            kotlin.Unit r1 = kotlin.Unit.f80348a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
