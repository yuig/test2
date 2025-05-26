package ed1;

import com.pinterest.feature.sharesheet.view.SharesheetBoardPreviewContainer;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class t implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f58707a;

    public t(v vVar) {
        this.f58707a = vVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x52.o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        v vVar = this.f58707a;
        SharesheetBoardPreviewContainer sharesheetBoardPreviewContainer = (SharesheetBoardPreviewContainer) vVar.getViewIfBound();
        if (sharesheetBoardPreviewContainer != null) {
            sharesheetBoardPreviewContainer.a();
        }
        vVar.f58717g.d(x52.s.f133912a);
    }
}
