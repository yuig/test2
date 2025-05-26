package xk1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import sq0.v;
import uk2.f;
import wt1.i;
import wt1.p;
import wt1.y;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135182i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f135183j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(1);
        this.f135182i = i13;
        this.f135183j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f135182i;
        c cVar = this.f135183j;
        switch (i13) {
            case 0:
                List list = (List) obj;
                Intrinsics.f(list);
                cVar.u(list);
                p pVar = new p(list);
                f fVar = cVar.f135190g;
                fVar.c(pVar);
                fVar.c(new y(null, list));
                return Unit.f80348a;
            case 1:
                Throwable th3 = (Throwable) obj;
                cVar.f135187d = true;
                Intrinsics.f(th3);
                cVar.f135190g.c(new i(th3));
                return Unit.f80348a;
            default:
                v it = (v) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!cVar.f135189f);
        }
    }
}
