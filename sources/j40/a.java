package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f74591a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74592b;

    public a(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f74591a = message;
        this.f74592b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f74592b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f74591a, aVar.f74591a) && Intrinsics.d(this.f74592b, aVar.f74592b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f74591a;
    }

    public final int hashCode() {
        int hashCode = this.f74591a.hashCode() * 31;
        String str = this.f74592b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f74591a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f74592b, ")");
    }
}
