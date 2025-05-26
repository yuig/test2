package j2;

import i2.y2;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f74453a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74454b;

    public /* synthetic */ j0(int i13, int i14, int i15) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? 0 : i14);
    }

    public abstract void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar);

    public String b(int i13) {
        return "IntParameter(" + i13 + ')';
    }

    public String c(int i13) {
        return "ObjectParameter(" + i13 + ')';
    }

    public final String toString() {
        String f13 = kotlin.jvm.internal.k0.f80436a.b(getClass()).f();
        return f13 == null ? "" : f13;
    }

    public j0(int i13, int i14) {
        this.f74453a = i13;
        this.f74454b = i14;
    }
}
