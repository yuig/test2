package pb1;

import android.widget.ScrollView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class k implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f99463a;

    public k(m mVar) {
        this.f99463a = mVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.x event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f100090a) {
            ScrollView scrollView = this.f99463a.f99470d0;
            if (scrollView != null) {
                scrollView.fullScroll(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
            } else {
                Intrinsics.r("scrollView");
                throw null;
            }
        }
    }
}
