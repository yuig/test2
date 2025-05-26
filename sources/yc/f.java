package yc;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public int f138618r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ pc.h f138619s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ pc.f f138620t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f138621u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ pc.v f138622v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f138623w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(pc.f fVar, pc.h hVar, pc.v vVar, l lVar, Set set, bl2.c cVar) {
        super(1, cVar);
        this.f138619s = hVar;
        this.f138620t = fVar;
        this.f138621u = lVar;
        this.f138622v = vVar;
        this.f138623w = set;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new f(this.f138620t, this.f138619s, this.f138622v, this.f138621u, this.f138623w, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((f) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            cl2.a r6 = cl2.a.COROUTINE_SUSPENDED
            int r0 = r11.f138618r
            yc.l r7 = r11.f138621u
            r8 = 2
            r1 = 1
            if (r0 == 0) goto L21
            if (r0 == r1) goto L1b
            if (r0 != r8) goto L13
            ue.c.H(r12)
            goto Lac
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1b:
            ue.c.H(r12)
            r0 = r12
            goto L94
        L21:
            ue.c.H(r12)
            pc.h r0 = r11.f138619s
            pc.n0 r2 = r0.f99563c
            if (r2 == 0) goto L97
            pc.f r2 = r11.f138620t
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            pc.f0 r4 = r2.f99543c
            m60.f0 r5 = vc.b.f125501b
            pc.c0 r4 = r4.a(r5)
            a.cb.w(r4)
            wc.a r4 = wc.a.f129075b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            pc.f0 r9 = r0.f99566f
            pc.c0 r5 = r9.a(r5)
            a.cb.w(r5)
            r4.getClass()
            java.lang.String r5 = "cacheHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Map r9 = r4.f129076a
            java.lang.String r10 = "headerMap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)
            r5.putAll(r9)
            java.util.Map r4 = r4.f129076a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r10)
            r5.putAll(r4)
            wc.a r4 = new wc.a
            r4.<init>(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            m60.f0 r3 = vc.b.f125505f
            pc.f0 r5 = r2.f99543c
            pc.c0 r3 = r5.a(r3)
            a.cb.w(r3)
            vc.a r3 = r7.f138642a
            pc.n0 r5 = r0.f99563c
            kotlin.jvm.internal.Intrinsics.f(r5)
            r11.f138618r = r1
            pc.v r1 = r11.f138622v
            pc.o0 r9 = r2.f99541a
            r0 = r3
            r2 = r5
            r3 = r9
            r5 = r11
            java.lang.Object r0 = r0.b(r1, r2, r3, r4, r5)
            if (r0 != r6) goto L94
            return r6
        L94:
            java.util.Set r0 = (java.util.Set) r0
            goto L99
        L97:
            kotlin.collections.s0 r0 = kotlin.collections.s0.f80394a
        L99:
            vc.a r1 = r7.f138642a
            java.util.Set r2 = r11.f138623w
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.LinkedHashSet r0 = kotlin.collections.i1.i(r0, r2)
            r11.f138618r = r8
            java.lang.Object r0 = r1.e(r0, r11)
            if (r0 != r6) goto Lac
            return r6
        Lac:
            kotlin.Unit r0 = kotlin.Unit.f80348a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
