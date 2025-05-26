package com.pinterest.shuffles.scene.composer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r72.z1;

/* loaded from: classes4.dex */
public final class k0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f52074r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0 f52075s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f52076t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u f52077u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, List list, u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f52075s = n0Var;
        this.f52076t = list;
        this.f52077u = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k0(this.f52075s, this.f52076t, this.f52077u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f52074r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f52074r = 1;
            int i14 = n0.f52108i;
            n0 n0Var = this.f52075s;
            n0Var.getClass();
            ao2.o oVar = new ao2.o(1, cl2.h.b(this));
            oVar.v();
            n0Var.f52111c.b(a.a.d("Offscreen rendering - awaitToRenderItemsLoad - start - ", n0Var.hashCode()), n72.l.VERBOSE);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            u uVar = this.f52077u;
            i0 i0Var = new i0(atomicBoolean, n0Var, uVar, oVar);
            oVar.e(new gw1.i(24, uVar, i0Var));
            uVar.g(i0Var);
            List items = this.f52076t;
            Intrinsics.checkNotNullParameter(items, "items");
            ke2.c cVar = uVar.f52156i;
            cVar.f79314f.clear();
            CopyOnWriteArrayList copyOnWriteArrayList = cVar.f79314f;
            List list = items;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(uVar.k((z1) it.next()));
            }
            copyOnWriteArrayList.addAll(arrayList);
            uVar.n();
            obj = oVar.u();
            if (obj == cl2.a.COROUTINE_SUSPENDED) {
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
