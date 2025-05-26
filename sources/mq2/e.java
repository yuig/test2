package mq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final BigInteger f88073a;

    public e(BigInteger bigInteger) {
        this.f88073a = bigInteger;
    }

    @Override // mq2.a
    public final int a() {
        return 1;
    }

    @Override // mq2.a
    public final BigInteger b() {
        return this.f88073a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f88073a.equals(((e) obj).f88073a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f88073a.hashCode();
    }
}
