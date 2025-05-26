package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f120415a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120416b;

    public q(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f120415a = message;
        this.f120416b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f120416b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f120415a, qVar.f120415a) && Intrinsics.d(this.f120416b, qVar.f120416b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f120415a;
    }

    public final int hashCode() {
        int hashCode = this.f120415a.hashCode() * 31;
        String str = this.f120416b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f120415a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f120416b, ")");
    }
}
