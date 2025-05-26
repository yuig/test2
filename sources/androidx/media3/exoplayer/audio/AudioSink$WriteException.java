package androidx.media3.exoplayer.audio;

import a.a;
import androidx.media3.common.b;

/* loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f18796a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18797b;

    /* renamed from: c, reason: collision with root package name */
    public final b f18798c;

    public AudioSink$WriteException(int i13, b bVar, boolean z13) {
        super(a.d("AudioTrack write failed: ", i13));
        this.f18797b = z13;
        this.f18796a = i13;
        this.f18798c = bVar;
    }
}
