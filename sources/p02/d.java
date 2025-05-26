package p02;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import kh2.k3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f98405r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ gx.e f98406s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f98407t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gx.e eVar, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f98406s = eVar;
        this.f98407t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f98406s, this.f98407t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f98405r;
        if (i13 == 0) {
            ue.c.H(obj);
            o02.a aVar2 = (o02.a) this.f98406s.f66246b;
            String Z = CollectionsKt.Z(f0.j("user.id", "user.full_name"), ",", null, null, 0, null, null, 62);
            this.f98405r = 1;
            obj = aVar2.c(Z, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        k3.y1((NetworkResponse) obj, new fa1.g(this.f98407t, 19));
        return Unit.f80348a;
    }
}
