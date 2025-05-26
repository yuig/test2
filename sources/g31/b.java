package g31;

import ao2.j0;
import c31.d0;
import c31.z;
import dl2.j;
import h32.d4;
import h32.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z f63441r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f63442s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z zVar, c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f63441r = zVar;
        this.f63442s = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f63441r, this.f63442s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        i0 i0Var;
        d4 d4Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        z zVar = this.f63441r;
        if ((zVar instanceof d0) && (d4Var = (i0Var = (d0Var = (d0) zVar).f25577c).f67081a) != null) {
            g.a(this.f63442s.f63443a, d0Var.f25575a, d0Var.f25576b, d4Var, i0Var.f67082b, d0Var.f25578d);
        }
        return Unit.f80348a;
    }
}
