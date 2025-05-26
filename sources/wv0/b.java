package wv0;

import com.pinterest.api.model.bo0;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.ln0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f131153i = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ln0 it = (ln0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        List items = it.y().getMediaList().getItems();
        ArrayList arrayList = new ArrayList(g0.q(items, 10));
        int i13 = 0;
        for (Object obj2 : items) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            bo0 bo0Var = (bo0) obj2;
            long endTimeMs = bo0Var.getEndTimeMs() - bo0Var.getStartTimeMs();
            d30 photoItem = bo0Var.getPhotoItem();
            if (photoItem == null) {
                photoItem = bo0Var.getVideoItem();
            }
            arrayList.add(new xv0.b(i13, photoItem, endTimeMs, !it.y().a()));
            i13 = i14;
        }
        return (((it.y().getMediaList().v() > pp2.a.u() ? 1 : (it.y().getMediaList().v() == pp2.a.u() ? 0 : -1)) >= 0) || (it.y().getMediaList().g() >= 20)) ? arrayList : CollectionsKt.m0(new xv0.a(), arrayList);
    }
}
