package o82;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class w0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93735r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ wt1.d f93736s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f93737t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ View f93738u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(View view, wt1.d dVar, b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f93736s = dVar;
        this.f93737t = bVar;
        this.f93738u = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w0(this.f93738u, this.f93736s, this.f93737t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93735r;
        if (i13 == 0) {
            ue.c.H(obj);
            wt1.d dVar = this.f93736s;
            do2.i a13 = dVar.a();
            v0 v0Var = new v0(this.f93738u, dVar, this.f93737t, null);
            this.f93735r = 1;
            if (lb.l0.I(a13, v0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
