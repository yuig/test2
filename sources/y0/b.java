package y0;

import androidx.camera.core.impl.v2;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f136259a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f136260b;

    /* renamed from: c, reason: collision with root package name */
    public v2 f136261c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f136262d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f136263e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f136264f;

    public final c a() {
        String str = this.f136259a == null ? " mimeType" : "";
        if (this.f136260b == null) {
            str = str.concat(" profile");
        }
        if (this.f136261c == null) {
            str = a.a.C(str, " inputTimebase");
        }
        if (this.f136262d == null) {
            str = a.a.C(str, " bitrate");
        }
        if (this.f136263e == null) {
            str = a.a.C(str, " sampleRate");
        }
        if (this.f136264f == null) {
            str = a.a.C(str, " channelCount");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        String str2 = this.f136259a;
        int intValue = this.f136260b.intValue();
        c cVar = new c(str2, intValue, this.f136261c, this.f136262d.intValue(), this.f136263e.intValue(), this.f136264f.intValue());
        if (Objects.equals(str2, "audio/mp4a-latm") && intValue == -1) {
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }
        return cVar;
    }
}
