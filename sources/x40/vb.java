package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vb implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133551a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133552b;

    public vb(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133551a = message;
        this.f133552b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133552b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb)) {
            return false;
        }
        vb vbVar = (vb) obj;
        return Intrinsics.d(this.f133551a, vbVar.f133551a) && Intrinsics.d(this.f133552b, vbVar.f133552b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133551a;
    }

    public final int hashCode() {
        int hashCode = this.f133551a.hashCode() * 31;
        String str = this.f133552b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133551a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133552b, ")");
    }
}
