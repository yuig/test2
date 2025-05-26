package vm2;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f126216a;

    /* renamed from: b, reason: collision with root package name */
    public final int f126217b;

    public d(int i13, int i14) {
        this.f126216a = i13;
        this.f126217b = i14;
    }

    public static b a(d dVar) {
        return new b(dVar.f126216a + dVar.f126217b, 1);
    }

    public static b b() {
        return new b(0);
    }
}
