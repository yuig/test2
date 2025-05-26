package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f17834o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17835a;

    /* renamed from: b, reason: collision with root package name */
    public float f17836b;

    /* renamed from: c, reason: collision with root package name */
    public float f17837c;

    /* renamed from: d, reason: collision with root package name */
    public float f17838d;

    /* renamed from: e, reason: collision with root package name */
    public float f17839e;

    /* renamed from: f, reason: collision with root package name */
    public float f17840f;

    /* renamed from: g, reason: collision with root package name */
    public float f17841g;

    /* renamed from: h, reason: collision with root package name */
    public float f17842h;

    /* renamed from: i, reason: collision with root package name */
    public int f17843i;

    /* renamed from: j, reason: collision with root package name */
    public float f17844j;

    /* renamed from: k, reason: collision with root package name */
    public float f17845k;

    /* renamed from: l, reason: collision with root package name */
    public float f17846l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17847m;

    /* renamed from: n, reason: collision with root package name */
    public float f17848n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17834o = sparseIntArray;
        sparseIntArray.append(s.Transform_android_rotation, 1);
        sparseIntArray.append(s.Transform_android_rotationX, 2);
        sparseIntArray.append(s.Transform_android_rotationY, 3);
        sparseIntArray.append(s.Transform_android_scaleX, 4);
        sparseIntArray.append(s.Transform_android_scaleY, 5);
        sparseIntArray.append(s.Transform_android_transformPivotX, 6);
        sparseIntArray.append(s.Transform_android_transformPivotY, 7);
        sparseIntArray.append(s.Transform_android_translationX, 8);
        sparseIntArray.append(s.Transform_android_translationY, 9);
        sparseIntArray.append(s.Transform_android_translationZ, 10);
        sparseIntArray.append(s.Transform_android_elevation, 11);
        sparseIntArray.append(s.Transform_transformPivotTarget, 12);
    }

    public final void a(o oVar) {
        this.f17835a = oVar.f17835a;
        this.f17836b = oVar.f17836b;
        this.f17837c = oVar.f17837c;
        this.f17838d = oVar.f17838d;
        this.f17839e = oVar.f17839e;
        this.f17840f = oVar.f17840f;
        this.f17841g = oVar.f17841g;
        this.f17842h = oVar.f17842h;
        this.f17843i = oVar.f17843i;
        this.f17844j = oVar.f17844j;
        this.f17845k = oVar.f17845k;
        this.f17846l = oVar.f17846l;
        this.f17847m = oVar.f17847m;
        this.f17848n = oVar.f17848n;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.Transform);
        this.f17835a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            switch (f17834o.get(index)) {
                case 1:
                    this.f17836b = obtainStyledAttributes.getFloat(index, this.f17836b);
                    break;
                case 2:
                    this.f17837c = obtainStyledAttributes.getFloat(index, this.f17837c);
                    break;
                case 3:
                    this.f17838d = obtainStyledAttributes.getFloat(index, this.f17838d);
                    break;
                case 4:
                    this.f17839e = obtainStyledAttributes.getFloat(index, this.f17839e);
                    break;
                case 5:
                    this.f17840f = obtainStyledAttributes.getFloat(index, this.f17840f);
                    break;
                case 6:
                    this.f17841g = obtainStyledAttributes.getDimension(index, this.f17841g);
                    break;
                case 7:
                    this.f17842h = obtainStyledAttributes.getDimension(index, this.f17842h);
                    break;
                case 8:
                    this.f17844j = obtainStyledAttributes.getDimension(index, this.f17844j);
                    break;
                case 9:
                    this.f17845k = obtainStyledAttributes.getDimension(index, this.f17845k);
                    break;
                case 10:
                    this.f17846l = obtainStyledAttributes.getDimension(index, this.f17846l);
                    break;
                case 11:
                    this.f17847m = true;
                    this.f17848n = obtainStyledAttributes.getDimension(index, this.f17848n);
                    break;
                case 12:
                    this.f17843i = p.A(obtainStyledAttributes, index, this.f17843i);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
