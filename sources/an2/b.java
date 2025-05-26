package an2;

import am2.c1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final b f15763a = new b();

    @Override // an2.e
    public final String a(am2.j classifier, y renderer) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        if (classifier instanceof c1) {
            ym2.g name = ((c1) classifier).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return renderer.T(name, false);
        }
        ym2.e h10 = bn2.e.h(classifier);
        Intrinsics.checkNotNullExpressionValue(h10, "getFqName(...)");
        return renderer.K(h10);
    }
}
