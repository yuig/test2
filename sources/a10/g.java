package a10;

import kotlin.jvm.internal.Intrinsics;
import kp.n;

/* loaded from: classes3.dex */
public final class g extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n imageMediumConverter, n imageLargeConverter, int i13) {
        super(imageMediumConverter, imageLargeConverter);
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(imageMediumConverter, "imageMediumConverter");
            Intrinsics.checkNotNullParameter(imageLargeConverter, "imageLargeConverter");
        } else {
            Intrinsics.checkNotNullParameter(imageMediumConverter, "imageMediumConverter");
            Intrinsics.checkNotNullParameter(imageLargeConverter, "imageLargeConverter");
            super(imageMediumConverter, imageLargeConverter);
        }
    }
}
