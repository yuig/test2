package fn0;

import co2.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f62661r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f62662s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f62663t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f62663t = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        s sVar = new s(this.f62663t, cVar);
        sVar.f62662s = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object w13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f62661r;
        if (i13 == 0) {
            ue.c.H(obj);
            z zVar = (z) this.f62662s;
            t tVar = this.f62663t;
            kotlin.jvm.internal.j.z(zVar, null, null, new q(tVar, zVar, null), 3).invokeOnCompletion(r.f62660i);
            tVar.getClass();
            this.f62661r = 1;
            w13 = dl2.b.w(zVar, new ap.e(6), this);
            if (w13 == aVar) {
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
