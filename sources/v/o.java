package v;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import com.google.android.gms.internal.measurement.q4;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kh2.k3;
import kh2.n3;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f123578a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.a f123579b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.b f123580c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.p0 f123581d;

    /* renamed from: e, reason: collision with root package name */
    public final w.t f123582e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f123583f;

    /* renamed from: g, reason: collision with root package name */
    public final x1 f123584g;

    /* renamed from: h, reason: collision with root package name */
    public final long f123585h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f123586i = new HashMap();

    public o(Context context, androidx.camera.core.impl.b bVar, c0.s sVar, long j13) {
        String str;
        this.f123578a = context;
        this.f123580c = bVar;
        w.t a13 = w.t.a(context, bVar.f16806b);
        this.f123582e = a13;
        this.f123584g = x1.b(context);
        try {
            ArrayList arrayList = new ArrayList();
            q4 q4Var = a13.f126943a;
            q4Var.getClass();
            try {
                List<String> asList = Arrays.asList(((CameraManager) q4Var.f31594b).getCameraIdList());
                if (sVar == null) {
                    Iterator it = asList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                } else {
                    try {
                        str = n3.q(a13, sVar.b(), asList);
                    } catch (IllegalStateException unused) {
                        str = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : asList) {
                        if (!str2.equals(str)) {
                            arrayList2.add(b(str2));
                        }
                    }
                    Iterator it2 = sVar.a(arrayList2).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((androidx.camera.core.impl.h0) ((c0.r) it2.next())).c());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str3 = (String) it3.next();
                    if (str3.equals("0") || str3.equals(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE)) {
                        arrayList3.add(str3);
                    } else if (k3.n1(this.f123582e, str3)) {
                        arrayList3.add(str3);
                    } else {
                        kh2.m0.p("Camera2CameraFactory", "Camera " + str3 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                    }
                }
                this.f123583f = arrayList3;
                w.t tVar = this.f123582e;
                a0.a aVar = new a0.a();
                aVar.f202a = 0;
                aVar.f203b = tVar;
                aVar.f206e = new HashMap();
                aVar.f207f = new HashSet();
                aVar.f204c = new ArrayList();
                aVar.f205d = new ArrayList();
                Set hashSet = new HashSet();
                try {
                    hashSet = tVar.f126943a.s();
                } catch (CameraAccessExceptionCompat unused2) {
                    kh2.m0.s("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    ArrayList arrayList4 = new ArrayList((Set) it4.next());
                    if (arrayList4.size() >= 2) {
                        String str4 = (String) arrayList4.get(0);
                        String str5 = (String) arrayList4.get(1);
                        try {
                            if (k3.n1(tVar, str4) && k3.n1(tVar, str5)) {
                                ((Set) aVar.f207f).add(new HashSet(Arrays.asList(str4, str5)));
                                Map map = (Map) aVar.f206e;
                                if (!map.containsKey(str4)) {
                                    map.put(str4, new ArrayList());
                                }
                                if (!map.containsKey(str5)) {
                                    map.put(str5, new ArrayList());
                                }
                                ((List) map.get(str4)).add((String) arrayList4.get(1));
                                ((List) map.get(str5)).add((String) arrayList4.get(0));
                            }
                        } catch (InitializationException unused3) {
                            kh2.m0.p("Camera2CameraCoordinator", a.a.m("Concurrent camera id pair: (", str4, ", ", str5, ") is not backward compatible"));
                        }
                    }
                }
                this.f123579b = aVar;
                androidx.camera.core.impl.p0 p0Var = new androidx.camera.core.impl.p0(aVar);
                this.f123581d = p0Var;
                ((List) aVar.f204c).add(p0Var);
                this.f123585h = j13;
            } catch (CameraAccessException e13) {
                throw new CameraAccessExceptionCompat(e13);
            }
        } catch (CameraAccessExceptionCompat e14) {
            throw new InitializationException(new CameraUnavailableException(e14));
        } catch (CameraUnavailableException e15) {
            throw new InitializationException(e15);
        }
    }

    public final d0 a(String str) {
        if (!this.f123583f.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        h0 b13 = b(str);
        androidx.camera.core.impl.b bVar = this.f123580c;
        Executor executor = bVar.f16805a;
        return new d0(this.f123578a, this.f123582e, str, b13, this.f123579b, this.f123581d, executor, bVar.f16806b, this.f123584g, this.f123585h);
    }

    public final h0 b(String str) {
        HashMap hashMap = this.f123586i;
        try {
            h0 h0Var = (h0) hashMap.get(str);
            if (h0Var != null) {
                return h0Var;
            }
            h0 h0Var2 = new h0(this.f123582e, str);
            hashMap.put(str, h0Var2);
            return h0Var2;
        } catch (CameraAccessExceptionCompat e13) {
            throw new CameraUnavailableException(e13);
        }
    }
}
