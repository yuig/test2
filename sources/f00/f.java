package f00;

import gk2.h0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pq2.g0;
import pq2.i;
import uj2.h;
import uj2.q;

/* loaded from: classes3.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60755i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f60756j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f60757k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, g0 g0Var, int i13) {
        super(1);
        this.f60755i = i13;
        this.f60756j = gVar;
        this.f60757k = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f60755i;
        i iVar = this.f60757k;
        g gVar = this.f60756j;
        switch (i13) {
            case 0:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                gVar.getClass();
                Exception c13 = rz.b.c(throwable, iVar);
                int i14 = h.f122339a;
                return new h0(new ck2.f(c13), 0);
            default:
                Throwable throwable2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                gVar.getClass();
                return q.r(rz.b.c(throwable2, iVar));
        }
    }
}
