package androidx.appcompat.widget;

import a.cb;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: l */
    public static final RectF f16714l = new RectF();

    /* renamed from: m */
    public static final ConcurrentHashMap f16715m = new ConcurrentHashMap();

    /* renamed from: a */
    public int f16716a = 0;

    /* renamed from: b */
    public boolean f16717b = false;

    /* renamed from: c */
    public float f16718c = -1.0f;

    /* renamed from: d */
    public float f16719d = -1.0f;

    /* renamed from: e */
    public float f16720e = -1.0f;

    /* renamed from: f */
    public int[] f16721f = new int[0];

    /* renamed from: g */
    public boolean f16722g = false;

    /* renamed from: h */
    public TextPaint f16723h;

    /* renamed from: i */
    public final TextView f16724i;

    /* renamed from: j */
    public final Context f16725j;

    /* renamed from: k */
    public final u0 f16726k;

    public x0(TextView textView) {
        this.f16724i = textView;
        this.f16725j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f16726k = new v0();
        } else {
            this.f16726k = new u0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i13 : iArr) {
            if (i13 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i13)) < 0) {
                arrayList.add(Integer.valueOf(i13));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr2[i14] = ((Integer) arrayList.get(i14)).intValue();
        }
        return iArr2;
    }

    public static Method h(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f16715m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e13) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e13);
            return null;
        }
    }

    public static Object i(Object obj, Object obj2, String str) {
        try {
            return h(str).invoke(obj, new Object[0]);
        } catch (Exception e13) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e13);
            return obj2;
        }
    }

    public final void a() {
        if (!n() || this.f16716a == 0) {
            return;
        }
        if (this.f16717b) {
            if (this.f16724i.getMeasuredHeight() <= 0 || this.f16724i.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = this.f16726k.b(this.f16724i) ? 1048576 : (this.f16724i.getMeasuredWidth() - this.f16724i.getTotalPaddingLeft()) - this.f16724i.getTotalPaddingRight();
            int height = (this.f16724i.getHeight() - this.f16724i.getCompoundPaddingBottom()) - this.f16724i.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            RectF rectF = f16714l;
            synchronized (rectF) {
                try {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float c13 = c(rectF);
                    if (c13 != this.f16724i.getTextSize()) {
                        j(0, c13);
                    }
                } finally {
                }
            }
        }
        this.f16717b = true;
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f16721f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i13 = length - 1;
        int i14 = 0;
        int i15 = 1;
        while (i15 <= i13) {
            int i16 = (i15 + i13) / 2;
            int i17 = this.f16721f[i16];
            TextView textView = this.f16724i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f16723h;
            if (textPaint == null) {
                this.f16723h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f16723h.set(textView.getPaint());
            this.f16723h.setTextSize(i17);
            StaticLayout a13 = t0.a(text, (Layout.Alignment) i(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f16724i, this.f16723h, this.f16726k);
            if ((maxLines == -1 || (a13.getLineCount() <= maxLines && a13.getLineEnd(a13.getLineCount() - 1) == text.length())) && a13.getHeight() <= rectF.bottom) {
                int i18 = i16 + 1;
                i14 = i15;
                i15 = i18;
            } else {
                i14 = i16 - 1;
                i13 = i14;
            }
        }
        return this.f16721f[i14];
    }

    public final int d() {
        return Math.round(this.f16720e);
    }

    public final int e() {
        return Math.round(this.f16719d);
    }

    public final int f() {
        return Math.round(this.f16718c);
    }

    public final int[] g() {
        return this.f16721f;
    }

    public final void j(int i13, float f13) {
        Context context = this.f16725j;
        float applyDimension = TypedValue.applyDimension(i13, f13, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f16724i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f16717b = false;
                try {
                    Method h10 = h("nullLayouts");
                    if (h10 != null) {
                        h10.invoke(textView, new Object[0]);
                    }
                } catch (Exception e13) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e13);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean k() {
        if (n() && this.f16716a == 1) {
            if (!this.f16722g || this.f16721f.length == 0) {
                int floor = ((int) Math.floor((this.f16720e - this.f16719d) / this.f16718c)) + 1;
                int[] iArr = new int[floor];
                for (int i13 = 0; i13 < floor; i13++) {
                    iArr[i13] = Math.round((i13 * this.f16718c) + this.f16719d);
                }
                this.f16721f = b(iArr);
            }
            this.f16717b = true;
        } else {
            this.f16717b = false;
        }
        return this.f16717b;
    }

    public final void l(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                iArr[i13] = typedArray.getDimensionPixelSize(i13, -1);
            }
            this.f16721f = b(iArr);
            m();
        }
    }

    public final boolean m() {
        boolean z13 = this.f16721f.length > 0;
        this.f16722g = z13;
        if (z13) {
            this.f16716a = 1;
            this.f16719d = r0[0];
            this.f16720e = r0[r1 - 1];
            this.f16718c = -1.0f;
        }
        return z13;
    }

    public final boolean n() {
        return !(this.f16724i instanceof AppCompatEditText);
    }

    public final void o(float f13, float f14, float f15) {
        if (f13 <= 0.0f) {
            throw new IllegalArgumentException(cb.h("Minimum auto-size text size (", f13, "px) is less or equal to (0px)"));
        }
        if (f14 <= f13) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f14 + "px) is less or equal to minimum auto-size text size (" + f13 + "px)");
        }
        if (f15 <= 0.0f) {
            throw new IllegalArgumentException(cb.h("The auto-size step granularity (", f15, "px) is less or equal to (0px)"));
        }
        this.f16716a = 1;
        this.f16719d = f13;
        this.f16720e = f14;
        this.f16718c = f15;
        this.f16722g = false;
    }
}
