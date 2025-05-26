package kb;

import android.app.Notification;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f79025a;

    /* renamed from: b, reason: collision with root package name */
    public final int f79026b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f79027c;

    public r(int i13, int i14, Notification notification) {
        this.f79025a = i13;
        this.f79027c = notification;
        this.f79026b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f79025a == rVar.f79025a && this.f79026b == rVar.f79026b) {
            return this.f79027c.equals(rVar.f79027c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f79027c.hashCode() + (((this.f79025a * 31) + this.f79026b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f79025a + ", mForegroundServiceType=" + this.f79026b + ", mNotification=" + this.f79027c + '}';
    }
}
