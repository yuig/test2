package ql1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final d f104078a;

    /* renamed from: b, reason: collision with root package name */
    public final fm1.c f104079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f104080c;

    public e(d variant, fm1.c visibility, int i13) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f104078a = variant;
        this.f104079b = visibility;
        this.f104080c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f104078a, eVar.f104078a) && this.f104079b == eVar.f104079b && this.f104080c == eVar.f104080c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104080c) + d7.g.a(this.f104079b, this.f104078a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(variant=");
        sb3.append(this.f104078a);
        sb3.append(", visibility=");
        sb3.append(this.f104079b);
        sb3.append(", id=");
        return a.a.n(sb3, this.f104080c, ")");
    }
}
