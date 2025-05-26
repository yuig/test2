package i50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f71537a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71538b;

    public a(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f71537a = message;
        this.f71538b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f71538b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f71537a, aVar.f71537a) && Intrinsics.d(this.f71538b, aVar.f71538b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f71537a;
    }

    public final int hashCode() {
        int hashCode = this.f71537a.hashCode() * 31;
        String str = this.f71538b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f71537a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f71538b, ")");
    }
}
