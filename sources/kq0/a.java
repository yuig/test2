package kq0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f80642a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f80643b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80644c;

    public a(boolean z13, boolean z14, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f80642a = z13;
        this.f80643b = z14;
        this.f80644c = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f80642a == aVar.f80642a && this.f80643b == aVar.f80643b && Intrinsics.d(this.f80644c, aVar.f80644c);
    }

    public final int hashCode() {
        return this.f80644c.hashCode() + ep.b.e(this.f80643b, Boolean.hashCode(this.f80642a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MQTTError(connectionFailure=");
        sb3.append(this.f80642a);
        sb3.append(", topicConnectionFailure=");
        sb3.append(this.f80643b);
        sb3.append(", message=");
        return a.a.p(sb3, this.f80644c, ")");
    }
}
