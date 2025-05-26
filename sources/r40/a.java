package r40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f106129a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106130b;

    public a(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f106129a = message;
        this.f106130b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f106130b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f106129a, aVar.f106129a) && Intrinsics.d(this.f106130b, aVar.f106130b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f106129a;
    }

    public final int hashCode() {
        int hashCode = this.f106129a.hashCode() * 31;
        String str = this.f106130b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f106129a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f106130b, ")");
    }
}
