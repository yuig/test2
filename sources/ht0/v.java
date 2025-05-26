package ht0;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f70140a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70141b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70142c;

    public v(int i13, int i14, int i15) {
        this.f70140a = i13;
        this.f70141b = i14;
        this.f70142c = i15;
    }

    public final int a() {
        return this.f70141b;
    }

    public final int b() {
        return this.f70140a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f70140a == vVar.f70140a && this.f70141b == vVar.f70141b && this.f70142c == vVar.f70142c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70142c) + ep.b.b(this.f70141b, Integer.hashCode(this.f70140a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TabDisplayState(tabPosition=");
        sb3.append(this.f70140a);
        sb3.append(", tabNameStringRes=");
        sb3.append(this.f70141b);
        sb3.append(", tabDescriptionStringRes=");
        return a.a.n(sb3, this.f70142c, ")");
    }
}
