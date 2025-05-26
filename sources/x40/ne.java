package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ne implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f132895a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132896b;

    public ne(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132895a = message;
        this.f132896b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f132896b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne)) {
            return false;
        }
        ne neVar = (ne) obj;
        return Intrinsics.d(this.f132895a, neVar.f132895a) && Intrinsics.d(this.f132896b, neVar.f132896b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f132895a;
    }

    public final int hashCode() {
        int hashCode = this.f132895a.hashCode() * 31;
        String str = this.f132896b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f132895a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f132896b, ")");
    }
}
