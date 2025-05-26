package cn1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends v {

    /* renamed from: b, reason: collision with root package name */
    public final int f28233b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28234c;

    public r(int i13, String str) {
        super(i13);
        this.f28233b = i13;
        this.f28234c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f28233b == rVar.f28233b && Intrinsics.d(this.f28234c, rVar.f28234c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f28233b) * 31;
        String str = this.f28234c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // gm1.c
    public final int j() {
        return this.f28233b;
    }

    public final String toString() {
        return "QueryTextSubmit(id=" + this.f28233b + ", query=" + this.f28234c + ")";
    }
}
