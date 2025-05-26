package y0;

import android.media.MediaFormat;
import android.util.Size;
import androidx.camera.core.impl.v2;

/* loaded from: classes2.dex */
public final class e implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f136320a;

    /* renamed from: b, reason: collision with root package name */
    public final int f136321b;

    /* renamed from: c, reason: collision with root package name */
    public final v2 f136322c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f136323d;

    /* renamed from: e, reason: collision with root package name */
    public final int f136324e;

    /* renamed from: f, reason: collision with root package name */
    public final f f136325f;

    /* renamed from: g, reason: collision with root package name */
    public final int f136326g;

    /* renamed from: h, reason: collision with root package name */
    public final int f136327h;

    /* renamed from: i, reason: collision with root package name */
    public final int f136328i;

    public e(String str, int i13, v2 v2Var, Size size, int i14, f fVar, int i15, int i16, int i17) {
        this.f136320a = str;
        this.f136321b = i13;
        this.f136322c = v2Var;
        this.f136323d = size;
        this.f136324e = i14;
        this.f136325f = fVar;
        this.f136326g = i15;
        this.f136327h = i16;
        this.f136328i = i17;
    }

    public static d d() {
        d dVar = new d();
        dVar.f136304b = -1;
        dVar.f136310h = 1;
        dVar.f136307e = 2130708361;
        dVar.f136308f = f.f136330d;
        return dVar;
    }

    @Override // y0.o
    public final MediaFormat a() {
        Size size = this.f136323d;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.f136320a, size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", this.f136324e);
        createVideoFormat.setInteger("bitrate", this.f136328i);
        createVideoFormat.setInteger("frame-rate", this.f136326g);
        createVideoFormat.setInteger("i-frame-interval", this.f136327h);
        int i13 = this.f136321b;
        if (i13 != -1) {
            createVideoFormat.setInteger("profile", i13);
        }
        f fVar = this.f136325f;
        int i14 = fVar.f136334a;
        if (i14 != 0) {
            createVideoFormat.setInteger("color-standard", i14);
        }
        int i15 = fVar.f136335b;
        if (i15 != 0) {
            createVideoFormat.setInteger("color-transfer", i15);
        }
        int i16 = fVar.f136336c;
        if (i16 != 0) {
            createVideoFormat.setInteger("color-range", i16);
        }
        return createVideoFormat;
    }

    @Override // y0.o
    public final String b() {
        return this.f136320a;
    }

    @Override // y0.o
    public final v2 c() {
        return this.f136322c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f136320a.equals(eVar.f136320a) && this.f136321b == eVar.f136321b && this.f136322c.equals(eVar.f136322c) && this.f136323d.equals(eVar.f136323d) && this.f136324e == eVar.f136324e && this.f136325f.equals(eVar.f136325f) && this.f136326g == eVar.f136326g && this.f136327h == eVar.f136327h && this.f136328i == eVar.f136328i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f136320a.hashCode() ^ 1000003) * 1000003) ^ this.f136321b) * 1000003) ^ this.f136322c.hashCode()) * 1000003) ^ this.f136323d.hashCode()) * 1000003) ^ this.f136324e) * 1000003) ^ this.f136325f.hashCode()) * 1000003) ^ this.f136326g) * 1000003) ^ this.f136327h) * 1000003) ^ this.f136328i;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb3.append(this.f136320a);
        sb3.append(", profile=");
        sb3.append(this.f136321b);
        sb3.append(", inputTimebase=");
        sb3.append(this.f136322c);
        sb3.append(", resolution=");
        sb3.append(this.f136323d);
        sb3.append(", colorFormat=");
        sb3.append(this.f136324e);
        sb3.append(", dataSpace=");
        sb3.append(this.f136325f);
        sb3.append(", frameRate=");
        sb3.append(this.f136326g);
        sb3.append(", IFrameInterval=");
        sb3.append(this.f136327h);
        sb3.append(", bitrate=");
        return a.a.n(sb3, this.f136328i, "}");
    }
}
