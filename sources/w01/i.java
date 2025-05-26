package w01;

import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinCloseupPresenter f127042b;

    public /* synthetic */ i(PinCloseupPresenter pinCloseupPresenter, int i13) {
        this.f127041a = i13;
        this.f127042b = pinCloseupPresenter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f127041a;
        PinCloseupPresenter this$0 = this.f127042b;
        switch (i13) {
            case 0:
                PinCloseupPresenter.updateFixedHeightImageSpec$lambda$64(this$0);
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.refreshForPlacement();
                break;
        }
    }
}
