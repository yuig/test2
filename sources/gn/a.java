package gn;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import bk.q;
import com.google.android.gms.common.api.d;
import fn.i;
import hn.c;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f65795a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f65796b;

    /* renamed from: c, reason: collision with root package name */
    public final d f65797c;

    /* renamed from: d, reason: collision with root package name */
    public final q f65798d;

    /* renamed from: e, reason: collision with root package name */
    public float f65799e;

    public a(Handler handler, Context context, d dVar, q qVar) {
        super(handler);
        this.f65795a = context;
        this.f65796b = (AudioManager) context.getSystemService("audio");
        this.f65797c = dVar;
        this.f65798d = qVar;
    }

    public final float a() {
        AudioManager audioManager = this.f65796b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        this.f65797c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f13 = streamVolume / streamMaxVolume;
        if (f13 > 1.0f) {
            return 1.0f;
        }
        return f13;
    }

    public final void b() {
        float f13 = this.f65799e;
        q qVar = this.f65798d;
        qVar.f23105a = f13;
        if (((c) qVar.f23109e) == null) {
            qVar.f23109e = c.f69594c;
        }
        Iterator it = Collections.unmodifiableCollection(((c) qVar.f23109e).f69596b).iterator();
        while (it.hasNext()) {
            ((i) it.next()).f62595e.a(f13);
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z13) {
        super.onChange(z13);
        float a13 = a();
        if (a13 != this.f65799e) {
            this.f65799e = a13;
            b();
        }
    }
}
