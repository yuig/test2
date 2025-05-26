package ac2;

import android.content.Context;
import android.media.AudioManager;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1935a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f1936b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f1937c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f1938d;

    /* renamed from: e, reason: collision with root package name */
    public int f1939e;

    public b(Context context, AudioManager audioManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        this.f1935a = context;
        this.f1936b = audioManager;
        this.f1937c = new LinkedHashSet();
        this.f1938d = xk2.m.b(new tu1.u(this, 8));
        this.f1939e = audioManager.getStreamVolume(3);
    }

    public final void b(j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f1937c.add(listener);
        a aVar = (a) this.f1938d.getValue();
        if (aVar.f1932a) {
            return;
        }
        aVar.f1934c.f1935a.registerReceiver(aVar, aVar.f1933b, 2);
        aVar.f1932a = true;
    }

    public final int c() {
        return this.f1939e;
    }

    public final void d(j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        LinkedHashSet linkedHashSet = this.f1937c;
        linkedHashSet.remove(listener);
        if (linkedHashSet.isEmpty()) {
            a aVar = (a) this.f1938d.getValue();
            if (aVar.f1932a) {
                aVar.f1934c.f1935a.unregisterReceiver(aVar);
                aVar.f1932a = false;
            }
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i13) {
    }
}
