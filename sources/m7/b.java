package m7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f86093a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.o f86094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f86095c;

    public b(c cVar, d7.i0 i0Var, i0 i0Var2) {
        this.f86095c = cVar;
        this.f86094b = i0Var;
        this.f86093a = i0Var2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            ((d7.i0) this.f86094b).d(new u0.n(this, 10));
        }
    }
}
