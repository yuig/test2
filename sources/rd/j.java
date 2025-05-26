package rd;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import c50.t1;
import com.google.android.engage.service.ClusterMetadata;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.r;
import com.google.protobuf.d2;
import com.google.protobuf.o1;
import com.google.protobuf.u;
import com.pinterest.ReleaseHiltApplication;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.c1;
import h32.f1;
import h32.i0;
import h32.v0;
import h32.w0;
import h6.q;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import me.t;
import nx.l0;
import nx.s;
import nx.t0;
import ok.d0;
import ok.e0;
import ok.v;
import ok.y;
import ok.z;
import pk.v2;
import pm.p;
import ps0.m;
import rl2.g0;
import so.oa;
import wd.w;
import zy.n;

/* loaded from: classes.dex */
public final class j implements ie.a, nd.d, zd.a, jh.b, jh.c, o, Continuation, yj.a, d0, p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107505a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f107506b;

    public j(int i13) {
        this.f107505a = i13;
        if (i13 == 12) {
            this.f107506b = com.google.android.gms.internal.recaptcha.k.INSTANCE;
        } else if (i13 != 18) {
            this.f107506b = new HashMap();
        } else {
            this.f107506b = new Bundle();
        }
    }

    public static final int J(AssetManager assetManager, File file) {
        int intValue = ((Integer) g0.o0(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        Log.d("SplitCompat", "addAssetPath completed with " + intValue);
        return intValue;
    }

    public static ByteArrayInputStream f(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int indexOf = str.indexOf(44);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, indexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public final void A(int i13, long j13) {
        ((u) this.f107506b).a0(i13, j13);
    }

    public final void B(int i13, d2 d2Var, Object obj) {
        ((u) this.f107506b).T(i13, (o1) obj, d2Var);
    }

    public final void C(int i13, int i14) {
        ((u) this.f107506b).N(i13, i14);
    }

    public final void D(int i13, long j13) {
        ((u) this.f107506b).P(i13, j13);
    }

    public final void E(int i13, int i14) {
        ((u) this.f107506b).Y(i13, (i14 >> 31) ^ (i14 << 1));
    }

    public final void F(int i13, long j13) {
        ((u) this.f107506b).a0(i13, (j13 >> 63) ^ (j13 << 1));
    }

    public final void G(int i13, int i14) {
        ((u) this.f107506b).Y(i13, i14);
    }

    public final void H(int i13, long j13) {
        ((u) this.f107506b).a0(i13, j13);
    }

    public final synchronized void I(Context context, HashSet hashSet) {
        AssetManager assets = context.getAssets();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            J(assets, (File) it.next());
        }
    }

    public final synchronized void a(t tVar) {
        Set<Map.Entry> set = null;
        if (!p001if.a.b(tVar)) {
            try {
                Set entrySet = tVar.f87022a.entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet, "events.entries");
                set = entrySet;
            } catch (Throwable th3) {
                p001if.a.a(tVar, th3);
            }
        }
        for (Map.Entry entry : set) {
            me.u k13 = k((me.b) entry.getKey());
            if (k13 != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    k13.a((me.e) it.next());
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void accept(Object obj, Object obj2) {
        yh.d dVar = (yh.d) ((yh.b) obj).getService();
        zza zzaVar = new zza(null, null);
        yh.g gVar = new yh.g((TaskCompletionSource) obj2);
        dVar.getClass();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i13 = yh.a.f139038a;
        obtain.writeInt(1);
        zzaVar.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(gVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f139039a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // yj.a
    public final void b(Typeface typeface) {
        com.google.android.material.internal.c cVar = (com.google.android.material.internal.c) this.f107506b;
        if (cVar.s(typeface)) {
            cVar.n(false);
        }
    }

    @Override // ok.d0
    public final Iterator c(e0 e0Var, CharSequence charSequence) {
        return new z(this, e0Var, charSequence);
    }

    @Override // ie.a
    public final Object create() {
        try {
            return new l(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // zd.a
    public final pd.g0 d(pd.g0 g0Var, nd.l lVar) {
        return w.e((Resources) this.f107506b, g0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.os.Parcelable, java.lang.Object] */
    public final Task g(xg.b bVar) {
        v yVar;
        xg.e eVar = (xg.e) this.f107506b;
        v2 v2Var = bVar.f134907a;
        int i13 = 0;
        if (v2Var.isEmpty()) {
            yVar = ok.a.f95409a;
        } else {
            xg.a aVar = new xg.a(2);
            for (int i14 = 0; i14 < v2Var.f100504d; i14++) {
                aVar.f134906a.e((Integer) v2Var.get(i14));
            }
            yVar = new y(new ClusterMetadata(aVar));
        }
        eVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("engage_sdk_version", eVar.f134916c);
        bundle.putString("calling_package_name", eVar.f134915b);
        if (yVar.c()) {
            bundle.putParcelable("cluster_metadata", yVar.b());
        }
        return eVar.b(new xg.j(eVar, bundle, i13)).onSuccessTask(r.INSTANCE, yg.e.f139008a);
    }

    public final Object h() {
        return new oa(new f0(), new vb0.i(3), new vb0.i(2), new q((ReleaseHiltApplication) this.f107506b), new m(27), new t1(29), new f0(), new f0(), new z50.a(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new z50.a(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new z50.a(), new f0(), new f0(), new f0(), new f0(), new z50.a(), new f0(), new vb0.e(3), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0(), new f0());
    }

    public final synchronized me.u i(me.b accessTokenAppIdPair) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        return (me.u) ((HashMap) this.f107506b).get(accessTokenAppIdPair);
    }

    public final synchronized int j() {
        int i13;
        int size;
        i13 = 0;
        for (me.u uVar : ((HashMap) this.f107506b).values()) {
            synchronized (uVar) {
                if (!p001if.a.b(uVar)) {
                    try {
                        size = uVar.f87026c.size();
                    } catch (Throwable th3) {
                        p001if.a.a(uVar, th3);
                    }
                }
                size = 0;
            }
            i13 += size;
        }
        return i13;
    }

    public final synchronized me.u k(me.b bVar) {
        Context a13;
        df.c q13;
        me.u uVar = (me.u) ((HashMap) this.f107506b).get(bVar);
        if (uVar == null && (q13 = wc.b.q((a13 = le.v.a()))) != null) {
            uVar = new me.u(q13, me.l.f86994b.p(a13));
        }
        if (uVar == null) {
            return null;
        }
        ((HashMap) this.f107506b).put(bVar, uVar);
        return uVar;
    }

    @Override // nd.d
    public final boolean l(Object obj, File file, nd.l lVar) {
        InputStream inputStream = (InputStream) obj;
        qd.i iVar = (qd.i) this.f107506b;
        byte[] bArr = (byte[]) iVar.c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e13) {
                        e = e13;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        iVar.h(bArr);
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        iVar.h(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                iVar.h(bArr);
                return true;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e14) {
            e = e14;
        }
    }

    public final synchronized Set m() {
        Set keySet;
        keySet = ((HashMap) this.f107506b).keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "stateMap.keys");
        return keySet;
    }

    public final void n(zy.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        t0 t0Var = (t0) this.f107506b;
        i0 i0Var = params.f143048a;
        w0 w0Var = params.f143053f;
        ((l0) t0Var).c(i0Var, params.f143049b, params.f143050c, params.f143052e, params.f143051d, w0Var != null ? new v0(w0Var) : null, params.f143054g, params.f143055h);
    }

    public final void o(n params) {
        h32.v2 v2Var;
        List list;
        List b13;
        List list2;
        Intrinsics.checkNotNullParameter(params, "params");
        t0 t0Var = (t0) this.f107506b;
        i0 context = params.f143090a;
        l0 l0Var = (l0) t0Var;
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        kg.a impressionType = params.f143091b;
        Intrinsics.checkNotNullParameter(impressionType, "impressionType");
        f1 eventType = params.f143092c;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        AdvertisingIdClient.Info a13 = l0Var.f92425f.a();
        String id3 = a13 != null ? a13.getId() : null;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        boolean z13 = impressionType instanceof s;
        HashMap hashMap = params.f143094e;
        if (!z13) {
            if (impressionType instanceof nx.r) {
                list2 = ((nx.r) impressionType).f92452f;
                v2Var = null;
                list = null;
                b13 = null;
            } else {
                if (impressionType instanceof nx.u) {
                    v2Var = ((nx.u) impressionType).f92468f;
                    list = null;
                } else if (impressionType instanceof nx.t) {
                    b13 = kotlin.collections.e0.b(((nx.t) impressionType).f92466f);
                    v2Var = null;
                    list = null;
                    list2 = null;
                } else {
                    v2Var = null;
                    list = null;
                }
                list2 = list;
            }
            t0.b(l0Var, context, eventType, params.f143093d, new c1(null, bool, list, bool2, bool, null, v2Var, null, null, null, null, null, null, null, list2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, b13, null, null, null, null, null, null, null, null, null, null, null, null, null, null), hashMap, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
        List list3 = ((s) impressionType).f92455f;
        if (hashMap != null && a13 != null && id3 != null && id3.length() != 0) {
            hashMap.put("advertising_identifier", id3);
            hashMap.put("advertising_tracking_enabled", String.valueOf(!a13.isLimitAdTrackingEnabled()));
        }
        list = list3;
        v2Var = null;
        list2 = null;
        b13 = list2;
        t0.b(l0Var, context, eventType, params.f143093d, new c1(null, bool, list, bool2, bool, null, v2Var, null, null, null, null, null, null, null, list2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, b13, null, null, null, null, null, null, null, null, null, null, null, null, null, null), hashMap, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
    }

    @Override // jh.b
    public final void onConnected(Bundle bundle) {
        ((com.google.android.gms.common.api.internal.e) this.f107506b).j();
    }

    @Override // jh.c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        ((com.google.android.gms.common.api.internal.n) this.f107506b).onConnectionFailed(connectionResult);
    }

    @Override // jh.b
    public final void onConnectionSuspended(int i13) {
        ((com.google.android.gms.common.api.internal.e) this.f107506b).onConnectionSuspended(i13);
    }

    public final void p(zy.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        t0 t0Var = (t0) this.f107506b;
        i0 context = params.f143048a;
        w0 w0Var = params.f143053f;
        v0 v0Var = w0Var != null ? new v0(w0Var) : null;
        l0 l0Var = (l0) t0Var;
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        f1 eventType = params.f143049b;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        dl2.b.Z2(context.f67084d, context.f67086f, t0.b(l0Var, context, eventType, params.f143050c, params.f143052e, params.f143051d, v0Var, params.f143054g, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN).f67324b);
    }

    public final void q(int i13, boolean z13) {
        ((u) this.f107506b).J(i13, z13);
    }

    public final void r(int i13, com.google.protobuf.l lVar) {
        ((u) this.f107506b).L(i13, lVar);
    }

    public final void s(int i13, double d2) {
        u uVar = (u) this.f107506b;
        uVar.getClass();
        uVar.P(i13, Double.doubleToRawLongBits(d2));
    }

    public final void t(int i13, int i14) {
        ((u) this.f107506b).R(i13, i14);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        yh.i iVar = (yh.i) this.f107506b;
        if (task.isSuccessful() || task.isCanceled()) {
            return task;
        }
        Exception exception = task.getException();
        if (!(exception instanceof ApiException)) {
            return task;
        }
        int statusCode = ((ApiException) exception).getStatusCode();
        return (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) ? iVar.f139048b.a() : statusCode == 43000 ? Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : statusCode != 15 ? task : Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    public final String toString() {
        switch (this.f107505a) {
            case 21:
                return ((Field) this.f107506b).toString();
            default:
                return super.toString();
        }
    }

    @Override // pm.p
    public final Object u() {
        Object obj = this.f107506b;
        try {
            return ((Constructor) obj).newInstance(new Object[0]);
        } catch (IllegalAccessException e13) {
            sm.c.c(e13);
            throw null;
        } catch (InstantiationException e14) {
            throw new RuntimeException("Failed to invoke constructor '" + sm.c.b((Constructor) obj) + "' with no args", e14);
        } catch (InvocationTargetException e15) {
            throw new RuntimeException("Failed to invoke constructor '" + sm.c.b((Constructor) obj) + "' with no args", e15.getCause());
        }
    }

    public final void v(int i13, int i14) {
        ((u) this.f107506b).N(i13, i14);
    }

    public final void w(int i13, long j13) {
        ((u) this.f107506b).P(i13, j13);
    }

    public final void x(int i13, float f13) {
        u uVar = (u) this.f107506b;
        uVar.getClass();
        uVar.N(i13, Float.floatToRawIntBits(f13));
    }

    public final void y(int i13, d2 d2Var, Object obj) {
        u uVar = (u) this.f107506b;
        uVar.X(i13, 3);
        d2Var.h((o1) obj, uVar.f34002p);
        uVar.X(i13, 4);
    }

    public final void z(int i13, int i14) {
        ((u) this.f107506b).R(i13, i14);
    }

    public j(Context context) {
        this.f107505a = 7;
        xg.e eVar = xg.e.f134913h;
        if (eVar == null || eVar.f134917d == null || !fi.j.a(context)) {
            synchronized (xg.e.class) {
                xg.e eVar2 = xg.e.f134913h;
                if (eVar2 == null || eVar2.f134917d == null || !fi.j.a(context)) {
                    xg.e.f134913h = new xg.e(context);
                }
            }
        }
        this.f107506b = xg.e.f134913h;
    }

    public /* synthetic */ j(Object obj, int i13) {
        this.f107505a = i13;
        this.f107506b = obj;
    }

    public j(l0 pinalyticsV2) {
        this.f107505a = 28;
        Intrinsics.checkNotNullParameter(pinalyticsV2, "pinalyticsV2");
        this.f107506b = pinalyticsV2;
    }

    public j(bf2.d analyticsApiProvider) {
        this.f107505a = 29;
        Intrinsics.checkNotNullParameter(analyticsApiProvider, "analyticsApiProvider");
        this.f107506b = analyticsApiProvider;
    }

    public j(se2.a apolloClientLazy) {
        this.f107505a = 26;
        Intrinsics.checkNotNullParameter(apolloClientLazy, "apolloClientLazy");
        this.f107506b = apolloClientLazy;
    }

    public j() {
        this.f107505a = 3;
        this.f107506b = new g(this);
    }

    public j(ob0.a crashReporter) {
        this.f107505a = 27;
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f107506b = crashReporter;
    }

    public j(Resources resources) {
        this.f107505a = 5;
        this.f107506b = resources;
    }

    public j(u uVar) {
        this.f107505a = 23;
        com.google.protobuf.w0.a(uVar, "output");
        this.f107506b = uVar;
        uVar.f34002p = this;
    }
}
