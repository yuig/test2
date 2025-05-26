package an0;

import android.graphics.Typeface;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;
import r72.i2;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Size f15666a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f15667b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f15668c;

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f15669d;

    /* renamed from: e, reason: collision with root package name */
    public final i2 f15670e;

    public i(Size size, Integer num, Integer num2, Typeface typeface, i2 i2Var) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f15666a = size;
        this.f15667b = num;
        this.f15668c = num2;
        this.f15669d = typeface;
        this.f15670e = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f15666a, iVar.f15666a) && Intrinsics.d(this.f15667b, iVar.f15667b) && Intrinsics.d(this.f15668c, iVar.f15668c) && Intrinsics.d(this.f15669d, iVar.f15669d) && this.f15670e == iVar.f15670e;
    }

    public final int hashCode() {
        int hashCode = this.f15666a.hashCode() * 31;
        Integer num = this.f15667b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f15668c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Typeface typeface = this.f15669d;
        int hashCode4 = (hashCode3 + (typeface == null ? 0 : typeface.hashCode())) * 31;
        i2 i2Var = this.f15670e;
        return hashCode4 + (i2Var != null ? i2Var.hashCode() : 0);
    }

    public final String toString() {
        return "StickerConfig(size=" + this.f15666a + ", fillColor=" + this.f15667b + ", cornerRadius=" + this.f15668c + ", font=" + this.f15669d + ", alignment=" + this.f15670e + ")";
    }
}
