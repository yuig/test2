package h41;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f67632a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67633b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f67634c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f67635d;

    public g(String text, String contentDescription, Function0 action, boolean z13) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f67632a = text;
        this.f67633b = contentDescription;
        this.f67634c = action;
        this.f67635d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f67632a, gVar.f67632a) && Intrinsics.d(this.f67633b, gVar.f67633b) && Intrinsics.d(this.f67634c, gVar.f67634c) && this.f67635d == gVar.f67635d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67635d) + d7.g.b(this.f67634c, cb.d(this.f67633b, this.f67632a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Metadata(text=");
        sb3.append(this.f67632a);
        sb3.append(", contentDescription=");
        sb3.append(this.f67633b);
        sb3.append(", action=");
        sb3.append(this.f67634c);
        sb3.append(", isEnabled=");
        return a.a.r(sb3, this.f67635d, ")");
    }
}
