package jo2;

import ao2.d0;
import ao2.j0;
import ao2.j1;
import ao2.l0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import uj2.e0;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements uj2.e, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f77226a = j1.f20166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f77227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f77228c;

    public /* synthetic */ e(CoroutineContext coroutineContext, Function2 function2) {
        this.f77227b = coroutineContext;
        this.f77228c = function2;
    }

    @Override // uj2.e0
    public final void g(kk2.a aVar) {
        go2.c cVar = new go2.c(d0.c(this.f77226a, this.f77227b), aVar, 2);
        bk2.c.set(aVar, new bk2.a(new d(cVar)));
        l0.DEFAULT.invoke(this.f77228c, cVar, cVar);
    }

    @Override // uj2.e
    public final void n(fk2.f fVar) {
        go2.c cVar = new go2.c(d0.c(this.f77226a, this.f77227b), fVar, 1);
        d dVar = new d(cVar);
        int i13 = fVar.f62432a;
        switch (i13) {
            case 0:
                bk2.a aVar = new bk2.a(dVar);
                switch (i13) {
                    case 0:
                        bk2.c.set(fVar, aVar);
                        break;
                    default:
                        bk2.c.set(fVar, aVar);
                        break;
                }
            default:
                bk2.a aVar2 = new bk2.a(dVar);
                switch (i13) {
                    case 0:
                        bk2.c.set(fVar, aVar2);
                        break;
                    default:
                        bk2.c.set(fVar, aVar2);
                        break;
                }
        }
        l0.DEFAULT.invoke(this.f77228c, cVar, cVar);
    }
}
