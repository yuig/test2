package j30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f74543a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74544b;

    public a(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f74543a = message;
        this.f74544b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f74544b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f74543a, aVar.f74543a) && Intrinsics.d(this.f74544b, aVar.f74544b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f74543a;
    }

    public final int hashCode() {
        int hashCode = this.f74543a.hashCode() * 31;
        String str = this.f74544b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f74543a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f74544b, ")");
    }
}
