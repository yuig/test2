package q4;

import i2.u0;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f102386a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f102387b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f102388c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f102389d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f102390e;

    public z(boolean z13, boolean z14, boolean z15, int i13) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? true : z14, (i13 & 4) != 0 ? true : z15, a0.Inherit, true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f102386a == zVar.f102386a && this.f102387b == zVar.f102387b && this.f102388c == zVar.f102388c && this.f102389d == zVar.f102389d && this.f102390e == zVar.f102390e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ep.b.e(this.f102390e, ep.b.e(this.f102389d, ep.b.e(this.f102388c, ep.b.e(this.f102387b, this.f102386a * 31, 31), 31), 31), 31);
    }

    public z(boolean z13, boolean z14, boolean z15, a0 a0Var, boolean z16, boolean z17) {
        u0 u0Var = l.f102344a;
        int i13 = !z13 ? 262152 : 262144;
        i13 = a0Var == a0.SecureOn ? i13 | 8192 : i13;
        i13 = z17 ? i13 : i13 | BitmapUtils.BITMAP_TO_JPEG_SIZE;
        boolean z18 = a0Var == a0.Inherit;
        this.f102386a = i13;
        this.f102387b = z18;
        this.f102388c = z14;
        this.f102389d = z15;
        this.f102390e = z16;
    }
}
