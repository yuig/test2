package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m1.m1;

/* loaded from: classes2.dex */
public final class q0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f110519r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f110520s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f110521t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f110522u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.g f110523v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f110524w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j1.n f110525x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(float f13, int i13, j1.n nVar, androidx.compose.foundation.lazy.layout.g gVar, bl2.c cVar, Function2 function2) {
        super(2, cVar);
        this.f110521t = function2;
        this.f110522u = i13;
        this.f110523v = gVar;
        this.f110524w = f13;
        this.f110525x = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q0 q0Var = new q0(this.f110524w, this.f110522u, this.f110525x, this.f110523v, cVar, this.f110521t);
        q0Var.f110520s = obj;
        return q0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((m1) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
