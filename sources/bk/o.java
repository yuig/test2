package bk;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: m, reason: collision with root package name */
    public static final k f23090m = new k(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public bs1.c f23091a = new l();

    /* renamed from: b, reason: collision with root package name */
    public bs1.c f23092b = new l();

    /* renamed from: c, reason: collision with root package name */
    public bs1.c f23093c = new l();

    /* renamed from: d, reason: collision with root package name */
    public bs1.c f23094d = new l();

    /* renamed from: e, reason: collision with root package name */
    public d f23095e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public d f23096f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public d f23097g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public d f23098h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public f f23099i = new f();

    /* renamed from: j, reason: collision with root package name */
    public f f23100j = new f();

    /* renamed from: k, reason: collision with root package name */
    public f f23101k = new f();

    /* renamed from: l, reason: collision with root package name */
    public f f23102l = new f();

    public static m a() {
        return new m();
    }

    public static m b(int i13, int i14, Context context, AttributeSet attributeSet) {
        return e(context, attributeSet, i13, i14, new a(0));
    }

    public static m c(Context context, int i13, int i14) {
        return d(context, i13, i14, new a(0));
    }

    public static m d(Context context, int i13, int i14, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i13);
        if (i14 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i14);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(fj.m.ShapeAppearance);
        try {
            int i15 = obtainStyledAttributes.getInt(fj.m.ShapeAppearance_cornerFamily, 0);
            int i16 = obtainStyledAttributes.getInt(fj.m.ShapeAppearance_cornerFamilyTopLeft, i15);
            int i17 = obtainStyledAttributes.getInt(fj.m.ShapeAppearance_cornerFamilyTopRight, i15);
            int i18 = obtainStyledAttributes.getInt(fj.m.ShapeAppearance_cornerFamilyBottomRight, i15);
            int i19 = obtainStyledAttributes.getInt(fj.m.ShapeAppearance_cornerFamilyBottomLeft, i15);
            d f13 = f(obtainStyledAttributes, fj.m.ShapeAppearance_cornerSize, dVar);
            d f14 = f(obtainStyledAttributes, fj.m.ShapeAppearance_cornerSizeTopLeft, f13);
            d f15 = f(obtainStyledAttributes, fj.m.ShapeAppearance_cornerSizeTopRight, f13);
            d f16 = f(obtainStyledAttributes, fj.m.ShapeAppearance_cornerSizeBottomRight, f13);
            d f17 = f(obtainStyledAttributes, fj.m.ShapeAppearance_cornerSizeBottomLeft, f13);
            m mVar = new m();
            bs1.c u13 = d7.b.u(i16);
            mVar.f23078a = u13;
            m.b(u13);
            mVar.f23082e = f14;
            bs1.c u14 = d7.b.u(i17);
            mVar.f23079b = u14;
            m.b(u14);
            mVar.f23083f = f15;
            bs1.c u15 = d7.b.u(i18);
            mVar.f23080c = u15;
            m.b(u15);
            mVar.f23084g = f16;
            bs1.c u16 = d7.b.u(i19);
            mVar.f23081d = u16;
            m.b(u16);
            mVar.f23085h = f17;
            return mVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static m e(Context context, AttributeSet attributeSet, int i13, int i14, d dVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fj.m.MaterialShape, i13, i14);
        int resourceId = obtainStyledAttributes.getResourceId(fj.m.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(fj.m.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    public static d f(TypedArray typedArray, int i13, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i13);
        if (peekValue == null) {
            return dVar;
        }
        int i14 = peekValue.type;
        return i14 == 5 ? new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i14 == 6 ? new k(peekValue.getFraction(1.0f, 1.0f)) : dVar;
    }

    public final boolean g(RectF rectF) {
        boolean z13 = this.f23102l.getClass().equals(f.class) && this.f23100j.getClass().equals(f.class) && this.f23099i.getClass().equals(f.class) && this.f23101k.getClass().equals(f.class);
        float a13 = this.f23095e.a(rectF);
        return z13 && ((this.f23096f.a(rectF) > a13 ? 1 : (this.f23096f.a(rectF) == a13 ? 0 : -1)) == 0 && (this.f23098h.a(rectF) > a13 ? 1 : (this.f23098h.a(rectF) == a13 ? 0 : -1)) == 0 && (this.f23097g.a(rectF) > a13 ? 1 : (this.f23097g.a(rectF) == a13 ? 0 : -1)) == 0) && ((this.f23092b instanceof l) && (this.f23091a instanceof l) && (this.f23093c instanceof l) && (this.f23094d instanceof l));
    }

    public final m h() {
        m mVar = new m();
        mVar.f23078a = this.f23091a;
        mVar.f23079b = this.f23092b;
        mVar.f23080c = this.f23093c;
        mVar.f23081d = this.f23094d;
        mVar.f23082e = this.f23095e;
        mVar.f23083f = this.f23096f;
        mVar.f23084g = this.f23097g;
        mVar.f23085h = this.f23098h;
        mVar.f23086i = this.f23099i;
        mVar.f23087j = this.f23100j;
        mVar.f23088k = this.f23101k;
        mVar.f23089l = this.f23102l;
        return mVar;
    }

    public final o i(n nVar) {
        m h10 = h();
        h10.f23082e = nVar.h(this.f23095e);
        h10.f23083f = nVar.h(this.f23096f);
        h10.f23085h = nVar.h(this.f23098h);
        h10.f23084g = nVar.h(this.f23097g);
        return h10.a();
    }
}
