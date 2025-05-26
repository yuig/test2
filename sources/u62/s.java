package u62;

import ao2.j0;
import do2.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public t2 f120871r;

    /* renamed from: s, reason: collision with root package name */
    public t f120872s;

    /* renamed from: t, reason: collision with root package name */
    public Object f120873t;

    /* renamed from: u, reason: collision with root package name */
    public int f120874u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t f120875v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f120875v = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s(this.f120875v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r5.h(r1, (com.pinterest.shuffles.core.ui.model.CutoutModel) r7) == false) goto L14;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0039 -> B:7:0x003c). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f120874u
            u62.t r2 = r6.f120875v
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r1 = r6.f120873t
            u62.t r4 = r6.f120872s
            do2.t2 r5 = r6.f120871r
            ue.c.H(r7)     // Catch: java.lang.Exception -> L15
            goto L3c
        L15:
            r7 = move-exception
            goto L45
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            ue.c.H(r7)
            do2.t2 r7 = r2.f120884i     // Catch: java.lang.Exception -> L15
            r5 = r7
            r4 = r2
        L26:
            java.lang.Object r1 = r5.getValue()     // Catch: java.lang.Exception -> L15
            r7 = r1
            com.pinterest.shuffles.core.ui.model.CutoutModel r7 = (com.pinterest.shuffles.core.ui.model.CutoutModel) r7     // Catch: java.lang.Exception -> L15
            r6.f120871r = r5     // Catch: java.lang.Exception -> L15
            r6.f120872s = r4     // Catch: java.lang.Exception -> L15
            r6.f120873t = r1     // Catch: java.lang.Exception -> L15
            r6.f120874u = r3     // Catch: java.lang.Exception -> L15
            java.lang.Object r7 = r4.d(r6)     // Catch: java.lang.Exception -> L15
            if (r7 != r0) goto L3c
            return r0
        L3c:
            com.pinterest.shuffles.core.ui.model.CutoutModel r7 = (com.pinterest.shuffles.core.ui.model.CutoutModel) r7     // Catch: java.lang.Exception -> L15
            boolean r7 = r5.h(r1, r7)     // Catch: java.lang.Exception -> L15
            if (r7 == 0) goto L26
            goto L4f
        L45:
            n72.m r0 = r2.f120880e
            u62.o r1 = new u62.o
            r1.<init>(r2, r3)
            r0.d(r7, r1)
        L4f:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u62.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
