package gc;

import a.o3;
import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.app.d1;
import androidx.appcompat.widget.t1;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.v0;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bp1.h;
import c0.i0;
import c0.n0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d0.o;
import d0.x;
import e0.u;
import g0.r;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import k6.g;
import kh2.m0;
import kh2.n3;
import l0.k;
import n.q;
import n7.g0;
import p5.f;
import q5.a2;
import q5.f1;
import q5.v;
import q5.y1;
import r4.i;
import r4.j;
import w.l;

/* loaded from: classes3.dex */
public class c implements f1, t1, d2, j, f, v, q5.f, t5.d {

    /* renamed from: a */
    public final /* synthetic */ int f64763a;

    /* renamed from: b */
    public final Object f64764b;

    public c(int i13) {
        this.f64763a = i13;
        if (i13 == 7) {
            this.f64764b = (SmallDisplaySizeQuirk) y.b.f136245a.b(SmallDisplaySizeQuirk.class);
            return;
        }
        if (i13 == 8) {
            this.f64764b = (ExtraSupportedSurfaceCombinationsQuirk) y.b.f136245a.b(ExtraSupportedSurfaceCombinationsQuirk.class);
            return;
        }
        if (i13 == 19) {
            this.f64764b = (CaptureFailedRetryQuirk) i0.a.f70646a.b(CaptureFailedRetryQuirk.class);
            return;
        }
        if (i13 == 20) {
            this.f64764b = (LargeJpegImageQuirk) i0.a.f70646a.b(LargeJpegImageQuirk.class);
        } else if (i13 != 24) {
            this.f64764b = h.b.f66367a;
        } else {
            this.f64764b = new ArrayList(32);
        }
    }

    public static c G() {
        return Build.VERSION.SDK_INT >= 30 ? new c(new e0.d(), 16) : new c(new o(5), 16);
    }

    public static String H(String str, b bVar, boolean z13) {
        String tempExtension = z13 ? bVar.tempExtension() : bVar.extension;
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - tempExtension.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder sb3 = new StringBuilder();
                for (byte b13 : digest) {
                    sb3.append(String.format("%02x", Byte.valueOf(b13)));
                }
                replaceAll = sb3.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return a.a.k("lottie_cache_", replaceAll, tempExtension);
    }

    public static c I(l lVar) {
        CameraCharacteristics.Key key;
        int i13 = Build.VERSION.SDK_INT;
        c cVar = null;
        if (i13 >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            DynamicRangeProfiles b13 = ku1.d.b(lVar.a(key));
            if (b13 != null) {
                com.bumptech.glide.d.v("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i13 >= 33);
                cVar = new c(new x.c(b13), 5);
            }
        }
        return cVar == null ? x.d.f131244a : cVar;
    }

    public static l0.b N(d0.c cVar) {
        l0.b bVar = cVar.f53502a;
        n0 n0Var = (n0) bVar.f81194a;
        Rect rect = bVar.f81198e;
        try {
            byte[] K = h.K(n0Var, rect, cVar.f53503b, bVar.f81199f);
            try {
                e0.h hVar = new e0.h(new g(new ByteArrayInputStream(K)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                RectF rectF = u.f56755a;
                Matrix matrix = new Matrix(bVar.f81200g);
                matrix.postTranslate(-rect.left, -rect.top);
                return new l0.b(K, hVar, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, size, rect2, bVar.f81199f, matrix, bVar.f81201h);
            } catch (IOException e13) {
                throw new ImageCaptureException("Failed to extract Exif from YUV-generated JPEG", e13);
            }
        } catch (ImageUtil$CodecFailedException e14) {
            throw new ImageCaptureException("Failed to encode the image to JPEG.", e14);
        }
    }

    @Override // r4.j
    public final Object C(i iVar) {
        switch (this.f64763a) {
            case 17:
                com.bumptech.glide.d.v("The result can only set once!", ((g0.d) this.f64764b).f63189b == null);
                ((g0.d) this.f64764b).f63189b = iVar;
                return "FutureChain[" + ((g0.d) this.f64764b) + "]";
            default:
                com.bumptech.glide.d.v("The result can only set once!", ((r) this.f64764b).f63223f == null);
                ((r) this.f64764b).f63223f = iVar;
                return "ListFuture[" + this + "]";
        }
    }

    @Override // q5.f
    public final int D() {
        int flags;
        flags = ((ContentInfo) this.f64764b).getFlags();
        return flags;
    }

    @Override // androidx.appcompat.widget.t1
    public final void E(n.o oVar, q qVar) {
        ((n.i) this.f64764b).f88612g.removeCallbacksAndMessages(null);
        int size = ((n.i) this.f64764b).f88614i.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                i13 = -1;
                break;
            } else if (oVar == ((n.h) ((n.i) this.f64764b).f88614i.get(i13)).f88605b) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 == -1) {
            return;
        }
        int i14 = i13 + 1;
        ((n.i) this.f64764b).f88612g.postAtTime(new n.g(this, i14 < ((n.i) this.f64764b).f88614i.size() ? (n.h) ((n.i) this.f64764b).f88614i.get(i14) : null, qVar, oVar, 0), oVar, SystemClock.uptimeMillis() + 200);
    }

    public final Object F(Object obj) {
        l0.b N;
        switch (this.f64763a) {
            case 14:
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.f64764b;
                k kVar = new k(new x((l0.b) obj), 1, 0);
                dVar.getClass();
                try {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(com.bumptech.glide.d.L(new o3(10, dVar, kVar)).f106128b.get());
                    throw null;
                } catch (Exception e13) {
                    e = e13;
                    if (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new ImageCaptureException("Failed to invoke ImageProcessor.", e);
                }
            default:
                d0.c cVar = (d0.c) obj;
                try {
                    l0.b bVar = cVar.f53502a;
                    int i13 = bVar.f81196c;
                    Object obj2 = bVar.f81194a;
                    if (i13 == 35) {
                        N = N(cVar);
                    } else {
                        if (i13 != 256 && i13 != 4101) {
                            throw new IllegalArgumentException("Unexpected format: " + i13);
                        }
                        N = M(cVar, i13);
                    }
                    ((n0) obj2).close();
                    return N;
                } catch (Throwable th3) {
                    ((n0) cVar.f53502a.f81194a).close();
                    throw th3;
                }
        }
    }

    public final File J(String str) {
        File file = new File(L(), H(str, b.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(L(), H(str, b.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(L(), H(str, b.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public final int K(byte[] bArr) {
        int i13;
        byte b13;
        LargeJpegImageQuirk largeJpegImageQuirk = (LargeJpegImageQuirk) this.f64764b;
        if (largeJpegImageQuirk != null) {
            largeJpegImageQuirk.getClass();
            if (("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.f17029a.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.e() || bArr.length > 10000000) {
                int i14 = 2;
                while (true) {
                    if (i14 + 4 > bArr.length || (b13 = bArr[i14]) != -1) {
                        break;
                    }
                    int i15 = i14 + 2;
                    int i16 = ((bArr[i15] & 255) << 8) | (bArr[i14 + 3] & 255);
                    if (b13 == -1 && bArr[i14 + 1] == -38) {
                        while (true) {
                            i13 = i15 + 2;
                            if (i13 <= bArr.length) {
                                if (bArr[i15] == -1 && bArr[i15 + 1] == -39) {
                                    break;
                                }
                                i15++;
                            } else {
                                break;
                            }
                        }
                    } else {
                        i14 += i16 + 2;
                    }
                }
                i13 = -1;
                return i13 != -1 ? i13 : bArr.length;
            }
        }
        return bArr.length;
    }

    public final File L() {
        Context context = (Context) ((a8.v) this.f64764b).f1465b;
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        File file = new File(context.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final l0.b M(d0.c cVar, int i13) {
        byte[] bArr;
        byte b13;
        l0.b bVar = cVar.f53502a;
        c cVar2 = (c) this.f64764b;
        n0 n0Var = (n0) bVar.f81194a;
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = (IncorrectJpegMetadataQuirk) cVar2.f64764b;
        int i14 = 0;
        if (incorrectJpegMetadataQuirk == null) {
            ByteBuffer l13 = n0Var.W0()[0].l();
            bArr = new byte[l13.capacity()];
            l13.rewind();
            l13.get(bArr);
        } else {
            incorrectJpegMetadataQuirk.getClass();
            ByteBuffer l14 = n0Var.W0()[0].l();
            int capacity = l14.capacity();
            byte[] bArr2 = new byte[capacity];
            l14.rewind();
            l14.get(bArr2);
            int i15 = 2;
            for (int i16 = 2; i16 + 4 <= capacity && (b13 = bArr2[i16]) == -1; i16 += (((bArr2[i16 + 2] & 255) << 8) | (bArr2[i16 + 3] & 255)) + 2) {
                if (b13 == -1 && bArr2[i16 + 1] == -38) {
                    break;
                }
            }
            while (true) {
                int i17 = i15 + 1;
                if (i17 > capacity) {
                    i14 = -1;
                    break;
                }
                if (bArr2[i15] == -1 && bArr2[i17] == -40) {
                    i14 = i15;
                    break;
                }
                i15 = i17;
            }
            if (i14 == -1) {
                bArr = bArr2;
            }
            bArr = Arrays.copyOfRange(bArr2, i14, l14.limit());
        }
        byte[] bArr3 = bArr;
        e0.h hVar = bVar.f81195b;
        Objects.requireNonNull(hVar);
        return new l0.b(bArr3, hVar, i13, bVar.f81197d, bVar.f81198e, bVar.f81199f, bVar.f81200g, bVar.f81201h);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f64764b
            r1 = r0
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r1 = (androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk) r1
            r2 = 0
            if (r1 == 0) goto L24
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            r4 = 1
            if (r1 >= r3) goto L16
            r0.getClass()
        L14:
            r0 = r2
            goto L20
        L16:
            w.l r0 = r0.f16784a
            r1 = 5
            int r0 = v.n.r(r0, r1)
            if (r0 != r1) goto L14
            r0 = r4
        L20:
            r0 = r0 ^ r4
            if (r0 == 0) goto L24
            r2 = r4
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "shouldUseFlashModeTorch: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "UseFlashModeTorchFor3aUpdate"
            kh2.m0.p(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.c.O():boolean");
    }

    public final void P() {
        i0 i0Var = (i0) this.f64764b;
        synchronized (i0Var.f24254p) {
            try {
                Integer num = (Integer) i0Var.f24254p.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != i0Var.D()) {
                    i0Var.H();
                }
            } finally {
            }
        }
    }

    public final File Q(String str, InputStream inputStream, b bVar) {
        File file = new File(L(), H(str, bVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th3) {
                fileOutputStream.close();
                throw th3;
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // q5.f
    public final int b() {
        int source;
        source = ((ContentInfo) this.f64764b).getSource();
        return source;
    }

    @Override // q5.f
    public final ContentInfo c() {
        return (ContentInfo) this.f64764b;
    }

    @Override // p5.f
    public final Object get() {
        int i13;
        int D0 = n3.D0((r0.a) this.f64764b);
        int E0 = n3.E0((r0.a) this.f64764b);
        int i14 = ((r0.a) this.f64764b).f105475e;
        if (i14 == -1) {
            m0.p("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            i14 = 1;
        } else {
            m0.p("DefAudioResolver", "Using supplied AUDIO channel count: " + i14);
        }
        Range range = ((r0.a) this.f64764b).f105474d;
        if (r0.a.f105470g.equals(range)) {
            m0.p("DefAudioResolver", "Using fallback AUDIO sample rate: 44100Hz");
            i13 = 44100;
        } else {
            int J0 = n3.J0(range, i14, E0, ((Integer) range.getUpper()).intValue());
            m0.p("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: " + J0 + "Hz");
            i13 = J0;
        }
        List list = u0.i.f119769e;
        s.a aVar = new s.a();
        aVar.f110242a = -1;
        aVar.f110243b = -1;
        aVar.f110244c = -1;
        aVar.f110245d = -1;
        aVar.f110242a = Integer.valueOf(D0);
        aVar.f110245d = Integer.valueOf(E0);
        aVar.f110244c = Integer.valueOf(i14);
        aVar.f110243b = Integer.valueOf(i13);
        return aVar.a();
    }

    @Override // androidx.camera.core.impl.d2
    public final v0 getConfig() {
        return (v0) this.f64764b;
    }

    @Override // t5.d
    public final ClipDescription getDescription() {
        return ((InputContentInfo) this.f64764b).getDescription();
    }

    @Override // q5.v
    public final a2 k(View view, a2 a2Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f64764b;
        if (!Objects.equals(coordinatorLayout.f17893m, a2Var)) {
            coordinatorLayout.f17893m = a2Var;
            boolean z13 = a2Var.e() > 0;
            coordinatorLayout.f17894n = z13;
            coordinatorLayout.setWillNotDraw(!z13 && coordinatorLayout.getBackground() == null);
            y1 y1Var = a2Var.f102400a;
            if (!y1Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = coordinatorLayout.getChildAt(i13);
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    if (childAt.getFitsSystemWindows() && ((androidx.coordinatorlayout.widget.c) childAt.getLayoutParams()).f17900a != null && y1Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return a2Var;
    }

    @Override // t5.d
    public final Object q() {
        return (InputContentInfo) this.f64764b;
    }

    @Override // q5.f1
    public final void s(View view) {
        ((View) ((d1) this.f64764b).f15974d.getParent()).invalidate();
    }

    @Override // q5.f
    public final ClipData t() {
        ClipData clip;
        clip = ((ContentInfo) this.f64764b).getClip();
        return clip;
    }

    public final String toString() {
        switch (this.f64763a) {
            case 28:
                return "ContentInfoCompat{" + ((ContentInfo) this.f64764b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // androidx.appcompat.widget.t1
    public final void v(n.o oVar, MenuItem menuItem) {
        ((n.i) this.f64764b).f88612g.removeCallbacksAndMessages(oVar);
    }

    @Override // t5.d
    public final Uri w() {
        return ((InputContentInfo) this.f64764b).getContentUri();
    }

    @Override // t5.d
    public final void x() {
        ((InputContentInfo) this.f64764b).requestPermission();
    }

    @Override // t5.d
    public final Uri y() {
        return ((InputContentInfo) this.f64764b).getLinkUri();
    }

    public c(int i13, androidx.camera.core.impl.r rVar) {
        this.f64763a = i13;
        if (i13 == 9) {
            this.f64764b = (CaptureSessionOnClosedNotCalledQuirk) rVar.b(CaptureSessionOnClosedNotCalledQuirk.class);
            return;
        }
        if (i13 == 11) {
            this.f64764b = (TorchFlashRequiredFor3aUpdateQuirk) rVar.b(TorchFlashRequiredFor3aUpdateQuirk.class);
            return;
        }
        if (i13 == 15) {
            this.f64764b = new c(21, rVar);
            return;
        }
        if (i13 != 21) {
            AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) rVar.b(AeFpsRangeLegacyQuirk.class);
            if (aeFpsRangeLegacyQuirk == null) {
                this.f64764b = null;
                return;
            } else {
                this.f64764b = aeFpsRangeLegacyQuirk.f16756a;
                return;
            }
        }
        this.f64764b = (IncorrectJpegMetadataQuirk) rVar.b(IncorrectJpegMetadataQuirk.class);
    }

    public /* synthetic */ c(Object obj, int i13) {
        this.f64763a = i13;
        this.f64764b = obj;
    }

    public c(Object obj) {
        this.f64763a = 29;
        this.f64764b = (InputContentInfo) obj;
    }

    public c(ContentInfo contentInfo) {
        this.f64763a = 28;
        contentInfo.getClass();
        this.f64764b = g0.l(contentInfo);
    }
}
