package dl1;

import jk2.i2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55216i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f55217j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f55218k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(l lVar, u uVar, int i13) {
        super(1);
        this.f55216i = i13;
        this.f55217j = lVar;
        this.f55218k = uVar;
    }

    public final uj2.t b(uj2.q remote) {
        ck2.e eVar = ck2.i.f27921a;
        int i13 = this.f55216i;
        u uVar = this.f55218k;
        l lVar = this.f55217j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(remote, "remote");
                return uj2.q.v(new i2(lVar.J(uVar), l.K(lVar, uVar), 0).J(remote), remote).u(eVar, false, 2, uj2.h.f122339a);
            default:
                Intrinsics.checkNotNullParameter(remote, "remote");
                return uj2.q.v(new i2(lVar.J(uVar), l.K(lVar, uVar), 0).J(remote), remote).u(eVar, false, 2, uj2.h.f122339a);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f55216i) {
        }
        return b((uj2.q) obj);
    }
}
