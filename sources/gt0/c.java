package gt0;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1.v0;
import x02.m0;
import x02.x0;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f66085r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ mb0.a f66086s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ xs0.d f66087t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mb0.a aVar, xs0.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f66086s = aVar;
        this.f66087t = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f66086s, this.f66087t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f66085r;
        if (i13 == 0) {
            ue.c.H(obj);
            x0 x0Var = (x0) this.f66086s.f86862b;
            String id3 = this.f66087t.f135782a.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            m0 params = new m0(id3);
            a update = a.f66081j;
            a rollback = a.f66082k;
            Intrinsics.checkNotNullParameter(x0Var, "<this>");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(rollback, "rollback");
            do2.j0 j0Var = new do2.j0(kotlin.jvm.internal.j.a(x0Var.I(params, update, rollback)), new v0(5, null));
            b bVar = b.f66084a;
            this.f66085r = 1;
            if (j0Var.collect(bVar, this) == aVar) {
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
