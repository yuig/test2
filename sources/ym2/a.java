package ym2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f139461a;

    /* renamed from: b, reason: collision with root package name */
    public final g f139462b;

    static {
        Intrinsics.checkNotNullExpressionValue(c.j(i.f139487f), "topLevel(...)");
    }

    public a(c packageName, g callableName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
        this.f139461a = packageName;
        this.f139462b = callableName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f139461a, aVar.f139461a) && Intrinsics.d(null, null) && Intrinsics.d(this.f139462b, aVar.f139462b) && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        return (this.f139462b.hashCode() + (this.f139461a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        String b13 = this.f139461a.b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        sb3.append(z.m(b13, '.', '/'));
        sb3.append("/");
        sb3.append(this.f139462b);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }
}
