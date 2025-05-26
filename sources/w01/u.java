package w01;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class u implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinCloseupPresenter f127116a;

    public u(PinCloseupPresenter pinCloseupPresenter) {
        this.f127116a = pinCloseupPresenter;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x70.a event) {
        String str;
        PinCloseupFragment pinCloseupFragment;
        RecyclerView g83;
        ViewTreeObserver viewTreeObserver;
        AtomicBoolean atomicBoolean;
        Intrinsics.checkNotNullParameter(event, "event");
        m60.u.f85943a.i(event);
        String str2 = event.f134109a;
        PinCloseupPresenter pinCloseupPresenter = this.f127116a;
        str = pinCloseupPresenter.pinUid;
        if (Intrinsics.d(str2, str)) {
            atomicBoolean = pinCloseupPresenter.webViewClosed;
            atomicBoolean.set(true);
            pinCloseupPresenter.shouldLoadExperiences = true;
        }
        if (!pinCloseupPresenter.isBound() || (g83 = (pinCloseupFragment = (PinCloseupFragment) PinCloseupPresenter.access$getView(pinCloseupPresenter)).g8()) == null || (viewTreeObserver = g83.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(pinCloseupFragment.M2);
    }
}
