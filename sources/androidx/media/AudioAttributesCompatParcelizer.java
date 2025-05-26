package androidx.media;

import wa.a;
import wa.c;

/* loaded from: classes3.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVar = audioAttributesCompat.f18727a;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        audioAttributesCompat.f18727a = (AudioAttributesImpl) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f18727a;
        aVar.i(1);
        aVar.k(audioAttributesImpl);
    }
}
