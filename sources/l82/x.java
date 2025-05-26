package l82;

import do2.x1;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class x extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public Iterator f82276r;

    /* renamed from: s, reason: collision with root package name */
    public h f82277s;

    /* renamed from: t, reason: collision with root package name */
    public int f82278t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f82279u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f82280v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f82281w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x1 f82282x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, x1 x1Var, bl2.c cVar) {
        super(3, cVar);
        this.f82281w = yVar;
        this.f82282x = x1Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x xVar = new x(this.f82281w, this.f82282x, (bl2.c) obj3);
        xVar.f82279u = (o) obj;
        xVar.f82280v = (u50.s) obj2;
        return xVar.invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00a4 -> B:6:0x00a7). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r13.f82278t
            r2 = 2
            r3 = 1
            l82.y r4 = r13.f82281w
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            l82.h r1 = r13.f82277s
            java.util.Iterator r3 = r13.f82276r
            java.lang.Object r4 = r13.f82280v
            l82.y r4 = (l82.y) r4
            java.lang.Object r5 = r13.f82279u
            l82.c0 r5 = (l82.c0) r5
            ue.c.H(r14)
            goto La7
        L1f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L27:
            java.lang.Object r1 = r13.f82279u
            l82.c0 r1 = (l82.c0) r1
            ue.c.H(r14)
            goto L7b
        L2f:
            ue.c.H(r14)
            java.lang.Object r14 = r13.f82279u
            l82.o r14 = (l82.o) r14
            java.lang.Object r1 = r13.f82280v
            u50.s r1 = (u50.s) r1
            m82.b r5 = r4.f82288f
            if (r5 == 0) goto L43
            m82.a r5 = (m82.a) r5
            r5.g(r1)
        L43:
            java.lang.Object r5 = r14.f82243a
            u50.o r5 = (u50.o) r5
            java.lang.Object r6 = r14.f82244b
            r8 = r6
            l82.i0 r8 = (l82.i0) r8
            l82.e r6 = new l82.e
            r6.<init>(r5, r8)
            l82.d r7 = r4.f82284b
            l82.c0 r1 = r7.f(r1, r5, r8, r6)
            m82.b r5 = r4.f82288f
            if (r5 == 0) goto L6c
            java.lang.Object r14 = r14.f82243a
            r10 = r14
            u50.o r10 = (u50.o) r10
            r7 = r5
            m82.a r7 = (m82.a) r7
            u50.o r11 = r1.f82212a
            java.util.List r12 = r1.f82214c
            l82.i0 r9 = r1.f82213b
            r7.b(r8, r9, r10, r11, r12)
        L6c:
            r13.f82279u = r1
            r13.f82278t = r3
            do2.x1 r14 = r13.f82282x
            u50.o r3 = r1.f82212a
            java.lang.Object r14 = r14.emit(r3, r13)
            if (r14 != r0) goto L7b
            return r0
        L7b:
            r4.f82292j = r1
            java.util.List r14 = r1.f82214c
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
            r3 = r14
            r5 = r1
        L87:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto Lb1
            java.lang.Object r14 = r3.next()
            r1 = r14
            l82.h r1 = (l82.h) r1
            do2.f2 r14 = r4.f82290h
            r13.f82279u = r5
            r13.f82280v = r4
            r13.f82276r = r3
            r13.f82277s = r1
            r13.f82278t = r2
            java.lang.Object r14 = r14.emit(r1, r13)
            if (r14 != r0) goto La7
            return r0
        La7:
            m82.b r14 = r4.f82288f
            if (r14 == 0) goto L87
            m82.a r14 = (m82.a) r14
            r14.a(r1)
            goto L87
        Lb1:
            l82.o r14 = new l82.o
            u50.o r0 = r5.f82212a
            l82.i0 r1 = r5.f82213b
            r14.<init>(r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: l82.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
