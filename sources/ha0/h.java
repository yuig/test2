package ha0;

import ao2.j0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import fa0.c0;
import fa0.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;
import x02.i2;

/* loaded from: classes5.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f68380r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f68381s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c0 f68382t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f68383u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, c0 c0Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f68381s = jVar;
        this.f68382t = c0Var;
        this.f68383u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f68381s, this.f68382t, this.f68383u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f68380r;
        if (i13 == 0) {
            ue.c.H(obj);
            i2 i2Var = this.f68381s.f68388b;
            String str = ((fa0.b) this.f68382t).f61475a.f106906a;
            this.f68380r = 1;
            obj = ve.h.y(i2Var, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f68383u.a(new l0(b40.L0((f30) obj)));
        return Unit.f80348a;
    }
}
