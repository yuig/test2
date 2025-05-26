package uv1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final d f123192i = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bm1.m it = (bm1.m) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return bm1.m.e(it, null, null, null, true, null, 0, null, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL);
    }
}
