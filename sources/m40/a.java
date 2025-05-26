package m40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f85816a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85817b;

    public a(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f85816a = message;
        this.f85817b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f85817b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f85816a, aVar.f85816a) && Intrinsics.d(this.f85817b, aVar.f85817b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f85816a;
    }

    public final int hashCode() {
        int hashCode = this.f85816a.hashCode() * 31;
        String str = this.f85817b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f85816a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f85817b, ")");
    }
}
