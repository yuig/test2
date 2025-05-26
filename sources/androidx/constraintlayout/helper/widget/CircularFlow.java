package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.s;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class CircularFlow extends VirtualLayout {

    /* renamed from: u, reason: collision with root package name */
    public static int f17482u;

    /* renamed from: v, reason: collision with root package name */
    public static float f17483v;

    /* renamed from: k, reason: collision with root package name */
    public ConstraintLayout f17484k;

    /* renamed from: l, reason: collision with root package name */
    public int f17485l;

    /* renamed from: m, reason: collision with root package name */
    public float[] f17486m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f17487n;

    /* renamed from: o, reason: collision with root package name */
    public int f17488o;

    /* renamed from: p, reason: collision with root package name */
    public int f17489p;

    /* renamed from: q, reason: collision with root package name */
    public String f17490q;

    /* renamed from: r, reason: collision with root package name */
    public String f17491r;

    /* renamed from: s, reason: collision with root package name */
    public Float f17492s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f17493t;

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A(String str) {
        Context context;
        int[] iArr;
        if (str == null || str.length() == 0 || (context = this.f17648c) == null || (iArr = this.f17487n) == null) {
            return;
        }
        if (this.f17488o + 1 > iArr.length) {
            this.f17487n = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f17487n[this.f17488o] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.f17488o++;
    }

    public final void B(String str) {
        if (str == null) {
            return;
        }
        int i13 = 0;
        this.f17489p = 0;
        while (true) {
            int indexOf = str.indexOf(44, i13);
            if (indexOf == -1) {
                z(str.substring(i13).trim());
                return;
            } else {
                z(str.substring(i13, indexOf).trim());
                i13 = indexOf + 1;
            }
        }
    }

    public final void C(String str) {
        if (str == null) {
            return;
        }
        int i13 = 0;
        this.f17488o = 0;
        while (true) {
            int indexOf = str.indexOf(44, i13);
            if (indexOf == -1) {
                A(str.substring(i13).trim());
                return;
            } else {
                A(str.substring(i13, indexOf).trim());
                i13 = indexOf + 1;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f17485l = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == s.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f17490q = string;
                    B(string);
                } else if (index == s.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f17491r = string2;
                    C(string2);
                } else if (index == s.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f17483v));
                    this.f17492s = valueOf;
                    f17483v = valueOf.floatValue();
                } else if (index == s.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f17482u));
                    this.f17493t = valueOf2;
                    f17482u = valueOf2.intValue();
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f17490q;
        if (str != null) {
            this.f17486m = new float[1];
            B(str);
        }
        String str2 = this.f17491r;
        if (str2 != null) {
            this.f17487n = new int[1];
            C(str2);
        }
        Float f13 = this.f17492s;
        if (f13 != null) {
            f17483v = f13.floatValue();
        }
        Integer num = this.f17493t;
        if (num != null) {
            f17482u = num.intValue();
        }
        this.f17484k = (ConstraintLayout) getParent();
        for (int i13 = 0; i13 < this.f17647b; i13++) {
            View viewById = this.f17484k.getViewById(this.f17646a[i13]);
            if (viewById != null) {
                int i14 = f17482u;
                float f14 = f17483v;
                int[] iArr = this.f17487n;
                HashMap hashMap = this.f17653h;
                if (iArr == null || i13 >= iArr.length) {
                    Integer num2 = this.f17493t;
                    if (num2 == null || num2.intValue() == -1) {
                        Log.e("CircularFlow", "Added radius to view with id: " + ((String) hashMap.get(Integer.valueOf(viewById.getId()))));
                    } else {
                        int i15 = this.f17488o + 1;
                        this.f17488o = i15;
                        if (this.f17487n == null) {
                            this.f17487n = new int[1];
                        }
                        int[] copyOf = Arrays.copyOf(this.f17487n, i15);
                        this.f17487n = copyOf;
                        copyOf[this.f17488o - 1] = i14;
                    }
                } else {
                    i14 = iArr[i13];
                }
                float[] fArr = this.f17486m;
                if (fArr == null || i13 >= fArr.length) {
                    Float f15 = this.f17492s;
                    if (f15 == null || f15.floatValue() == -1.0f) {
                        Log.e("CircularFlow", "Added angle to view with id: " + ((String) hashMap.get(Integer.valueOf(viewById.getId()))));
                    } else {
                        int i16 = this.f17489p + 1;
                        this.f17489p = i16;
                        if (this.f17486m == null) {
                            this.f17486m = new float[1];
                        }
                        float[] copyOf2 = Arrays.copyOf(this.f17486m, i16);
                        this.f17486m = copyOf2;
                        copyOf2[this.f17489p - 1] = f14;
                    }
                } else {
                    f14 = fArr[i13];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.f17689r = f14;
                layoutParams.f17685p = this.f17485l;
                layoutParams.f17687q = i14;
                viewById.setLayoutParams(layoutParams);
            }
        }
        f();
    }

    public final void z(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f17648c == null || (fArr = this.f17486m) == null) {
            return;
        }
        if (this.f17489p + 1 > fArr.length) {
            this.f17486m = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f17486m[this.f17489p] = Integer.parseInt(str);
        this.f17489p++;
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
