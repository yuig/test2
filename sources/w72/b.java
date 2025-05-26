package w72;

import ao2.j0;
import dl2.j;
import do2.t2;
import do2.y1;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;

/* loaded from: classes4.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128198r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y1 f128199s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f128200t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y1 y1Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f128199s = y1Var;
        this.f128200t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f128199s, this.f128200t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128198r;
        if (i13 == 0) {
            ue.c.H(obj);
            da0.b bVar = new da0.b(this.f128200t, 7);
            this.f128198r = 1;
            if (((t2) this.f128199s).collect(bVar, this) == aVar) {
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
