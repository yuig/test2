package ps0;

import android.view.View;
import com.pinterest.design.brio.widget.progress.LoadingView;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q implements pr0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFeedFragment f101292a;

    public q(HomeFeedFragment homeFeedFragment) {
        this.f101292a = homeFeedFragment;
    }

    @Override // pr0.c
    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i13 = HomeFeedFragment.U1;
        HomeFeedFragment homeFeedFragment = this.f101292a;
        ky.e eVar = (ky.e) homeFeedFragment.B1.getValue();
        if (view.getId() == nl1.e.loading_cell || (view instanceof PinterestLoadingLayout) || (view instanceof LoadingView) || homeFeedFragment.u8()) {
            eVar.d();
        }
    }
}
