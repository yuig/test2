package hh1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends l {

    /* renamed from: f, reason: collision with root package name */
    public final String f69214f;

    public r(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f69214f = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f69214f, ((r) obj).f69214f);
    }

    public final int hashCode() {
        return this.f69214f.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("TextTagData(text="), this.f69214f, ")");
    }
}
