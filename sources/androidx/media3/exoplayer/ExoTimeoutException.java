package androidx.media3.exoplayer;

/* loaded from: classes3.dex */
public final class ExoTimeoutException extends RuntimeException {
    public ExoTimeoutException(int i13) {
        super(i13 != 1 ? i13 != 2 ? i13 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
