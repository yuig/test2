package m30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f85743a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85744b;

    public a(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f85743a = message;
        this.f85744b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f85744b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f85743a, aVar.f85743a) && Intrinsics.d(this.f85744b, aVar.f85744b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f85743a;
    }

    public final int hashCode() {
        int hashCode = this.f85743a.hashCode() * 31;
        String str = this.f85744b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f85743a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f85744b, ")");
    }
}
