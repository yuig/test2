package t3;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f116041r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f116042s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k1 f116043t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, bl2.c cVar) {
        super(2, cVar);
        this.f116043t = k1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j1 j1Var = new j1(this.f116043t, cVar);
        j1Var.f116042s = obj;
        return j1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((t2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f116041r;
        if (i13 == 0) {
            ue.c.H(obj);
            t2 t2Var = (t2) this.f116042s;
            this.f116042s = t2Var;
            k1 k1Var = this.f116043t;
            this.f116041r = 1;
            ao2.o oVar = new ao2.o(1, cl2.h.b(this));
            oVar.v();
            h4.g0 g0Var = k1Var.f116051b;
            h4.a0 a0Var = g0Var.f67562a;
            a0Var.a();
            g0Var.f67563b.set(new h4.m0(g0Var, a0Var));
            oVar.e(new j1.x0(23, t2Var, k1Var));
            Object u13 = oVar.u();
            if (u13 == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (u13 == aVar) {
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
