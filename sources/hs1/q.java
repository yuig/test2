package hs1;

import android.graphics.Bitmap;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;

/* loaded from: classes2.dex */
public interface q {
    static /* synthetic */ void a(q qVar, a aVar, String str, int i13, int i14, Bitmap.Config config, Boolean bool, List list, int i15) {
        boolean z13 = (i15 & 8) != 0;
        if ((i15 & 64) != 0) {
            Bitmap.Config config2 = r.f70066d;
        }
        ((r) qVar).e(aVar, str, null, z13, i13, i14, (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? Boolean.FALSE : bool, (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : list, false);
    }
}
