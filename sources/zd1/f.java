package zd1;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface f extends yk1.d {
    static String P1(boolean z13, Resources resources, String str) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (z13) {
            String string = resources.getString(mz1.g.content_description_unselect_product_filter, str);
            Intrinsics.f(string);
            return string;
        }
        String string2 = resources.getString(mz1.g.content_description_select_product_filter, str);
        Intrinsics.f(string2);
        return string2;
    }
}
