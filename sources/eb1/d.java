package eb1;

import ao2.j0;
import ao2.v0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.feature.settings.notifications.f0;
import dl2.j;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f58229r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f58230s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f0 f58231t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j0 f58232u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, f0 f0Var, j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f58230s = eVar;
        this.f58231t = f0Var;
        this.f58232u = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f58230s, this.f58231t, this.f58232u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f58229r;
        f0 f0Var = this.f58231t;
        if (i13 == 0) {
            ue.c.H(obj);
            ll.j jVar = this.f58230s.f58235a;
            String str = f0Var.f48187b;
            String str2 = f0Var.f48188c;
            this.f58229r = 1;
            jVar.getClass();
            ko2.f fVar = v0.f20219a;
            obj = kotlin.jvm.internal.j.M(this, ko2.e.f80326c, new com.pinterest.feature.settings.notifications.g(jVar, str, str2, null));
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        k3.y1((NetworkResponse) obj, new y71.b(25, f0Var, this.f58232u));
        return Unit.f80348a;
    }
}
