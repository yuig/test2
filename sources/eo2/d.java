package eo2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f59749r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f59750s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ do2.j f59751t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f59752u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bl2.c cVar, do2.j jVar, f fVar) {
        super(2, cVar);
        this.f59751t = jVar;
        this.f59752u = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(cVar, this.f59751t, this.f59752u);
        dVar.f59750s = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f59749r;
        if (i13 == 0) {
            ue.c.H(obj);
            co2.b0 g13 = this.f59752u.g((ao2.j0) this.f59750s);
            this.f59749r = 1;
            Object i03 = bs1.c.i0(this.f59751t, g13, true, this);
            if (i03 != obj2) {
                i03 = Unit.f80348a;
            }
            if (i03 == obj2) {
                return obj2;
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
