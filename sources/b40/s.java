package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21744a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21745b;

    public s(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f21744a = message;
        this.f21745b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f21745b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f21744a, sVar.f21744a) && Intrinsics.d(this.f21745b, sVar.f21745b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f21744a;
    }

    public final int hashCode() {
        int hashCode = this.f21744a.hashCode() * 31;
        String str = this.f21745b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f21744a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f21745b, ")");
    }
}
