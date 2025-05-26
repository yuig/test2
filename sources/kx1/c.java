package kx1;

import com.pinterest.api.model.xr;
import dl2.j;
import jx1.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;
import u50.r;

/* loaded from: classes4.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f81107r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f81108s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f81109t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, j0 j0Var, j0 j0Var2, bl2.c cVar) {
        super(2, cVar);
        this.f81107r = rVar;
        this.f81108s = j0Var;
        this.f81109t = j0Var2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f81107r, this.f81108s, this.f81109t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((Unit) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f81107r.a(new i((xr) this.f81108s.f80434a, (xr) this.f81109t.f80434a));
        return Unit.f80348a;
    }
}
