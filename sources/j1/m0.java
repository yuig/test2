package j1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class m0 extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public int f74153r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f74154s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Function1 function1, bl2.c cVar) {
        super(1, cVar);
        this.f74154s = function1;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new m0(this.f74154s, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m0) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f74153r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f74153r = 1;
            obj = bs1.c.K0(getContext()).d(this.f74154s, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
