package com.pinterest.feature.search.results.view;

import android.content.Context;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchGridMultiSectionFragment f47820b;

    public /* synthetic */ n(SearchGridMultiSectionFragment searchGridMultiSectionFragment, int i13) {
        this.f47819a = i13;
        this.f47820b = searchGridMultiSectionFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window;
        int i13 = this.f47819a;
        SearchGridMultiSectionFragment this$0 = this.f47820b;
        switch (i13) {
            case 0:
                int i14 = SearchGridMultiSectionFragment.O2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FragmentActivity E4 = this$0.E4();
                if (E4 != null && (window = E4.getWindow()) != null) {
                    window.clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    break;
                }
                break;
            default:
                int i15 = SearchGridMultiSectionFragment.O2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.k9().f27256o) {
                    Context context = this$0.getContext();
                    if (context != null) {
                        FragmentActivity E42 = this$0.E4();
                        Window window2 = E42 != null ? E42.getWindow() : null;
                        if (window2 != null) {
                            window2.setStatusBarColor(dl2.b.x0(context, eo1.a.sema_color_background_wash_dark));
                        }
                    }
                    FrameLayout frameLayout = this$0.M1;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                    }
                    ca2.e.w(this$0.k9(), this$0.L1, new np.f(this$0, 2), null, null, 12);
                    break;
                }
                break;
        }
    }
}
