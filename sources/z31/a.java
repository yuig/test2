package z31;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.vz0;
import dl2.j;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tb0.h;
import tb0.p;
import u50.r;
import y31.a0;
import y31.e0;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f140792r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f140793s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e0 f140794t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f140795u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, e0 e0Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f140793s = bVar;
        this.f140794t = e0Var;
        this.f140795u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f140793s, this.f140794t, this.f140795u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140792r;
        if (i13 == 0) {
            ue.c.H(obj);
            d30.a aVar2 = this.f140793s.f140796a;
            String str = this.f140794t.f136787a;
            this.f140792r = 1;
            obj = aVar2.b(str, this);
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
        if (networkResponse instanceof xz.b) {
            this.f140795u.a(new a0((vz0) ((xz.b) networkResponse).f136205a));
        } else {
            HashSet hashSet = h.f117076w;
            h hVar = tb0.g.f117075a;
            Intrinsics.g(networkResponse, "null cannot be cast to non-null type com.pinterest.api.adapter.coroutine.NetworkResponse.Failure<com.pinterest.api.model.VerifiedMerchant>");
            hVar.q(((xz.a) networkResponse).f136204a, "Failed to fetch verified merchant", p.PROFILE_VIEW_BUSINESS);
        }
        return Unit.f80348a;
    }
}
