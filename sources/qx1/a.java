package qx1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends jr.a {
    public final void H(ArrayList pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        l();
        Iterator it = pages.iterator();
        while (it.hasNext()) {
            ScreenModel screenDescription = jr.a.n((ScreenLocation) it.next());
            Intrinsics.checkNotNullExpressionValue(screenDescription, "createScreenDescription(...)");
            Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
            C(CollectionsKt.m0(screenDescription, this.f77529f));
        }
    }
}
