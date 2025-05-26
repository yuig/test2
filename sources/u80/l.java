package u80;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes5.dex */
public abstract class l {

    /* renamed from: b, reason: collision with root package name */
    public static final float f120962b = 0.66f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f120964d = 0.5625f;

    /* renamed from: a, reason: collision with root package name */
    public static final float f120961a = RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP;

    /* renamed from: c, reason: collision with root package name */
    public static final float f120963c = RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;

    /* renamed from: e, reason: collision with root package name */
    public static final float f120965e = 8;

    public static k a(i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(963326637);
        i b13 = b(sVar, 3072);
        sVar.W(328957169);
        float f13 = f120961a;
        boolean e13 = sVar.e(f13);
        float f14 = f120962b;
        boolean e14 = e13 | sVar.e(f14) | sVar.h(b13);
        Object J2 = sVar.J();
        if (e14 || J2 == i2.n.f71185a) {
            J2 = new k(f13, f14, b13);
            sVar.g0(J2);
        }
        k kVar = (k) J2;
        sVar.r(false);
        sVar.r(false);
        return kVar;
    }

    public static i b(i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(-1810715998);
        sVar.W(437112353);
        int i14 = (i13 & 14) ^ 6;
        float f13 = f120963c;
        boolean z13 = (i14 > 4 && sVar.e(f13)) || (i13 & 6) == 4;
        int i15 = (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) ^ 48;
        float f14 = f120964d;
        boolean z14 = ((i15 > 32 && sVar.e(f14)) || (i13 & 48) == 32) | z13;
        Object J2 = sVar.J();
        if (z14 || J2 == i2.n.f71185a) {
            J2 = new i(f13, f14, true, f120965e);
            sVar.g0(J2);
        }
        i iVar = (i) J2;
        sVar.r(false);
        sVar.r(false);
        return iVar;
    }
}
