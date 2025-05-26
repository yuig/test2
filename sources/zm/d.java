package zm;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: i, reason: collision with root package name */
    public static final d[] f142165i = {new d(false, 3, 5, 8, 8, 1, 3, 5), new d(false, 5, 7, 10, 10, 1, 5, 7), new d(true, 5, 7, 16, 6, 1, 5, 7), new d(false, 8, 10, 12, 12, 1, 8, 10), new d(true, 10, 11, 14, 6, 2, 10, 11), new d(false, 12, 12, 14, 14, 1, 12, 12), new d(true, 16, 14, 24, 10, 1, 16, 14), new d(false, 18, 14, 16, 16, 1, 18, 14), new d(false, 22, 18, 18, 18, 1, 22, 18), new d(true, 22, 18, 16, 10, 2, 22, 18), new d(false, 30, 20, 20, 20, 1, 30, 20), new d(true, 32, 24, 16, 14, 2, 32, 24), new d(false, 36, 24, 22, 22, 1, 36, 24), new d(false, 44, 28, 24, 24, 1, 44, 28), new d(true, 49, 28, 22, 14, 2, 49, 28), new d(false, 62, 36, 14, 14, 4, 62, 36), new d(false, 86, 42, 16, 16, 4, 86, 42), new d(false, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, 48, 18, 18, 4, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, 48), new d(false, RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM, 56, 20, 20, 4, RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM, 56), new d(false, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN, 68, 22, 22, 4, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN, 68), new d(false, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR, 84, 24, 24, 4, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, 42), new d(false, RecyclerViewTypes.VIEW_TYPE_PIN_WEBVIEW_AD, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 14, 14, 16, RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM, 56), new d(false, 368, RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM, 16, 16, 16, 92, 36), new d(false, 456, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY, 18, 18, 16, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, 48), new d(false, 576, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL, 20, 20, 16, RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM, 56), new d(false, 696, RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO_AD_EXCLUDE, 22, 22, 16, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN, 68), new d(false, 816, 336, 24, 24, 16, RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL, 56), new d(false, 1050, 408, 18, 18, 36, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN, 68), new d(false, 1304, 496, 20, 20, 36, RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM, 62), new a(false, 1558, 620, 22, 22, 36, -1, 62)};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f142166a;

    /* renamed from: b, reason: collision with root package name */
    public final int f142167b;

    /* renamed from: c, reason: collision with root package name */
    public final int f142168c;

    /* renamed from: d, reason: collision with root package name */
    public final int f142169d;

    /* renamed from: e, reason: collision with root package name */
    public final int f142170e;

    /* renamed from: f, reason: collision with root package name */
    public final int f142171f;

    /* renamed from: g, reason: collision with root package name */
    public final int f142172g;

    /* renamed from: h, reason: collision with root package name */
    public final int f142173h;

    public d(boolean z13, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f142166a = z13;
        this.f142167b = i13;
        this.f142168c = i14;
        this.f142169d = i15;
        this.f142170e = i16;
        this.f142171f = i17;
        this.f142172g = i18;
        this.f142173h = i19;
    }

    public static d e(int i13, e eVar) {
        d[] dVarArr = f142165i;
        for (int i14 = 0; i14 < 30; i14++) {
            d dVar = dVarArr[i14];
            if (!(eVar == e.FORCE_SQUARE && dVar.f142166a) && ((eVar != e.FORCE_RECTANGLE || dVar.f142166a) && i13 <= dVar.f142167b)) {
                return dVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i13)));
    }

    public int a(int i13) {
        return this.f142172g;
    }

    public final int b() {
        int i13 = 1;
        int i14 = this.f142171f;
        if (i14 != 1) {
            i13 = 2;
            if (i14 != 2 && i14 != 4) {
                if (i14 == 16) {
                    return 4;
                }
                if (i14 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i13;
    }

    public int c() {
        return this.f142167b / this.f142172g;
    }

    public final int d() {
        int i13 = this.f142171f;
        if (i13 == 1 || i13 == 2) {
            return 1;
        }
        if (i13 == 4) {
            return 2;
        }
        if (i13 == 16) {
            return 4;
        }
        if (i13 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f142166a ? "Rectangular Symbol:" : "Square Symbol:");
        sb3.append(" data region ");
        int i13 = this.f142169d;
        sb3.append(i13);
        sb3.append('x');
        int i14 = this.f142170e;
        sb3.append(i14);
        sb3.append(", symbol size ");
        sb3.append((b() * i13) + (b() << 1));
        sb3.append('x');
        sb3.append((d() * i14) + (d() << 1));
        sb3.append(", symbol data size ");
        sb3.append(b() * i13);
        sb3.append('x');
        sb3.append(d() * i14);
        sb3.append(", codewords ");
        sb3.append(this.f142167b);
        sb3.append('+');
        sb3.append(this.f142168c);
        return sb3.toString();
    }
}
