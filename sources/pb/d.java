package pb;

import ao2.j0;
import co2.y;
import co2.z;
import kb.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes3.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f99404r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f99405s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f99406t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f99405s = gVar;
        this.f99406t = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f99405s, this.f99406t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f99404r;
        g gVar = this.f99405s;
        if (i13 == 0) {
            ue.c.H(obj);
            long j13 = gVar.f99415b;
            this.f99404r = 1;
            if (l0.S(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        b0.e().a(m.f99427a, a.a.o(new StringBuilder("NetworkRequestConstraintController didn't receive neither  onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after "), gVar.f99415b, " ms"));
        ((y) this.f99406t).g(new b(7));
        return Unit.f80348a;
    }
}
