package uz1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f123296a;

    public g(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f123296a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f123296a, ((g) obj).f123296a);
    }

    public final int hashCode() {
        return this.f123296a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("BigText(text="), this.f123296a, ")");
    }
}
