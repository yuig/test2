package androidx.media3.common.audio;

import b7.e;

/* loaded from: classes.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(e eVar) {
        this("Unhandled input format:", eVar);
    }

    public AudioProcessor$UnhandledAudioFormatException(String str, e eVar) {
        super(str + " " + eVar);
    }
}
