package ya0;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerPage;
import h32.a4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class b {
    public static final a4 a(CutoutPickerOrigin cutoutPickerOrigin) {
        Intrinsics.checkNotNullParameter(cutoutPickerOrigin, "<this>");
        int i13 = a.f138314a[cutoutPickerOrigin.ordinal()];
        if (i13 == 1) {
            return a4.COLLAGE_COMPOSER_CUTOUTS_FOR_YOU_FEED;
        }
        if (i13 != 2 && i13 != 3) {
            return a4.COLLAGE_COMPOSER_DISCOVER_FEED;
        }
        return a4.COLLAGE_COMPOSER_YOUR_SAVES_FEED;
    }

    public static final a4 b(CutoutPickerPage cutoutPickerPage) {
        Intrinsics.checkNotNullParameter(cutoutPickerPage, "<this>");
        if (cutoutPickerPage instanceof CutoutPickerPage.OriginPage) {
            return a(((CutoutPickerPage.OriginPage) cutoutPickerPage).f44681a);
        }
        return null;
    }
}
