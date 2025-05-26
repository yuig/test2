package w01;

import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import i32.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127089a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object obj, int i13) {
        super(1, obj, i01.t.class, "loadPlacement", "loadPlacement(Lcom/pinterest/schemas/experiences/Placement;)V", 0);
        this.f127089a = i13;
        switch (i13) {
            case 1:
                super(1, obj, PinCloseupPresenter.class, "addDisposable", "addDisposable(Lio/reactivex/disposables/Disposable;)V", 0);
                break;
            case 2:
                super(1, obj, i01.t.class, "loadPlacement", "loadPlacement(Lcom/pinterest/schemas/experiences/Placement;)V", 0);
                break;
            case 3:
                super(1, obj, PinCloseupPresenter.class, "addDisposable", "addDisposable(Lio/reactivex/disposables/Disposable;)V", 0);
                break;
            case 4:
                super(1, obj, i01.t.class, "loadPlacement", "loadPlacement(Lcom/pinterest/schemas/experiences/Placement;)V", 0);
                break;
            case 5:
                super(1, obj, PinCloseupPresenter.class, "addDisposable", "addDisposable(Lio/reactivex/disposables/Disposable;)V", 0);
                break;
            case 6:
                super(1, obj, i01.t.class, "loadPlacement", "loadPlacement(Lcom/pinterest/schemas/experiences/Placement;)V", 0);
                break;
            default:
                break;
        }
    }

    public final void h(y0 p03) {
        switch (this.f127089a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((PinCloseupFragment) ((i01.t) this.receiver)).z9(p03);
                break;
            case 1:
            case 3:
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((PinCloseupFragment) ((i01.t) this.receiver)).z9(p03);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((PinCloseupFragment) ((i01.t) this.receiver)).z9(p03);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((PinCloseupFragment) ((i01.t) this.receiver)).z9(p03);
                break;
        }
    }

    public final void i(xj2.c p03) {
        switch (this.f127089a) {
            case 1:
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((PinCloseupPresenter) this.receiver).addDisposable(p03);
                break;
            case 2:
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((PinCloseupPresenter) this.receiver).addDisposable(p03);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((PinCloseupPresenter) this.receiver).addDisposable(p03);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f127089a) {
            case 0:
                h((y0) obj);
                break;
            case 1:
                i((xj2.c) obj);
                break;
            case 2:
                h((y0) obj);
                break;
            case 3:
                i((xj2.c) obj);
                break;
            case 4:
                h((y0) obj);
                break;
            case 5:
                i((xj2.c) obj);
                break;
            default:
                h((y0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
