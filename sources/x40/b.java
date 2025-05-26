package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f131996a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131997b;

    public b(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f131996a = message;
        this.f131997b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f131997b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f131996a, bVar.f131996a) && Intrinsics.d(this.f131997b, bVar.f131997b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f131996a;
    }

    public final int hashCode() {
        int hashCode = this.f131996a.hashCode() * 31;
        String str = this.f131997b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f131996a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f131997b, ")");
    }
}
