package o7;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f93043a = new Handler(Looper.myLooper());

    /* renamed from: b, reason: collision with root package name */
    public final d0 f93044b = new d0(this);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f93045c;

    public e0(f0 f0Var) {
        this.f93045c = f0Var;
    }

    public final void a(AudioTrack audioTrack) {
        Handler handler = this.f93043a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new m7.r(handler, 1), this.f93044b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f93044b);
        this.f93043a.removeCallbacksAndMessages(null);
    }
}
