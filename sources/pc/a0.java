package pc;

import a.cb;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f99510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f99511b;

    public a0(int i13, int i14) {
        this.f99510a = i13;
        this.f99511b = i14;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Location(line = ");
        sb3.append(this.f99510a);
        sb3.append(", column = ");
        return cb.l(sb3, this.f99511b, ')');
    }
}
