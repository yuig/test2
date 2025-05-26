package sm0;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.ta;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qm0.x;
import u50.r;

/* loaded from: classes5.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f113246r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f113247s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f113248t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f113249u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f113247s = hVar;
        this.f113248t = str;
        this.f113249u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f113247s, this.f113248t, this.f113249u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f113246r;
        if (i13 == 0) {
            ue.c.H(obj);
            qz.k kVar = this.f113247s.f113255f;
            this.f113246r = 1;
            obj = kVar.c(this.f113248t, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        ta taVar = (ta) k3.f0((NetworkResponse) obj);
        String id3 = taVar != null ? taVar.getId() : null;
        if (id3 == null) {
            id3 = "";
        }
        this.f113249u.a(new x(id3));
        return Unit.f80348a;
    }
}
