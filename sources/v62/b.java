package v62;

import d7.g;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f124228a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f124229b;

    /* renamed from: c, reason: collision with root package name */
    public final float f124230c;

    public b(float f13, float f14, float[] strokeDashPattern) {
        Intrinsics.checkNotNullParameter(strokeDashPattern, "strokeDashPattern");
        this.f124228a = f13;
        this.f124229b = strokeDashPattern;
        this.f124230c = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f124228a, bVar.f124228a) == 0 && Intrinsics.d(this.f124229b, bVar.f124229b) && Float.compare(this.f124230c, bVar.f124230c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f124230c) + ((Arrays.hashCode(this.f124229b) + (Float.hashCode(this.f124228a) * 31)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f124229b);
        StringBuilder sb3 = new StringBuilder("MaskDrawableStrokeParams(strokeWidth=");
        sb3.append(this.f124228a);
        sb3.append(", strokeDashPattern=");
        sb3.append(arrays);
        sb3.append(", segmentStrokeWidth=");
        return g.i(sb3, this.f124230c, ")");
    }
}
