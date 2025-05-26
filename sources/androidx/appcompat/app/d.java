package androidx.appcompat.app;

import a.y3;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Log;
import android.util.LogPrinter;
import android.util.Size;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import androidx.core.widget.NestedScrollView;
import androidx.gridlayout.widget.GridLayout;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.measurement.q4;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import i2.v3;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;
import pk.v2;

/* loaded from: classes2.dex */
public class d implements androidx.core.widget.i, r4.j, androidx.camera.core.impl.c1, t5.d, v9.b0, wd.v, bg.k {

    /* renamed from: e */
    public static d f15964e;

    /* renamed from: a */
    public final /* synthetic */ int f15965a;

    /* renamed from: b */
    public Object f15966b;

    /* renamed from: c */
    public Object f15967c;

    /* renamed from: d */
    public Object f15968d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType(), 20);
        this.f15965a = 20;
        Intrinsics.checkNotNullParameter(intent, "intent");
    }

    public static Object[] m(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        LogPrinter logPrinter = GridLayout.f18515i;
        int i13 = -1;
        for (int i14 : iArr) {
            i13 = Math.max(i13, i14);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i13 + 1);
        for (int i15 = 0; i15 < length; i15++) {
            objArr2[iArr[i15]] = objArr[i15];
        }
        return objArr2;
    }

    public static d r(Context context) {
        if (f15964e == null) {
            Context applicationContext = context.getApplicationContext();
            f15964e = new d(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f15964e;
    }

    public Object A(kc.b bVar) {
        return this.f15968d;
    }

    public final Object B(float f13, float f14, Object obj, Object obj2, float f15, float f16, float f17) {
        kc.b bVar = (kc.b) this.f15966b;
        bVar.f79119a = f13;
        bVar.f79120b = f14;
        bVar.f79121c = obj;
        bVar.f79122d = obj2;
        bVar.f79123e = f15;
        bVar.f79124f = f16;
        bVar.f79125g = f17;
        return A(bVar);
    }

    @Override // r4.j
    public final Object C(r4.i iVar) {
        iVar.a(new z(this, 3), l3.c.s());
        ((f0.f) this.f15968d).f60732a.set(iVar);
        return "HandlerScheduledFuture-" + ((Callable) this.f15967c).toString();
    }

    public final boolean D() {
        String trim;
        if (((String) this.f15968d) != null) {
            return true;
        }
        if (!((Queue) this.f15967c).isEmpty()) {
            String str = (String) ((Queue) this.f15967c).poll();
            str.getClass();
            this.f15968d = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f15966b).readLine();
            this.f15968d = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.f15968d = trim;
        } while (trim.isEmpty());
        return true;
    }

    public final void E(g7.f fVar, Uri uri, Map map, long j13, long j14, q8.u uVar) {
        boolean z13;
        q8.o oVar = new q8.o(fVar, j13, j14);
        this.f15968d = oVar;
        if (((q8.s) this.f15967c) != null) {
            return;
        }
        q8.s[] e13 = ((q8.v) this.f15966b).e(uri, map);
        pk.x0 p13 = pk.c1.p(e13.length);
        boolean z14 = true;
        if (e13.length == 1) {
            this.f15967c = e13[0];
        } else {
            int length = e13.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                q8.s sVar = e13[i13];
                try {
                } catch (EOFException unused) {
                    z13 = ((q8.s) this.f15967c) != null || oVar.f102981d == j13;
                } catch (Throwable th3) {
                    if (((q8.s) this.f15967c) == null && oVar.f102981d != j13) {
                        z14 = false;
                    }
                    bf.b.t(z14);
                    oVar.f102983f = 0;
                    throw th3;
                }
                if (sVar.i(oVar)) {
                    this.f15967c = sVar;
                    oVar.f102983f = 0;
                    break;
                } else {
                    p13.b(sVar.j());
                    z13 = ((q8.s) this.f15967c) != null || oVar.f102981d == j13;
                    bf.b.t(z13);
                    oVar.f102983f = 0;
                    i13++;
                }
            }
            if (((q8.s) this.f15967c) == null) {
                String str = "None of the available extractors (" + z.a.n(", ").l(com.bumptech.glide.d.y0(new y3(13), pk.c1.s(e13))) + ") could read the stream.";
                uri.getClass();
                v2 i14 = p13.i();
                UnrecognizedInputFormatException unrecognizedInputFormatException = new UnrecognizedInputFormatException(str, null, false, 1);
                pk.c1.r(i14);
                throw unrecognizedInputFormatException;
            }
        }
        ((q8.s) this.f15967c).f(uVar);
    }

    public final void F(v.o oVar) {
        synchronized (this.f15966b) {
            try {
                oVar.getClass();
                for (String str : new LinkedHashSet(oVar.f123583f)) {
                    kh2.m0.p("CameraRepository", "Added camera: " + str);
                    ((Map) this.f15967c).put(str, oVar.a(str));
                }
            } catch (CameraUnavailableException e13) {
                throw new InitializationException(e13);
            }
        }
    }

    public final boolean G() {
        if (((v3) this.f15966b).getValue() == this.f15968d) {
            Object obj = this.f15967c;
            if (((d) obj) == null || !((d) obj).G()) {
                return false;
            }
        }
        return true;
    }

    public final String H() {
        if (!D()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f15968d;
        this.f15968d = null;
        return str;
    }

    public final void I(Exception exc, boolean z13) {
        this.f15967c = null;
        pk.c1 r13 = pk.c1.r((Set) this.f15966b);
        ((Set) this.f15966b).clear();
        pk.y0 listIterator = r13.listIterator(0);
        while (listIterator.hasNext()) {
            s7.d dVar = (s7.d) listIterator.next();
            dVar.getClass();
            dVar.j(z13 ? 1 : 3, exc);
        }
    }

    public final void J(androidx.lifecycle.q qVar) {
        v.b0 b0Var = (v.b0) this.f15968d;
        if (b0Var != null) {
            b0Var.run();
        }
        v.b0 b0Var2 = new v.b0((androidx.lifecycle.b0) this.f15966b, qVar);
        this.f15968d = b0Var2;
        ((Handler) this.f15967c).postAtFrontOfQueue(b0Var2);
    }

    public final void K(s7.d dVar) {
        ((Set) this.f15966b).add(dVar);
        if (((s7.d) this.f15967c) != null) {
            return;
        }
        this.f15967c = dVar;
        s7.u c13 = dVar.f111265b.c();
        dVar.f111288y = c13;
        s7.a aVar = dVar.f111282s;
        int i13 = d7.n0.f53866a;
        c13.getClass();
        aVar.getClass();
        aVar.obtainMessage(1, new s7.b(g8.v.f64440d.getAndIncrement(), true, SystemClock.elapsedRealtime(), c13)).sendToTarget();
    }

    public final void L() {
        switch (this.f15965a) {
            case 15:
                AudioTrack audioTrack = (AudioTrack) this.f15966b;
                AudioRouting.OnRoutingChangedListener onRoutingChangedListener = (AudioRouting.OnRoutingChangedListener) this.f15968d;
                onRoutingChangedListener.getClass();
                audioTrack.removeOnRoutingChangedListener(onRoutingChangedListener);
                this.f15968d = null;
                break;
            default:
                q8.s sVar = (q8.s) this.f15967c;
                if (sVar != null) {
                    sVar.a();
                    this.f15967c = null;
                }
                this.f15968d = null;
                break;
        }
    }

    @Override // v9.b0
    public final void a(d7.k0 k0Var, q8.u uVar, v9.h0 h0Var) {
        this.f15967c = k0Var;
        h0Var.a();
        h0Var.b();
        q8.k0 D = uVar.D(h0Var.f124634d, 5);
        this.f15968d = D;
        D.b((androidx.media3.common.b) this.f15966b);
    }

    @Override // androidx.camera.core.impl.c1
    public final boolean b(int i13) {
        switch (this.f15965a) {
            case 8:
                if (((androidx.camera.core.impl.c1) this.f15966b).b(i13)) {
                    break;
                }
                break;
            case 9:
                if (((androidx.camera.core.impl.c1) this.f15966b).b(i13)) {
                    break;
                }
                break;
            default:
                if (((androidx.camera.core.impl.c1) this.f15966b).b(i13)) {
                    break;
                }
                break;
        }
        return v(i13) != null;
    }

    @Override // wd.v
    public final Bitmap c(BitmapFactory.Options options) {
        switch (this.f15965a) {
            case 24:
                wd.y yVar = (wd.y) ((com.bumptech.glide.load.data.n) this.f15966b).f29818b;
                yVar.reset();
                return BitmapFactory.decodeStream(yVar, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.n) this.f15968d).a().getFileDescriptor(), null, options);
        }
    }

    @Override // bg.k
    public final Reader d(String str) {
        Reader d2 = ((z.a) this.f15966b).d(str);
        if (d2 != null) {
            return d2;
        }
        Reader d13 = ((fg.a) this.f15967c).d(str);
        return d13 == null ? ((kp.n) this.f15968d).d(str) : d13;
    }

    @Override // v9.b0
    public final void e(d7.d0 d0Var) {
        long d2;
        long j13;
        bf.b.w((d7.k0) this.f15967c);
        int i13 = d7.n0.f53866a;
        d7.k0 k0Var = (d7.k0) this.f15967c;
        synchronized (k0Var) {
            try {
                long j14 = k0Var.f53848c;
                d2 = j14 != -9223372036854775807L ? j14 + k0Var.f53847b : k0Var.d();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        d7.k0 k0Var2 = (d7.k0) this.f15967c;
        synchronized (k0Var2) {
            j13 = k0Var2.f53847b;
        }
        if (d2 == -9223372036854775807L || j13 == -9223372036854775807L) {
            return;
        }
        androidx.media3.common.b bVar = (androidx.media3.common.b) this.f15966b;
        if (j13 != bVar.f18770t) {
            a7.q a13 = bVar.a();
            a13.f1186s = j13;
            androidx.media3.common.b bVar2 = new androidx.media3.common.b(a13);
            this.f15966b = bVar2;
            ((q8.k0) this.f15968d).b(bVar2);
        }
        int a14 = d0Var.a();
        ((q8.k0) this.f15968d).d(a14, 0, d0Var);
        ((q8.k0) this.f15968d).a(d2, 1, a14, 0, null);
    }

    @Override // wd.v
    public final void f() {
        switch (this.f15965a) {
            case 24:
                wd.y yVar = (wd.y) ((com.bumptech.glide.load.data.n) this.f15966b).f29818b;
                synchronized (yVar) {
                    yVar.f129217c = yVar.f129215a.length;
                }
                return;
            default:
                return;
        }
    }

    @Override // wd.v
    public final int g() {
        wd.y yVar;
        switch (this.f15965a) {
            case 24:
                List list = (List) this.f15968d;
                wd.y yVar2 = (wd.y) ((com.bumptech.glide.load.data.n) this.f15966b).f29818b;
                yVar2.reset();
                return bs1.c.N0((qd.i) this.f15967c, yVar2, list);
            default:
                List list2 = (List) this.f15967c;
                com.bumptech.glide.load.data.n nVar = (com.bumptech.glide.load.data.n) this.f15968d;
                qd.i iVar = (qd.i) this.f15966b;
                int size = list2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    nd.f fVar = (nd.f) list2.get(i13);
                    wd.y yVar3 = null;
                    try {
                        yVar = new wd.y(new FileInputStream(nVar.a().getFileDescriptor()), iVar);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        int a13 = fVar.a(yVar, iVar);
                        yVar.c();
                        nVar.a();
                        if (a13 != -1) {
                            return a13;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        yVar3 = yVar;
                        if (yVar3 != null) {
                            yVar3.c();
                        }
                        nVar.a();
                        throw th;
                    }
                }
                return -1;
        }
    }

    @Override // t5.d
    public final ClipDescription getDescription() {
        return (ClipDescription) this.f15967c;
    }

    @Override // androidx.core.widget.i
    public final void h(NestedScrollView nestedScrollView, int i13, int i14) {
        i.b(nestedScrollView, (View) this.f15966b, (View) this.f15967c);
    }

    @Override // wd.v
    public final ImageHeaderParser$ImageType i() {
        wd.y yVar;
        switch (this.f15965a) {
            case 24:
                List list = (List) this.f15968d;
                wd.y yVar2 = (wd.y) ((com.bumptech.glide.load.data.n) this.f15966b).f29818b;
                yVar2.reset();
                return bs1.c.V0((qd.i) this.f15967c, yVar2, list);
            default:
                List list2 = (List) this.f15967c;
                com.bumptech.glide.load.data.n nVar = (com.bumptech.glide.load.data.n) this.f15968d;
                qd.i iVar = (qd.i) this.f15966b;
                int size = list2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    nd.f fVar = (nd.f) list2.get(i13);
                    wd.y yVar3 = null;
                    try {
                        yVar = new wd.y(new FileInputStream(nVar.a().getFileDescriptor()), iVar);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        ImageHeaderParser$ImageType d2 = fVar.d(yVar);
                        yVar.c();
                        nVar.a();
                        if (d2 != ImageHeaderParser$ImageType.UNKNOWN) {
                            return d2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        yVar3 = yVar;
                        if (yVar3 != null) {
                            yVar3.c();
                        }
                        nVar.a();
                        throw th;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public final Size[] j(Size[] sizeArr, int i13) {
        List emptyList;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList(Arrays.asList(sizeArr));
        if (((ExtraSupportedOutputSizeQuirk) this.f15967c) != null) {
            Size[] sizeArr2 = (i13 == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr2.length > 0) {
                arrayList3.addAll(Arrays.asList(sizeArr2));
            }
        }
        z.a aVar = (z.a) this.f15968d;
        aVar.getClass();
        if (((ExcludedSupportedSizesQuirk) y.b.f136245a.b(ExcludedSupportedSizesQuirk.class)) == null) {
            emptyList = new ArrayList();
        } else {
            String str = aVar.f140498b;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i13 == 256) {
                    arrayList2.add(new Size(4160, 3120));
                    arrayList2.add(new Size(4000, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i13 == 256) {
                    arrayList2.add(new Size(4160, 3120));
                    arrayList2.add(new Size(4000, 3000));
                }
            } else {
                if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && (i13 == 34 || i13 == 35)) {
                        arrayList.add(new Size(720, 720));
                        arrayList.add(new Size(400, 400));
                    }
                } else if (ExcludedSupportedSizesQuirk.f()) {
                    arrayList2 = new ArrayList();
                    if (str.equals("0")) {
                        if (i13 == 34) {
                            arrayList2.add(new Size(4128, 3096));
                            arrayList2.add(new Size(4128, 2322));
                            arrayList2.add(new Size(3088, 3088));
                            arrayList2.add(new Size(3264, 2448));
                            arrayList2.add(new Size(3264, 1836));
                            arrayList2.add(new Size(2048, 1536));
                            arrayList2.add(new Size(2048, 1152));
                            arrayList2.add(new Size(1920, 1080));
                        } else if (i13 == 35) {
                            arrayList2.add(new Size(4128, 2322));
                            arrayList2.add(new Size(3088, 3088));
                            arrayList2.add(new Size(3264, 2448));
                            arrayList2.add(new Size(3264, 1836));
                            arrayList2.add(new Size(2048, 1536));
                            arrayList2.add(new Size(2048, 1152));
                            arrayList2.add(new Size(1920, 1080));
                        }
                    } else if (str.equals(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE) && (i13 == 34 || i13 == 35)) {
                        arrayList2.add(new Size(3264, 2448));
                        arrayList2.add(new Size(3264, 1836));
                        arrayList2.add(new Size(2448, 2448));
                        arrayList2.add(new Size(1920, 1920));
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    }
                } else if (ExcludedSupportedSizesQuirk.e()) {
                    arrayList2 = new ArrayList();
                    if (str.equals("0")) {
                        if (i13 == 34) {
                            arrayList2.add(new Size(4128, 3096));
                            arrayList2.add(new Size(4128, 2322));
                            arrayList2.add(new Size(3088, 3088));
                            arrayList2.add(new Size(3264, 2448));
                            arrayList2.add(new Size(3264, 1836));
                            arrayList2.add(new Size(2048, 1536));
                            arrayList2.add(new Size(2048, 1152));
                            arrayList2.add(new Size(1920, 1080));
                        } else if (i13 == 35) {
                            arrayList2.add(new Size(2048, 1536));
                            arrayList2.add(new Size(2048, 1152));
                            arrayList2.add(new Size(1920, 1080));
                        }
                    } else if (str.equals(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE) && (i13 == 34 || i13 == 35)) {
                        arrayList2.add(new Size(2576, 1932));
                        arrayList2.add(new Size(2560, 1440));
                        arrayList2.add(new Size(1920, 1920));
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                    }
                } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i13 == 256) {
                        arrayList.add(new Size(9280, 6944));
                    }
                } else {
                    kh2.m0.X0("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                    emptyList = Collections.emptyList();
                }
                emptyList = arrayList;
            }
            emptyList = arrayList2;
        }
        if (!emptyList.isEmpty()) {
            arrayList3.removeAll(emptyList);
        }
        if (arrayList3.isEmpty()) {
            kh2.m0.X0("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList3.toArray(new Size[0]);
    }

    @Override // androidx.camera.core.impl.c1
    public final androidx.camera.core.impl.d1 k(int i13) {
        switch (this.f15965a) {
            case 8:
                return t(i13);
            case 9:
                return u(i13);
            default:
                return v(i13);
        }
    }

    public final r0.e l() {
        String str = ((r0.m) this.f15966b) == null ? " videoSpec" : "";
        if (((r0.a) this.f15967c) == null) {
            str = str.concat(" audioSpec");
        }
        if (((Integer) this.f15968d) == null) {
            str = a.a.C(str, " outputFormat");
        }
        if (str.isEmpty()) {
            return new r0.e((r0.m) this.f15966b, (r0.a) this.f15967c, ((Integer) this.f15968d).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final void n(p5.a aVar) {
        r0.m mVar = (r0.m) this.f15966b;
        if (mVar == null) {
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }
        r0.l lVar = new r0.l();
        lVar.f105595a = mVar.f105607a;
        lVar.f105596b = mVar.f105608b;
        lVar.f105597c = mVar.f105609c;
        lVar.f105598d = Integer.valueOf(mVar.f105610d);
        aVar.accept(lVar);
        this.f15966b = lVar.a();
    }

    public final LinkedHashSet o() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f15966b) {
            linkedHashSet = new LinkedHashSet(((Map) this.f15967c).values());
        }
        return linkedHashSet;
    }

    public final long p() {
        Object obj = this.f15968d;
        if (((q8.t) obj) != null) {
            return ((q8.t) obj).h();
        }
        return -1L;
    }

    @Override // t5.d
    public final Object q() {
        return null;
    }

    public final Location s(String str) {
        try {
            if (((LocationManager) this.f15967c).isProviderEnabled(str)) {
                return ((LocationManager) this.f15967c).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e13) {
            Log.d("TwilightManager", "Failed to get last known location", e13);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.d1 t(int r19) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.t(int):androidx.camera.core.impl.d1");
    }

    public final String toString() {
        switch (this.f15965a) {
            case 20:
                StringBuilder sb3 = new StringBuilder("NavDeepLinkRequest{");
                if (((Uri) this.f15966b) != null) {
                    sb3.append(" uri=");
                    sb3.append(String.valueOf((Uri) this.f15966b));
                }
                if (((String) this.f15967c) != null) {
                    sb3.append(" action=");
                    sb3.append((String) this.f15967c);
                }
                if (((String) this.f15968d) != null) {
                    sb3.append(" mimetype=");
                    sb3.append((String) this.f15968d);
                }
                sb3.append(" }");
                String sb4 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
                return sb4;
            default:
                return super.toString();
        }
    }

    public final androidx.camera.core.impl.d1 u(int i13) {
        if (((Map) this.f15968d).containsKey(Integer.valueOf(i13))) {
            return (androidx.camera.core.impl.d1) ((Map) this.f15968d).get(Integer.valueOf(i13));
        }
        androidx.camera.core.impl.e eVar = null;
        if (((androidx.camera.core.impl.c1) this.f15966b).b(i13)) {
            androidx.camera.core.impl.d1 k13 = ((androidx.camera.core.impl.c1) this.f15966b).k(i13);
            c0.z zVar = (c0.z) this.f15967c;
            if (k13 != null) {
                ArrayList arrayList = new ArrayList();
                for (androidx.camera.core.impl.f fVar : k13.b()) {
                    if (z0.b.a(fVar, zVar)) {
                        arrayList.add(fVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    eVar = androidx.camera.core.impl.e.e(k13.a(), k13.c(), k13.d(), arrayList);
                }
            }
            ((Map) this.f15968d).put(Integer.valueOf(i13), eVar);
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.camera.core.impl.d1 v(int i13) {
        androidx.camera.core.impl.e eVar;
        Size size;
        if (((Map) this.f15968d).containsKey(Integer.valueOf(i13))) {
            return (androidx.camera.core.impl.d1) ((Map) this.f15968d).get(Integer.valueOf(i13));
        }
        if (((androidx.camera.core.impl.c1) this.f15966b).b(i13)) {
            androidx.camera.core.impl.d1 k13 = ((androidx.camera.core.impl.c1) this.f15966b).k(i13);
            Objects.requireNonNull(k13);
            Iterator it = ((androidx.camera.core.impl.r) this.f15967c).c(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((StretchedVideoResolutionQuirk) it.next()) != null) {
                    if (i13 == 4) {
                        size = new Size(640, 480);
                    } else if (i13 == 5) {
                        size = new Size(960, 720);
                    } else if (i13 == 6) {
                        size = new Size(1440, 1080);
                    }
                }
            }
            size = null;
            if (size == null) {
                eVar = k13;
            } else {
                ArrayList arrayList = new ArrayList();
                for (androidx.camera.core.impl.f fVar : k13.b()) {
                    arrayList.add(new androidx.camera.core.impl.f(fVar.f16829b, fVar.f16828a, fVar.f16830c, fVar.f16831d, size.getWidth(), size.getHeight(), fVar.f16834g, fVar.f16835h, fVar.f16836i, fVar.f16837j));
                }
                if (!arrayList.isEmpty()) {
                    eVar = androidx.camera.core.impl.e.e(k13.a(), k13.c(), k13.d(), arrayList);
                }
            }
            ((Map) this.f15968d).put(Integer.valueOf(i13), eVar);
            return eVar;
        }
        eVar = null;
        ((Map) this.f15968d).put(Integer.valueOf(i13), eVar);
        return eVar;
    }

    @Override // t5.d
    public final Uri w() {
        return (Uri) this.f15966b;
    }

    @Override // t5.d
    public final void x() {
    }

    @Override // t5.d
    public final Uri y() {
        return (Uri) this.f15968d;
    }

    public final Object z(int i13) {
        return ((Object[]) this.f15968d)[((int[]) this.f15966b)[i13]];
    }

    public /* synthetic */ d(Uri uri, Object obj, Object obj2, int i13) {
        this.f15965a = i13;
        this.f15966b = uri;
        this.f15967c = obj;
        this.f15968d = obj2;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3) {
        this.f15965a = 5;
        this.f15968d = obj;
        this.f15966b = obj2;
        this.f15967c = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(r0.e eVar, int i13) {
        this(eVar);
        this.f15965a = 7;
    }

    public d(androidx.lifecycle.z provider) {
        this.f15965a = 14;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f15966b = new androidx.lifecycle.b0(provider);
        this.f15967c = new Handler();
    }

    public d(PorterDuffColorFilter porterDuffColorFilter) {
        this.f15965a = 23;
        this.f15966b = new kc.b();
        this.f15968d = porterDuffColorFilter;
    }

    public d(int i13) {
        this.f15965a = i13;
        if (i13 != 7) {
            if (i13 == 23) {
                this.f15966b = new kc.b();
                this.f15968d = null;
            } else if (i13 == 26) {
                this.f15967c = new fg.a();
                this.f15966b = new z.a(3);
                this.f15968d = new kp.n(7);
            } else if (i13 != 28) {
                this.f15966b = new Object();
                this.f15967c = new LinkedHashMap();
                this.f15968d = new HashSet();
            }
        }
    }

    public d(androidx.camera.core.impl.c1 c1Var, c0.z zVar) {
        this.f15965a = 9;
        this.f15968d = new HashMap();
        this.f15966b = c1Var;
        this.f15967c = zVar;
    }

    public d(String str) {
        this.f15965a = 3;
        this.f15967c = (ExtraSupportedOutputSizeQuirk) y.b.f136245a.b(ExtraSupportedOutputSizeQuirk.class);
        this.f15966b = str;
        this.f15968d = new z.a(str, 0, 0);
    }

    public d(String str, int i13) {
        this.f15965a = 19;
        a7.q qVar = new a7.q();
        qVar.f1180m = a7.o0.r("video/mp2t");
        qVar.f1181n = a7.o0.r(str);
        this.f15966b = new androidx.media3.common.b(qVar);
    }

    public d(androidx.camera.core.impl.c1 c1Var, androidx.camera.core.impl.r rVar) {
        this.f15965a = 10;
        this.f15968d = new HashMap();
        this.f15966b = c1Var;
        this.f15967c = rVar;
    }

    public d(q8.v vVar) {
        this.f15965a = 18;
        this.f15966b = vVar;
    }

    public d(Context context, LocationManager locationManager) {
        this.f15965a = 1;
        this.f15968d = new a1();
        this.f15966b = context;
        this.f15967c = locationManager;
    }

    public d(d dVar) {
        v.l0 l0Var = y0.g0.f136340d;
        this.f15965a = 8;
        this.f15968d = new HashMap();
        this.f15966b = dVar;
        this.f15967c = l0Var;
    }

    public d(r0.e eVar) {
        this.f15965a = 7;
        this.f15966b = eVar.f105509a;
        this.f15967c = eVar.f105510b;
        this.f15968d = Integer.valueOf(eVar.f105511c);
    }

    public d(qd.i iVar, mc.f fVar, List list) {
        this.f15965a = 24;
        d7.b.p(iVar, "Argument must not be null");
        this.f15967c = iVar;
        d7.b.p(list, "Argument must not be null");
        this.f15968d = list;
        this.f15966b = new com.bumptech.glide.load.data.n(fVar, iVar);
    }

    public d(g4.z zVar, d dVar) {
        this.f15965a = 11;
        this.f15966b = zVar;
        this.f15967c = dVar;
        this.f15968d = ((g4.y) zVar).f63486a;
    }

    public d(ParcelFileDescriptor parcelFileDescriptor, List list, qd.i iVar) {
        this.f15965a = 25;
        d7.b.p(iVar, "Argument must not be null");
        this.f15966b = iVar;
        d7.b.p(list, "Argument must not be null");
        this.f15967c = list;
        this.f15968d = new com.bumptech.glide.load.data.n(parcelFileDescriptor);
    }

    public d(s7.h hVar) {
        this.f15965a = 16;
        this.f15968d = hVar;
        this.f15966b = new HashSet();
    }

    public d(q4 q4Var) {
        this.f15965a = 2;
        this.f15968d = q4Var;
        this.f15967c = new AtomicBoolean(false);
        this.f15966b = ((v.d0) q4Var.f31595c).f123399d.schedule(new v.y(this, 0), CameraPreview.AUTOFOCUS_INTERVAL_MILLIS, TimeUnit.MILLISECONDS);
    }

    public d(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f15965a = 17;
        this.f15967c = arrayDeque;
        this.f15966b = bufferedReader;
    }

    public d(AudioTrack audioTrack, o7.e eVar) {
        this.f15965a = 15;
        this.f15966b = audioTrack;
        this.f15967c = eVar;
        this.f15968d = new AudioRouting.OnRoutingChangedListener() { // from class: o7.a0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                AudioDeviceInfo routedDevice;
                androidx.appcompat.app.d dVar = androidx.appcompat.app.d.this;
                if (((AudioRouting.OnRoutingChangedListener) dVar.f15968d) == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                    return;
                }
                ((e) dVar.f15967c).c(routedDevice);
            }
        };
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) this.f15968d, new Handler(Looper.myLooper()));
    }

    public d(Object[] objArr, Object[] objArr2) {
        this.f15965a = 13;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i13 = 0; i13 < length; i13++) {
            Object obj = objArr[i13];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i13] = num.intValue();
        }
        this.f15966b = iArr;
        this.f15967c = m(objArr, iArr);
        this.f15968d = m(objArr2, (int[]) this.f15966b);
    }
}
