package p3;

import a.cb;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f98723a;

    /* renamed from: b, reason: collision with root package name */
    public final float f98724b;

    /* renamed from: c, reason: collision with root package name */
    public final long f98725c;

    /* renamed from: d, reason: collision with root package name */
    public final int f98726d;

    public c(float f13, float f14, int i13, long j13) {
        this.f98723a = f13;
        this.f98724b = f14;
        this.f98725c = j13;
        this.f98726d = i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f98723a == this.f98723a && cVar.f98724b == this.f98724b && cVar.f98725c == this.f98725c && cVar.f98726d == this.f98726d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98726d) + a.a.c(this.f98725c, a.a.a(this.f98724b, Float.hashCode(this.f98723a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb3.append(this.f98723a);
        sb3.append(",horizontalScrollPixels=");
        sb3.append(this.f98724b);
        sb3.append(",uptimeMillis=");
        sb3.append(this.f98725c);
        sb3.append(",deviceId=");
        return cb.l(sb3, this.f98726d, ')');
    }
}
