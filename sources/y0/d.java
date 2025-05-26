package y0;

import android.util.Size;
import androidx.camera.core.impl.v2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f136303a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f136304b;

    /* renamed from: c, reason: collision with root package name */
    public v2 f136305c;

    /* renamed from: d, reason: collision with root package name */
    public Size f136306d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f136307e;

    /* renamed from: f, reason: collision with root package name */
    public f f136308f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f136309g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f136310h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f136311i;

    public final e a() {
        String str = this.f136303a == null ? " mimeType" : "";
        if (this.f136304b == null) {
            str = str.concat(" profile");
        }
        if (this.f136305c == null) {
            str = a.a.C(str, " inputTimebase");
        }
        if (this.f136306d == null) {
            str = a.a.C(str, " resolution");
        }
        if (this.f136307e == null) {
            str = a.a.C(str, " colorFormat");
        }
        if (this.f136308f == null) {
            str = a.a.C(str, " dataSpace");
        }
        if (this.f136309g == null) {
            str = a.a.C(str, " frameRate");
        }
        if (this.f136310h == null) {
            str = a.a.C(str, " IFrameInterval");
        }
        if (this.f136311i == null) {
            str = a.a.C(str, " bitrate");
        }
        if (str.isEmpty()) {
            return new e(this.f136303a, this.f136304b.intValue(), this.f136305c, this.f136306d, this.f136307e.intValue(), this.f136308f, this.f136309g.intValue(), this.f136310h.intValue(), this.f136311i.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
