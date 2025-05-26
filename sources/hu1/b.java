package hu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f70415a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70416b;

    public b(String username, String fullName) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.f70415a = username;
        this.f70416b = fullName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f70415a, bVar.f70415a) && Intrinsics.d(this.f70416b, bVar.f70416b);
    }

    public final int hashCode() {
        return this.f70416b.hashCode() + (this.f70415a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Loaded(username=");
        sb3.append(this.f70415a);
        sb3.append(", fullName=");
        return a.a.p(sb3, this.f70416b, ")");
    }
}
