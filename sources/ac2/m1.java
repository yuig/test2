package ac2;

import com.pinterest.video.view.BaseVideoView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final m1 f1996i = new m1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        oc2.i it = (oc2.i) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        BaseVideoView baseVideoView = (BaseVideoView) it;
        return Boolean.valueOf(baseVideoView.V() && baseVideoView.f52774J);
    }
}
