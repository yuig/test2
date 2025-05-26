package mc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.b f86935a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86936b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86937c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f86938d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f86939e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f86940f;

    /* renamed from: g, reason: collision with root package name */
    public final int f86941g;

    public i(androidx.media3.common.b format, int i13, int i14, boolean z13, boolean z14, boolean z15, int i15) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f86935a = format;
        this.f86936b = i13;
        this.f86937c = i14;
        this.f86938d = z13;
        this.f86939e = z14;
        this.f86940f = z15;
        this.f86941g = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f86935a, iVar.f86935a) && this.f86936b == iVar.f86936b && this.f86937c == iVar.f86937c && this.f86938d == iVar.f86938d && this.f86939e == iVar.f86939e && this.f86940f == iVar.f86940f && this.f86941g == iVar.f86941g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f86941g) + ep.b.e(this.f86940f, ep.b.e(this.f86939e, ep.b.e(this.f86938d, ep.b.b(this.f86937c, ep.b.b(this.f86936b, this.f86935a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
