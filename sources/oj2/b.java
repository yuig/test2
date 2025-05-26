package oj2;

import io.opentelemetry.api.trace.StatusCode;

/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final b f95403c = new b(StatusCode.OK, "");

    /* renamed from: d, reason: collision with root package name */
    public static final b f95404d = new b(StatusCode.UNSET, "");

    /* renamed from: e, reason: collision with root package name */
    public static final b f95405e = new b(StatusCode.ERROR, "");

    /* renamed from: a, reason: collision with root package name */
    public final StatusCode f95406a;

    /* renamed from: b, reason: collision with root package name */
    public final String f95407b;

    public b(StatusCode statusCode, String str) {
        if (statusCode == null) {
            throw new NullPointerException("Null statusCode");
        }
        this.f95406a = statusCode;
        this.f95407b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f95406a.equals(bVar.f95406a) && this.f95407b.equals(bVar.f95407b);
    }

    public final int hashCode() {
        return ((this.f95406a.hashCode() ^ 1000003) * 1000003) ^ this.f95407b.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImmutableStatusData{statusCode=");
        sb3.append(this.f95406a);
        sb3.append(", description=");
        return a.a.p(sb3, this.f95407b, "}");
    }
}
