package xs0;

import h32.a4;
import h32.d4;
import h32.i0;
import h32.x3;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zy.l0;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135783i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g0 f135784j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i13, g0 g0Var) {
        super(1);
        this.f135783i = i13;
        this.f135784j = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f135783i;
        g0 g0Var = this.f135784j;
        switch (i13) {
            case 0:
                g0 it = (g0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                l0 l0Var = it.f135812f;
                i0 pinalyticsContext = new i0(d4.HOMEFEED_CONTROL, a4.HOMEFEED_CONTROL_ACTIVITY, new x3(null, null, null, null, null, g0Var.f135807a.getUid(), null, null, null, null, null, null, null, null, null, null, null), null, null, null);
                String uid = g0Var.f135807a.getUid();
                l0Var.getClass();
                Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
                return g0.b(it, new l0(pinalyticsContext, uid), null, 95);
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return q.e(it2, false, new Date(TimeUnit.MILLISECONDS.convert((long) g0Var.f135807a.s3().doubleValue(), TimeUnit.SECONDS)), null, false, null, 29);
        }
    }
}
