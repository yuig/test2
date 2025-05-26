package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f136733a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136734b;

    public a(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f136733a = message;
        this.f136734b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f136734b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f136733a, aVar.f136733a) && Intrinsics.d(this.f136734b, aVar.f136734b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f136733a;
    }

    public final int hashCode() {
        int hashCode = this.f136733a.hashCode() * 31;
        String str = this.f136734b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f136733a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f136734b, ")");
    }
}
