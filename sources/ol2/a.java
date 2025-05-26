package ol2;

import java.util.Random;
import jk.v;

/* loaded from: classes2.dex */
public abstract class a extends f {
    @Override // ol2.f
    public final int a(int i13) {
        return v.f0(h().nextInt(), i13);
    }

    @Override // ol2.f
    public final double b() {
        return h().nextDouble();
    }

    @Override // ol2.f
    public final int e() {
        return h().nextInt();
    }

    @Override // ol2.f
    public final long g() {
        return h().nextLong();
    }

    public abstract Random h();

    public final int i(int i13) {
        return h().nextInt(i13);
    }
}
