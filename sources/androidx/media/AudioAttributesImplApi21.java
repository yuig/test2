package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: classes3.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f18728a;

    /* renamed from: b, reason: collision with root package name */
    public int f18729b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f18728a.equals(((AudioAttributesImplApi21) obj).f18728a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18728a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f18728a;
    }
}
