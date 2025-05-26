package pd2;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class o0 extends p0 {

    @NotNull
    public static final n0 Companion = new n0();

    /* renamed from: b, reason: collision with root package name */
    public PointF f99863b;

    public o0(PointF value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f99863b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && Intrinsics.d(this.f99863b, ((o0) obj).f99863b);
    }

    public final int hashCode() {
        return this.f99863b.hashCode();
    }

    public final String toString() {
        return "Point(value=" + this.f99863b + ')';
    }
}
