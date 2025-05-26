package y1;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t3.e3;

/* loaded from: classes2.dex */
public final class y extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f136607r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f136608s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f136609t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f136608s = zVar;
        this.f136609t = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new y(this.f136608s, this.f136609t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f136607r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f136607r = 1;
            if (e3.a(this.f136608s, this.f136609t, this) == aVar) {
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
