package ads_mobile_sdk;

import a.g2;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class ub2 extends a.r {

    /* renamed from: a, reason: collision with root package name */
    public final wb2 f12013a;

    /* renamed from: b, reason: collision with root package name */
    public g2 f12014b = b();

    public ub2(xb2 xb2Var) {
        this.f12013a = new wb2(xb2Var);
    }

    @Override // a.g2
    public final byte a() {
        g2 g2Var = this.f12014b;
        if (g2Var == null) {
            throw new NoSuchElementException();
        }
        byte a13 = g2Var.a();
        if (!this.f12014b.hasNext()) {
            this.f12014b = b();
        }
        return a13;
    }

    public final zk b() {
        if (!this.f12013a.hasNext()) {
            return null;
        }
        a.g3 next = this.f12013a.next();
        next.getClass();
        return new zk(next);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12014b != null;
    }
}
