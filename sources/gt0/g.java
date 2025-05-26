package gt0;

import ao2.j0;
import com.pinterest.api.model.f30;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;
import u50.r;
import xs0.x;
import xs0.y;

/* loaded from: classes5.dex */
public final class g extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ nu.b f66097r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f66098s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f30 f66099t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f66100u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nu.b bVar, f30 f30Var, r rVar, x xVar, bl2.c cVar) {
        super(2, cVar);
        this.f66097r = bVar;
        this.f66098s = xVar;
        this.f66099t = f30Var;
        this.f66100u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f66097r, this.f66099t, this.f66100u, this.f66098s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        nu.b bVar = this.f66097r;
        js0.c cVar = new js0.c((x10.b) bVar.f92309d);
        x xVar = this.f66098s;
        String id3 = ((y) xVar).f135845a.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        int value = ((y) xVar).f135846b.getValue();
        String str = ((y) xVar).f135847c;
        int i13 = ((y) xVar).f135848d;
        d1 d1Var = (d1) bVar.f92310e;
        f30 f30Var = this.f66099t;
        cVar.b(new js0.d(id3, value, str, i13, d1Var.b(f30Var))).execute((ak2.e) new d(bVar, f30Var, 1), (ak2.e) new e(this.f66100u, 1));
        return Unit.f80348a;
    }
}
