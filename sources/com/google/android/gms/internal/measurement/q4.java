package com.google.android.gms.internal.measurement;

import a.jg;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.WindowInsetsAnimation;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.bugsnag.android.ErrorType;
import com.bugsnag.android.NativeInterface;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public class q4 implements o4, androidx.camera.core.impl.u1, androidx.camera.core.impl.c1, v7.q, n8.b0, q8.k, androidx.recyclerview.widget.o3, wd.n, Continuation, com.google.android.gms.common.api.internal.o {

    /* renamed from: d */
    public static q4 f31592d;

    /* renamed from: a */
    public final /* synthetic */ int f31593a;

    /* renamed from: b */
    public Object f31594b;

    /* renamed from: c */
    public Object f31595c;

    public /* synthetic */ q4(int i13, Object obj, Object obj2) {
        this.f31593a = i13;
        this.f31594b = obj;
        this.f31595c = obj2;
    }

    public static synchronized void C() {
        synchronized (q4.class) {
            try {
                q4 q4Var = f31592d;
                if (q4Var != null) {
                    Object obj = q4Var.f31594b;
                    if (((Context) obj) != null && ((ContentObserver) q4Var.f31595c) != null) {
                        ((Context) obj).getContentResolver().unregisterContentObserver((ContentObserver) f31592d.f31595c);
                    }
                }
                f31592d = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static com.bugsnag.android.s2 q(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            com.bugsnag.android.r2 r2Var = new com.bugsnag.android.r2();
            Object obj = map.get("method");
            ErrorType errorType = null;
            r2Var.f29466a = obj instanceof String ? (String) obj : null;
            Object obj2 = map.get("file");
            r2Var.f29467b = obj2 instanceof String ? (String) obj2 : null;
            com.bugsnag.android.repackaged.dslplatform.json.k kVar = hd.l.f68841a;
            r2Var.f29468c = hd.l.b(map.get("lineNumber"));
            Object obj3 = map.get("inProject");
            r2Var.f29469d = obj3 instanceof Boolean ? (Boolean) obj3 : null;
            Object obj4 = map.get("columnNumber");
            r2Var.f29471f = obj4 instanceof Number ? (Number) obj4 : null;
            r2Var.f29472g = hd.l.b(map.get("frameAddress"));
            r2Var.f29473h = hd.l.b(map.get("symbolAddress"));
            r2Var.f29474i = hd.l.b(map.get("loadAddress"));
            Object obj5 = map.get("codeIdentifier");
            r2Var.f29475j = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = map.get("isPC");
            r2Var.f29476k = obj6 instanceof Boolean ? (Boolean) obj6 : null;
            Object obj7 = map.get("code");
            r2Var.f29470e = obj7 instanceof Map ? (Map) obj7 : null;
            Object obj8 = map.get("type");
            String str = obj8 instanceof String ? (String) obj8 : null;
            if (str != null) {
                ErrorType.Companion.getClass();
                errorType = com.bugsnag.android.v0.a(str);
            }
            r2Var.f29477l = errorType;
            arrayList.add(r2Var);
        }
        return new com.bugsnag.android.s2(arrayList);
    }

    public static Long w(String str) {
        if (str.length() != 16) {
            return null;
        }
        try {
            String substring = str.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            long parseLong = Long.parseLong(substring, CharsKt.checkRadix(16)) << 56;
            String substring2 = str.substring(2);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            return Long.valueOf(Long.parseLong(substring2, CharsKt.checkRadix(16)) | parseLong);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Date A(String str) {
        if (str.length() > 0 && str.charAt(0) == 't') {
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            Long h03 = StringsKt.h0(substring);
            if (h03 != null) {
                return new Date(h03.longValue());
            }
        }
        try {
            return hd.e.a(str);
        } catch (IllegalArgumentException unused) {
            Object obj = ((a.g) this.f31595c).get();
            Intrinsics.f(obj);
            Date parse = ((DateFormat) obj).parse(str);
            if (parse != null) {
                return parse;
            }
            throw new IllegalArgumentException(Intrinsics.n(str, "cannot parse date "));
        }
    }

    public void B(v.w wVar) {
        w.s sVar;
        if (wVar != null) {
            w.x xVar = (w.x) this.f31595c;
            synchronized (xVar.f126945a) {
                sVar = (w.s) xVar.f126945a.remove(wVar);
            }
        } else {
            sVar = null;
        }
        if (sVar != null) {
            synchronized (sVar.f126941c) {
                sVar.f126942d = true;
            }
        }
        ((CameraManager) this.f31594b).unregisterAvailabilityCallback(sVar);
    }

    @Override // androidx.camera.core.impl.u1
    public final void a(androidx.camera.core.impl.t1 t1Var, Executor executor) {
        synchronized (((Map) this.f31595c)) {
            androidx.camera.core.impl.n1 n1Var = (androidx.camera.core.impl.n1) ((Map) this.f31595c).get(t1Var);
            if (n1Var != null) {
                n1Var.f16921a.set(false);
            }
            androidx.camera.core.impl.n1 n1Var2 = new androidx.camera.core.impl.n1(t1Var, executor);
            ((Map) this.f31595c).put(t1Var, n1Var2);
            l3.c.H0().execute(new a.a4(this, n1Var, n1Var2, 6));
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void accept(Object obj, Object obj2) {
        ai.b bVar = new ai.b((TaskCompletionSource) obj2);
        ai.p pVar = (ai.p) ((ai.o) obj).getService();
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) this.f31595c;
        com.bumptech.glide.d.t(savePasswordRequest);
        Parcel C = pVar.C();
        int i13 = ai.l.f15231a;
        C.writeStrongBinder(bVar);
        ai.l.c(C, savePasswordRequest);
        pVar.D(C, 2);
    }

    @Override // androidx.camera.core.impl.c1
    public final boolean b(int i13) {
        return t(i13) != null;
    }

    @Override // androidx.camera.core.impl.u1
    public final com.google.common.util.concurrent.c0 c() {
        return com.bumptech.glide.d.L(new a.z0(this, 12));
    }

    @Override // wd.n
    public final void d(Bitmap bitmap, qd.d dVar) {
        IOException iOException = ((he.f) this.f31595c).f68945b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            dVar.b(bitmap);
            throw iOException;
        }
    }

    @Override // androidx.recyclerview.widget.o3
    public final void dispose() {
        t7.w wVar = (t7.w) this.f31595c;
        androidx.recyclerview.widget.i1 i1Var = (androidx.recyclerview.widget.i1) this.f31594b;
        for (int size = wVar.f116612a.size() - 1; size >= 0; size--) {
            List list = (List) wVar.f116612a.valueAt(size);
            if (list.remove(i1Var) && list.isEmpty()) {
                wVar.f116612a.removeAt(size);
            }
        }
    }

    @Override // q8.k
    public final q8.j e(q8.t tVar, long j13) {
        q8.j jVar;
        long h10 = tVar.h();
        int min = (int) Math.min(20000L, tVar.getLength() - h10);
        ((d7.d0) this.f31595c).H(min);
        tVar.s(((d7.d0) this.f31595c).f53806a, 0, min);
        d7.d0 d0Var = (d7.d0) this.f31595c;
        int i13 = -1;
        int i14 = -1;
        long j14 = -9223372036854775807L;
        while (d0Var.a() >= 4) {
            if (pk.d1.d(d0Var.f53807b, d0Var.f53806a) != 442) {
                d0Var.L(1);
            } else {
                d0Var.L(4);
                long c13 = v9.y.c(d0Var);
                if (c13 != -9223372036854775807L) {
                    long b13 = ((d7.k0) this.f31594b).b(c13);
                    if (b13 > j13) {
                        if (j14 == -9223372036854775807L) {
                            return new q8.j(-1, b13, h10);
                        }
                        jVar = new q8.j(0, -9223372036854775807L, h10 + i14);
                    } else if (100000 + b13 > j13) {
                        jVar = new q8.j(0, -9223372036854775807L, h10 + d0Var.f53807b);
                    } else {
                        i14 = d0Var.f53807b;
                        j14 = b13;
                    }
                    return jVar;
                }
                int i15 = d0Var.f53808c;
                if (d0Var.a() >= 10) {
                    d0Var.L(9);
                    int y13 = d0Var.y() & 7;
                    if (d0Var.a() >= y13) {
                        d0Var.L(y13);
                        if (d0Var.a() >= 4) {
                            if (pk.d1.d(d0Var.f53807b, d0Var.f53806a) == 443) {
                                d0Var.L(4);
                                int E = d0Var.E();
                                if (d0Var.a() < E) {
                                    d0Var.K(i15);
                                } else {
                                    d0Var.L(E);
                                }
                            }
                            while (true) {
                                if (d0Var.a() < 4) {
                                    break;
                                }
                                int d2 = pk.d1.d(d0Var.f53807b, d0Var.f53806a);
                                if (d2 == 442 || d2 == 441 || (d2 >>> 8) != 1) {
                                    break;
                                }
                                d0Var.L(4);
                                if (d0Var.a() < 2) {
                                    d0Var.K(i15);
                                    break;
                                }
                                d0Var.K(Math.min(d0Var.f53808c, d0Var.f53807b + d0Var.E()));
                            }
                        } else {
                            d0Var.K(i15);
                        }
                    } else {
                        d0Var.K(i15);
                    }
                } else {
                    d0Var.K(i15);
                }
                i13 = d0Var.f53807b;
            }
        }
        return j14 != -9223372036854775807L ? new q8.j(-2, j14, h10 + i13) : q8.j.f102938d;
    }

    @Override // androidx.camera.core.impl.u1
    public final void f(androidx.camera.core.impl.t1 t1Var) {
        synchronized (((Map) this.f31595c)) {
            try {
                androidx.camera.core.impl.n1 n1Var = (androidx.camera.core.impl.n1) ((Map) this.f31595c).remove(t1Var);
                if (n1Var != null) {
                    n1Var.f16921a.set(false);
                    l3.c.H0().execute(new jg(27, this, n1Var));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // v7.q
    public final l8.y g(v7.n nVar, v7.k kVar) {
        return new sp2.i(15, ((v7.q) this.f31594b).g(nVar, kVar), (List) this.f31595c);
    }

    @Override // androidx.recyclerview.widget.o3
    public final int h(int i13) {
        return i13;
    }

    @Override // androidx.recyclerview.widget.o3
    public final int i(int i13) {
        List list = (List) ((t7.w) this.f31595c).f116612a.get(i13);
        if (list == null) {
            list = new ArrayList();
            ((t7.w) this.f31595c).f116612a.put(i13, list);
        }
        if (!list.contains((androidx.recyclerview.widget.i1) this.f31594b)) {
            list.add((androidx.recyclerview.widget.i1) this.f31594b);
        }
        return i13;
    }

    @Override // wd.n
    public final void j() {
        wd.y yVar = (wd.y) this.f31594b;
        synchronized (yVar) {
            yVar.f129217c = yVar.f129215a.length;
        }
    }

    @Override // androidx.camera.core.impl.c1
    public final androidx.camera.core.impl.d1 k(int i13) {
        return t(i13);
    }

    @Override // q8.k
    public final void l() {
        d7.d0 d0Var = (d7.d0) this.f31595c;
        byte[] bArr = d7.n0.f53868c;
        d0Var.getClass();
        d0Var.I(bArr.length, bArr);
    }

    public final void m(Object obj, String str) {
        ((List) this.f31594b).add(a.a.D(str, "=", String.valueOf(obj)));
    }

    @Override // v7.q
    public final l8.y n() {
        return new sp2.i(15, ((v7.q) this.f31594b).n(), (List) this.f31595c);
    }

    public final void o() {
        Object obj = this.f31594b;
        if (((androidx.appcompat.app.d) obj) != null) {
            androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) obj;
            ((AtomicBoolean) dVar.f15967c).set(true);
            ((ScheduledFuture) dVar.f15966b).cancel(true);
        }
        this.f31594b = null;
    }

    public int p(ArrayList arrayList, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f31594b).captureBurst(arrayList, new w.e(executor, captureCallback), ((w.j) this.f31595c).f126927a);
    }

    public CameraCharacteristics r(String str) {
        try {
            return ((CameraManager) this.f31594b).getCameraCharacteristics(str);
        } catch (CameraAccessException e13) {
            throw CameraAccessExceptionCompat.a(e13);
        }
    }

    public Set s() {
        return Collections.emptySet();
    }

    public final androidx.camera.core.impl.d1 t(int i13) {
        Object obj = this.f31595c;
        return (((Map) obj) == null || !((Map) obj).containsKey(Integer.valueOf(i13))) ? ((androidx.camera.core.impl.c1) this.f31594b).k(i13) : (androidx.camera.core.impl.d1) ((Map) this.f31595c).get(Integer.valueOf(i13));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Bundle bundle;
        hh.a aVar = (hh.a) this.f31594b;
        Bundle bundle2 = (Bundle) this.f31595c;
        aVar.getClass();
        return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? aVar.a(bundle2).onSuccessTask(hh.o.f69132a, hh.n.f69131a) : task;
    }

    public final String toString() {
        boolean z13 = false;
        switch (this.f31593a) {
            case 13:
                return "Bounds{lower=" + ((f5.e) this.f31594b) + " upper=" + ((f5.e) this.f31595c) + "}";
            case 21:
                StringBuilder sb3 = new StringBuilder("MasterKey{keyAlias=");
                sb3.append((String) this.f31594b);
                sb3.append(", isKeyStoreBacked=");
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    z13 = keyStore.containsAlias((String) this.f31594b);
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                }
                return a.a.r(sb3, z13, "}");
            case 27:
                StringBuilder sb4 = new StringBuilder(100);
                sb4.append(this.f31595c.getClass().getSimpleName());
                sb4.append('{');
                int size = ((List) this.f31594b).size();
                for (int i13 = 0; i13 < size; i13++) {
                    sb4.append((String) ((List) this.f31594b).get(i13));
                    if (i13 < size - 1) {
                        sb4.append(", ");
                    }
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public final void u(Context context, Uri uri) {
        ((Intent) this.f31594b).setData(uri);
        Intent intent = (Intent) this.f31594b;
        Bundle bundle = (Bundle) this.f31595c;
        Object obj = d5.a.f53679a;
        context.startActivity(intent, bundle);
    }

    public void v(String str, f0.j jVar, CameraDevice.StateCallback stateCallback) {
        jVar.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.f31594b).openCamera(str, new v.u(jVar, stateCallback), ((w.x) this.f31595c).f126946b);
        } catch (CameraAccessException e13) {
            throw new CameraAccessExceptionCompat(e13);
        }
    }

    public void x(f0.j jVar, v.w wVar) {
        w.s sVar;
        w.x xVar = (w.x) this.f31595c;
        synchronized (xVar.f126945a) {
            try {
                sVar = (w.s) xVar.f126945a.get(wVar);
                if (sVar == null) {
                    sVar = new w.s(jVar, wVar);
                    xVar.f126945a.put(wVar, sVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ((CameraManager) this.f31594b).registerAvailabilityCallback(sVar, xVar.f126946b);
    }

    public int y(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f31594b).setRepeatingRequest(captureRequest, new w.e(executor, captureCallback), ((w.j) this.f31595c).f126927a);
    }

    public final boolean z(JsonReader jsonReader) {
        boolean z13;
        boolean z14;
        boolean z15;
        jsonReader.beginObject();
        boolean z16 = true;
        boolean z17 = true;
        do {
            z13 = false;
            if (!jsonReader.hasNext() || (!z16 && !z17)) {
                return false;
            }
            String nextName = jsonReader.nextName();
            if (Intrinsics.d(nextName, "app")) {
                if (((Collection) this.f31595c).isEmpty()) {
                    jsonReader.skipValue();
                } else {
                    jsonReader.beginObject();
                    while (jsonReader.peek() != JsonToken.END_OBJECT) {
                        if (Intrinsics.d(jsonReader.nextName(), "releaseStage")) {
                            if (!((Collection) this.f31595c).contains(jsonReader.nextString())) {
                                z15 = true;
                                break;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                }
                z15 = false;
                z13 = z15;
                z16 = false;
            } else if (Intrinsics.d(nextName, "exceptions")) {
                jsonReader.beginArray();
                while (true) {
                    if (jsonReader.peek() == JsonToken.END_ARRAY) {
                        jsonReader.endArray();
                        z14 = false;
                        break;
                    }
                    jsonReader.beginObject();
                    while (jsonReader.peek() != JsonToken.END_OBJECT) {
                        if (!Intrinsics.d(jsonReader.nextName(), "errorClass")) {
                            jsonReader.skipValue();
                        } else if (NativeInterface.isDiscardErrorClass(jsonReader.nextString())) {
                            ((com.bugsnag.android.u1) this.f31594b).i("Discarding native report due to errorClass");
                            z14 = true;
                            break;
                        }
                    }
                    jsonReader.endObject();
                }
                z13 = z14;
                z17 = false;
            } else {
                jsonReader.skipValue();
            }
        } while (!z13);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.o4
    public final Object zza(String str) {
        Object v13;
        if (((Context) this.f31594b) == null || (!m4.a(r0))) {
            return null;
        }
        try {
            try {
                x xVar = new x(2, this, str);
                try {
                    v13 = xVar.v();
                } catch (SecurityException unused) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        v13 = xVar.v();
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                return (String) v13;
            } catch (IllegalStateException e13) {
                e = e13;
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
                return null;
            } catch (NullPointerException e14) {
                e = e14;
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
                return null;
            }
        } catch (SecurityException e15) {
            e = e15;
            Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4(d7.k0 k0Var, int i13) {
        this(k0Var);
        this.f31593a = 19;
    }

    public /* synthetic */ q4(Object obj, Object obj2, int i13) {
        this.f31593a = i13;
        this.f31595c = obj;
        this.f31594b = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4(n8.c cVar, int i13) {
        this(cVar);
        this.f31593a = 17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4(v.d0 d0Var, int i13) {
        this(d0Var);
        this.f31593a = 2;
    }

    public /* synthetic */ q4(Object obj) {
        this.f31593a = 27;
        com.bumptech.glide.d.t(obj);
        this.f31595c = obj;
        this.f31594b = new ArrayList();
    }

    public q4(com.bugsnag.android.u1 u1Var) {
        this.f31593a = 22;
        this.f31594b = u1Var;
        this.f31595c = new a.g(5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q4(com.bugsnag.android.u1 r2, int r3) {
        /*
            r1 = this;
            r3 = 23
            r1.f31593a = r3
            java.util.Collection r0 = com.bugsnag.android.NativeInterface.getEnabledReleaseStages()
            if (r0 != 0) goto Lc
            kotlin.collections.s0 r0 = kotlin.collections.s0.f80394a
        Lc:
            r1.<init>(r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q4.<init>(com.bugsnag.android.u1, int):void");
    }

    public q4(int i13) {
        this.f31593a = i13;
        if (i13 == 6) {
            this.f31594b = new LinkedHashSet();
            return;
        }
        if (i13 == 7) {
            this.f31594b = new androidx.lifecycle.l0();
            this.f31595c = new HashMap();
        } else if (i13 != 18) {
            this.f31594b = null;
            this.f31595c = null;
        }
    }

    public q4(Context context) {
        this.f31593a = 0;
        this.f31594b = context;
        this.f31595c = new k4();
        context.getContentResolver().registerContentObserver(i4.f31426a, true, (ContentObserver) this.f31595c);
    }

    public q4(CameraCaptureSession cameraCaptureSession, w.j jVar) {
        this.f31593a = 4;
        cameraCaptureSession.getClass();
        this.f31594b = cameraCaptureSession;
        this.f31595c = jVar;
    }

    public q4(androidx.camera.core.impl.p0 p0Var) {
        this.f31593a = 3;
        this.f31594b = p0Var;
        androidx.lifecycle.l0 l0Var = new androidx.lifecycle.l0();
        this.f31595c = l0Var;
        l0Var.i(new c0.e(c0.t.CLOSED, null));
    }

    public q4(Context context, w.x xVar) {
        this.f31593a = 5;
        this.f31594b = (CameraManager) context.getSystemService("camera");
        this.f31595c = xVar;
    }

    public q4(androidx.camera.core.impl.c1 c1Var, androidx.camera.core.impl.r rVar, androidx.camera.core.impl.h0 h0Var) {
        Range range;
        this.f31593a = 10;
        this.f31594b = c1Var;
        ArrayList c13 = rVar.c(ExtraSupportedQualityQuirk.class);
        if (c13.isEmpty()) {
            return;
        }
        Map map = null;
        y0.f0 f0Var = null;
        map = null;
        map = null;
        com.bumptech.glide.d.v(null, c13.size() == 1);
        ExtraSupportedQualityQuirk extraSupportedQualityQuirk = (ExtraSupportedQualityQuirk) c13.get(0);
        androidx.camera.core.impl.c1 c1Var2 = (androidx.camera.core.impl.c1) this.f31594b;
        extraSupportedQualityQuirk.getClass();
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            if (SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(h0Var.c()) && !c1Var2.b(4)) {
                androidx.camera.core.impl.d1 k13 = c1Var2.k(1);
                androidx.camera.core.impl.f fVar = (k13 == null || k13.b().isEmpty()) ? null : (androidx.camera.core.impl.f) k13.b().get(0);
                if (fVar != null) {
                    try {
                        f0Var = a1.b.k(null, y0.g0.B(x0.b.e(fVar)));
                    } catch (InvalidConfigException e13) {
                        kh2.m0.Y0("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e13);
                    }
                    if (f0Var != null) {
                        range = f0Var.g();
                    } else {
                        range = r0.m.f105605f;
                    }
                    Size size = k0.c.f77784d;
                    androidx.camera.core.impl.e e14 = androidx.camera.core.impl.e.e(k13.a(), k13.c(), k13.d(), Collections.singletonList(ph.a.x(fVar, size, range)));
                    HashMap hashMap = new HashMap();
                    hashMap.put(4, e14);
                    Size size2 = new Size(fVar.f16832e, fVar.f16833f);
                    if (size.getHeight() * size.getWidth() > size2.getHeight() * size2.getWidth()) {
                        hashMap.put(1, e14);
                    }
                    map = hashMap;
                }
            }
        } else {
            map = Collections.emptyMap();
        }
        if (map != null) {
            this.f31595c = new HashMap(map);
        }
    }

    public q4(d7.k0 k0Var) {
        this.f31593a = 19;
        this.f31594b = k0Var;
        this.f31595c = new d7.d0();
    }

    public q4(ArrayList arrayList, ArrayList arrayList2) {
        this.f31593a = 12;
        int size = arrayList.size();
        this.f31594b = new int[size];
        this.f31595c = new float[size];
        for (int i13 = 0; i13 < size; i13++) {
            ((int[]) this.f31594b)[i13] = ((Integer) arrayList.get(i13)).intValue();
            ((float[]) this.f31595c)[i13] = ((Float) arrayList2.get(i13)).floatValue();
        }
    }

    public q4(int i13, int i14) {
        this.f31593a = 12;
        this.f31594b = new int[]{i13, i14};
        this.f31595c = new float[]{0.0f, 1.0f};
    }

    public q4(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f31593a = 13;
        lowerBound = bounds.getLowerBound();
        this.f31594b = f5.e.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f31595c = f5.e.c(upperBound);
    }

    public q4(int i13, int i14, int i15) {
        this.f31593a = 12;
        this.f31594b = new int[]{i13, i14, i15};
        this.f31595c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public q4(n8.c cVar) {
        this.f31593a = 17;
        this.f31595c = cVar;
    }

    public q4(pk.v2 v2Var, int[] iArr) {
        this.f31593a = 15;
        this.f31594b = pk.c1.r(v2Var);
        this.f31595c = iArr;
    }

    public q4(v.d0 d0Var) {
        this.f31593a = 2;
        this.f31595c = d0Var;
        this.f31594b = null;
    }
}
