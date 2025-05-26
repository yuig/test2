package nk0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f91091a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f91092b;

    public a(Function0 clickHandler, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        this.f91091a = name;
        this.f91092b = clickHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f91091a, aVar.f91091a) && Intrinsics.d(this.f91092b, aVar.f91092b);
    }

    public final int hashCode() {
        return this.f91092b.hashCode() + (this.f91091a.hashCode() * 31);
    }

    public final String toString() {
        return "ClickableCollaborator(name=" + this.f91091a + ", clickHandler=" + this.f91092b + ")";
    }
}
