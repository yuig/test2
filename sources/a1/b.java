package a1;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kh2.m0;
import y0.f0;

/* loaded from: classes2.dex */
public final class b implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f233a;

    /* renamed from: b, reason: collision with root package name */
    public final Range f234b;

    /* renamed from: c, reason: collision with root package name */
    public final Range f235c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f236d;

    public b(f0 f0Var) {
        HashSet hashSet = new HashSet();
        this.f236d = hashSet;
        this.f233a = f0Var;
        int f13 = f0Var.f();
        this.f234b = Range.create(Integer.valueOf(f13), Integer.valueOf(((int) Math.ceil(4096.0d / f13)) * f13));
        int c13 = f0Var.c();
        this.f235c = Range.create(Integer.valueOf(c13), Integer.valueOf(((int) Math.ceil(2160.0d / c13)) * c13));
        List list = MediaCodecInfoReportIncorrectInfoQuirk.f17037a;
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.f17037a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.emptySet());
    }

    public static f0 k(Size size, f0 f0Var) {
        if (!(f0Var instanceof b)) {
            if (w0.a.f126951a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !f0Var.e(size.getWidth(), size.getHeight())) {
                    m0.X0("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + size + " that should be valid in widths/heights = " + f0Var.i() + "/" + f0Var.j());
                }
            }
            f0Var = new b(f0Var);
        }
        if (size != null && (f0Var instanceof b)) {
            ((b) f0Var).f236d.add(size);
        }
        return f0Var;
    }

    @Override // y0.f0
    public final boolean a() {
        return this.f233a.a();
    }

    @Override // y0.f0
    public final Range b(int i13) {
        Integer valueOf = Integer.valueOf(i13);
        Range range = this.f235c;
        boolean contains = range.contains((Range) valueOf);
        f0 f0Var = this.f233a;
        com.bumptech.glide.d.g("Not supported height: " + i13 + " which is not in " + range + " or can not be divided by alignment " + f0Var.c(), contains && i13 % f0Var.c() == 0);
        return this.f234b;
    }

    @Override // y0.f0
    public final int c() {
        return this.f233a.c();
    }

    @Override // y0.f0
    public final boolean d(int i13, int i14) {
        f0 f0Var = this.f233a;
        if (f0Var.d(i13, i14)) {
            return true;
        }
        Iterator it = this.f236d.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getWidth() == i13 && size.getHeight() == i14) {
                return true;
            }
        }
        if (this.f234b.contains((Range) Integer.valueOf(i13))) {
            if (this.f235c.contains((Range) Integer.valueOf(i14)) && i13 % f0Var.f() == 0 && i14 % f0Var.c() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // y0.f0
    public final int f() {
        return this.f233a.f();
    }

    @Override // y0.f0
    public final Range g() {
        return this.f233a.g();
    }

    @Override // y0.f0
    public final Range h(int i13) {
        Integer valueOf = Integer.valueOf(i13);
        Range range = this.f234b;
        boolean contains = range.contains((Range) valueOf);
        f0 f0Var = this.f233a;
        com.bumptech.glide.d.g("Not supported width: " + i13 + " which is not in " + range + " or can not be divided by alignment " + f0Var.f(), contains && i13 % f0Var.f() == 0);
        return this.f235c;
    }

    @Override // y0.f0
    public final Range i() {
        return this.f234b;
    }

    @Override // y0.f0
    public final Range j() {
        return this.f235c;
    }
}
