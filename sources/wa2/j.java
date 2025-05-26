package wa2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class j extends l {
    public List A;
    public final BitmapDrawable B;
    public final Paint C;
    public final int D;
    public boolean E;
    public boolean F;
    public final int G;
    public final int H;

    /* renamed from: l, reason: collision with root package name */
    public final hs1.q f128807l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f128808m;

    /* renamed from: n, reason: collision with root package name */
    public int f128809n;

    /* renamed from: o, reason: collision with root package name */
    public int f128810o;

    /* renamed from: p, reason: collision with root package name */
    public int f128811p;

    /* renamed from: q, reason: collision with root package name */
    public int f128812q;

    /* renamed from: r, reason: collision with root package name */
    public int f128813r;

    /* renamed from: s, reason: collision with root package name */
    public int f128814s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f128815t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f128816u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f128817v;

    /* renamed from: w, reason: collision with root package name */
    public final Paint f128818w;

    /* renamed from: x, reason: collision with root package name */
    public int f128819x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f128820y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f128821z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(com.pinterest.ui.grid.LegoPinGridCellImpl r10, boolean r11, boolean r12, hs1.q r13) {
        /*
            r9 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "imageCache"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            android.content.Context r0 = r10.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.app.Activity r0 = bs1.c.k0(r0)
            r9.<init>(r0)
            r9.f128807l = r13
            r13 = -1
            r9.f128810o = r13
            int r13 = wa2.l.f128837k
            r9.f128814s = r13
            r13 = 255(0xff, float:3.57E-43)
            r9.f128819x = r13
            rm1.d r13 = new rm1.d
            rm1.f r3 = new rm1.f
            rm1.q r0 = rm1.q.ARROW_UP_RIGHT
            rm1.i r2 = rm1.i.XS
            r3.<init>(r0, r2)
            rm1.c r4 = rm1.c.DARK
            r6 = 0
            r7 = 0
            r5 = 0
            r8 = 28
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.content.Context r0 = r10.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.graphics.drawable.BitmapDrawable r13 = com.bumptech.glide.d.C(r13, r0)
            r9.B = r13
            int r13 = eo1.a.color_white_mochimalist_0_opacity_80
            r9.D = r13
            android.content.Context r13 = r10.getContext()
            r9.E = r11
            r9.F = r12
            int r11 = eo1.b.color_themed_transparent
            java.lang.Object r12 = d5.a.f53679a
            int r11 = r13.getColor(r11)
            r9.G = r11
            int r12 = eo1.b.color_gray_500
            int r12 = r13.getColor(r12)
            r9.H = r12
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r9.f128815t = r0
            boolean r1 = r9.E
            if (r1 == 0) goto L74
            goto L75
        L74:
            r11 = r12
        L75:
            r0.setColor(r11)
            android.graphics.Paint r11 = new android.graphics.Paint
            r11.<init>()
            r9.f128816u = r11
            android.graphics.Paint r11 = new android.graphics.Paint
            r12 = 1
            r11.<init>(r12)
            r9.f128818w = r11
            int r12 = eo1.a.color_background_dark_opacity_100
            int r12 = dl2.b.x0(r13, r12)
            r11.setColor(r12)
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 3
            r11.<init>(r12)
            r9.f128817v = r11
            r11 = 0
        L99:
            if (r11 >= r12) goto La8
            qa2.c r0 = new qa2.c
            r0.<init>(r10)
            java.util.ArrayList r1 = r9.f128817v
            r1.add(r0)
            int r11 = r11 + 1
            goto L99
        La8:
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>()
            r9.C = r10
            int r11 = r9.D
            int r11 = dl2.b.x0(r13, r11)
            r10.setColor(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa2.j.<init>(com.pinterest.ui.grid.LegoPinGridCellImpl, boolean, boolean, hs1.q):void");
    }

    @Override // wa2.l
    public int b() {
        return this.f128813r;
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        ArrayList arrayList = this.f128820y;
        if (arrayList != null) {
            int i13 = 0;
            for (Object obj : arrayList) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                qa2.c cVar = (qa2.c) this.f128817v.get(i13);
                ((hs1.m) this.f128807l).h(cVar);
                cVar.d();
                i13 = i14;
            }
        }
        this.f128816u.reset();
        this.f128811p = 0;
        this.f128812q = 0;
        this.f128813r = 0;
        this.f128820y = null;
        this.f128821z = null;
        this.f128810o = -1;
        this.A = null;
        this.f128814s = l.f128837k;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF;
        List list;
        RectF rectF2;
        RectF rectF3;
        float height;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ArrayList arrayList = this.f128820y;
        if (!(arrayList == null || arrayList.isEmpty())) {
            if (this.f128808m && !this.E) {
                Path path = new Path();
                float width = canvas.getWidth();
                List list2 = this.A;
                if (list2 == null || list2.isEmpty()) {
                    height = canvas.getHeight();
                } else {
                    List list3 = this.A;
                    Intrinsics.f(list3);
                    height = ((RectF) list3.get(0)).bottom;
                }
                float height2 = canvas.getHeight();
                path.reset();
                path.moveTo(0.0f, 0.0f);
                path.lineTo(width, 0.0f);
                path.lineTo(width, height - this.f128809n);
                path.quadTo(width, height, width - this.f128809n, height);
                path.lineTo(this.f128809n + 0.0f, height);
                path.quadTo(0.0f, height, 0.0f, height - this.f128809n);
                path.moveTo(0.0f, height);
                path.lineTo(0.0f, height2);
                path.lineTo(width, height2);
                path.lineTo(width, height);
                path.lineTo(0.0f, height);
                path.close();
                canvas.clipPath(path);
            }
            ArrayList arrayList2 = this.f128820y;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    ArrayList arrayList3 = this.f128817v;
                    if (((qa2.c) arrayList3.get(i13)).c() != null) {
                        qa2.c cVar = (qa2.c) arrayList3.get(i13);
                        List list4 = this.A;
                        if (list4 != null && (rectF3 = (RectF) list4.get(i13)) != null) {
                            cVar.f103232a = this.E ? this.f128809n : 0;
                            cVar.a(canvas, rectF3.left, rectF3.top, rectF3.width(), rectF3.height(), false);
                            Bitmap c13 = cVar.c();
                            if (c13 != null && qb0.b.d(c13)) {
                                boolean z13 = this.E;
                                Paint paint = this.f128818w;
                                if (z13) {
                                    float f13 = this.f128809n;
                                    float[] fArr = {f13, f13, f13, f13, f13, f13, f13, f13};
                                    Path path2 = new Path();
                                    path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
                                    canvas.drawPath(path2, paint);
                                } else {
                                    canvas.drawRect(rectF3, paint);
                                }
                            }
                        }
                        if (this.F && (list = this.A) != null && (rectF2 = (RectF) list.get(i13)) != null) {
                            Rect rect = new Rect();
                            rectF2.roundOut(rect);
                            BitmapDrawable bitmapDrawable = this.B;
                            float intrinsicWidth = bitmapDrawable.getIntrinsicWidth() * 0.65f;
                            float f14 = 0.5f * intrinsicWidth;
                            int i15 = rect.right;
                            float f15 = ((i15 - r6) * 0.215f) + rect.left;
                            int i16 = rect.bottom;
                            float f16 = ((i16 - r2) * 0.215f) + rect.top;
                            canvas.drawCircle(f15, f16, intrinsicWidth, this.C);
                            bitmapDrawable.setBounds((int) (f15 - f14), (int) (f16 - f14), (int) (f15 + f14), (int) (f14 + f16));
                            bitmapDrawable.draw(canvas);
                        }
                    } else {
                        List list5 = this.A;
                        if (list5 != null && (rectF = (RectF) list5.get(i13)) != null) {
                            float f17 = this.E ? this.f128809n : 0.0f;
                            canvas.drawRoundRect(rectF, f17, f17, this.f128815t);
                        }
                    }
                    i13 = i14;
                }
            }
        }
    }

    @Override // wa2.l, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f128819x == 255 ? -1 : -3;
    }

    public final void h(int i13, String url) {
        hs1.z o13;
        Intrinsics.checkNotNullParameter(url, "url");
        qa2.c cVar = (qa2.c) this.f128817v.get(i13);
        if (cVar.c() == null) {
            o13 = ((hs1.m) this.f128807l).o(url, false);
            o13.f70086d = true;
            o13.f70087e = this.f128811p;
            o13.f70088f = this.f128812q;
            Bitmap.Config config = Bitmap.Config.RGB_565;
            o13.a(cVar);
        }
    }

    public void i() {
        ArrayList arrayList = this.f128820y;
        if (arrayList != null) {
            this.A = new ArrayList(arrayList.size());
            int i13 = this.f128840c;
            ArrayList arrayList2 = this.f128820y;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    String str = (String) next;
                    int i16 = (this.f128811p + this.f128814s) * i14;
                    int i17 = this.f128811p;
                    RectF rectF = new RectF(i16, i13, i16 + i17, i17 + i13);
                    List list = this.A;
                    if (list != null) {
                        list.add(rectF);
                    }
                    h(i14, str);
                    i14 = i15;
                }
            }
            e(this.f128813r);
        }
    }

    public void j(int i13, float f13, int i14) {
        int ceil = (int) Math.ceil((i14 - (this.f128814s * 2)) / 3.0d);
        this.f128811p = ceil;
        this.f128812q = ceil;
        int i15 = this.f128814s;
        this.f128813r = ceil + i15;
        g(i13 + i15);
        e(this.f128813r);
        f(i14);
    }

    public void k(int i13, int i14) {
        this.f128810o = i13 / (this.f128811p + this.f128814s);
        ArrayList arrayList = this.f128821z;
        if (arrayList != null) {
            int size = arrayList.size();
            int i15 = this.f128810o;
            if (i15 < 0 || i15 > size - 1) {
                this.f128810o = this.E ? size - 1 : -1;
            }
        }
    }

    public boolean l(int i13, int i14) {
        return getBounds().contains(i13, i14);
    }

    @Override // wa2.l, android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f128819x = i13;
    }

    @Override // wa2.l, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
