package oi;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzo;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class i6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f94854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f94855b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f94856c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f94857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzo f94858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f94859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d6 f94860g;

    public i6(d6 d6Var, AtomicReference atomicReference, String str, String str2, zzo zzoVar, boolean z13) {
        this.f94860g = d6Var;
        this.f94854a = atomicReference;
        this.f94856c = str;
        this.f94857d = str2;
        this.f94858e = zzoVar;
        this.f94859f = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d6 d6Var;
        t3 t3Var;
        synchronized (this.f94854a) {
            try {
                d6Var = this.f94860g;
                t3Var = d6Var.f94726d;
            } catch (RemoteException e13) {
                this.f94860g.zzj().f95268f.d("(legacy) Failed to get user properties; remote exception", y3.v(this.f94855b), this.f94856c, e13);
                this.f94854a.set(Collections.emptyList());
            } finally {
                this.f94854a.notify();
            }
            if (t3Var == null) {
                d6Var.zzj().f95268f.d("(legacy) Failed to get user properties; not connected to service", y3.v(this.f94855b), this.f94856c, this.f94857d);
                this.f94854a.set(Collections.emptyList());
                return;
            }
            if (TextUtils.isEmpty(this.f94855b)) {
                com.bumptech.glide.d.t(this.f94858e);
                this.f94854a.set(t3Var.w(this.f94856c, this.f94857d, this.f94859f, this.f94858e));
            } else {
                this.f94854a.set(t3Var.d(this.f94855b, this.f94856c, this.f94857d, this.f94859f));
            }
            this.f94860g.J();
        }
    }
}
