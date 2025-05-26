package n72;

import kotlin.jvm.internal.Intrinsics;
import r72.k2;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final k2 f89709a;

    /* renamed from: b, reason: collision with root package name */
    public final b82.j f89710b;

    public c(k2 fontType, b82.j callback) {
        Intrinsics.checkNotNullParameter(fontType, "fontType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f89709a = fontType;
        this.f89710b = callback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f89709a == cVar.f89709a && Intrinsics.d(this.f89710b, cVar.f89710b);
    }

    public final int hashCode() {
        return this.f89710b.hashCode() + (this.f89709a.hashCode() * 31);
    }

    public final String toString() {
        return "RequestItem(fontType=" + this.f89709a + ", callback=" + this.f89710b + ")";
    }
}
