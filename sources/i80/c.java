package i80;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import dl2.j;
import h80.d;
import h80.f;
import h80.o;
import h80.q;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f71720r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f71721s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f71722t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f71723u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, q qVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f71721s = bVar;
        this.f71722t = qVar;
        this.f71723u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f71721s, this.f71722t, this.f71723u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f71720r;
        if (i13 == 0) {
            ue.c.H(obj);
            g20.a aVar2 = this.f71721s.f71719b;
            String str = ((o) this.f71722t).f68110a;
            this.f71720r = 1;
            obj = aVar2.a(str, this);
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
        r rVar = this.f71723u;
        if (z13) {
            rVar.a(new f((List) ((xz.b) networkResponse).f136205a));
        } else if (networkResponse instanceof xz.a) {
            rVar.a(new d(new HashMap()));
        }
        return Unit.f80348a;
    }
}
