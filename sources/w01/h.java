package w01;

import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class h implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f127039b;

    public /* synthetic */ h(int i13, Function1 function1) {
        this.f127038a = i13;
        this.f127039b = function1;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f127038a;
        Function1 tmp0 = this.f127039b;
        switch (i13) {
            case 0:
                PinCloseupPresenter.subscribeToSaveStatusChange$lambda$51(tmp0, obj);
                break;
            case 1:
                PinCloseupPresenter.observeRelatedPinsDataReset$lambda$10(tmp0, obj);
                break;
            case 2:
                PinCloseupPresenter.observeRelatedPinsDataReset$lambda$11(tmp0, obj);
                break;
            case 3:
                PinCloseupPresenter.prefetchBoardPickerSuggestions$lambda$59(tmp0, obj);
                break;
            case 4:
                PinCloseupPresenter.prefetchBoardPickerSuggestions$lambda$60(tmp0, obj);
                break;
            case 5:
                PinCloseupPresenter.refreshForPlacement$lambda$37(tmp0, obj);
                break;
            case 6:
                PinCloseupPresenter.refreshForPlacement$lambda$38(tmp0, obj);
                break;
            case 7:
                PinCloseupPresenter.observeRelatedPinsFirstPageLoad$lambda$13(tmp0, obj);
                break;
            case 8:
                PinCloseupPresenter.observeRelatedPinsFirstPageLoad$lambda$14(tmp0, obj);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 13:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 15:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 16:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 18:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 21:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 22:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 24:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 25:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 26:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 27:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 28:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            default:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
        }
    }
}
