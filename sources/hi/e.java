package hi;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.os.Parcel;
import bb.p;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.internal.location.zzbf;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final p f69226a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f69227b = false;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f69228c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f69229d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f69230e = new HashMap();

    public e(p pVar) {
        this.f69226a = pVar;
    }

    public final void a() {
        synchronized (this.f69228c) {
            try {
                Iterator it = this.f69228c.values().iterator();
                while (it.hasNext()) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                }
                this.f69228c.clear();
            } finally {
            }
        }
        synchronized (this.f69230e) {
            try {
                for (f fVar : this.f69230e.values()) {
                    if (fVar != null) {
                        d dVar = (d) ((i) this.f69226a.f22464b).getService();
                        zzbf zzbfVar = new zzbf(2, null, null, null, fVar, null);
                        dVar.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(dVar.f141968c);
                        int i13 = k.f69236a;
                        obtain.writeInt(1);
                        zzbfVar.writeToParcel(obtain, 0);
                        dVar.j(obtain, 59);
                    }
                }
                this.f69230e.clear();
            } finally {
            }
        }
        synchronized (this.f69229d) {
            try {
                Iterator it2 = this.f69229d.values().iterator();
                while (it2.hasNext()) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it2.next());
                }
                this.f69229d.clear();
            } finally {
            }
        }
    }

    public final void b(zzbd zzbdVar, l lVar, li.a aVar) {
        f fVar;
        ((i) this.f69226a.f22464b).checkConnected();
        synchronized (this.f69230e) {
            try {
                f fVar2 = (f) this.f69230e.get(lVar.f30843c);
                if (fVar2 == null) {
                    fVar2 = new f(lVar);
                }
                fVar = fVar2;
                this.f69230e.put(lVar.f30843c, fVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        d dVar = (d) ((i) this.f69226a.f22464b).getService();
        zzbf zzbfVar = new zzbf(1, zzbdVar, null, null, fVar, aVar);
        dVar.getClass();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(dVar.f141968c);
        int i13 = k.f69236a;
        obtain.writeInt(1);
        zzbfVar.writeToParcel(obtain, 0);
        dVar.j(obtain, 59);
    }

    public final void c() {
        if (this.f69227b) {
            p pVar = this.f69226a;
            ((i) pVar.f22464b).checkConnected();
            d dVar = (d) ((i) pVar.f22464b).getService();
            dVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(dVar.f141968c);
            int i13 = k.f69236a;
            obtain.writeInt(0);
            dVar.j(obtain, 12);
            this.f69227b = false;
        }
    }
}
