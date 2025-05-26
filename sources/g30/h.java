package g30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f63424a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63425b;

    public h(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f63424a = message;
        this.f63425b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f63425b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f63424a, hVar.f63424a) && Intrinsics.d(this.f63425b, hVar.f63425b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f63424a;
    }

    public final int hashCode() {
        int hashCode = this.f63424a.hashCode() * 31;
        String str = this.f63425b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f63424a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f63425b, ")");
    }
}
