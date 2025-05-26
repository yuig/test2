package ra0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f106978r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r1.p0 f106979s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f106980t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r1.p0 p0Var, int i13, bl2.c cVar) {
        super(2, cVar);
        this.f106979s = p0Var;
        this.f106980t = i13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q(this.f106979s, this.f106980t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f106978r;
        if (i13 == 0) {
            ue.c.H(obj);
            r1.p0 p0Var = this.f106979s;
            List list = ((r1.a0) p0Var.i()).f105841g;
            boolean z13 = list instanceof Collection;
            int i14 = this.f106980t;
            if (!z13 || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((r1.b0) ((r1.m) it.next())).f105850a == i14) {
                        break;
                    }
                }
            }
            this.f106978r = 1;
            if (r1.p0.k(p0Var, i14, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
