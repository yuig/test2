package zm2;

import androidx.datastore.preferences.protobuf.a2;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class c0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final a2 f142181a;

    /* renamed from: b, reason: collision with root package name */
    public e f142182b;

    /* renamed from: c, reason: collision with root package name */
    public int f142183c;

    public c0(d0 d0Var) {
        a2 a2Var = new a2(d0Var, 0);
        this.f142181a = a2Var;
        z c13 = a2Var.c();
        c13.getClass();
        this.f142182b = new e(c13, 0);
        this.f142183c = d0Var.f142185b;
    }

    public final byte b() {
        if (!this.f142182b.hasNext()) {
            z c13 = this.f142181a.c();
            c13.getClass();
            this.f142182b = new e(c13, 0);
        }
        this.f142183c--;
        return this.f142182b.b();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f142183c > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
