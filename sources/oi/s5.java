package oi;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class s5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f95154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f95155c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f95156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f95157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f95158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k2 f95159g;

    public s5(k5 k5Var, AtomicReference atomicReference, String str, String str2, boolean z13) {
        this.f95153a = 0;
        this.f95159g = k5Var;
        this.f95157e = atomicReference;
        this.f95154b = null;
        this.f95155c = str;
        this.f95158f = str2;
        this.f95156d = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:10:0x0076). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f95153a;
        k2 k2Var = this.f95159g;
        Object obj = this.f95158f;
        Object obj2 = this.f95157e;
        switch (i13) {
            case 0:
                d6 m13 = ((u4) ((k5) k2Var).f24333a).m();
                m13.p();
                m13.w();
                zzo L = m13.L(false);
                m13.A(new i6(m13, (AtomicReference) obj2, this.f95155c, (String) obj, L, this.f95156d));
                return;
            default:
                String str = this.f95154b;
                Bundle bundle = new Bundle();
                try {
                    t3 t3Var = ((d6) k2Var).f94726d;
                    String str2 = this.f95155c;
                    if (t3Var == null) {
                        ((d6) k2Var).zzj().f95268f.a(str, str2, "Failed to get user properties; not connected to service");
                    } else {
                        com.bumptech.glide.d.t((zzo) obj2);
                        bundle = f7.A(t3Var.w(str, str2, this.f95156d, (zzo) obj2));
                        ((d6) k2Var).J();
                        k2Var = (d6) k2Var;
                        f7 o13 = k2Var.o();
                        com.google.android.gms.internal.measurement.u0 u0Var = (com.google.android.gms.internal.measurement.u0) obj;
                        o13.K(u0Var, bundle);
                        str = o13;
                        obj = u0Var;
                    }
                } catch (RemoteException e13) {
                    ((d6) k2Var).zzj().f95268f.a(str, e13, "Failed to get user properties; remote exception");
                } finally {
                    ((d6) k2Var).o().K((com.google.android.gms.internal.measurement.u0) obj, bundle);
                }
                return;
        }
    }

    public s5(d6 d6Var, String str, String str2, zzo zzoVar, boolean z13, com.google.android.gms.internal.measurement.u0 u0Var) {
        this.f95153a = 1;
        this.f95159g = d6Var;
        this.f95154b = str;
        this.f95155c = str2;
        this.f95157e = zzoVar;
        this.f95156d = z13;
        this.f95158f = u0Var;
    }
}
