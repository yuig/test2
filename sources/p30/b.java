package p30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f98728a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98729b;

    public b(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f98728a = message;
        this.f98729b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f98729b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f98728a, bVar.f98728a) && Intrinsics.d(this.f98729b, bVar.f98729b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f98728a;
    }

    public final int hashCode() {
        int hashCode = this.f98728a.hashCode() * 31;
        String str = this.f98729b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f98728a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f98729b, ")");
    }
}
