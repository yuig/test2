package com.pinterest.shuffles.scene.composer;

import android.util.Size;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f52099r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0 f52100s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f52101t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Size f52102u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, u uVar, Size size, bl2.c cVar) {
        super(2, cVar);
        this.f52100s = n0Var;
        this.f52101t = uVar;
        this.f52102u = size;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m0(this.f52100s, this.f52101t, this.f52102u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f52099r;
        if (i13 == 0) {
            ue.c.H(obj);
            ke2.c cVar = this.f52101t.f52156i;
            this.f52099r = 1;
            int i14 = n0.f52108i;
            n0 n0Var = this.f52100s;
            n0Var.getClass();
            ao2.o oVar = new ao2.o(1, cl2.h.b(this));
            oVar.v();
            oVar.e(new f0(kotlin.jvm.internal.j.z(n0Var.f52110b, n0Var.f52113e, null, new g0(n0Var, this.f52102u, cVar, oVar, null), 2), 0));
            obj = oVar.u();
            if (obj == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
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
