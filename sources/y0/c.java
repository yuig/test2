package y0;

import android.media.MediaFormat;
import androidx.camera.core.impl.v2;

/* loaded from: classes2.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f136271a;

    /* renamed from: b, reason: collision with root package name */
    public final int f136272b;

    /* renamed from: c, reason: collision with root package name */
    public final v2 f136273c;

    /* renamed from: d, reason: collision with root package name */
    public final int f136274d;

    /* renamed from: e, reason: collision with root package name */
    public final int f136275e;

    /* renamed from: f, reason: collision with root package name */
    public final int f136276f;

    public c(String str, int i13, v2 v2Var, int i14, int i15, int i16) {
        this.f136271a = str;
        this.f136272b = i13;
        this.f136273c = v2Var;
        this.f136274d = i14;
        this.f136275e = i15;
        this.f136276f = i16;
    }

    @Override // y0.o
    public final MediaFormat a() {
        int i13 = this.f136275e;
        int i14 = this.f136276f;
        String str = this.f136271a;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i13, i14);
        createAudioFormat.setInteger("bitrate", this.f136274d);
        int i15 = this.f136272b;
        if (i15 != -1) {
            if (str.equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", i15);
            } else {
                createAudioFormat.setInteger("profile", i15);
            }
        }
        return createAudioFormat;
    }

    @Override // y0.o
    public final String b() {
        return this.f136271a;
    }

    @Override // y0.o
    public final v2 c() {
        return this.f136273c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f136271a.equals(cVar.f136271a) && this.f136272b == cVar.f136272b && this.f136273c.equals(cVar.f136273c) && this.f136274d == cVar.f136274d && this.f136275e == cVar.f136275e && this.f136276f == cVar.f136276f;
    }

    public final int hashCode() {
        return ((((((((((this.f136271a.hashCode() ^ 1000003) * 1000003) ^ this.f136272b) * 1000003) ^ this.f136273c.hashCode()) * 1000003) ^ this.f136274d) * 1000003) ^ this.f136275e) * 1000003) ^ this.f136276f;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb3.append(this.f136271a);
        sb3.append(", profile=");
        sb3.append(this.f136272b);
        sb3.append(", inputTimebase=");
        sb3.append(this.f136273c);
        sb3.append(", bitrate=");
        sb3.append(this.f136274d);
        sb3.append(", sampleRate=");
        sb3.append(this.f136275e);
        sb3.append(", channelCount=");
        return a.a.n(sb3, this.f136276f, "}");
    }
}
