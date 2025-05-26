package com.pinterest.shuffles.scene.composer;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r72.z1;

/* loaded from: classes4.dex */
public final class w0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f52164r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0 f52165s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z1 f52166t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, z1 z1Var, bl2.c cVar) {
        super(2, cVar);
        this.f52165s = x0Var;
        this.f52166t = z1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w0(this.f52165s, this.f52166t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f52164r;
        z1 z1Var = this.f52166t;
        x0 x0Var = this.f52165s;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f52164r = 1;
            obj = x0Var.b(z1Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        ke2.d dVar = (ke2.d) obj;
        CopyOnWriteArrayList copyOnWriteArrayList = x0Var.f52170b.f().f79314f;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.add(dVar);
        ke2.i iVar = dVar.f79319a;
        et1.r0 r0Var = new et1.r0(14, x0Var, dVar);
        this.f52164r = 2;
        if (x0Var.f(z1Var, iVar, r0Var, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
