package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l03 {

    /* renamed from: a, reason: collision with root package name */
    public final k03 f7599a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7600b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7601c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7602d;

    public /* synthetic */ l03(k03 k03Var, int i13, int i14, int i15) {
        this(k03Var, (i15 & 2) != 0 ? 0 : i13, (i15 & 4) != 0 ? 0 : i14, false);
    }

    public final boolean a() {
        return this.f7599a == k03.f7032a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l03)) {
            return false;
        }
        l03 l03Var = (l03) obj;
        return this.f7599a == l03Var.f7599a && this.f7600b == l03Var.f7600b && this.f7601c == l03Var.f7601c && this.f7602d == l03Var.f7602d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int f13 = kh2.n3.f(this.f7601c, kh2.n3.f(this.f7600b, this.f7599a.hashCode() * 31));
        boolean z13 = this.f7602d;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return f13 + i13;
    }

    public final String toString() {
        return "WebViewSize(type=" + this.f7599a + ", widthInPixels=" + this.f7600b + ", heightInPixels=" + this.f7601c + ", isFluidHeight=" + this.f7602d + ")";
    }

    public l03(k03 type, int i13, int i14, boolean z13) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f7599a = type;
        this.f7600b = i13;
        this.f7601c = i14;
        this.f7602d = z13;
    }
}
