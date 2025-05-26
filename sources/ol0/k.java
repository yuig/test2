package ol0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96396i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f96397j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, int i13) {
        super(1);
        this.f96396i = i13;
        this.f96397j = mVar;
    }

    public final om1.c b(om1.c it) {
        int i13 = this.f96396i;
        m mVar = this.f96397j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, d7.b.Z(mVar.f96407d), null, false, 0, 1015);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, d7.b.Z(mVar.f96408e), null, false, 0, 1015);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f96396i) {
        }
        return b((om1.c) obj);
    }
}
