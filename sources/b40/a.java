package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21681a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21682b;

    public a(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f21681a = message;
        this.f21682b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f21682b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f21681a, aVar.f21681a) && Intrinsics.d(this.f21682b, aVar.f21682b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f21681a;
    }

    public final int hashCode() {
        int hashCode = this.f21681a.hashCode() * 31;
        String str = this.f21682b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f21681a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f21682b, ")");
    }
}
