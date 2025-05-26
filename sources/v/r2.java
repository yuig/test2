package v;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r2 {

    /* renamed from: i, reason: collision with root package name */
    public final String f123628i;

    /* renamed from: j, reason: collision with root package name */
    public final d f123629j;

    /* renamed from: k, reason: collision with root package name */
    public final w.l f123630k;

    /* renamed from: l, reason: collision with root package name */
    public final gc.c f123631l;

    /* renamed from: m, reason: collision with root package name */
    public final int f123632m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f123633n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f123634o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f123635p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f123636q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f123637r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.camera.core.impl.m f123638s;

    /* renamed from: u, reason: collision with root package name */
    public final x1 f123640u;

    /* renamed from: x, reason: collision with root package name */
    public final z1 f123643x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f123620a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f123621b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f123622c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f123623d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f123624e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f123625f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f123626g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f123627h = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f123639t = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final kp.n f123641v = new kp.n(25);

    /* renamed from: w, reason: collision with root package name */
    public final z.c f123642w = new z.c(1);

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0718, code lost:
    
        if (r0.length != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x041d, code lost:
    
        if (androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.f16764c.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US)) == false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r2(android.content.Context r17, java.lang.String r18, w.t r19, v.d r20) {
        /*
            Method dump skipped, instructions count: 2309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.r2.<init>(android.content.Context, java.lang.String, w.t, v.d):void");
    }

    public static Size c(StreamConfigurationMap streamConfigurationMap, int i13, boolean z13) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i13 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i13);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        e0.f fVar = new e0.f(false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), fVar);
        Size size2 = k0.c.f77781a;
        if (z13 && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i13)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), fVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), fVar);
    }

    public static int e(Range range, Range range2) {
        com.bumptech.glide.d.v("Ranges must not intersect", (range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(c cVar, List list) {
        List list2;
        HashMap hashMap = this.f123624e;
        if (hashMap.containsKey(cVar)) {
            list2 = (List) hashMap.get(cVar);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z13 = cVar.f123377d;
            int i13 = cVar.f123374a;
            if (!z13) {
                int i14 = cVar.f123375b;
                if (i14 == 8) {
                    if (i13 != 1) {
                        ArrayList arrayList2 = this.f123620a;
                        if (i13 != 2) {
                            if (cVar.f123376c) {
                                arrayList2 = this.f123623d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.f123621b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        arrayList = this.f123622c;
                    }
                } else if (i14 == 10 && i13 == 0) {
                    arrayList.addAll(this.f123625f);
                }
            } else if (i13 == 0) {
                arrayList.addAll(this.f123626g);
            }
            hashMap.put(cVar, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            z14 = ((androidx.camera.core.impl.r2) it.next()).c(list) != null;
            if (z14) {
                break;
            }
        }
        return z14;
    }

    public final void b() {
        Size size;
        Size size2;
        int parseInt;
        d dVar;
        CamcorderProfile camcorderProfile;
        CamcorderProfile a13;
        Size e13 = this.f123640u.e();
        try {
            parseInt = Integer.parseInt(this.f123628i);
            dVar = this.f123629j;
            camcorderProfile = null;
            a13 = dVar.b(parseInt, 1) ? dVar.a(parseInt, 1) : null;
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) this.f123630k.b().f126947a.f126926a).getOutputSizes(MediaRecorder.class);
            if (outputSizes != null) {
                Arrays.sort(outputSizes, new e0.f(true));
                int length = outputSizes.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        size = k0.c.f77784d;
                        break;
                    }
                    Size size3 = outputSizes[i13];
                    int width = size3.getWidth();
                    Size size4 = k0.c.f77786f;
                    if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                        size = size3;
                        break;
                    }
                    i13++;
                }
            } else {
                size = k0.c.f77784d;
            }
        }
        if (a13 != null) {
            size2 = new Size(a13.videoFrameWidth, a13.videoFrameHeight);
            this.f123638s = new androidx.camera.core.impl.m(k0.c.f77783c, new HashMap(), e13, new HashMap(), size2, new HashMap(), new HashMap());
        }
        size = k0.c.f77784d;
        if (dVar.b(parseInt, 10)) {
            camcorderProfile = dVar.a(parseInt, 10);
        } else if (dVar.b(parseInt, 8)) {
            camcorderProfile = dVar.a(parseInt, 8);
        } else if (dVar.b(parseInt, 12)) {
            camcorderProfile = dVar.a(parseInt, 12);
        } else if (dVar.b(parseInt, 6)) {
            camcorderProfile = dVar.a(parseInt, 6);
        } else if (dVar.b(parseInt, 5)) {
            camcorderProfile = dVar.a(parseInt, 5);
        } else if (dVar.b(parseInt, 4)) {
            camcorderProfile = dVar.a(parseInt, 4);
        }
        if (camcorderProfile != null) {
            size = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        }
        size2 = size;
        this.f123638s = new androidx.camera.core.impl.m(k0.c.f77783c, new HashMap(), e13, new HashMap(), size2, new HashMap(), new HashMap());
    }

    public final List d(c cVar, List list) {
        androidx.camera.core.impl.c cVar2 = q2.f123609a;
        if (cVar.f123374a == 0 && cVar.f123375b == 8) {
            Iterator it = this.f123627h.iterator();
            while (it.hasNext()) {
                List c13 = ((androidx.camera.core.impl.r2) it.next()).c(list);
                if (c13 != null) {
                    return c13;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x035a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0737, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0910, code lost:
    
        if (r7 != null) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0912, code lost:
    
        if (r15 == false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0942, code lost:
    
        throw new java.lang.IllegalArgumentException(r11 + r39.f123628i + r32 + r41 + r30 + r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0914, code lost:
    
        r6 = r23;
        r15 = r30;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0b1e, code lost:
    
        if (r14 >= r0) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c9, code lost:
    
        if (r4.contains(r14) != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0dcd  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0e17  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0bdf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair g(int r40, java.util.ArrayList r41, java.util.HashMap r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 4086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.r2.g(int, java.util.ArrayList, java.util.HashMap, boolean, boolean):android.util.Pair");
    }

    public final Pair h(int i13, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i14, HashMap hashMap, HashMap hashMap2) {
        int i15;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.a aVar = (androidx.camera.core.impl.a) it.next();
            arrayList4.add(aVar.f16791a);
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(arrayList4.size() - 1), aVar);
            }
        }
        for (int i16 = 0; i16 < list.size(); i16++) {
            Size size = (Size) list.get(i16);
            androidx.camera.core.impl.z2 z2Var = (androidx.camera.core.impl.z2) arrayList2.get(((Integer) arrayList3.get(i16)).intValue());
            int l13 = z2Var.l();
            arrayList4.add(androidx.camera.core.impl.l.c(i13, l13, size, i(l13)));
            if (hashMap2 != null) {
                hashMap2.put(Integer.valueOf(arrayList4.size() - 1), z2Var);
            }
            try {
                i15 = (int) (1.0E9d / ((StreamConfigurationMap) this.f123630k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(z2Var.l(), size));
            } catch (Exception unused) {
                i15 = 0;
            }
            i14 = Math.min(i14, i15);
        }
        return new Pair(arrayList4, Integer.valueOf(i14));
    }

    public final androidx.camera.core.impl.m i(int i13) {
        CameraCharacteristics.Key key;
        ArrayList arrayList = this.f123639t;
        if (!arrayList.contains(Integer.valueOf(i13))) {
            j(this.f123638s.f16908b, k0.c.f77785e, i13);
            j(this.f123638s.f16910d, k0.c.f77787g, i13);
            Map map = this.f123638s.f16912f;
            w.l lVar = this.f123630k;
            Size c13 = c((StreamConfigurationMap) lVar.b().f126947a.f126926a, i13, true);
            if (c13 != null) {
                map.put(Integer.valueOf(i13), c13);
            }
            Map map2 = this.f123638s.f16913g;
            if (Build.VERSION.SDK_INT >= 31 && this.f123637r) {
                key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) lVar.a(key);
                if (streamConfigurationMap != null) {
                    map2.put(Integer.valueOf(i13), c(streamConfigurationMap, i13, true));
                }
            }
            arrayList.add(Integer.valueOf(i13));
        }
        return this.f123638s;
    }

    public final void j(Map map, Size size, int i13) {
        if (this.f123635p) {
            Size c13 = c((StreamConfigurationMap) this.f123630k.b().f126947a.f126926a, i13, false);
            Integer valueOf = Integer.valueOf(i13);
            if (c13 != null) {
                size = (Size) Collections.min(Arrays.asList(size, c13), new e0.f(false));
            }
            map.put(valueOf, size);
        }
    }
}
