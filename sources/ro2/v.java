package ro2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f109040a;

    /* renamed from: b, reason: collision with root package name */
    public final oo2.g f109041b;

    /* renamed from: c, reason: collision with root package name */
    public final String f109042c;

    public v(Object body, boolean z13, oo2.g gVar) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f109040a = z13;
        this.f109041b = gVar;
        this.f109042c = body.toString();
        if (gVar != null && !gVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // ro2.h0
    public final String b() {
        return this.f109042c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f109040a == vVar.f109040a && Intrinsics.d(this.f109042c, vVar.f109042c);
    }

    public final int hashCode() {
        return this.f109042c.hashCode() + (Boolean.hashCode(this.f109040a) * 31);
    }

    @Override // ro2.h0
    public final String toString() {
        String str = this.f109042c;
        if (!this.f109040a) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        so2.h0.a(str, sb3);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }
}
