package v30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f123918a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123919b;

    public a(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f123918a = message;
        this.f123919b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f123919b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f123918a, aVar.f123918a) && Intrinsics.d(this.f123919b, aVar.f123919b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f123918a;
    }

    public final int hashCode() {
        int hashCode = this.f123918a.hashCode() * 31;
        String str = this.f123919b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f123918a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f123919b, ")");
    }
}
