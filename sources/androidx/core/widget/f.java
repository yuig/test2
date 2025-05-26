package androidx.core.widget;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.app.z;

/* loaded from: classes3.dex */
public final class f implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f17990r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f17991a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f17992b;

    /* renamed from: c, reason: collision with root package name */
    public final View f17993c;

    /* renamed from: d, reason: collision with root package name */
    public z f17994d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f17995e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f17996f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17997g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17998h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f17999i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f18000j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f18001k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18002l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18003m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18004n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18005o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18006p;

    /* renamed from: q, reason: collision with root package name */
    public final ListView f18007q;

    public f(ListView listView) {
        a aVar = new a();
        aVar.f17983e = Long.MIN_VALUE;
        aVar.f17985g = -1L;
        aVar.f17984f = 0L;
        this.f17991a = aVar;
        this.f17992b = new AccelerateInterpolator();
        this.f17995e = new float[]{0.0f, 0.0f};
        this.f17996f = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f17999i = new float[]{0.0f, 0.0f};
        this.f18000j = new float[]{0.0f, 0.0f};
        this.f18001k = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f17993c = listView;
        float f13 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f18001k;
        float f14 = ((int) ((1575.0f * f13) + 0.5f)) / 1000.0f;
        fArr[0] = f14;
        fArr[1] = f14;
        float[] fArr2 = this.f18000j;
        float f15 = ((int) ((f13 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f15;
        fArr2[1] = f15;
        this.f17997g = 1;
        float[] fArr3 = this.f17996f;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f17995e;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f17999i;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f17998h = f17990r;
        aVar.f17979a = 500;
        aVar.f17980b = 500;
        this.f18007q = listView;
    }

    public static float b(float f13, float f14, float f15) {
        return f13 > f15 ? f15 : f13 < f14 ? f14 : f13;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f17995e
            r0 = r0[r7]
            float[] r1 = r3.f17996f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f17992b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            goto L58
        L3c:
            float[] r0 = r3.f17999i
            r0 = r0[r7]
            float[] r1 = r3.f18000j
            r1 = r1[r7]
            float[] r2 = r3.f18001k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r2 = b(r4, r1, r7)
            goto L58
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r2 = -r4
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.f.a(float, float, float, int):float");
    }

    public final float c(float f13, float f14) {
        if (f14 == 0.0f) {
            return 0.0f;
        }
        int i13 = this.f17997g;
        if (i13 == 0 || i13 == 1) {
            if (f13 < f14) {
                return f13 >= 0.0f ? 1.0f - (f13 / f14) : (this.f18005o && i13 == 1) ? 1.0f : 0.0f;
            }
            return 0.0f;
        }
        if (i13 == 2 && f13 < 0.0f) {
            return f13 / (-f14);
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f18006p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7d
        L16:
            r7.e()
            goto L7d
        L1a:
            r7.f18004n = r2
            r7.f18002l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f17993c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            androidx.core.widget.a r9 = r7.f17991a
            r9.f17981c = r0
            r9.f17982d = r8
            boolean r8 = r7.f18005o
            if (r8 != 0) goto L7d
            boolean r8 = r7.f()
            if (r8 == 0) goto L7d
            androidx.appcompat.app.z r8 = r7.f17994d
            if (r8 != 0) goto L61
            androidx.appcompat.app.z r8 = new androidx.appcompat.app.z
            r9 = 9
            r8.<init>(r7, r9)
            r7.f17994d = r8
        L61:
            r7.f18005o = r2
            r7.f18003m = r2
            boolean r8 = r7.f18002l
            if (r8 != 0) goto L76
            int r8 = r7.f17998h
            if (r8 <= 0) goto L76
            androidx.appcompat.app.z r9 = r7.f17994d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = q5.v0.f102521a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L76:
            androidx.appcompat.app.z r8 = r7.f17994d
            r8.run()
        L7b:
            r7.f18002l = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.f.d(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void e() {
        int i13 = 0;
        if (this.f18003m) {
            this.f18005o = false;
            return;
        }
        a aVar = this.f17991a;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i14 = (int) (currentAnimationTimeMillis - aVar.f17983e);
        int i15 = aVar.f17980b;
        if (i14 > i15) {
            i13 = i15;
        } else if (i14 >= 0) {
            i13 = i14;
        }
        aVar.f17987i = i13;
        aVar.f17986h = aVar.a(currentAnimationTimeMillis);
        aVar.f17985g = currentAnimationTimeMillis;
    }

    public final boolean f() {
        ListView listView;
        int count;
        a aVar = this.f17991a;
        float f13 = aVar.f17982d;
        int abs = (int) (f13 / Math.abs(f13));
        Math.abs(aVar.f17981c);
        if (abs == 0 || (count = (listView = this.f18007q).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i13 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i13 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
