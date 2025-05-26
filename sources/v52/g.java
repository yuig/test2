package v52;

import ao2.j0;
import dl2.j;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;
import ve.h;
import x02.i2;

/* loaded from: classes4.dex */
public final class g extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f124186r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z01.e f124187s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p52.a f124188t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f124189u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(z01.e eVar, p52.a aVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f124187s = eVar;
        this.f124188t = aVar;
        this.f124189u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f124187s, this.f124188t, this.f124189u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f124186r;
        if (i13 == 0) {
            ue.c.H(obj);
            i2 i2Var = this.f124187s.f140544b;
            List list = this.f124188t.f98903a;
            this.f124186r = 1;
            obj = h.u(i2Var, list, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f124189u.a(new p52.b((List) obj));
        return Unit.f80348a;
    }
}
