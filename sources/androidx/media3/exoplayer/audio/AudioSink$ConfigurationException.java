package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.b;

/* loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final b f18793a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, b bVar) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.f18793a = bVar;
    }

    public AudioSink$ConfigurationException(String str, b bVar) {
        super(str);
        this.f18793a = bVar;
    }
}
