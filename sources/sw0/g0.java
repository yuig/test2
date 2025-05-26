package sw0;

import android.graphics.Matrix;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class g0 extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f115445a = new g0();

    public g0() {
        super(1, ig1.b.class, "getMatrixRotationDegree", "getMatrixRotationDegree(Landroid/graphics/Matrix;)F", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Matrix p03 = (Matrix) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return Float.valueOf(ig1.b.a0(p03));
    }
}
