package tb1;

import android.widget.ScrollView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pg0.x;

/* loaded from: classes5.dex */
public final class f implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f117134a;

    public f(h hVar) {
        this.f117134a = hVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f100090a) {
            ScrollView scrollView = this.f117134a.f117148r0;
            if (scrollView != null) {
                scrollView.fullScroll(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
            } else {
                Intrinsics.r("scrollView");
                throw null;
            }
        }
    }
}
