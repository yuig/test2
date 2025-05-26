package g30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f63413a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63414b;

    public a(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f63413a = message;
        this.f63414b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f63414b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f63413a, aVar.f63413a) && Intrinsics.d(this.f63414b, aVar.f63414b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f63413a;
    }

    public final int hashCode() {
        int hashCode = this.f63413a.hashCode() * 31;
        String str = this.f63414b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f63413a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f63414b, ")");
    }
}
