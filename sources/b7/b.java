package b7;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import d7.n0;
import java.util.Objects;
import v.f1;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f22021a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f22022b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f22023c;

    /* renamed from: d, reason: collision with root package name */
    public final a7.f f22024d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22025e;

    /* renamed from: f, reason: collision with root package name */
    public final AudioFocusRequest f22026f;

    public b(int i13, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, a7.f fVar, boolean z13) {
        this.f22021a = i13;
        this.f22023c = handler;
        this.f22024d = fVar;
        this.f22025e = z13;
        int i14 = n0.f53866a;
        if (i14 < 26) {
            this.f22022b = new a(onAudioFocusChangeListener, handler);
        } else {
            this.f22022b = onAudioFocusChangeListener;
        }
        if (i14 >= 26) {
            this.f22026f = new AudioFocusRequest.Builder(i13).setAudioAttributes((AudioAttributes) fVar.a().f66449b).setWillPauseWhenDucked(z13).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f22026f = null;
        }
    }

    public final f1 a() {
        return new f1(this, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f22021a == bVar.f22021a && this.f22025e == bVar.f22025e && Objects.equals(this.f22022b, bVar.f22022b) && Objects.equals(this.f22023c, bVar.f22023c) && Objects.equals(this.f22024d, bVar.f22024d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22021a), this.f22022b, this.f22023c, this.f22024d, Boolean.valueOf(this.f22025e));
    }
}
