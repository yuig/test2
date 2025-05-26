package com.pinterest.shuffles.scene.composer;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import kh2.c3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f52128r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f52129s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f52130t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s0 f52131u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(AtomicReference atomicReference, List list, s0 s0Var, bl2.c cVar) {
        super(2, cVar);
        this.f52129s = atomicReference;
        this.f52130t = list;
        this.f52131u = s0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q0(this.f52129s, this.f52130t, this.f52131u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f52128r;
        List list = this.f52130t;
        s0 s0Var = this.f52131u;
        if (i13 == 0) {
            ue.c.H(obj);
            AtomicReference atomicReference = this.f52129s;
            Object obj2 = atomicReference.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            if (((Boolean) obj2).booleanValue()) {
                return Unit.f80348a;
            }
            List<ke2.d> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (ke2.d dVar : list2) {
                    Object obj3 = dVar != null ? dVar.f79319a : null;
                    c cVar = obj3 instanceof c ? (c) obj3 : null;
                    if (cVar == null || !cVar.f52012n) {
                        return Unit.f80348a;
                    }
                }
            }
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            while (!atomicReference.compareAndSet(bool, bool2)) {
                if (atomicReference.get() != bool) {
                    break;
                }
            }
            CompletableFuture i14 = s0Var.i();
            this.f52128r = 1;
            if (c3.q(i14, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        Iterator it = s0Var.f52146d.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).a();
        }
        s0Var.f52147e.D(list);
        return Unit.f80348a;
    }
}
