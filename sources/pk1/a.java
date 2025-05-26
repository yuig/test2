package pk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f100536a;

    /* renamed from: b, reason: collision with root package name */
    public final vq0.h f100537b;

    public a(rk1.g viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.f100536a = 44;
        this.f100537b = viewBinder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f100536a == aVar.f100536a && Intrinsics.d(this.f100537b, aVar.f100537b);
    }

    public final int hashCode() {
        return this.f100537b.hashCode() + (Integer.hashCode(this.f100536a) * 31);
    }

    public final String toString() {
        return "UserViewConfiguration(viewType=" + this.f100536a + ", viewBinder=" + this.f100537b + ")";
    }
}
