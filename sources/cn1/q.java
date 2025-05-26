package cn1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends v {

    /* renamed from: b, reason: collision with root package name */
    public final int f28231b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28232c;

    public q(int i13, String str) {
        super(i13);
        this.f28231b = i13;
        this.f28232c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f28231b == qVar.f28231b && Intrinsics.d(this.f28232c, qVar.f28232c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f28231b) * 31;
        String str = this.f28232c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // gm1.c
    public final int j() {
        return this.f28231b;
    }

    public final String toString() {
        return "QueryTextChange(id=" + this.f28231b + ", newText=" + this.f28232c + ")";
    }
}
