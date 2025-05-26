package n0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f88733a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88734b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88735c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f88736d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f88737e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88738f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f88739g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f88740h;

    public c(UUID uuid, int i13, int i14, Rect rect, Size size, int i15, boolean z13) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f88733a = uuid;
        this.f88734b = i13;
        this.f88735c = i14;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f88736d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f88737e = size;
        this.f88738f = i15;
        this.f88739g = z13;
        this.f88740h = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f88733a.equals(cVar.f88733a) && this.f88734b == cVar.f88734b && this.f88735c == cVar.f88735c && this.f88736d.equals(cVar.f88736d) && this.f88737e.equals(cVar.f88737e) && this.f88738f == cVar.f88738f && this.f88739g == cVar.f88739g && this.f88740h == cVar.f88740h;
    }

    public final int hashCode() {
        return ((((((((((((((this.f88733a.hashCode() ^ 1000003) * 1000003) ^ this.f88734b) * 1000003) ^ this.f88735c) * 1000003) ^ this.f88736d.hashCode()) * 1000003) ^ this.f88737e.hashCode()) * 1000003) ^ this.f88738f) * 1000003) ^ (this.f88739g ? 1231 : 1237)) * 1000003) ^ (this.f88740h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OutConfig{getUuid=");
        sb3.append(this.f88733a);
        sb3.append(", getTargets=");
        sb3.append(this.f88734b);
        sb3.append(", getFormat=");
        sb3.append(this.f88735c);
        sb3.append(", getCropRect=");
        sb3.append(this.f88736d);
        sb3.append(", getSize=");
        sb3.append(this.f88737e);
        sb3.append(", getRotationDegrees=");
        sb3.append(this.f88738f);
        sb3.append(", isMirroring=");
        sb3.append(this.f88739g);
        sb3.append(", shouldRespectInputCropRect=");
        return a.a.r(sb3, this.f88740h, "}");
    }
}
