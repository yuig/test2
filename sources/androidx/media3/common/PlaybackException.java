package androidx.media3.common;

import a.cb;
import d7.n0;

/* loaded from: classes.dex */
public class PlaybackException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f18745a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18746b;

    static {
        cb.s(0, 1, 2, 3, 4);
        n0.Q(5);
    }

    public PlaybackException(String str, Throwable th3, int i13, long j13) {
        super(str, th3);
        this.f18745a = i13;
        this.f18746b = j13;
    }
}
