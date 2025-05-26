package mm0;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.v7;
import dl2.j;
import e12.d;
import h32.d4;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lm0.l;
import ol0.t;
import sk0.f;
import u50.r;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f87573r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f87574s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v7 f87575t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f87576u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, v7 v7Var, r rVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f87574s = cVar;
        this.f87575t = v7Var;
        this.f87576u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f87574s, this.f87575t, this.f87576u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f87573r;
        v7 v7Var = this.f87575t;
        if (i13 == 0) {
            ue.c.H(obj);
            d dVar = this.f87574s.f87577a;
            String id3 = v7Var.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            int value = d4.BOARD_ALL_SAVES.getValue();
            this.f87573r = 1;
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
        f fVar = (f) k3.f0(k3.y1((NetworkResponse) obj, new t(2, v7Var)));
        if (fVar != null) {
            this.f87576u.a(new l(fVar));
        }
        return Unit.f80348a;
    }
}
