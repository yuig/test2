package o7;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import d7.n0;
import java.util.Objects;
import m7.u0;
import m7.u1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f93033a;

    /* renamed from: b, reason: collision with root package name */
    public final t f93034b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f93035c;

    /* renamed from: d, reason: collision with root package name */
    public final c f93036d;

    /* renamed from: e, reason: collision with root package name */
    public final d7.a0 f93037e;

    /* renamed from: f, reason: collision with root package name */
    public final d f93038f;

    /* renamed from: g, reason: collision with root package name */
    public b f93039g;

    /* renamed from: h, reason: collision with root package name */
    public h1.b f93040h;

    /* renamed from: i, reason: collision with root package name */
    public a7.f f93041i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f93042j;

    public e(Context context, t tVar, a7.f fVar, h1.b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f93033a = applicationContext;
        this.f93034b = tVar;
        this.f93041i = fVar;
        this.f93040h = bVar;
        Handler o13 = n0.o(null);
        this.f93035c = o13;
        this.f93036d = n0.f53866a >= 23 ? new c(this) : null;
        this.f93037e = new d7.a0(this);
        b bVar2 = b.f93019c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f93038f = uriFor != null ? new d(this, o13, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(b bVar) {
        u1 u1Var;
        boolean z13;
        k8.x xVar;
        if (!this.f93042j || bVar.equals(this.f93039g)) {
            return;
        }
        this.f93039g = bVar;
        f0 f0Var = this.f93034b.f93193a;
        f0Var.getClass();
        Looper myLooper = Looper.myLooper();
        Looper looper = f0Var.f93066g0;
        if (looper != myLooper) {
            throw new IllegalStateException(a.a.m("Current looper (", myLooper == null ? "null" : myLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        b bVar2 = f0Var.f93086x;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        f0Var.f93086x = bVar;
        h1.b bVar3 = f0Var.f93081s;
        if (bVar3 != null) {
            h0 h0Var = (h0) bVar3.f66449b;
            synchronized (h0Var.f86170a) {
                u1Var = h0Var.f86186q;
            }
            if (u1Var != null) {
                k8.q qVar = (k8.q) u1Var;
                synchronized (qVar.f78566c) {
                    z13 = qVar.f78569f.U;
                }
                if (!z13 || (xVar = qVar.f78582a) == null) {
                    return;
                }
                ((u0) xVar).f86417h.f(26);
            }
        }
    }

    public final void b(a7.f fVar) {
        this.f93041i = fVar;
        a(b.b(this.f93033a, fVar, this.f93040h));
    }

    public final void c(AudioDeviceInfo audioDeviceInfo) {
        h1.b bVar = this.f93040h;
        if (Objects.equals(audioDeviceInfo, bVar == null ? null : (AudioDeviceInfo) bVar.f66449b)) {
            return;
        }
        h1.b bVar2 = audioDeviceInfo != null ? new h1.b(audioDeviceInfo, 17) : null;
        this.f93040h = bVar2;
        a(b.b(this.f93033a, this.f93041i, bVar2));
    }
}
