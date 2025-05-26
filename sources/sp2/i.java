package sp2;

import a.cb;
import a8.t0;
import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureResult;
import android.net.Uri;
import android.opengl.EGL14;
import android.os.Build;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.JsonReader;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.k1;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.t;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.u2;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.w;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.z;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.e3;
import c0.d1;
import c0.n0;
import com.bugsnag.android.n1;
import com.bugsnag.android.o1;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.c0;
import d7.d0;
import d7.k0;
import ja.i0;
import ja.j0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kh2.a1;
import kh2.m0;
import kh2.n3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import l8.y;
import pk.c1;
import pk.v2;
import v.r2;
import v9.b0;
import v9.e0;
import v9.f0;
import v9.h0;
import w.q;
import x.r;
import x.s;

/* loaded from: classes4.dex */
public class i implements z, l1, p5.f, y, l9.l, b0, e3, uj2.j, qd.k, ae.n, vf.e, xg.d {

    /* renamed from: a */
    public final /* synthetic */ int f114927a;

    /* renamed from: b */
    public Object f114928b;

    /* renamed from: c */
    public Object f114929c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(int i13, Object obj) {
        this();
        this.f114927a = i13;
        if (i13 == 18) {
            this.f114928b = new d0();
            this.f114929c = new u9.b();
        } else if (i13 != 22) {
            if (i13 != 26) {
            } else {
                this.f114928b = new qd.c();
                this.f114929c = new tb.l(6);
            }
        }
    }

    public static void I(CameraDevice cameraDevice, s sVar) {
        cameraDevice.getClass();
        sVar.getClass();
        r rVar = sVar.f131262a;
        rVar.g().getClass();
        List a13 = rVar.a();
        if (a13 == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (rVar.e() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        String id3 = cameraDevice.getId();
        Iterator it = a13.iterator();
        while (it.hasNext()) {
            String d2 = ((x.h) it.next()).f131248a.d();
            if (d2 != null && !d2.isEmpty()) {
                m0.X0("CameraDeviceCompat", a.a.m("Camera ", id3, ": Camera doesn't support physicalCameraId ", d2, ". Ignoring."));
            }
        }
    }

    public static i L(List list, r0.c cVar) {
        com.bumptech.glide.d.s(list, "qualities cannot be null");
        com.bumptech.glide.d.g("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r0.r rVar = (r0.r) it.next();
            com.bumptech.glide.d.g("qualities contain invalid quality: " + rVar, r0.r.f105636h.contains(rVar));
        }
        return new i(list, cVar);
    }

    public static String P(int i13, int i14, Bitmap.Config config) {
        StringBuilder t13 = a.a.t("[", i13, "x", i14, "], ");
        t13.append(config);
        return t13.toString();
    }

    public static float U(List list, float f13, sf.n nVar) {
        float f14 = Float.MAX_VALUE;
        for (int i13 = 0; i13 < list.size(); i13++) {
            vf.c cVar = (vf.c) list.get(i13);
            if (cVar.f125772h == nVar) {
                float abs = Math.abs(cVar.f125768d - f13);
                if (abs < f14) {
                    f14 = abs;
                }
            }
        }
        return f14;
    }

    public static String[] Y(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return new String[]{a.a.k("_", str, "_DslJsonConverter")};
        }
        String substring = str.substring(0, lastIndexOf);
        String substring2 = str.substring(lastIndexOf + 1);
        return new String[]{a.a.l(substring, "._", substring2, "_DslJsonConverter"), a.a.m("dsl_json.", substring, "._", substring2, "_DslJsonConverter"), a.a.m("dsl_json.", substring, ".", substring2, "DslJsonConverter")};
    }

    public static ArrayList b0(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((x.h) it.next()).f131248a.e());
        }
        return arrayList;
    }

    @Override // vf.e
    public vf.c A(float f13, float f14) {
        ag.c b13 = ((BarLineChartBase) ((wf.b) this.f114928b)).G(sf.n.LEFT).b(f13, f14);
        float f15 = (float) b13.f15084b;
        ag.c.c(b13);
        return S(f15, f13, f14);
    }

    @Override // qd.k
    public final String B(int i13, int i14, Bitmap.Config config) {
        return P(i13, i14, config);
    }

    @Override // androidx.camera.core.impl.z
    public final t C() {
        Integer num = (Integer) ((CaptureResult) this.f114929c).get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return t.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return t.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return t.CONVERGED;
            }
            if (intValue == 3) {
                return t.LOCKED;
            }
            if (intValue == 4) {
                return t.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                m0.s("C2CameraCaptureResult", "Undefined ae state: " + num);
                return t.UNKNOWN;
            }
        }
        return t.SEARCHING;
    }

    @Override // qd.k
    public final int D(Bitmap bitmap) {
        return he.n.c(bitmap);
    }

    @Override // l9.l
    public final int E() {
        return 1;
    }

    @Override // androidx.camera.core.impl.l1
    public final n0 F() {
        return K(((l1) this.f114928b).F());
    }

    @Override // uj2.j
    public final void G(gk2.l lVar) {
        ja.r rVar = new ja.r(this, (String[]) this.f114928b, lVar);
        bk2.a aVar = lVar.f65491b;
        if (!aVar.isDisposed()) {
            ((ja.d0) this.f114929c).f75182e.a(rVar);
            xj2.a aVar2 = new xj2.a(new i0(this, rVar));
            aVar.getClass();
            bk2.c.set(aVar, aVar2);
        }
        if (aVar.isDisposed()) {
            return;
        }
        lVar.c(j0.f75246a);
    }

    public ArrayList H(xf.b bVar, int i13, float f13, tf.d dVar) {
        Entry f14;
        ArrayList arrayList = new ArrayList();
        tf.e eVar = (tf.e) bVar;
        ArrayList<Entry> d2 = eVar.d(f13);
        if (d2.size() == 0 && (f14 = eVar.f(f13, Float.NaN, dVar)) != null) {
            d2 = eVar.d(f14.b());
        }
        if (d2.size() == 0) {
            return arrayList;
        }
        for (Entry entry : d2) {
            ag.c a13 = ((BarLineChartBase) ((wf.b) this.f114928b)).G(eVar.f117515d).a(entry.b(), entry.a());
            arrayList.add(new vf.c(entry.b(), entry.a(), (float) a13.f15084b, (float) a13.f15085c, i13, eVar.f117515d));
        }
        return arrayList;
    }

    public void J(s sVar) {
        I((CameraDevice) this.f114928b, sVar);
        r rVar = sVar.f131262a;
        if (rVar.d() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        }
        if (rVar.f() == 1) {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        w.g gVar = new w.g(rVar.e(), rVar.g());
        try {
            ((CameraDevice) this.f114928b).createCaptureSession(b0(rVar.a()), gVar, ((q) this.f114929c).f126935a);
        } catch (CameraAccessException e13) {
            throw new CameraAccessExceptionCompat(e13);
        }
    }

    public final d1 K(n0 n0Var) {
        u2 u2Var;
        if (n0Var == null) {
            return null;
        }
        if (((d0.s) this.f114929c) == null) {
            u2Var = u2.f16976b;
        } else {
            d0.s sVar = (d0.s) this.f114929c;
            Pair pair = new Pair(sVar.f53561h, sVar.f53562i.get(0));
            u2 u2Var2 = u2.f16976b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            u2Var = new u2(arrayMap);
        }
        this.f114929c = null;
        return new d1(n0Var, new Size(n0Var.j(), n0Var.i()), new h0.c(new p0.h(null, u2Var, n0Var.H1().h())));
    }

    public final androidx.camera.core.impl.s M() {
        Integer num = (Integer) ((CaptureResult) this.f114929c).get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return androidx.camera.core.impl.s.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return androidx.camera.core.impl.s.OFF;
        }
        if (intValue == 1) {
            return androidx.camera.core.impl.s.ON;
        }
        if (intValue == 2) {
            return androidx.camera.core.impl.s.ON_AUTO_FLASH;
        }
        if (intValue == 3) {
            return androidx.camera.core.impl.s.ON_ALWAYS_FLASH;
        }
        if (intValue == 4) {
            return androidx.camera.core.impl.s.ON_AUTO_FLASH_REDEYE;
        }
        if (intValue == 5 && Build.VERSION.SDK_INT >= 28) {
            return androidx.camera.core.impl.s.ON_EXTERNAL_FLASH;
        }
        return androidx.camera.core.impl.s.UNKNOWN;
    }

    public final u N() {
        Integer num = (Integer) ((CaptureResult) this.f114929c).get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return u.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return u.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return u.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                m0.s("C2CameraCaptureResult", "Undefined af mode: " + num);
                return u.UNKNOWN;
            }
        }
        return u.OFF;
    }

    public final w O() {
        Integer num = (Integer) ((CaptureResult) this.f114929c).get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return w.UNKNOWN;
        }
        switch (num.intValue()) {
        }
        return w.UNKNOWN;
    }

    public tf.a Q() {
        return (tf.a) ((BarLineChartBase) ((wf.b) this.f114928b)).f30149a;
    }

    public float R(float f13, float f14, float f15, float f16) {
        return (float) Math.hypot(f13 - f15, f14 - f16);
    }

    public final vf.c S(float f13, float f14, float f15) {
        List T = T(f13);
        vf.c cVar = null;
        if (T.isEmpty()) {
            return null;
        }
        sf.n nVar = sf.n.LEFT;
        float U = U(T, f15, nVar);
        sf.n nVar2 = sf.n.RIGHT;
        if (U >= U(T, f15, nVar2)) {
            nVar = nVar2;
        }
        float f16 = ((Chart) ((wf.b) this.f114928b)).f30170v;
        for (int i13 = 0; i13 < T.size(); i13++) {
            vf.c cVar2 = (vf.c) T.get(i13);
            if (nVar == null || cVar2.f125772h == nVar) {
                float R = R(f14, f15, cVar2.f125767c, cVar2.f125768d);
                if (R < f16) {
                    cVar = cVar2;
                    f16 = R;
                }
            }
        }
        return cVar;
    }

    public List T(float f13) {
        ((List) this.f114929c).clear();
        tf.a Q = Q();
        if (Q == null) {
            return (List) this.f114929c;
        }
        int c13 = Q.c();
        for (int i13 = 0; i13 < c13; i13++) {
            xf.b b13 = Q.b(i13);
            if (((tf.e) b13).f117516e) {
                ((List) this.f114929c).addAll(H(b13, i13, f13, tf.d.CLOSEST));
            }
        }
        return (List) this.f114929c;
    }

    public final n1 V(com.bugsnag.android.n0 n0Var) {
        ReentrantReadWriteLock.ReadLock readLock = ((ReentrantReadWriteLock) this.f114929c).readLock();
        readLock.lock();
        try {
            Reader inputStreamReader = new InputStreamReader(new FileInputStream((File) this.f114928b), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                n1 n1Var = (n1) n0Var.invoke(new JsonReader(bufferedReader));
                dl2.b.J(bufferedReader, null);
                readLock.unlock();
                return n1Var;
            } finally {
            }
        } catch (Throwable th3) {
            readLock.unlock();
            throw th3;
        }
    }

    public final void W(m5.e eVar) {
        int i13 = eVar.f85850b;
        if (i13 != 0) {
            ((Executor) this.f114929c).execute(new d.d(this, (a1) this.f114928b, i13, 6, 0));
        } else {
            a1 a1Var = (a1) this.f114928b;
            ((Executor) this.f114929c).execute(new s.f(this, a1Var, eVar.f85849a, 1));
        }
    }

    public final void X(n1 n1Var) {
        ReentrantReadWriteLock.WriteLock writeLock = ((ReentrantReadWriteLock) this.f114929c).writeLock();
        writeLock.lock();
        try {
            Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream((File) this.f114928b), Charsets.UTF_8);
            BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
            try {
                n1Var.toStream(new o1(bufferedWriter));
                dl2.b.J(bufferedWriter, null);
                writeLock.unlock();
            } finally {
            }
        } catch (Throwable th3) {
            writeLock.unlock();
            throw th3;
        }
    }

    public final void Z(int i13, int i14, int i15, int i16) {
        ((CardView) this.f114929c).f17056d.set(i13, i14, i15, i16);
        Object obj = this.f114929c;
        super/*android.view.View*/.setPadding(i13 + ((CardView) obj).f17055c.left, i14 + ((CardView) obj).f17055c.top, i15 + ((CardView) obj).f17055c.right, i16 + ((CardView) obj).f17055c.bottom);
    }

    @Override // v9.b0
    public final void a(k0 k0Var, q8.u uVar, h0 h0Var) {
    }

    public final synchronized void a0(Class cls) {
        Class<?> loadClass;
        String name = cls.getName();
        if (((Set) this.f114928b).add(name)) {
            String[] Y = Y(name);
            for (ClassLoader classLoader : (ClassLoader[]) this.f114929c) {
                for (String str : Y) {
                    try {
                        loadClass = classLoader.loadClass(str);
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    if (com.bugsnag.android.repackaged.dslplatform.json.e.class.isAssignableFrom(loadClass)) {
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(loadClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                        throw null;
                    }
                }
            }
        }
    }

    @Override // qd.k
    public final void b(Bitmap bitmap) {
        qd.c cVar = (qd.c) this.f114928b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        qd.l lVar = (qd.l) ((Queue) cVar.f92902b).poll();
        if (lVar == null) {
            lVar = cVar.k();
        }
        qd.b bVar = (qd.b) lVar;
        bVar.f103535b = width;
        bVar.f103536c = height;
        bVar.f103537d = config;
        ((tb.l) this.f114929c).z(bVar, bitmap);
    }

    @Override // androidx.camera.core.impl.z
    public final void c(e0.n nVar) {
        super.c(nVar);
        try {
            Integer num = (Integer) ((CaptureResult) this.f114929c).get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                nVar.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            m0.X0("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l13 = (Long) ((CaptureResult) this.f114929c).get(CaptureResult.SENSOR_EXPOSURE_TIME);
        ArrayList arrayList = nVar.f56722a;
        if (l13 != null) {
            nVar.c("ExposureTime", String.valueOf(l13.longValue() / TimeUnit.SECONDS.toNanos(1L)), arrayList);
        }
        Float f13 = (Float) ((CaptureResult) this.f114929c).get(CaptureResult.LENS_APERTURE);
        if (f13 != null) {
            nVar.c("FNumber", String.valueOf(f13.floatValue()), arrayList);
        }
        Integer num2 = (Integer) ((CaptureResult) this.f114929c).get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) ((CaptureResult) this.f114929c).get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r2.intValue() / 100.0f)));
            }
            int intValue = num2.intValue();
            nVar.c("SensitivityType", String.valueOf(3), arrayList);
            nVar.c("PhotographicSensitivity", String.valueOf(Math.min(65535, intValue)), arrayList);
        }
        Float f14 = (Float) ((CaptureResult) this.f114929c).get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f14 != null) {
            nVar.c("FocalLength", new e0.s((long) (f14.floatValue() * 1000.0f), 1000L).toString(), arrayList);
        }
        Integer num3 = (Integer) ((CaptureResult) this.f114929c).get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            e0.o oVar = e0.o.AUTO;
            if (num3.intValue() == 0) {
                oVar = e0.o.MANUAL;
            }
            int ordinal = oVar.ordinal();
            nVar.c("WhiteBalance", ordinal != 0 ? ordinal != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final void close() {
        ((l1) this.f114928b).close();
    }

    @Override // v9.b0
    public final void e(d0 d0Var) {
        if (d0Var.y() == 0 && (d0Var.y() & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            d0Var.L(6);
            int a13 = d0Var.a() / 4;
            for (int i13 = 0; i13 < a13; i13++) {
                c0 c0Var = (c0) this.f114928b;
                d0Var.i(c0Var.f53793b, 0, 4);
                c0Var.m(0);
                int g13 = ((c0) this.f114928b).g(16);
                ((c0) this.f114928b).o(3);
                if (g13 == 0) {
                    ((c0) this.f114928b).o(13);
                } else {
                    int g14 = ((c0) this.f114928b).g(13);
                    if (((f0) this.f114929c).f124592h.get(g14) == null) {
                        f0 f0Var = (f0) this.f114929c;
                        f0Var.f124592h.put(g14, new v9.c0(new e0(f0Var, g14)));
                        ((f0) this.f114929c).f124598n++;
                    }
                }
            }
            f0 f0Var2 = (f0) this.f114929c;
            if (f0Var2.f124585a != 2) {
                f0Var2.f124592h.remove(0);
            }
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f114927a) {
            case 22:
                if (!(obj instanceof p5.b)) {
                    return false;
                }
                p5.b bVar = (p5.b) obj;
                Object obj2 = bVar.f98855a;
                Object obj3 = this.f114929c;
                if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                    return false;
                }
                Object obj4 = this.f114928b;
                Object obj5 = bVar.f98856b;
                return obj5 == obj4 || (obj5 != null && obj5.equals(obj4));
            default:
                return super.equals(obj);
        }
    }

    @Override // androidx.camera.core.impl.z
    public final u2 f() {
        return (u2) this.f114928b;
    }

    @Override // qd.k
    public final Bitmap g(int i13, int i14, Bitmap.Config config) {
        qd.c cVar = (qd.c) this.f114928b;
        qd.l lVar = (qd.l) ((Queue) cVar.f92902b).poll();
        if (lVar == null) {
            lVar = cVar.k();
        }
        qd.b bVar = (qd.b) lVar;
        bVar.f103535b = i13;
        bVar.f103536c = i14;
        bVar.f103537d = config;
        return (Bitmap) ((tb.l) this.f114929c).u(bVar);
    }

    @Override // p5.f
    public final Object get() {
        int D0 = n3.D0((r0.a) this.f114928b);
        int E0 = n3.E0((r0.a) this.f114928b);
        r0.a aVar = (r0.a) this.f114928b;
        int i13 = aVar.f105475e;
        int i14 = ((androidx.camera.core.impl.d) this.f114929c).f16818e;
        if (i13 == -1) {
            m0.p("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + i14);
            i13 = i14;
        } else {
            m0.p("AudioSrcAdPrflRslvr", cb.j("Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: ", i14, ", Resolved Channel Count: ", i13, "]"));
        }
        int i15 = ((androidx.camera.core.impl.d) this.f114929c).f16817d;
        int J0 = n3.J0(aVar.f105474d, i13, E0, i15);
        m0.p("AudioSrcAdPrflRslvr", cb.j("Using resolved AUDIO sample rate or nearest supported from AudioProfile: ", J0, "Hz. [AudioProfile sample rate: ", i15, "Hz]"));
        List list = u0.i.f119769e;
        s.a aVar2 = new s.a();
        aVar2.f110242a = -1;
        aVar2.f110243b = -1;
        aVar2.f110244c = -1;
        aVar2.f110245d = -1;
        aVar2.f110242a = Integer.valueOf(D0);
        aVar2.f110245d = Integer.valueOf(E0);
        aVar2.f110244c = Integer.valueOf(i13);
        aVar2.f110243b = Integer.valueOf(J0);
        return aVar2.a();
    }

    @Override // androidx.camera.core.impl.z
    public final long h() {
        Long l13 = (Long) ((CaptureResult) this.f114929c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l13 == null) {
            return -1L;
        }
        return l13.longValue();
    }

    public final int hashCode() {
        switch (this.f114927a) {
            case 22:
                Object obj = this.f114929c;
                int hashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.f114928b;
                return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final int i() {
        return ((l1) this.f114928b).i();
    }

    @Override // androidx.camera.core.impl.l1
    public final int j() {
        return ((l1) this.f114928b).j();
    }

    @Override // l8.y
    public final Object k(Uri uri, g7.g gVar) {
        z7.n nVar = (z7.n) ((y) this.f114928b).k(uri, gVar);
        List list = (List) this.f114929c;
        return (list == null || list.isEmpty()) ? nVar : (z7.n) nVar.a((List) this.f114929c);
    }

    @Override // androidx.camera.core.impl.l1
    public final n0 l() {
        return K(((l1) this.f114928b).l());
    }

    @Override // androidx.camera.core.impl.l1
    public final int m() {
        return ((l1) this.f114928b).m();
    }

    @Override // xg.d
    public final void n(wg.c cVar, TaskCompletionSource taskCompletionSource) {
        cVar.y((Bundle) this.f114929c, new xg.c((xg.e) this.f114928b, taskCompletionSource));
    }

    @Override // androidx.camera.core.impl.l1
    public final void o() {
        ((l1) this.f114928b).o();
    }

    @Override // androidx.camera.core.impl.z
    public final androidx.camera.core.impl.y p() {
        Integer num = (Integer) ((CaptureResult) this.f114929c).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return androidx.camera.core.impl.y.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return androidx.camera.core.impl.y.NONE;
        }
        if (intValue == 2) {
            return androidx.camera.core.impl.y.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return androidx.camera.core.impl.y.FIRED;
        }
        m0.s("C2CameraCaptureResult", "Undefined flash state: " + num);
        return androidx.camera.core.impl.y.UNKNOWN;
    }

    @Override // androidx.recyclerview.widget.e3
    public final long q(long j13) {
        Long l13 = (Long) ((g1.p) this.f114928b).c(j13);
        if (l13 == null) {
            t0 t0Var = (t0) this.f114929c;
            long j14 = t0Var.f1462a;
            t0Var.f1462a = 1 + j14;
            l13 = Long.valueOf(j14);
            ((g1.p) this.f114928b).j(j13, l13);
        }
        return l13.longValue();
    }

    @Override // androidx.camera.core.impl.z
    public final CaptureResult r() {
        return (CaptureResult) this.f114929c;
    }

    @Override // qd.k
    public final Bitmap removeLast() {
        return (Bitmap) ((tb.l) this.f114929c).B();
    }

    @Override // androidx.camera.core.impl.l1
    public final int s() {
        return ((l1) this.f114928b).s();
    }

    @Override // androidx.camera.core.impl.z
    public final v t() {
        Integer num = (Integer) ((CaptureResult) this.f114929c).get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return v.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                m0.s("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return v.UNKNOWN;
    }

    public final String toString() {
        switch (this.f114927a) {
            case 7:
                return "QualitySelector{preferredQualities=" + ((List) this.f114928b) + ", fallbackStrategy=" + ((r0.o) this.f114929c) + "}";
            case 22:
                return "Pair{" + this.f114929c + " " + this.f114928b + "}";
            case 26:
                return "AttributeStrategy:\n  " + ((tb.l) this.f114929c);
            default:
                return super.toString();
        }
    }

    @Override // qd.k
    public final String u(Bitmap bitmap) {
        return P(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // androidx.camera.core.impl.l1
    public final void v(k1 k1Var, Executor executor) {
        ((l1) this.f114928b).v(new c0.a1(this, k1Var, 1), executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x03c4, code lost:
    
        r0.addAll(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0139, code lost:
    
        if (")".equals(u9.b.b(r6, r11)) == false) goto L319;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [int] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // l9.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(byte[] r20, int r21, int r22, l9.k r23, d7.i r24) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.i.w(byte[], int, int, l9.k, d7.i):void");
    }

    @Override // androidx.camera.core.impl.z
    public final x y() {
        Integer num = (Integer) ((CaptureResult) this.f114929c).get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return x.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return x.INACTIVE;
        }
        if (intValue == 1) {
            return x.METERING;
        }
        if (intValue == 2) {
            return x.CONVERGED;
        }
        if (intValue == 3) {
            return x.LOCKED;
        }
        m0.s("C2CameraCaptureResult", "Undefined awb state: " + num);
        return x.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.l1
    public final Surface z() {
        return ((l1) this.f114928b).z();
    }

    public /* synthetic */ i(int i13, Object obj, Object obj2) {
        this.f114927a = i13;
        this.f114928b = obj;
        this.f114929c = obj2;
    }

    public /* synthetic */ i(ae.k kVar, Object obj, int i13) {
        this.f114927a = i13;
        this.f114929c = kVar;
        this.f114928b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Context context, w.t tVar, LinkedHashSet linkedHashSet) {
        this(context, new v.d1(), tVar, linkedHashSet);
        this.f114927a = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(CaptureResult captureResult) {
        this(1, u2.f16976b, captureResult);
        this.f114927a = 1;
    }

    public /* synthetic */ i(Object obj, int i13) {
        this.f114927a = i13;
        this.f114928b = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(te0.f r4) {
        /*
            r3 = this;
            r0 = 10
            r3.f114927a = r0
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L14
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            goto L19
        L14:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
        L19:
            m5.j r2 = new m5.j
            r2.<init>(r1)
            r3.<init>(r0, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.i.<init>(te0.f):void");
    }

    public i(HashSet hashSet) {
        this.f114927a = 24;
        this.f114928b = new HashSet();
        this.f114929c = (ClassLoader[]) hashSet.toArray(new ClassLoader[0]);
    }

    public i(File file) {
        this.f114927a = 23;
        this.f114928b = file;
        this.f114929c = new ReentrantReadWriteLock();
    }

    public i(f0.j executor) {
        this.f114927a = 3;
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f114928b = executor;
        this.f114929c = new AtomicInteger(0);
    }

    public i(wf.b bVar) {
        this.f114927a = 28;
        this.f114929c = new ArrayList();
        this.f114928b = bVar;
    }

    public i(CameraDevice cameraDevice, q qVar) {
        this.f114927a = 4;
        cameraDevice.getClass();
        this.f114928b = cameraDevice;
        this.f114929c = qVar;
    }

    public i() {
        this.f114927a = 13;
        this.f114928b = EGL14.EGL_NO_CONTEXT;
        this.f114929c = new ArrayList();
    }

    public i(Context context, v.d1 d1Var, w.t tVar, LinkedHashSet linkedHashSet) {
        this.f114927a = 2;
        this.f114928b = new HashMap();
        this.f114929c = d1Var;
        tVar = tVar instanceof w.t ? tVar : w.t.a(context, e0.t.s());
        context.getClass();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((Map) this.f114928b).put(str, new r2(context, str, tVar, (v.d) this.f114929c));
        }
    }

    public i(t0 t0Var) {
        this.f114927a = 20;
        this.f114929c = t0Var;
        this.f114928b = new g1.p();
    }

    public i(List list, r0.c cVar) {
        this.f114927a = 7;
        com.bumptech.glide.d.g("No preferred quality and fallback strategy.", (list.isEmpty() && cVar == r0.o.f105615a) ? false : true);
        this.f114928b = Collections.unmodifiableList(new ArrayList(list));
        this.f114929c = cVar;
    }

    public i(v2 v2Var, int[] iArr) {
        this.f114927a = 12;
        this.f114928b = c1.r(v2Var);
        this.f114929c = iArr;
    }

    public i(CardView cardView) {
        this.f114927a = 9;
        this.f114929c = cardView;
    }

    public i(f0 f0Var) {
        this.f114927a = 19;
        this.f114929c = f0Var;
        this.f114928b = new c0(new byte[4], 0, 0);
    }
}
