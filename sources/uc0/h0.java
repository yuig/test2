package uc0;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class h0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f121788r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p0 f121789s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p0 p0Var, bl2.c cVar) {
        super(2, cVar);
        this.f121789s = p0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h0(this.f121789s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f121788r;
        if (i13 == 0) {
            ue.c.H(obj);
            p0 p0Var = this.f121789s;
            do2.f2 f2Var = p0Var.f121847i;
            y1.b bVar = new y1.b(p0Var, 8);
            this.f121788r = 1;
            f2Var.getClass();
            if (do2.f2.j(f2Var, bVar, this) == aVar) {
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
