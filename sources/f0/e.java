package f0;

import android.database.Cursor;
import android.os.Bundle;
import androidx.room.EmptyResultSetException;
import bb.p;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.measurement.internal.zzam;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.play.core.splitinstall.SplitInstallException;
import ja.d0;
import ja.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import oi.a7;
import oi.c7;
import oi.f5;
import oi.g5;
import oi.g7;
import oi.k4;
import oi.m;
import oi.w4;

/* loaded from: classes2.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60731c;

    public /* synthetic */ e(int i13, Object obj, Object obj2) {
        this.f60729a = i13;
        this.f60731c = obj;
        this.f60730b = obj2;
    }

    public final Boolean a() {
        Cursor m03;
        int i13 = this.f60729a;
        boolean z13 = true;
        Boolean bool = null;
        Object obj = this.f60730b;
        Object obj2 = this.f60731c;
        switch (i13) {
            case 7:
                m03 = d7.b.m0(((w71.g) obj2).f128179a, (f0) obj, false);
                try {
                    if (m03.moveToFirst()) {
                        Integer valueOf = m03.isNull(0) ? null : Integer.valueOf(m03.getInt(0));
                        if (valueOf != null) {
                            if (valueOf.intValue() == 0) {
                                z13 = false;
                            }
                            bool = Boolean.valueOf(z13);
                        }
                    }
                    if (bool != null) {
                        return bool;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: ".concat(((f0) obj).c()));
                } finally {
                }
            default:
                m03 = d7.b.m0(((w71.i) obj2).f128188a, (f0) obj, false);
                try {
                    if (m03.moveToFirst()) {
                        Integer valueOf2 = m03.isNull(0) ? null : Integer.valueOf(m03.getInt(0));
                        if (valueOf2 != null) {
                            if (valueOf2.intValue() == 0) {
                                z13 = false;
                            }
                            bool = Boolean.valueOf(z13);
                        }
                    }
                    if (bool != null) {
                        return bool;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: ".concat(((f0) obj).c()));
                } finally {
                }
        }
    }

    public final void b() {
        d0 d0Var;
        int i13 = this.f60729a;
        Object obj = this.f60731c;
        Object obj2 = this.f60730b;
        switch (i13) {
            case 0:
                ((Runnable) obj2).run();
                return;
            case 5:
                xd0.f fVar = (xd0.f) obj;
                xd0.d dVar = fVar.f134612e;
                xd0.d dVar2 = fVar.f134612e;
                oa.i a13 = dVar.a();
                a13.c1(1, (String) obj2);
                try {
                    ((xd0.f) obj).f134608a.c();
                    try {
                        a13.G();
                        ((xd0.f) obj).f134608a.r();
                        return;
                    } finally {
                        ((xd0.f) obj).f134608a.m();
                    }
                } finally {
                    dVar2.j(a13);
                }
            case 6:
                w71.d dVar3 = (w71.d) obj;
                zd0.b bVar = dVar3.f128172e;
                zd0.b bVar2 = dVar3.f128172e;
                oa.i a14 = bVar.a();
                a14.c1(1, (String) obj2);
                try {
                    ((w71.d) obj).f128168a.c();
                    try {
                        a14.G();
                        ((w71.d) obj).f128168a.r();
                        return;
                    } finally {
                        ((w71.d) obj).f128168a.m();
                    }
                } finally {
                    bVar2.j(a14);
                }
            case 8:
                w71.g gVar = (w71.g) obj;
                d0 d0Var2 = gVar.f128179a;
                d0Var = gVar.f128179a;
                d0Var2.c();
                try {
                    w71.e eVar = ((w71.g) obj).f128180b;
                    List entities = (List) obj2;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(entities, "entities");
                    oa.i a15 = eVar.a();
                    try {
                        Iterator it = entities.iterator();
                        while (it.hasNext()) {
                            eVar.l(a15, it.next());
                            a15.Q0();
                        }
                        eVar.j(a15);
                        ((w71.g) obj).f128179a.r();
                        return;
                    } catch (Throwable th3) {
                        eVar.j(a15);
                        throw th3;
                    }
                } finally {
                    d0Var.m();
                }
            default:
                w71.g gVar2 = (w71.g) obj;
                zd0.b bVar3 = gVar2.f128184f;
                zd0.b bVar4 = gVar2.f128184f;
                oa.i a16 = bVar3.a();
                a16.c1(1, (String) obj2);
                try {
                    ((w71.g) obj).f128179a.c();
                    try {
                        a16.G();
                        ((w71.g) obj).f128179a.r();
                        return;
                    } finally {
                        d0Var = ((w71.g) obj).f128179a;
                    }
                } finally {
                    bVar4.j(a16);
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        int i13;
        int i14 = this.f60729a;
        Object obj = this.f60731c;
        Object obj2 = this.f60730b;
        Bundle bundle = null;
        switch (i14) {
            case 0:
                b();
                return null;
            case 1:
                w4 w4Var = (w4) obj;
                w4Var.f95246a.M();
                String str2 = ((zzo) obj2).f32044f;
                a7 a7Var = w4Var.f95246a;
                a7Var.zzl().p();
                a7Var.N();
                r8.a();
                k4 k4Var = a7Var.f94655a;
                a7.p(k4Var);
                if (k4Var.E(str2) != null) {
                    bundle = new Bundle();
                    g5 x13 = a7Var.x(str2);
                    Bundle bundle2 = new Bundle();
                    Iterator it = x13.f94791a.entrySet().iterator();
                    while (true) {
                        str = "denied";
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Boolean bool = (Boolean) entry.getValue();
                            if (bool != null) {
                                bundle2.putString(((f5) entry.getKey()).zze, bool.booleanValue() ? "granted" : "denied");
                            }
                        } else {
                            bundle.putAll(bundle2);
                            m c13 = a7Var.c(str2, a7Var.E(str2), x13, new p(26));
                            Bundle bundle3 = new Bundle();
                            for (Map.Entry entry2 : c13.f94946e.entrySet()) {
                                Boolean bool2 = (Boolean) entry2.getValue();
                                if (bool2 != null) {
                                    bundle3.putString(((f5) entry2.getKey()).zze, bool2.booleanValue() ? "granted" : "denied");
                                }
                            }
                            Boolean bool3 = c13.f94944c;
                            if (bool3 != null) {
                                bundle3.putString("is_dma_region", bool3.toString());
                            }
                            String str3 = c13.f94945d;
                            if (str3 != null) {
                                bundle3.putString("cps_display_str", str3);
                            }
                            bundle.putAll(bundle3);
                            c7 c7Var = a7Var.f94661g;
                            a7.p(c7Var);
                            if (!c7Var.Y(str2)) {
                                oi.i iVar = a7Var.f94657c;
                                a7.p(iVar);
                                g7 e03 = iVar.e0(str2, "_npa");
                                if (e03 == null ? k4Var.F(str2, f5.AD_PERSONALIZATION) : !e03.f94801e.equals(1L)) {
                                    str = "granted";
                                }
                            }
                            bundle.putString("ad_personalization", str);
                        }
                    }
                }
                return new zzam(bundle);
            case 2:
                w4 w4Var2 = (w4) obj;
                w4Var2.f95246a.M();
                oi.i iVar2 = w4Var2.f95246a.f94657c;
                a7.p(iVar2);
                return iVar2.i0((String) obj2);
            case 3:
                a7 a7Var2 = (a7) obj;
                zzo zzoVar = (zzo) obj2;
                String str4 = zzoVar.f32044f;
                com.bumptech.glide.d.t(str4);
                g5 x14 = a7Var2.x(str4);
                f5 f5Var = f5.ANALYTICS_STORAGE;
                if (x14.e(f5Var) && g5.c(100, zzoVar.A).e(f5Var)) {
                    return a7Var2.d(zzoVar).N();
                }
                a7Var2.zzj().f95276n.c("Analytics storage consent denied. Returning null app instance id");
                return null;
            case 4:
                jk.d dVar = (jk.d) obj2;
                qq2.c cVar = (qq2.c) obj;
                int i15 = mk.a.f87285p;
                if (dVar == null || (i13 = dVar.f76321b) == 0 || i13 == 5 || i13 == 6 || i13 == 7) {
                    return jk.d.a(dVar != null ? 1 + dVar.f76320a : 1, 1, 0, 0L, 0L, (List) cVar.f104883b, new ArrayList());
                }
                throw new SplitInstallException(-1);
            case 5:
                b();
                return null;
            case 6:
                b();
                return null;
            case 7:
                return a();
            case 8:
                b();
                return null;
            case 9:
                b();
                return null;
            default:
                return a();
        }
    }

    public final void finalize() {
        int i13 = this.f60729a;
        Object obj = this.f60730b;
        switch (i13) {
            case 7:
                ((f0) obj).e();
                break;
            case 10:
                ((f0) obj).e();
                break;
            default:
                super.finalize();
                break;
        }
    }

    public /* synthetic */ e(jk.d dVar, qq2.c cVar) {
        this.f60729a = 4;
        this.f60730b = dVar;
        this.f60731c = cVar;
    }
}
