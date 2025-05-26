package nl0;

import com.pinterest.api.model.e8;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tu.d0;
import u50.r;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d0 f91251r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f91252s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e8 f91253t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d0 d0Var, e8 e8Var, r rVar, bl2.c cVar) {
        super(1, cVar);
        this.f91251r = d0Var;
        this.f91252s = rVar;
        this.f91253t = e8Var;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        r rVar = this.f91252s;
        return new f(this.f91251r, this.f91253t, rVar, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((f) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d0.k(this.f91251r, this.f91252s, this.f91253t, null);
        return Unit.f80348a;
    }
}
