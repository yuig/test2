package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f120285a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120286b;

    public a(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f120285a = message;
        this.f120286b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f120286b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f120285a, aVar.f120285a) && Intrinsics.d(this.f120286b, aVar.f120286b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f120285a;
    }

    public final int hashCode() {
        int hashCode = this.f120285a.hashCode() * 31;
        String str = this.f120286b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f120285a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f120286b, ")");
    }
}
