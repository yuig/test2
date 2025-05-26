package xr1;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lr1.h;
import u50.r;
import uj2.q;
import vs.w;
import wr1.n0;
import wr1.s0;

/* loaded from: classes4.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f135681r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f135682s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s0 f135683t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f135684u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, s0 s0Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f135682s = dVar;
        this.f135683t = s0Var;
        this.f135684u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f135682s, this.f135683t, this.f135684u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f135681r;
        if (i13 == 0) {
            ue.c.H(obj);
            q u13 = this.f135682s.f135691b.b(h.GoogleUnifiedAuthMethod, ((n0) this.f135683t).f130982a, null).u();
            Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
            r rVar = this.f135684u;
            do2.j0 j0Var = new do2.j0(kotlin.jvm.internal.j.a(u13), new w(4, rVar, null));
            da0.b bVar = new da0.b(rVar, 3);
            this.f135681r = 1;
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
