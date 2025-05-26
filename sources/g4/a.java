package g4;

import a.cb;

/* loaded from: classes.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final int f63454a;

    public a(int i13) {
        this.f63454a = i13;
    }

    @Override // g4.s
    public final l a(l lVar) {
        int i13 = this.f63454a;
        return (i13 == 0 || i13 == Integer.MAX_VALUE) ? lVar : new l(ql2.s.g(lVar.b() + i13, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f63454a == ((a) obj).f63454a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63454a);
    }

    public final String toString() {
        return cb.l(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f63454a, ')');
    }
}
