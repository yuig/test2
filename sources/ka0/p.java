package ka0;

import android.os.Bundle;
import com.pinterest.collage.retrieval.screens.CollageRetrievalLocation;
import com.pinterest.framework.screens.ScreenModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends jr.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(il1.b screenFactory) {
        super(screenFactory);
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
    }

    public final void H(List tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        l();
        List<u> list = tabs;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (u uVar : list) {
            CollageRetrievalLocation collageRetrievalLocation = CollageRetrievalLocation.COLLAGE_RETRIEVAL_FEED;
            Bundle bundle = new Bundle();
            bundle.putSerializable("RetrievalExtras.COLLAGE_RETRIEVAL_TYPE", uVar.getType());
            Unit unit = Unit.f80348a;
            ScreenModel o13 = jr.a.o(collageRetrievalLocation, bundle);
            Intrinsics.checkNotNullExpressionValue(o13, "createScreenDescription(...)");
            arrayList.add(o13);
        }
        k(arrayList);
    }
}
