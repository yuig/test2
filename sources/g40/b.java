package g40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f63489a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63490b;

    public b(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f63489a = message;
        this.f63490b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f63490b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f63489a, bVar.f63489a) && Intrinsics.d(this.f63490b, bVar.f63490b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f63489a;
    }

    public final int hashCode() {
        int hashCode = this.f63489a.hashCode() * 31;
        String str = this.f63490b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f63489a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f63490b, ")");
    }
}
