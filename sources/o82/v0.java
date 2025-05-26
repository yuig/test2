package o82;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class v0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f93729r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f93730s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f93731t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ wt1.d f93732u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(View view, wt1.d dVar, b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f93730s = bVar;
        this.f93731t = view;
        this.f93732u = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        v0 v0Var = new v0(this.f93731t, this.f93732u, this.f93730s, cVar);
        v0Var.f93729r = obj;
        return v0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((u50.o) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f93730s.d(this.f93731t, (u50.o) this.f93729r, this.f93732u.c());
        return Unit.f80348a;
    }
}
