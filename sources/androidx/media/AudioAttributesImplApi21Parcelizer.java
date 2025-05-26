package androidx.media;

import android.media.AudioAttributes;
import wa.a;
import wa.b;

/* loaded from: classes3.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f18728a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f18728a, 1);
        audioAttributesImplApi21.f18729b = aVar.f(audioAttributesImplApi21.f18729b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f18728a;
        aVar.i(1);
        ((b) aVar).f128611e.writeParcelable(audioAttributes, 0);
        aVar.j(audioAttributesImplApi21.f18729b, 2);
    }
}
