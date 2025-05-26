package te0;

import android.content.res.Resources;
import android.util.SparseArray;

/* loaded from: classes5.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static SparseArray f117494a;

    /* renamed from: b, reason: collision with root package name */
    public static final lm1.b f117495b = lm1.b.NONE;

    /* renamed from: c, reason: collision with root package name */
    public static final lm1.b f117496c = lm1.b.NORMAL;

    /* renamed from: d, reason: collision with root package name */
    public static final lm1.b f117497d = lm1.b.BOLD;

    public static ef0.b a(h hVar, Resources resources) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        if (hVar == h.TEXT_NONE) {
            throw new IllegalStateException("Text size is not in range. See SIZE_SPECS");
        }
        if (f117494a == null) {
            SparseArray sparseArray = new SparseArray();
            f117494a = sparseArray;
            i14 = h.TEXT_XSMALL.value;
            sparseArray.put(i14, new ef0.b(resources.getDimension(eo1.c.font_size_100)));
            SparseArray sparseArray2 = f117494a;
            i15 = h.TEXT_SMALL.value;
            sparseArray2.put(i15, new ef0.b(resources.getDimension(eo1.c.font_size_100)));
            SparseArray sparseArray3 = f117494a;
            i16 = h.TEXT_MEDIUM.value;
            sparseArray3.put(i16, new ef0.b(resources.getDimension(eo1.c.font_size_300)));
            SparseArray sparseArray4 = f117494a;
            i17 = h.TEXT_LARGE.value;
            sparseArray4.put(i17, new ef0.b(resources.getDimension(eo1.c.font_size_300)));
            SparseArray sparseArray5 = f117494a;
            i18 = h.TEXT_XLARGE.value;
            sparseArray5.put(i18, new ef0.b(resources.getDimension(eo1.c.font_size_300)));
            SparseArray sparseArray6 = f117494a;
            i19 = h.DISPLAY_XSMALL.value;
            sparseArray6.put(i19, new ef0.b(resources.getDimension(eo1.c.font_size_400)));
            SparseArray sparseArray7 = f117494a;
            i23 = h.DISPLAY_SMALL.value;
            sparseArray7.put(i23, new ef0.b(resources.getDimension(eo1.c.font_size_500)));
            SparseArray sparseArray8 = f117494a;
            i24 = h.DISPLAY_MEDIUM.value;
            sparseArray8.put(i24, new ef0.b(resources.getDimension(eo1.c.font_size_600)));
            SparseArray sparseArray9 = f117494a;
            i25 = h.DISPLAY_LARGE.value;
            sparseArray9.put(i25, new ef0.b(resources.getDimension(eo1.c.font_size_600)));
            SparseArray sparseArray10 = f117494a;
            i26 = h.DISPLAY_XLARGE.value;
            sparseArray10.put(i26, new ef0.b(resources.getDimension(eo1.c.font_size_600)));
        }
        SparseArray sparseArray11 = f117494a;
        i13 = hVar.value;
        return (ef0.b) sparseArray11.get(i13);
    }
}
