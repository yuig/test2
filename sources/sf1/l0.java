package sf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f112646a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f112647b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f112648c;

    /* renamed from: d, reason: collision with root package name */
    public final w0 f112649d;

    /* renamed from: e, reason: collision with root package name */
    public final a.z0 f112650e;

    /* renamed from: f, reason: collision with root package name */
    public final w0 f112651f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f112652g;

    public l0(p1 pageDisplayListener, w0 videoStateListener, c1 upgradeListener, w0 stickerListener, a.z0 logListener, w0 adsPageListener, v0 v0Var) {
        Intrinsics.checkNotNullParameter(pageDisplayListener, "pageDisplayListener");
        Intrinsics.checkNotNullParameter(videoStateListener, "videoStateListener");
        Intrinsics.checkNotNullParameter(upgradeListener, "upgradeListener");
        Intrinsics.checkNotNullParameter(stickerListener, "stickerListener");
        Intrinsics.checkNotNullParameter(logListener, "logListener");
        Intrinsics.checkNotNullParameter(adsPageListener, "adsPageListener");
        this.f112646a = pageDisplayListener;
        this.f112647b = videoStateListener;
        this.f112648c = upgradeListener;
        this.f112649d = stickerListener;
        this.f112650e = logListener;
        this.f112651f = adsPageListener;
        this.f112652g = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.f112646a, l0Var.f112646a) && Intrinsics.d(this.f112647b, l0Var.f112647b) && Intrinsics.d(this.f112648c, l0Var.f112648c) && Intrinsics.d(this.f112649d, l0Var.f112649d) && Intrinsics.d(this.f112650e, l0Var.f112650e) && Intrinsics.d(this.f112651f, l0Var.f112651f) && Intrinsics.d(this.f112652g, l0Var.f112652g);
    }

    public final int hashCode() {
        int hashCode = (this.f112651f.hashCode() + ((this.f112650e.hashCode() + ((this.f112649d.hashCode() + ((this.f112648c.hashCode() + ((this.f112647b.hashCode() + (this.f112646a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        v0 v0Var = this.f112652g;
        return hashCode + (v0Var == null ? 0 : v0Var.hashCode());
    }

    public final String toString() {
        return "PageActionListeners(pageDisplayListener=" + this.f112646a + ", videoStateListener=" + this.f112647b + ", upgradeListener=" + this.f112648c + ", stickerListener=" + this.f112649d + ", logListener=" + this.f112650e + ", adsPageListener=" + this.f112651f + ", staticImageIdeaPinListener=" + this.f112652g + ")";
    }
}
