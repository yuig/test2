package o82;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93556r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f93557s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f93558t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f93559u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u50.r rVar, h hVar, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f93557s = hVar;
        this.f93558t = obj;
        this.f93559u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f93559u, this.f93557s, this.f93558t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93556r;
        if (i13 == 0) {
            ue.c.H(obj);
            r rVar = this.f93557s.f93605a;
            this.f93556r = 1;
            obj = rVar.i(this.f93558t, this);
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
        boolean z13 = networkResponse instanceof xz.b;
        u50.r rVar2 = this.f93559u;
        if (z13) {
            rVar2.a(new m1((List) ((xz.b) networkResponse).f136205a, false));
        } else if (networkResponse instanceof xz.a) {
            rVar2.a(new c1(((xz.a) networkResponse).f136204a));
        }
        return Unit.f80348a;
    }
}
