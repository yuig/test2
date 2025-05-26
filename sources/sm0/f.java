package sm0;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.v7;
import h32.d4;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ol0.t;
import qm0.p;
import u50.r;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f113242r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f113243s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v7 f113244t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f113245u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, v7 v7Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f113243s = hVar;
        this.f113244t = v7Var;
        this.f113245u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f113243s, this.f113244t, this.f113245u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f113242r;
        v7 v7Var = this.f113244t;
        if (i13 == 0) {
            ue.c.H(obj);
            e12.d dVar = this.f113243s.f113250a;
            String id3 = v7Var.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            int value = d4.BOARD_LANDING_PAGE.getValue();
            this.f113242r = 1;
            obj = dVar.l(id3, value, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        sk0.f fVar = (sk0.f) k3.f0(k3.y1((NetworkResponse) obj, new t(6, v7Var)));
        if (fVar != null) {
            this.f113245u.a(new p(fVar));
        }
        return Unit.f80348a;
    }
}
