package nc2;

import android.util.Size;
import bc2.n;
import bc2.o;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f90408a = z0.g(new Pair(n.T1, new Size(RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM, 424)), new Pair(n.T2, new Size(360, 640)), new Pair(n.T3, new Size(486, 864)), new Pair(n.T4, new Size(648, 1152)), new Pair(n.T5, new Size(720, 1280)));

    public static bc2.c a(o track, bc2.c maxDimensions) {
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(maxDimensions, "maxDimensions");
        n nVar = track.f22669f;
        if (nVar == null) {
            return null;
        }
        bc2.c cVar = track.f22667d;
        if (cVar != null) {
            return cVar;
        }
        int i13 = maxDimensions.f22648a;
        if (nVar.compareTo(i13 > 640 ? n.T5 : i13 > 480 ? n.T4 : i13 > 360 ? n.T3 : i13 > 240 ? n.T2 : n.T1) >= 0) {
            return maxDimensions;
        }
        Size size = (Size) f90408a.get(nVar);
        if (size == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        float b13 = b(null, maxDimensions);
        int width = size.getWidth();
        return new bc2.c(width, (int) (width / b13));
    }

    public static float b(bc2.c cVar, bc2.c cVar2) {
        int i13;
        int i14;
        int i15;
        if (cVar != null && (i14 = cVar.f22648a) != 0 && (i15 = cVar.f22649b) != 0) {
            return i14 / i15;
        }
        int i16 = cVar2.f22648a;
        if (i16 == 0 || (i13 = cVar2.f22649b) == 0) {
            return 1.0f;
        }
        return i16 / i13;
    }
}
