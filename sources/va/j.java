package va;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import ao2.m0;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f125048a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f125049b;

    /* renamed from: c, reason: collision with root package name */
    public float f125050c;

    /* renamed from: d, reason: collision with root package name */
    public float f125051d;

    /* renamed from: e, reason: collision with root package name */
    public float f125052e;

    /* renamed from: f, reason: collision with root package name */
    public float f125053f;

    /* renamed from: g, reason: collision with root package name */
    public float f125054g;

    /* renamed from: h, reason: collision with root package name */
    public float f125055h;

    /* renamed from: i, reason: collision with root package name */
    public float f125056i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f125057j;

    /* renamed from: k, reason: collision with root package name */
    public final int f125058k;

    /* renamed from: l, reason: collision with root package name */
    public String f125059l;

    public j() {
        this.f125048a = new Matrix();
        this.f125049b = new ArrayList();
        this.f125050c = 0.0f;
        this.f125051d = 0.0f;
        this.f125052e = 0.0f;
        this.f125053f = 1.0f;
        this.f125054g = 1.0f;
        this.f125055h = 0.0f;
        this.f125056i = 0.0f;
        this.f125057j = new Matrix();
        this.f125059l = null;
    }

    @Override // va.k
    public final boolean a() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f125049b;
            if (i13 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i13)).a()) {
                return true;
            }
            i13++;
        }
    }

    @Override // va.k
    public final boolean b(int[] iArr) {
        int i13 = 0;
        boolean z13 = false;
        while (true) {
            ArrayList arrayList = this.f125049b;
            if (i13 >= arrayList.size()) {
                return z13;
            }
            z13 |= ((k) arrayList.get(i13)).b(iArr);
            i13++;
        }
    }

    public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray d03 = m0.d0(resources, theme, attributeSet, a.f125018b);
        float f13 = this.f125050c;
        if (m0.N(xmlPullParser, "rotation")) {
            f13 = d03.getFloat(5, f13);
        }
        this.f125050c = f13;
        this.f125051d = d03.getFloat(1, this.f125051d);
        this.f125052e = d03.getFloat(2, this.f125052e);
        float f14 = this.f125053f;
        if (m0.N(xmlPullParser, "scaleX")) {
            f14 = d03.getFloat(3, f14);
        }
        this.f125053f = f14;
        float f15 = this.f125054g;
        if (m0.N(xmlPullParser, "scaleY")) {
            f15 = d03.getFloat(4, f15);
        }
        this.f125054g = f15;
        float f16 = this.f125055h;
        if (m0.N(xmlPullParser, "translateX")) {
            f16 = d03.getFloat(6, f16);
        }
        this.f125055h = f16;
        float f17 = this.f125056i;
        if (m0.N(xmlPullParser, "translateY")) {
            f17 = d03.getFloat(7, f17);
        }
        this.f125056i = f17;
        String string = d03.getString(0);
        if (string != null) {
            this.f125059l = string;
        }
        d();
        d03.recycle();
    }

    public final void d() {
        Matrix matrix = this.f125057j;
        matrix.reset();
        matrix.postTranslate(-this.f125051d, -this.f125052e);
        matrix.postScale(this.f125053f, this.f125054g);
        matrix.postRotate(this.f125050c, 0.0f, 0.0f);
        matrix.postTranslate(this.f125055h + this.f125051d, this.f125056i + this.f125052e);
    }

    public String getGroupName() {
        return this.f125059l;
    }

    public Matrix getLocalMatrix() {
        return this.f125057j;
    }

    public float getPivotX() {
        return this.f125051d;
    }

    public float getPivotY() {
        return this.f125052e;
    }

    public float getRotation() {
        return this.f125050c;
    }

    public float getScaleX() {
        return this.f125053f;
    }

    public float getScaleY() {
        return this.f125054g;
    }

    public float getTranslateX() {
        return this.f125055h;
    }

    public float getTranslateY() {
        return this.f125056i;
    }

    public void setPivotX(float f13) {
        if (f13 != this.f125051d) {
            this.f125051d = f13;
            d();
        }
    }

    public void setPivotY(float f13) {
        if (f13 != this.f125052e) {
            this.f125052e = f13;
            d();
        }
    }

    public void setRotation(float f13) {
        if (f13 != this.f125050c) {
            this.f125050c = f13;
            d();
        }
    }

    public void setScaleX(float f13) {
        if (f13 != this.f125053f) {
            this.f125053f = f13;
            d();
        }
    }

    public void setScaleY(float f13) {
        if (f13 != this.f125054g) {
            this.f125054g = f13;
            d();
        }
    }

    public void setTranslateX(float f13) {
        if (f13 != this.f125055h) {
            this.f125055h = f13;
            d();
        }
    }

    public void setTranslateY(float f13) {
        if (f13 != this.f125056i) {
            this.f125056i = f13;
            d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(j jVar, g1.g gVar) {
        h hVar;
        this.f125048a = new Matrix();
        this.f125049b = new ArrayList();
        this.f125050c = 0.0f;
        this.f125051d = 0.0f;
        this.f125052e = 0.0f;
        this.f125053f = 1.0f;
        this.f125054g = 1.0f;
        this.f125055h = 0.0f;
        this.f125056i = 0.0f;
        Matrix matrix = new Matrix();
        this.f125057j = matrix;
        this.f125059l = null;
        this.f125050c = jVar.f125050c;
        this.f125051d = jVar.f125051d;
        this.f125052e = jVar.f125052e;
        this.f125053f = jVar.f125053f;
        this.f125054g = jVar.f125054g;
        this.f125055h = jVar.f125055h;
        this.f125056i = jVar.f125056i;
        String str = jVar.f125059l;
        this.f125059l = str;
        this.f125058k = jVar.f125058k;
        if (str != null) {
            gVar.put(str, this);
        }
        matrix.set(jVar.f125057j);
        ArrayList arrayList = jVar.f125049b;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            Object obj = arrayList.get(i13);
            if (obj instanceof j) {
                this.f125049b.add(new j((j) obj, gVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f125038f = 0.0f;
                    iVar2.f125040h = 1.0f;
                    iVar2.f125041i = 1.0f;
                    iVar2.f125042j = 0.0f;
                    iVar2.f125043k = 1.0f;
                    iVar2.f125044l = 0.0f;
                    iVar2.f125045m = Paint.Cap.BUTT;
                    iVar2.f125046n = Paint.Join.MITER;
                    iVar2.f125047o = 4.0f;
                    iVar2.f125037e = iVar.f125037e;
                    iVar2.f125038f = iVar.f125038f;
                    iVar2.f125040h = iVar.f125040h;
                    iVar2.f125039g = iVar.f125039g;
                    iVar2.f125062c = iVar.f125062c;
                    iVar2.f125041i = iVar.f125041i;
                    iVar2.f125042j = iVar.f125042j;
                    iVar2.f125043k = iVar.f125043k;
                    iVar2.f125044l = iVar.f125044l;
                    iVar2.f125045m = iVar.f125045m;
                    iVar2.f125046n = iVar.f125046n;
                    iVar2.f125047o = iVar.f125047o;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f125049b.add(hVar);
                Object obj2 = hVar.f125061b;
                if (obj2 != null) {
                    gVar.put(obj2, hVar);
                }
            }
        }
    }
}
