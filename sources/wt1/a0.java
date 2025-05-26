package wt1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends tl1.i {

    /* renamed from: b, reason: collision with root package name */
    public final int f131093b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f131094c;

    public a0(int i13, Object obj) {
        super(1);
        this.f131093b = i13;
        this.f131094c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f131093b == a0Var.f131093b && Intrinsics.d(this.f131094c, a0Var.f131094c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f131093b) * 31;
        Object obj = this.f131094c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Payload(position=" + this.f131093b + ", changed=" + this.f131094c + ")";
    }
}
