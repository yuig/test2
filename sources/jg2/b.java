package jg2;

import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f76086a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76087b;

    /* renamed from: c, reason: collision with root package name */
    public final long f76088c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f76089d;

    /* renamed from: e, reason: collision with root package name */
    public final List f76090e;

    /* renamed from: f, reason: collision with root package name */
    public final ErrorCode f76091f;

    public b(String name, long j13, long j14, Map attributes, List events, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f76086a = name;
        this.f76087b = j13;
        this.f76088c = j14;
        this.f76089d = attributes;
        this.f76090e = events;
        this.f76091f = errorCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f76086a, bVar.f76086a) && this.f76087b == bVar.f76087b && this.f76088c == bVar.f76088c && Intrinsics.d(this.f76089d, bVar.f76089d) && Intrinsics.d(this.f76090e, bVar.f76090e) && this.f76091f == bVar.f76091f;
    }

    public final int hashCode() {
        int c13 = ep.b.c(this.f76090e, a.c.e(this.f76089d, a.a.c(this.f76088c, a.a.c(this.f76087b, this.f76086a.hashCode() * 31, 31), 31), 31), 31);
        ErrorCode errorCode = this.f76091f;
        return c13 + (errorCode == null ? 0 : errorCode.hashCode());
    }

    public final String toString() {
        return "TrackedInterval(name=" + this.f76086a + ", startTimeMs=" + this.f76087b + ", endTimeMs=" + this.f76088c + ", attributes=" + this.f76089d + ", events=" + this.f76090e + ", errorCode=" + this.f76091f + ')';
    }
}
