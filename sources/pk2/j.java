package pk2;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class j implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f100549a;

    public j(Throwable th3) {
        this.f100549a = th3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return ck2.i.a(this.f100549a, ((j) obj).f100549a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f100549a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f100549a + "]";
    }
}
