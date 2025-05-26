package b4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21543b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21544c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21545d;

    public e(int i13, int i14, Object obj, String str) {
        this.f21542a = obj;
        this.f21543b = i13;
        this.f21544c = i14;
        this.f21545d = str;
        if (i13 > i14) {
            throw new IllegalArgumentException("Reversed range is not supported".toString());
        }
    }

    public final int a() {
        return this.f21544c;
    }

    public final Object b() {
        return this.f21542a;
    }

    public final int c() {
        return this.f21543b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f21542a, eVar.f21542a) && this.f21543b == eVar.f21543b && this.f21544c == eVar.f21544c && Intrinsics.d(this.f21545d, eVar.f21545d);
    }

    public final int hashCode() {
        Object obj = this.f21542a;
        return this.f21545d.hashCode() + ep.b.b(this.f21544c, ep.b.b(this.f21543b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Range(item=");
        sb3.append(this.f21542a);
        sb3.append(", start=");
        sb3.append(this.f21543b);
        sb3.append(", end=");
        sb3.append(this.f21544c);
        sb3.append(", tag=");
        return ep.b.k(sb3, this.f21545d, ')');
    }

    public e(Object obj, int i13, int i14) {
        this(i13, i14, obj, "");
    }
}
