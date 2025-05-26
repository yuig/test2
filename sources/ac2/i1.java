package ac2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1976a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f1977b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f1978c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1979d;

    public i1(String mediaUid, s81.g coolDownRunnable, x62.c warmUpRunnable) {
        Intrinsics.checkNotNullParameter(mediaUid, "mediaUid");
        Intrinsics.checkNotNullParameter(coolDownRunnable, "coolDownRunnable");
        Intrinsics.checkNotNullParameter(warmUpRunnable, "warmUpRunnable");
        this.f1976a = mediaUid;
        this.f1977b = coolDownRunnable;
        this.f1978c = warmUpRunnable;
        this.f1979d = false;
    }

    public final boolean a() {
        return this.f1979d;
    }

    public final Runnable b() {
        return this.f1977b;
    }

    public final Runnable c() {
        return this.f1978c;
    }

    public final void d() {
        this.f1979d = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Intrinsics.d(this.f1976a, i1Var.f1976a) && Intrinsics.d(this.f1977b, i1Var.f1977b) && Intrinsics.d(this.f1978c, i1Var.f1978c) && this.f1979d == i1Var.f1979d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1979d) + ((this.f1978c.hashCode() + ((this.f1977b.hashCode() + (this.f1976a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioDecoderCoolDownCancelToken(mediaUid=" + this.f1976a + ", coolDownRunnable=" + this.f1977b + ", warmUpRunnable=" + this.f1978c + ", cancelledOnce=" + this.f1979d + ")";
    }
}
