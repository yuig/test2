package o82;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i3 f93602r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f93603s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ sq0.y f93604t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(i3 i3Var, int i13, sq0.y yVar, bl2.c cVar) {
        super(2, cVar);
        this.f93602r = i3Var;
        this.f93603s = i13;
        this.f93604t = yVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g3(this.f93602r, this.f93603s, this.f93604t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g3) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        i3 i3Var = this.f93602r;
        q2 q2Var = i3Var.f93624w0;
        if (q2Var == null) {
            Intrinsics.r("compositeAdapter");
            throw null;
        }
        Pair E = q2Var.E(this.f93603s);
        if (E != null) {
            int intValue = ((Number) E.f80346a).intValue();
            int intValue2 = ((Number) E.f80347b).intValue();
            i3Var.V8().a(new f0(intValue, new f1(intValue2, this.f93604t, i3Var.getT0())));
        }
        return Unit.f80348a;
    }
}
