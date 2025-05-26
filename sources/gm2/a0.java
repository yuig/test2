package gm2;

import java.util.Collection;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a0 extends u implements pm2.d {

    /* renamed from: a, reason: collision with root package name */
    public final ym2.c f65755a;

    public a0(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f65755a = fqName;
    }

    @Override // pm2.d
    public final pm2.a a(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            if (Intrinsics.d(this.f65755a, ((a0) obj).f65755a)) {
                return true;
            }
        }
        return false;
    }

    @Override // pm2.d
    public final Collection getAnnotations() {
        return q0.f80391a;
    }

    public final int hashCode() {
        return this.f65755a.hashCode();
    }

    public final String toString() {
        return a0.class.getName() + ": " + this.f65755a;
    }
}
