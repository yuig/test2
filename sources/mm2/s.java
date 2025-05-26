package mm2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ym2.g f87729a;

    /* renamed from: b, reason: collision with root package name */
    public final pm2.g f87730b;

    public s(ym2.g name, pm2.g gVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f87729a = name;
        this.f87730b = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            if (Intrinsics.d(this.f87729a, ((s) obj).f87729a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f87729a.hashCode();
    }
}
