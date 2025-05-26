package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f17815n;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17816a;

    /* renamed from: b, reason: collision with root package name */
    public int f17817b;

    /* renamed from: c, reason: collision with root package name */
    public int f17818c;

    /* renamed from: d, reason: collision with root package name */
    public String f17819d;

    /* renamed from: e, reason: collision with root package name */
    public int f17820e;

    /* renamed from: f, reason: collision with root package name */
    public int f17821f;

    /* renamed from: g, reason: collision with root package name */
    public float f17822g;

    /* renamed from: h, reason: collision with root package name */
    public float f17823h;

    /* renamed from: i, reason: collision with root package name */
    public float f17824i;

    /* renamed from: j, reason: collision with root package name */
    public int f17825j;

    /* renamed from: k, reason: collision with root package name */
    public String f17826k;

    /* renamed from: l, reason: collision with root package name */
    public int f17827l;

    /* renamed from: m, reason: collision with root package name */
    public int f17828m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17815n = sparseIntArray;
        sparseIntArray.append(s.Motion_motionPathRotate, 1);
        sparseIntArray.append(s.Motion_pathMotionArc, 2);
        sparseIntArray.append(s.Motion_transitionEasing, 3);
        sparseIntArray.append(s.Motion_drawPath, 4);
        sparseIntArray.append(s.Motion_animateRelativeTo, 5);
        sparseIntArray.append(s.Motion_animateCircleAngleTo, 6);
        sparseIntArray.append(s.Motion_motionStagger, 7);
        sparseIntArray.append(s.Motion_quantizeMotionSteps, 8);
        sparseIntArray.append(s.Motion_quantizeMotionPhase, 9);
        sparseIntArray.append(s.Motion_quantizeMotionInterpolator, 10);
    }

    public final void a(m mVar) {
        this.f17816a = mVar.f17816a;
        this.f17817b = mVar.f17817b;
        this.f17819d = mVar.f17819d;
        this.f17820e = mVar.f17820e;
        this.f17821f = mVar.f17821f;
        this.f17823h = mVar.f17823h;
        this.f17822g = mVar.f17822g;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.Motion);
        this.f17816a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            switch (f17815n.get(index)) {
                case 1:
                    this.f17823h = obtainStyledAttributes.getFloat(index, this.f17823h);
                    break;
                case 2:
                    this.f17820e = obtainStyledAttributes.getInt(index, this.f17820e);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f17819d = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f17819d = t4.e.f116352c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f17821f = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f17817b = p.A(obtainStyledAttributes, index, this.f17817b);
                    break;
                case 6:
                    this.f17818c = obtainStyledAttributes.getInteger(index, this.f17818c);
                    break;
                case 7:
                    this.f17822g = obtainStyledAttributes.getFloat(index, this.f17822g);
                    break;
                case 8:
                    this.f17825j = obtainStyledAttributes.getInteger(index, this.f17825j);
                    break;
                case 9:
                    this.f17824i = obtainStyledAttributes.getFloat(index, this.f17824i);
                    break;
                case 10:
                    int i14 = obtainStyledAttributes.peekValue(index).type;
                    if (i14 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.f17828m = resourceId;
                        if (resourceId != -1) {
                            this.f17827l = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i14 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f17826k = string;
                        if (string.indexOf("/") > 0) {
                            this.f17828m = obtainStyledAttributes.getResourceId(index, -1);
                            this.f17827l = -2;
                            break;
                        } else {
                            this.f17827l = -1;
                            break;
                        }
                    } else {
                        this.f17827l = obtainStyledAttributes.getInteger(index, this.f17828m);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
