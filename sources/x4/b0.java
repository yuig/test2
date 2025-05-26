package x4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes3.dex */
public final class b0 {
    public static final float[][] E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public final float A;
    public final float B;
    public final int C;
    public final int D;

    /* renamed from: a, reason: collision with root package name */
    public final int f131662a;

    /* renamed from: b, reason: collision with root package name */
    public final int f131663b;

    /* renamed from: c, reason: collision with root package name */
    public int f131664c;

    /* renamed from: d, reason: collision with root package name */
    public final int f131665d;

    /* renamed from: e, reason: collision with root package name */
    public final int f131666e;

    /* renamed from: f, reason: collision with root package name */
    public final int f131667f;

    /* renamed from: g, reason: collision with root package name */
    public float f131668g;

    /* renamed from: h, reason: collision with root package name */
    public float f131669h;

    /* renamed from: i, reason: collision with root package name */
    public final int f131670i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f131671j;

    /* renamed from: k, reason: collision with root package name */
    public float f131672k;

    /* renamed from: l, reason: collision with root package name */
    public float f131673l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f131674m = false;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f131675n = new float[2];

    /* renamed from: o, reason: collision with root package name */
    public final int[] f131676o = new int[2];

    /* renamed from: p, reason: collision with root package name */
    public float f131677p;

    /* renamed from: q, reason: collision with root package name */
    public float f131678q;

    /* renamed from: r, reason: collision with root package name */
    public final MotionLayout f131679r;

    /* renamed from: s, reason: collision with root package name */
    public final float f131680s;

    /* renamed from: t, reason: collision with root package name */
    public final float f131681t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f131682u;

    /* renamed from: v, reason: collision with root package name */
    public final float f131683v;

    /* renamed from: w, reason: collision with root package name */
    public final int f131684w;

    /* renamed from: x, reason: collision with root package name */
    public final float f131685x;

    /* renamed from: y, reason: collision with root package name */
    public final float f131686y;

    /* renamed from: z, reason: collision with root package name */
    public final float f131687z;

    public b0(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f131662a = 0;
        this.f131663b = 0;
        this.f131664c = 0;
        this.f131665d = -1;
        this.f131666e = -1;
        this.f131667f = -1;
        this.f131668g = 0.5f;
        this.f131669h = 0.5f;
        this.f131670i = -1;
        this.f131671j = false;
        this.f131672k = 0.0f;
        this.f131673l = 1.0f;
        this.f131680s = 4.0f;
        this.f131681t = 1.2f;
        this.f131682u = true;
        this.f131683v = 1.0f;
        this.f131684w = 0;
        this.f131685x = 10.0f;
        this.f131686y = 10.0f;
        this.f131687z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.f131679r = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.s.OnSwipe);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            if (index == androidx.constraintlayout.widget.s.OnSwipe_touchAnchorId) {
                this.f131665d = obtainStyledAttributes.getResourceId(index, this.f131665d);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_touchAnchorSide) {
                int i14 = obtainStyledAttributes.getInt(index, this.f131662a);
                this.f131662a = i14;
                float[] fArr = E[i14];
                this.f131669h = fArr[0];
                this.f131668g = fArr[1];
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_dragDirection) {
                int i15 = obtainStyledAttributes.getInt(index, this.f131663b);
                this.f131663b = i15;
                if (i15 < 6) {
                    float[] fArr2 = F[i15];
                    this.f131672k = fArr2[0];
                    this.f131673l = fArr2[1];
                } else {
                    this.f131673l = Float.NaN;
                    this.f131672k = Float.NaN;
                    this.f131671j = true;
                }
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_maxVelocity) {
                this.f131680s = obtainStyledAttributes.getFloat(index, this.f131680s);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_maxAcceleration) {
                this.f131681t = obtainStyledAttributes.getFloat(index, this.f131681t);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_moveWhenScrollAtTop) {
                this.f131682u = obtainStyledAttributes.getBoolean(index, this.f131682u);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_dragScale) {
                this.f131683v = obtainStyledAttributes.getFloat(index, this.f131683v);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_dragThreshold) {
                this.f131685x = obtainStyledAttributes.getFloat(index, this.f131685x);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_touchRegionId) {
                this.f131666e = obtainStyledAttributes.getResourceId(index, this.f131666e);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_onTouchUp) {
                this.f131664c = obtainStyledAttributes.getInt(index, this.f131664c);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_nestedScrollFlags) {
                this.f131684w = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_limitBoundsTo) {
                this.f131667f = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_rotationCenterId) {
                this.f131670i = obtainStyledAttributes.getResourceId(index, this.f131670i);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_springDamping) {
                this.f131686y = obtainStyledAttributes.getFloat(index, this.f131686y);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_springMass) {
                this.f131687z = obtainStyledAttributes.getFloat(index, this.f131687z);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_springStiffness) {
                this.A = obtainStyledAttributes.getFloat(index, this.A);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_springStopThreshold) {
                this.B = obtainStyledAttributes.getFloat(index, this.B);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_springBoundary) {
                this.C = obtainStyledAttributes.getInt(index, this.C);
            } else if (index == androidx.constraintlayout.widget.s.OnSwipe_autoCompleteMode) {
                this.D = obtainStyledAttributes.getInt(index, this.D);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final RectF a(MotionLayout motionLayout, RectF rectF) {
        View findViewById;
        int i13 = this.f131667f;
        if (i13 == -1 || (findViewById = motionLayout.findViewById(i13)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i13 = this.f131666e;
        if (i13 == -1 || (findViewById = viewGroup.findViewById(i13)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z13) {
        float[][] fArr = E;
        float[][] fArr2 = F;
        if (z13) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f131662a];
        this.f131669h = fArr3[0];
        this.f131668g = fArr3[1];
        int i13 = this.f131663b;
        if (i13 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i13];
        this.f131672k = fArr4[0];
        this.f131673l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f131672k)) {
            return "rotation";
        }
        return this.f131672k + " , " + this.f131673l;
    }
}
