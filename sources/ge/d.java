package ge;

import java.security.MessageDigest;
import nd.h;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f64838b;

    public d(Object obj) {
        d7.b.p(obj, "Argument must not be null");
        this.f64838b = obj;
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f64838b.toString().getBytes(h.f90415a));
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f64838b.equals(((d) obj).f64838b);
        }
        return false;
    }

    @Override // nd.h
    public final int hashCode() {
        return this.f64838b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f64838b + '}';
    }
}
