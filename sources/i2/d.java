package i2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f71087a;

    public d(int i13) {
        this.f71087a = i13;
    }

    public final boolean a() {
        return this.f71087a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("{ location = ");
        return a.a.n(sb3, this.f71087a, " }");
    }
}
