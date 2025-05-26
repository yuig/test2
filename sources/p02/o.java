package p02;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f98439r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ nu.b f98440s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f98441t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f98442u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(nu.b bVar, t tVar, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f98440s = bVar;
        this.f98441t = tVar;
        this.f98442u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f98440s, this.f98441t, this.f98442u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f98439r;
        nu.b bVar = this.f98440s;
        if (i13 == 0) {
            ue.c.H(obj);
            o02.a aVar2 = (o02.a) bVar.f92307b;
            t tVar = this.f98441t;
            String str = ((p) tVar).f98443a;
            String str2 = ((p) tVar).f98444b;
            this.f98439r = 1;
            obj = aVar2.b(str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if (k3.s1(networkResponse)) {
            k3.y1(networkResponse, new fa1.g(this.f98442u, 20));
        } else {
            ((m60.w) bVar.f92309d).d(r02.u.f105822a);
        }
        return Unit.f80348a;
    }
}
