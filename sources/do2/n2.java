package do2;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class n2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f55869r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f55870s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r2 f55871t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(r2 r2Var, bl2.c cVar) {
        super(2, cVar);
        this.f55871t = r2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n2 n2Var = new n2(this.f55871t, cVar);
        n2Var.f55870s = obj;
        return n2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n2) create((j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f55869r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = 22;
            o1.f fVar = new o1.f(i14, new kotlin.jvm.internal.f0(), (j) this.f55870s);
            this.f55869r = 1;
            if (this.f55871t.collect(fVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        throw new KotlinNothingValueException();
    }
}
