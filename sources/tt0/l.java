package tt0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.mediagallery.MediaGalleryActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltt0/l;", "Lnl1/d;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class l extends nl1.d {
    @Override // nl1.d
    public final void K7() {
        super.K7();
        requireActivity().getWindow().addFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
    }

    @Override // nl1.d
    public final void L7() {
        requireActivity().getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        super.L7();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        requireActivity().getWindow().addFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        super.onAttach(context);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        requireActivity().getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        if (requireActivity() instanceof pw0.a) {
            LayoutInflater.Factory requireActivity = requireActivity();
            Intrinsics.g(requireActivity, "null cannot be cast to non-null type com.pinterest.feature.mediagallery.FitsSystemWindows");
            View findViewById = ((MediaGalleryActivity) ((pw0.a) requireActivity)).findViewById(ct1.b.activity_wrapper);
            if (findViewById != null) {
                findViewById.setFitsSystemWindows(true);
            }
        }
        super.onDetach();
    }
}
