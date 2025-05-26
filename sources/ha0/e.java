package ha0;

import ao2.j0;
import com.pinterest.api.model.f30;
import fa0.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;
import x02.i2;

/* loaded from: classes5.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f68369r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f68370s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f68371t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f68372u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f68370s = fVar;
        this.f68371t = str;
        this.f68372u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f68370s, this.f68371t, this.f68372u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f68369r;
        if (i13 == 0) {
            ue.c.H(obj);
            i2 i2Var = this.f68370s.f68375c;
            this.f68369r = 1;
            obj = ve.h.y(i2Var, this.f68371t, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        f30 f30Var = (f30) obj;
        if (f30Var == null) {
            return Unit.f80348a;
        }
        this.f68372u.a(new o0(f30Var));
        return Unit.f80348a;
    }
}
