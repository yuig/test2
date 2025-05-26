package ta0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f116863r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f0 f116864s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f116865t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f116864s = f0Var;
        this.f116865t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e0(this.f116864s, this.f116865t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f116863r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f116863r = 1;
            if (this.f116864s.a(this.f116865t, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
