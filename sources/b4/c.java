package b4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21531a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21532b;

    /* renamed from: c, reason: collision with root package name */
    public int f21533c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21534d;

    public /* synthetic */ c(Object obj, int i13, int i14, int i15) {
        this(i13, (i15 & 4) != 0 ? Integer.MIN_VALUE : i14, obj, "");
    }

    public final e a(int i13) {
        int i14 = this.f21533c;
        if (i14 != Integer.MIN_VALUE) {
            i13 = i14;
        }
        if (i13 == Integer.MIN_VALUE) {
            throw new IllegalStateException("Item.end should be set first".toString());
        }
        return new e(this.f21532b, i13, this.f21531a, this.f21534d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f21531a, cVar.f21531a) && this.f21532b == cVar.f21532b && this.f21533c == cVar.f21533c && Intrinsics.d(this.f21534d, cVar.f21534d);
    }

    public final int hashCode() {
        Object obj = this.f21531a;
        return this.f21534d.hashCode() + ep.b.b(this.f21533c, ep.b.b(this.f21532b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MutableRange(item=");
        sb3.append(this.f21531a);
        sb3.append(", start=");
        sb3.append(this.f21532b);
        sb3.append(", end=");
        sb3.append(this.f21533c);
        sb3.append(", tag=");
        return ep.b.k(sb3, this.f21534d, ')');
    }

    public c(int i13, int i14, Object obj, String str) {
        this.f21531a = obj;
        this.f21532b = i13;
        this.f21533c = i14;
        this.f21534d = str;
    }
}
