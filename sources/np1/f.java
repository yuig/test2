package np1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m60.x0;
import qp1.p;
import qp1.q;
import u50.k0;
import u50.r;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public i f91779r;

    /* renamed from: s, reason: collision with root package name */
    public int f91780s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f91781t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f91782u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f91781t = iVar;
        this.f91782u = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f91781t, this.f91782u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f91780s;
        i iVar2 = this.f91781t;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f91779r = iVar2;
            this.f91780s = 1;
            obj = iVar2.f91790b.linkAccount(this.f91782u, iVar2.f() ? gb0.c.UNIVERSAL_DEEP_LINK.value() : gb0.c.HTTPS_PROXY_TO_MOBILE_DEEP_LINK.value(), this);
            if (obj == aVar) {
                return aVar;
            }
            iVar = iVar2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = this.f91779r;
            ue.c.H(obj);
        }
        iVar.f91797i = (String) obj;
        if (iVar2.f91797i == null) {
            r rVar = iVar2.f91800l;
            if (rVar != null) {
                rVar.a(new p(new k0(x0.oops_something_went_wrong)));
            }
        } else {
            iVar2.f91802n = true;
            r rVar2 = iVar2.f91800l;
            if (rVar2 != null) {
                rVar2.a(new q(iVar2.f()));
            }
        }
        return Unit.f80348a;
    }
}
