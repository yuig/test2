package g72;

import a.cb;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* renamed from: c, reason: collision with root package name */
    public static final no2.b[] f64088c = {new qo2.e1(kotlin.jvm.internal.k0.f80436a.b(float[].class), qo2.y.f104655c), null};

    /* renamed from: a, reason: collision with root package name */
    public final float[][] f64089a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64090b;

    public r(int i13, float[][] fArr, String str) {
        if ((i13 & 1) == 0) {
            this.f64089a = null;
        } else {
            this.f64089a = fArr;
        }
        if ((i13 & 2) == 0) {
            this.f64090b = null;
        } else {
            this.f64090b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(r.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.shuffles.data.entity.shuffle.effect.BitmapMaskEntity");
        r rVar = (r) obj;
        return kotlin.collections.x.c(this.f64089a, rVar.f64089a) && Intrinsics.d(this.f64090b, rVar.f64090b);
    }

    public final int hashCode() {
        int deepHashCode = Arrays.deepHashCode(this.f64089a) * 31;
        String str = this.f64090b;
        return deepHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return a.a.p(cb.o("BitmapMaskEntity(maskBounds=", Arrays.toString(this.f64089a), ", maskImage="), this.f64090b, ")");
    }

    public r(float[][] fArr, String str) {
        this.f64089a = fArr;
        this.f64090b = str;
    }
}
