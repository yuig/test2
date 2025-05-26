package oy0;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ny0.f0;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f98268r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f98269s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f0 f98270t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f98271u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z13, f0 f0Var, d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f98269s = z13;
        this.f98270t = f0Var;
        this.f98271u = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c cVar2 = new c(this.f98269s, this.f98270t, this.f98271u, cVar);
        cVar2.f98268r = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        py0.c aVar;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f98268r;
        boolean z13 = this.f98269s;
        f0 f0Var = this.f98270t;
        if (z13) {
            aVar = new py0.b(f0Var.f92589a, f0Var.f92591c);
        } else {
            String id3 = f0Var.f92589a.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            aVar = new py0.a(id3);
        }
        this.f98271u.f98273b.e(j0Var, aVar, b.f98267a);
        return Unit.f80348a;
    }
}
