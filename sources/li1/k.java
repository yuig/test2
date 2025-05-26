package li1;

import ao2.j0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f83561r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f83562s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, bl2.c cVar) {
        super(2, cVar);
        this.f83562s = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f83562s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f83561r;
        if (i13 == 0) {
            ue.c.H(obj);
            kk2.g a13 = this.f83562s.f83568a.a(y0.b(new Pair("weight_loss_ads_opted_out", "true")));
            this.f83561r = 1;
            obj = kh2.j.p(a13, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
