package ve0;

import android.R;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public abstract class h extends Drawable {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f125695j = {R.attr.state_empty};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f125696k = {R.attr.state_pressed};

    /* renamed from: a, reason: collision with root package name */
    public final int f125697a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125698b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125699c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125700d;

    /* renamed from: e, reason: collision with root package name */
    public final int f125701e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f125702f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f125703g;

    /* renamed from: h, reason: collision with root package name */
    public g f125704h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f125705i;

    public h(int i13, int i14, int i15, float f13, int i16, int i17) {
        this.f125699c = i13;
        this.f125700d = i14;
        this.f125701e = i15;
        Paint paint = new Paint(1);
        this.f125702f = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f13);
        this.f125705i = false;
        this.f125697a = i16;
        this.f125698b = i17;
        setBounds(0, 0, i16, i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        r7 = com.pinterest.design.brio.widget.voice.PinterestSuggestion.f44894i;
        r6.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r6, android.graphics.PointF r7) {
        /*
            r5 = this;
            int[] r0 = ve0.h.f125696k
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L56
            int[] r3 = ve0.h.f125695j
            if (r6 == r1) goto L28
            r4 = 2
            if (r6 == r4) goto Le
            goto L6c
        Le:
            boolean r6 = r5.f125703g
            if (r6 == 0) goto L6c
            android.graphics.Rect r6 = r5.getBounds()
            float r2 = r7.x
            int r2 = (int) r2
            float r7 = r7.y
            int r7 = (int) r7
            boolean r6 = r6.contains(r2, r7)
            if (r6 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            r5.setState(r0)
            goto L6d
        L28:
            boolean r6 = r5.f125703g
            if (r6 == 0) goto L4f
            android.graphics.Rect r6 = r5.getBounds()
            float r0 = r7.x
            int r0 = (int) r0
            float r7 = r7.y
            int r7 = (int) r7
            boolean r6 = r6.contains(r0, r7)
            if (r6 == 0) goto L4f
            ve0.g r6 = r5.f125704h
            if (r6 == 0) goto L50
            ve0.j r6 = (ve0.j) r6
            int r7 = r6.f125709a
            com.pinterest.design.brio.widget.voice.PinterestSuggestion r6 = r6.f125710b
            switch(r7) {
                case 0: goto L49;
                default: goto L49;
            }
        L49:
            int r7 = com.pinterest.design.brio.widget.voice.PinterestSuggestion.f44894i
            r6.getClass()
            goto L50
        L4f:
            r1 = r2
        L50:
            r5.setState(r3)
            r5.f125703g = r2
            goto L6d
        L56:
            android.graphics.Rect r6 = r5.getBounds()
            float r3 = r7.x
            int r3 = (int) r3
            float r7 = r7.y
            int r7 = (int) r7
            boolean r6 = r6.contains(r3, r7)
            if (r6 == 0) goto L6c
            r5.f125703g = r1
            r5.setState(r0)
            goto L6d
        L6c:
            r1 = r2
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ve0.h.a(int, android.graphics.PointF):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f125698b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f125697a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f125702f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z13;
        int length = iArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                z13 = false;
                break;
            }
            if (iArr[i13] == 16842919) {
                z13 = true;
                break;
            }
            i13++;
        }
        boolean z14 = this.f125705i != z13;
        if (z14) {
            this.f125705i = z13;
            invalidateSelf();
        }
        return z14;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f125702f.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f125702f.setColorFilter(colorFilter);
    }
}
