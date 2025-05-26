package b7;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import d7.n0;
import v.k;

/* loaded from: classes3.dex */
public final class a implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f22019a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f22020b;

    public a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f22020b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        int i13 = n0.f53866a;
        this.f22019a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i13) {
        n0.c0(this.f22019a, new k(this, i13, 6));
    }
}
