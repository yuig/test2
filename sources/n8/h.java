package n8;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.ExoPlaybackException;
import d7.n0;

/* loaded from: classes3.dex */
public final class h implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f89811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f89812b;

    public h(i iVar, x7.l lVar) {
        this.f89812b = iVar;
        Handler n13 = n0.n(this);
        this.f89811a = n13;
        lVar.e(this, n13);
    }

    public final void a(long j13) {
        i iVar = this.f89812b;
        if (this != iVar.f89831m1 || iVar.L == null) {
            return;
        }
        if (j13 == Long.MAX_VALUE) {
            iVar.f134094w0 = true;
            return;
        }
        try {
            iVar.W0(j13);
        } catch (ExoPlaybackException e13) {
            iVar.f134096x0 = e13;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i13 = message.arg1;
        int i14 = message.arg2;
        int i15 = n0.f53866a;
        a(((i13 & 4294967295L) << 32) | (4294967295L & i14));
        return true;
    }
}
