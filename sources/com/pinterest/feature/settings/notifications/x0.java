package com.pinterest.feature.settings.notifications;

import do2.f2;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class x0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f48283r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z0 f48284s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, bl2.c cVar) {
        super(2, cVar);
        this.f48284s = z0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x0(this.f48284s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        f2 f2Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f48283r;
        if (i13 == 0) {
            ue.c.H(obj);
            switch (eb1.h.f58243b.f90075a) {
                case 25:
                    f2Var = cb1.b.f27266b;
                    break;
                case 26:
                    f2Var = eb1.e.f58234c;
                    break;
                default:
                    f2Var = eb1.h.f58244c;
                    break;
            }
            u0 u0Var = new u0(this.f48284s, 2);
            this.f48283r = 1;
            f2Var.getClass();
            if (f2.j(f2Var, u0Var, this) == aVar) {
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
