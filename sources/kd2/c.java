package kd2;

import android.content.Context;
import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f79261r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f79262s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f79263t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f79262s = iVar;
        this.f79263t = context;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c cVar2 = new c(this.f79263t, this.f79262s, cVar);
        cVar2.f79261r = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f79261r;
        Context context = this.f79263t;
        i iVar = this.f79262s;
        kotlin.jvm.internal.j.z(j0Var, null, null, new a(context, iVar, null), 3);
        kotlin.jvm.internal.j.z(j0Var, null, null, new b(context, iVar, null), 3);
        return Unit.f80348a;
    }
}
