package f00;

import gk2.d1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pq2.g0;
import pq2.i;
import uj2.b0;

/* loaded from: classes.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60752i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f60753j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f60754k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, g0 g0Var, int i13) {
        super(1);
        this.f60752i = i13;
        this.f60753j = gVar;
        this.f60754k = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f60752i;
        i iVar = this.f60754k;
        g gVar = this.f60753j;
        switch (i13) {
            case 0:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                gVar.getClass();
                return uj2.b.g(rz.b.c(throwable, iVar));
            case 1:
                Throwable throwable2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                gVar.getClass();
                return new d1(rz.b.c(throwable2, iVar), 1);
            default:
                Throwable throwable3 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable3, "throwable");
                gVar.getClass();
                return b0.g(rz.b.c(throwable3, iVar));
        }
    }
}
