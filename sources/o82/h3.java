package o82;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i3 f93614r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f93615s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(i3 i3Var, int i13, bl2.c cVar) {
        super(2, cVar);
        this.f93614r = i3Var;
        this.f93615s = i13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h3(this.f93614r, this.f93615s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h3) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        i3 i3Var = this.f93614r;
        q2 q2Var = i3Var.f93624w0;
        if (q2Var == null) {
            Intrinsics.r("compositeAdapter");
            throw null;
        }
        Pair E = q2Var.E(this.f93615s);
        if (E != null) {
            i3Var.V8().a(new f0(((Number) E.f80346a).intValue(), new g1(((Number) E.f80347b).intValue())));
        }
        return Unit.f80348a;
    }
}
