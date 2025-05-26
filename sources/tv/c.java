package tv;

import ao2.j0;
import com.pinterest.api.model.f30;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import sv.q;
import u50.r;

/* loaded from: classes3.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public r f119491r;

    /* renamed from: s, reason: collision with root package name */
    public int f119492s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ sv.r f119493t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f119494u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f119495v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sv.r rVar, e eVar, r rVar2, bl2.c cVar) {
        super(2, cVar);
        this.f119493t = rVar;
        this.f119494u = eVar;
        this.f119495v = rVar2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f119493t, this.f119494u, this.f119495v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        r rVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f119492s;
        if (i13 == 0) {
            ue.c.H(obj);
            String str = ((q) this.f119493t).f115311a;
            if (str != null) {
                r rVar2 = this.f119495v;
                this.f119491r = rVar2;
                this.f119492s = 1;
                obj = e.j(this.f119494u, str, this);
                if (obj == aVar) {
                    return aVar;
                }
                rVar = rVar2;
            }
            return Unit.f80348a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rVar = this.f119491r;
        ue.c.H(obj);
        rVar.a(new sv.j((f30) obj));
        return Unit.f80348a;
    }
}
