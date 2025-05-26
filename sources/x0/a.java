package x0;

import androidx.camera.core.impl.f;
import kh2.g0;

/* loaded from: classes2.dex */
public final class a extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f131263a;

    /* renamed from: b, reason: collision with root package name */
    public final int f131264b;

    /* renamed from: c, reason: collision with root package name */
    public final f f131265c;

    public a(String str, int i13, f fVar) {
        this.f131263a = str;
        this.f131264b = i13;
        this.f131265c = fVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f131263a.equals(aVar.f131263a) && this.f131264b == aVar.f131264b) {
            f fVar = aVar.f131265c;
            f fVar2 = this.f131265c;
            if (fVar2 == null) {
                if (fVar == null) {
                    return true;
                }
            } else if (fVar2.equals(fVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f131263a.hashCode() ^ 1000003) * 1000003) ^ this.f131264b) * 1000003;
        f fVar = this.f131265c;
        return hashCode ^ (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.f131263a + ", profile=" + this.f131264b + ", compatibleVideoProfile=" + this.f131265c + "}";
    }
}
