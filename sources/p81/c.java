package p81;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.pinterest.ui.imageview.WebImageView;
import hb0.d;
import kh2.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m81.i;
import m81.q;
import s81.o;
import s81.p;
import u81.r;

/* loaded from: classes5.dex */
public final class c extends d {

    /* renamed from: d, reason: collision with root package name */
    public i f99122d;

    /* renamed from: e, reason: collision with root package name */
    public final float f99123e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f99124f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f99125g;

    /* renamed from: h, reason: collision with root package name */
    public int f99126h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f99127i;

    /* renamed from: j, reason: collision with root package name */
    public String f99128j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f99129k;

    public c(o oVar, float f13, boolean z13) {
        this.f99122d = oVar;
        this.f99123e = f13;
        this.f99124f = z13;
    }

    @Override // hb0.c
    public final void c() {
        int intValue;
        Bitmap bitmap = this.f99125g;
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        if (this.f99124f) {
            int i13 = this.f99126h;
            boolean z13 = this.f99127i;
            String str = this.f99128j;
            if (!z13) {
                bitmap = c0.d.p2(bitmap, str);
            }
            if (i13 == 1 && !z13 && bitmap != null) {
                bitmap = c0.d.W(bitmap);
            }
        } else {
            int i14 = this.f99126h;
            boolean z14 = this.f99127i;
            if (i14 == 1 && !z14) {
                bitmap = c0.d.W(bitmap);
            }
            if (z14) {
                intValue = 0;
            } else {
                Integer num = fa2.c.f61598f;
                intValue = num == null ? -1 : num.intValue();
            }
            if (intValue != -1 && bitmap != null) {
                bitmap = c0.d.D2(intValue, bitmap);
            }
        }
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f13 = width;
            float f14 = this.f99123e;
            float f15 = (height / f13) * f14;
            int i15 = b.f99121a[j.R(width, height).ordinal()];
            if (i15 == 1) {
                int i16 = (int) ((f13 * hf0.b.f69003c) / hf0.b.f69002b);
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                Matrix matrix = new Matrix();
                matrix.postScale(f14 / width2, f15 / height2);
                if (width2 > 0 && height2 > 0) {
                    bitmap2 = c0.d.y(bitmap, width2, i16, matrix);
                }
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bitmap2 = c0.d.c0(bitmap, f15, f14);
            }
        }
        this.f99129k = bitmap2;
    }

    @Override // hb0.d
    public final void e() {
        i iVar;
        Unit unit;
        Bitmap bitmap = this.f99129k;
        if (bitmap == null || (iVar = this.f99122d) == null) {
            return;
        }
        o oVar = (o) iVar;
        Unit unit2 = null;
        int i13 = oVar.f111917a;
        p pVar = oVar.f111918b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bitmap, "resizedBitmap");
                a aVar = pVar.F;
                if (aVar != null) {
                    Intrinsics.checkNotNullParameter(bitmap, "<set-?>");
                    aVar.f99117d = bitmap;
                    aVar.b();
                    unit = Unit.f80348a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    a aVar2 = new a(bitmap, new o(pVar, 1));
                    aVar2.b();
                    pVar.F = aVar2;
                }
                pVar.G = bitmap;
                if (pVar.L == a32.c.CAMERA_SNAP) {
                    r rVar = (r) ((q) pVar.getView());
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    WebImageView webImageView = rVar.f121092w1;
                    if (webImageView == null) {
                        Intrinsics.r("imagePreview");
                        throw null;
                    }
                    webImageView.setImageBitmap(bitmap);
                    pVar.L3(bitmap);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(bitmap, "resizedBitmap");
                a aVar3 = pVar.E;
                if (aVar3 != null) {
                    Intrinsics.checkNotNullParameter(bitmap, "<set-?>");
                    aVar3.f99117d = bitmap;
                    aVar3.b();
                    unit2 = Unit.f80348a;
                }
                if (unit2 == null) {
                    a aVar4 = new a(bitmap, new o(pVar, 0));
                    aVar4.b();
                    pVar.E = aVar4;
                    return;
                }
                return;
        }
    }
}
