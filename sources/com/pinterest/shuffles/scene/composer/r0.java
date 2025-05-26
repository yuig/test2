package com.pinterest.shuffles.scene.composer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r72.z1;

/* loaded from: classes4.dex */
public final class r0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public List f52136r;

    /* renamed from: s, reason: collision with root package name */
    public AtomicReference f52137s;

    /* renamed from: t, reason: collision with root package name */
    public s0 f52138t;

    /* renamed from: u, reason: collision with root package name */
    public Iterator f52139u;

    /* renamed from: v, reason: collision with root package name */
    public int f52140v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f52141w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, bl2.c cVar) {
        super(2, cVar);
        this.f52141w = s0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r0(this.f52141w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        List list;
        s0 s0Var;
        AtomicReference atomicReference;
        Iterator it;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f52140v;
        if (i13 == 0) {
            ue.c.H(obj);
            s0 s0Var2 = this.f52141w;
            CopyOnWriteArrayList copyOnWriteArrayList = s0Var2.l().f79314f;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = copyOnWriteArrayList.iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                ke2.d dVar = (ke2.d) next;
                ke2.i iVar = dVar.f79319a;
                c cVar = iVar instanceof c ? (c) iVar : null;
                if (cVar != null && !cVar.f52011m) {
                    z1 r03 = kh2.b0.r0(dVar);
                    if (r03 != null) {
                        ke2.b a13 = s0Var2.a(r03, i14);
                        Intrinsics.checkNotNullParameter(a13, "<set-?>");
                        dVar.f79320b = a13;
                    }
                    arrayList.add(next);
                }
                i14 = i15;
            }
            if (arrayList.isEmpty()) {
                return Unit.f80348a;
            }
            AtomicReference atomicReference2 = new AtomicReference(Boolean.FALSE);
            Iterator it3 = arrayList.iterator();
            list = arrayList;
            s0Var = s0Var2;
            atomicReference = atomicReference2;
            it = it3;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f52139u;
            s0Var = this.f52138t;
            atomicReference = this.f52137s;
            list = this.f52136r;
            ue.c.H(obj);
        }
        while (it.hasNext()) {
            ke2.d dVar2 = (ke2.d) it.next();
            Intrinsics.f(dVar2);
            z1 r04 = kh2.b0.r0(dVar2);
            if (r04 != null) {
                px0.g gVar = new px0.g(s0Var, atomicReference, list, 24);
                this.f52136r = list;
                this.f52137s = atomicReference;
                this.f52138t = s0Var;
                this.f52139u = it;
                this.f52140v = 1;
                if (s0Var.f(r04, dVar2.f79319a, gVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.f80348a;
    }
}
