package o4;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: c */
    public static final /* synthetic */ int f92873c = 0;

    /* renamed from: a */
    public final float[] f92874a;

    /* renamed from: b */
    public final float[] f92875b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero".toString());
        }
        this.f92874a = fArr;
        this.f92875b = fArr2;
    }

    @Override // o4.a
    public final float a(float f13) {
        return e3.b.a(f13, this.f92875b, this.f92874a);
    }

    @Override // o4.a
    public final float b(float f13) {
        return e3.b.a(f13, this.f92874a, this.f92875b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f92874a, cVar.f92874a) && Arrays.equals(this.f92875b, cVar.f92875b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f92875b) + (Arrays.hashCode(this.f92874a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f92874a);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb3.append(arrays);
        sb3.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f92875b);
        Intrinsics.checkNotNullExpressionValue(arrays2, "toString(this)");
        sb3.append(arrays2);
        sb3.append('}');
        return sb3.toString();
    }
}
