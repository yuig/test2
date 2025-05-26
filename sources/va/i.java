package va;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import ao2.m0;
import kh2.k3;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class i extends l {

    /* renamed from: e, reason: collision with root package name */
    public e5.d f125037e;

    /* renamed from: g, reason: collision with root package name */
    public e5.d f125039g;

    /* renamed from: f, reason: collision with root package name */
    public float f125038f = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f125040h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f125041i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f125042j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f125043k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f125044l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Cap f125045m = Paint.Cap.BUTT;

    /* renamed from: n, reason: collision with root package name */
    public Paint.Join f125046n = Paint.Join.MITER;

    /* renamed from: o, reason: collision with root package name */
    public float f125047o = 4.0f;

    @Override // va.k
    public final boolean a() {
        return this.f125039g.f() || this.f125037e.f();
    }

    @Override // va.k
    public final boolean b(int[] iArr) {
        return this.f125037e.g(iArr) | this.f125039g.g(iArr);
    }

    public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray d03 = m0.d0(resources, theme, attributeSet, a.f125019c);
        if (m0.N(xmlPullParser, "pathData")) {
            String string = d03.getString(0);
            if (string != null) {
                this.f125061b = string;
            }
            String string2 = d03.getString(2);
            if (string2 != null) {
                this.f125060a = k3.I(string2);
            }
            this.f125039g = m0.C(d03, xmlPullParser, theme, "fillColor", 1);
            float f13 = this.f125041i;
            if (m0.N(xmlPullParser, "fillAlpha")) {
                f13 = d03.getFloat(12, f13);
            }
            this.f125041i = f13;
            int i13 = !m0.N(xmlPullParser, "strokeLineCap") ? -1 : d03.getInt(8, -1);
            Paint.Cap cap = this.f125045m;
            if (i13 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i13 == 1) {
                cap = Paint.Cap.ROUND;
            } else if (i13 == 2) {
                cap = Paint.Cap.SQUARE;
            }
            this.f125045m = cap;
            int i14 = m0.N(xmlPullParser, "strokeLineJoin") ? d03.getInt(9, -1) : -1;
            Paint.Join join = this.f125046n;
            if (i14 == 0) {
                join = Paint.Join.MITER;
            } else if (i14 == 1) {
                join = Paint.Join.ROUND;
            } else if (i14 == 2) {
                join = Paint.Join.BEVEL;
            }
            this.f125046n = join;
            float f14 = this.f125047o;
            if (m0.N(xmlPullParser, "strokeMiterLimit")) {
                f14 = d03.getFloat(10, f14);
            }
            this.f125047o = f14;
            this.f125037e = m0.C(d03, xmlPullParser, theme, "strokeColor", 3);
            float f15 = this.f125040h;
            if (m0.N(xmlPullParser, "strokeAlpha")) {
                f15 = d03.getFloat(11, f15);
            }
            this.f125040h = f15;
            float f16 = this.f125038f;
            if (m0.N(xmlPullParser, "strokeWidth")) {
                f16 = d03.getFloat(4, f16);
            }
            this.f125038f = f16;
            float f17 = this.f125043k;
            if (m0.N(xmlPullParser, "trimPathEnd")) {
                f17 = d03.getFloat(6, f17);
            }
            this.f125043k = f17;
            float f18 = this.f125044l;
            if (m0.N(xmlPullParser, "trimPathOffset")) {
                f18 = d03.getFloat(7, f18);
            }
            this.f125044l = f18;
            float f19 = this.f125042j;
            if (m0.N(xmlPullParser, "trimPathStart")) {
                f19 = d03.getFloat(5, f19);
            }
            this.f125042j = f19;
            int i15 = this.f125062c;
            if (m0.N(xmlPullParser, "fillType")) {
                i15 = d03.getInt(13, i15);
            }
            this.f125062c = i15;
        }
        d03.recycle();
    }

    public float getFillAlpha() {
        return this.f125041i;
    }

    public int getFillColor() {
        return this.f125039g.f57215b;
    }

    public float getStrokeAlpha() {
        return this.f125040h;
    }

    public int getStrokeColor() {
        return this.f125037e.f57215b;
    }

    public float getStrokeWidth() {
        return this.f125038f;
    }

    public float getTrimPathEnd() {
        return this.f125043k;
    }

    public float getTrimPathOffset() {
        return this.f125044l;
    }

    public float getTrimPathStart() {
        return this.f125042j;
    }

    public void setFillAlpha(float f13) {
        this.f125041i = f13;
    }

    public void setFillColor(int i13) {
        this.f125039g.f57215b = i13;
    }

    public void setStrokeAlpha(float f13) {
        this.f125040h = f13;
    }

    public void setStrokeColor(int i13) {
        this.f125037e.f57215b = i13;
    }

    public void setStrokeWidth(float f13) {
        this.f125038f = f13;
    }

    public void setTrimPathEnd(float f13) {
        this.f125043k = f13;
    }

    public void setTrimPathOffset(float f13) {
        this.f125044l = f13;
    }

    public void setTrimPathStart(float f13) {
        this.f125042j = f13;
    }
}
