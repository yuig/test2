package i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public s2.h f71156r;

    /* renamed from: s, reason: collision with root package name */
    public int f71157s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f71158t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o2 f71159u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kl2.l f71160v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i1 f71161w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(o2 o2Var, kl2.l lVar, i1 i1Var, bl2.c cVar) {
        super(2, cVar);
        this.f71159u = o2Var;
        this.f71160v = lVar;
        this.f71161w = i1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l2 l2Var = new l2(this.f71159u, this.f71160v, this.f71161w, cVar);
        l2Var.f71158t = obj;
        return l2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.l2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
