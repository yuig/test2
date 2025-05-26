package oi2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f95342a;

    /* renamed from: b, reason: collision with root package name */
    public final long f95343b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f95344c;

    public c(String name, long j13, Map attributes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f95342a = name;
        this.f95343b = j13;
        this.f95344c = attributes;
    }

    public static c a(c cVar, LinkedHashMap attributes) {
        String name = cVar.f95342a;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new c(name, cVar.f95343b, attributes);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f95342a, cVar.f95342a) && this.f95343b == cVar.f95343b && Intrinsics.d(this.f95344c, cVar.f95344c);
    }

    public final int hashCode() {
        return this.f95344c.hashCode() + a.a.c(this.f95343b, this.f95342a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "EmbraceSpanEvent(name=" + this.f95342a + ", timestampNanos=" + this.f95343b + ", attributes=" + this.f95344c + ')';
    }
}
