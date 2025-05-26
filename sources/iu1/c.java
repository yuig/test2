package iu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f73695a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73696b;

    public c(String username, String fullName) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.f73695a = username;
        this.f73696b = fullName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f73695a, cVar.f73695a) && Intrinsics.d(this.f73696b, cVar.f73696b);
    }

    public final int hashCode() {
        return this.f73696b.hashCode() + (this.f73695a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Loaded(username=");
        sb3.append(this.f73695a);
        sb3.append(", fullName=");
        return a.a.p(sb3, this.f73696b, ")");
    }
}
