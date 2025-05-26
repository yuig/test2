package ri2;

import ui2.l;
import ui2.o;

/* loaded from: classes4.dex */
public final class b implements l {

    /* renamed from: g, reason: collision with root package name */
    public static final b f108392g = new b("00000000000000000000000000000000", "0000000000000000", ui2.h.f122310c, ui2.b.f122304a, false);

    /* renamed from: a, reason: collision with root package name */
    public final String f108393a;

    /* renamed from: b, reason: collision with root package name */
    public final String f108394b;

    /* renamed from: c, reason: collision with root package name */
    public final o f108395c;

    /* renamed from: d, reason: collision with root package name */
    public final ui2.a f108396d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f108397e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f108398f;

    public b(String str, String str2, ui2.h hVar, ui2.a aVar, boolean z13) {
        if (str == null) {
            throw new NullPointerException("Null traceId");
        }
        this.f108393a = str;
        if (str2 == null) {
            throw new NullPointerException("Null spanId");
        }
        this.f108394b = str2;
        if (hVar == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.f108395c = hVar;
        if (aVar == null) {
            throw new NullPointerException("Null traceState");
        }
        this.f108396d = aVar;
        this.f108397e = false;
        this.f108398f = z13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f108393a.equals(bVar.f108393a) && this.f108394b.equals(bVar.f108394b) && this.f108395c.equals(bVar.f108395c) && this.f108396d.equals(bVar.f108396d) && this.f108397e == bVar.f108397e && this.f108398f == bVar.f108398f;
    }

    public final int hashCode() {
        return ((((((((((this.f108393a.hashCode() ^ 1000003) * 1000003) ^ this.f108394b.hashCode()) * 1000003) ^ this.f108395c.hashCode()) * 1000003) ^ this.f108396d.hashCode()) * 1000003) ^ (this.f108397e ? 1231 : 1237)) * 1000003) ^ (this.f108398f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImmutableSpanContext{traceId=");
        sb3.append(this.f108393a);
        sb3.append(", spanId=");
        sb3.append(this.f108394b);
        sb3.append(", traceFlags=");
        sb3.append(this.f108395c);
        sb3.append(", traceState=");
        sb3.append(this.f108396d);
        sb3.append(", remote=");
        sb3.append(this.f108397e);
        sb3.append(", valid=");
        return a.a.r(sb3, this.f108398f, "}");
    }
}
