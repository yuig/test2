package e32;

import kotlin.jvm.internal.Intrinsics;
import vb0.i;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static final i f57128i = new i(0);

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f57129a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f57130b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f57131c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f57132d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f57133e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f57134f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f57135g;

    /* renamed from: h, reason: collision with root package name */
    public final String f57136h;

    public b(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str) {
        this.f57129a = bool;
        this.f57130b = num;
        this.f57131c = num2;
        this.f57132d = num3;
        this.f57133e = num4;
        this.f57134f = num5;
        this.f57135g = num6;
        this.f57136h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f57129a, bVar.f57129a) && Intrinsics.d(this.f57130b, bVar.f57130b) && Intrinsics.d(this.f57131c, bVar.f57131c) && Intrinsics.d(this.f57132d, bVar.f57132d) && Intrinsics.d(this.f57133e, bVar.f57133e) && Intrinsics.d(this.f57134f, bVar.f57134f) && Intrinsics.d(this.f57135g, bVar.f57135g) && Intrinsics.d(this.f57136h, bVar.f57136h);
    }

    public final int hashCode() {
        Boolean bool = this.f57129a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f57130b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f57131c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f57132d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f57133e;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f57134f;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f57135g;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str = this.f57136h;
        return hashCode7 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CommonExtraData(excludesFromGridRep=" + this.f57129a + ", creativeType=" + this.f57130b + ", closeupType=" + this.f57131c + ", mediaType=" + this.f57132d + ", intendedDestinationType=" + this.f57133e + ", fallbackDestinationType=" + this.f57134f + ", finalDestinationType=" + this.f57135g + ", finalDestinationUrl=" + this.f57136h + ")";
    }
}
