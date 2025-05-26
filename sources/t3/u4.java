package t3;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u4 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f116207r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ do2.r2 f116208s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y2 f116209t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(do2.r2 r2Var, y2 y2Var, bl2.c cVar) {
        super(2, cVar);
        this.f116208s = r2Var;
        this.f116209t = y2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u4(this.f116208s, this.f116209t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u4) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f116207r;
        if (i13 == 0) {
            ue.c.H(obj);
            t4 t4Var = new t4(this.f116209t, 0);
            this.f116207r = 1;
            if (this.f116208s.collect(t4Var, this) == aVar) {
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
