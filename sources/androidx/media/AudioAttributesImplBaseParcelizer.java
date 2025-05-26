package androidx.media;

import wa.a;

/* loaded from: classes3.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f18730a = aVar.f(audioAttributesImplBase.f18730a, 1);
        audioAttributesImplBase.f18731b = aVar.f(audioAttributesImplBase.f18731b, 2);
        audioAttributesImplBase.f18732c = aVar.f(audioAttributesImplBase.f18732c, 3);
        audioAttributesImplBase.f18733d = aVar.f(audioAttributesImplBase.f18733d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f18730a, 1);
        aVar.j(audioAttributesImplBase.f18731b, 2);
        aVar.j(audioAttributesImplBase.f18732c, 3);
        aVar.j(audioAttributesImplBase.f18733d, 4);
    }
}
