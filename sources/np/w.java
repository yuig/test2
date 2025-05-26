package np;

import com.pinterest.activity.create.ScrapedImagesResultsActivity;
import com.pinterest.component.modal.ModalContainer;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrapedImagesResultsActivity f91715a;

    public w(ScrapedImagesResultsActivity scrapedImagesResultsActivity) {
        this.f91715a = scrapedImagesResultsActivity;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ff0.d e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f91715a.f34942h;
        if (modalContainer != null) {
            ff0.a.a(modalContainer);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ff0.g e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (this.f91715a.f34942h != null) {
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.s e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f91715a.f34941g;
        if (modalContainer != null) {
            modalContainer.f(jc0.a.Bottom, true);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.v e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f91715a.f34941g;
        if (modalContainer != null) {
            modalContainer.k(e13);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull v event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ScrapedImagesResultsActivity scrapedImagesResultsActivity = this.f91715a;
        if (scrapedImagesResultsActivity.f34938d == null) {
            scrapedImagesResultsActivity.finish();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull y resultsLoadedEvent) {
        Intrinsics.checkNotNullParameter(resultsLoadedEvent, "resultsLoadedEvent");
        throw null;
    }
}
