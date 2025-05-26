package pk;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o2 implements ok.g0, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f100463a;

    public o2(int i13) {
        a0.C(i13, "expectedValuesPerKey");
        this.f100463a = i13;
    }

    @Override // ok.g0
    public final Object get() {
        return new ArrayList(this.f100463a);
    }
}
