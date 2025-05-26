package vo;

import com.pinterest.activity.ExperimentsReloaderActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126356i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ExperimentsReloaderActivity f126357j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ExperimentsReloaderActivity experimentsReloaderActivity, int i13) {
        super(1);
        this.f126356i = i13;
        this.f126357j = experimentsReloaderActivity;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f126356i;
        ExperimentsReloaderActivity experimentsReloaderActivity = this.f126357j;
        switch (i13) {
            case 0:
                ExperimentsReloaderActivity.q(experimentsReloaderActivity);
                break;
            default:
                if (!experimentsReloaderActivity.f34805j.isDisposed() && !experimentsReloaderActivity.isDestroyed()) {
                    ExperimentsReloaderActivity.q(experimentsReloaderActivity);
                }
                break;
        }
        return Unit.f80348a;
    }
}
