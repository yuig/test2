package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fc implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132409a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132410b;

    public fc(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132409a = message;
        this.f132410b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132410b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        return Intrinsics.d(this.f132409a, fcVar.f132409a) && Intrinsics.d(this.f132410b, fcVar.f132410b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132409a;
    }

    public final int hashCode() {
        int hashCode = this.f132409a.hashCode() * 31;
        String str = this.f132410b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132409a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132410b, ")");
    }
}
