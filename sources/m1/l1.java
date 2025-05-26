package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f85436r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f85437s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f85438t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(kotlin.jvm.internal.g0 g0Var, float f13, bl2.c cVar) {
        super(2, cVar);
        this.f85437s = g0Var;
        this.f85438t = f13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l1 l1Var = new l1(this.f85437s, this.f85438t, cVar);
        l1Var.f85436r = obj;
        return l1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l1) create((m1) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f85437s.f80425a = ((m1) this.f85436r).a(this.f85438t);
        return Unit.f80348a;
    }
}
