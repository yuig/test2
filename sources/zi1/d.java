package zi1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import hs1.m;
import hs1.q;
import hs1.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import wa2.l;

/* loaded from: classes5.dex */
public class d extends l {
    public int A;
    public int B;
    public List C;
    public int D;
    public List E;
    public int F;
    public final BitmapDrawable G;
    public final Paint H;

    /* renamed from: l, reason: collision with root package name */
    public final q f142008l;

    /* renamed from: m, reason: collision with root package name */
    public final int f142009m;

    /* renamed from: n, reason: collision with root package name */
    public int f142010n;

    /* renamed from: o, reason: collision with root package name */
    public int f142011o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f142012p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f142013q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f142014r;

    /* renamed from: s, reason: collision with root package name */
    public float f142015s;

    /* renamed from: t, reason: collision with root package name */
    public int f142016t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f142017u;

    /* renamed from: v, reason: collision with root package name */
    public final Paint f142018v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f142019w;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f142020x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f142021y;

    /* renamed from: z, reason: collision with root package name */
    public int f142022z;

    public /* synthetic */ d(View view, q qVar) {
        this(view, qVar, 3);
    }

    @Override // wa2.l
    public int b() {
        return this.B;
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        List list = this.C;
        if (list != null) {
            int i13 = 0;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    f0.p();
                    throw null;
                }
                qa2.c cVar = (qa2.c) this.f142019w.get(i13);
                ((m) this.f142008l).h(cVar);
                cVar.d();
                i13 = i14;
            }
        }
        this.f142018v.reset();
        this.f142022z = 0;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.f142010n = -1;
        this.E = null;
        this.F = l.f128837k;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF;
        List list;
        RectF rectF2;
        RectF rectF3;
        float height;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        List list2 = this.C;
        if (!(list2 == null || list2.isEmpty())) {
            if (this.f142012p) {
                Path path = new Path();
                float width = canvas.getWidth();
                List list3 = this.E;
                if (list3 == null || list3.isEmpty()) {
                    height = canvas.getHeight();
                } else {
                    List list4 = this.E;
                    Intrinsics.f(list4);
                    height = ((RectF) list4.get(0)).bottom;
                }
                float height2 = canvas.getHeight();
                path.reset();
                path.moveTo(0.0f, 0.0f);
                path.lineTo(width, 0.0f);
                path.lineTo(width, height - this.f142011o);
                path.quadTo(width, height, width - this.f142011o, height);
                path.lineTo(this.f142011o + 0.0f, height);
                path.quadTo(0.0f, height, 0.0f, height - this.f142011o);
                path.moveTo(0.0f, height);
                path.lineTo(0.0f, height2);
                path.lineTo(width, height2);
                path.lineTo(width, height);
                path.lineTo(0.0f, height);
                path.close();
                canvas.clipPath(path);
            }
            List list5 = this.C;
            if (list5 != null) {
                int i13 = 0;
                for (Object obj : list5) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        f0.p();
                        throw null;
                    }
                    ArrayList arrayList = this.f142019w;
                    if (((qa2.c) arrayList.get(i13)).c() != null) {
                        qa2.c cVar = (qa2.c) arrayList.get(i13);
                        List list6 = this.E;
                        if (list6 != null && (rectF3 = (RectF) CollectionsKt.U(i13, list6)) != null) {
                            cVar.f103232a = this.f142016t;
                            cVar.a(canvas, rectF3.left, rectF3.top, rectF3.width(), rectF3.height(), false);
                            Bitmap c13 = cVar.c();
                            if (c13 != null && qb0.b.d(c13)) {
                                boolean z13 = this.f142013q;
                                Paint paint = this.f142020x;
                                if (z13) {
                                    float f13 = this.f142011o;
                                    float[] fArr = {f13, f13, f13, f13, f13, f13, f13, f13};
                                    Path path2 = new Path();
                                    path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
                                    canvas.drawPath(path2, paint);
                                } else {
                                    canvas.drawRect(rectF3, paint);
                                }
                            }
                        }
                        if (this.f142014r && (list = this.E) != null && (rectF2 = (RectF) CollectionsKt.U(i13, list)) != null) {
                            Rect rect = new Rect();
                            rectF2.roundOut(rect);
                            BitmapDrawable bitmapDrawable = this.G;
                            float intrinsicWidth = bitmapDrawable.getIntrinsicWidth() * 0.65f;
                            float f14 = 0.5f * intrinsicWidth;
                            int i15 = rect.right;
                            float f15 = ((i15 - r9) * 0.215f) + rect.left;
                            int i16 = rect.bottom;
                            float f16 = ((i16 - r4) * 0.215f) + rect.top;
                            canvas.drawCircle(f15, f16, intrinsicWidth, this.H);
                            bitmapDrawable.setBounds((int) (f15 - f14), (int) (f16 - f14), (int) (f15 + f14), (int) (f14 + f16));
                            bitmapDrawable.draw(canvas);
                        }
                    } else {
                        List list7 = this.E;
                        if (list7 != null && (rectF = (RectF) CollectionsKt.U(i13, list7)) != null) {
                            float f17 = this.f142015s;
                            canvas.drawRoundRect(rectF, f17, f17, this.f142017u);
                        }
                    }
                    i13 = i14;
                }
            }
        }
    }

    @Override // wa2.l, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.D == 255 ? -1 : -3;
    }

    public final void h(e displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.C = displayState.f142023a;
        this.f142012p = displayState.f142029g;
        Context context = this.f142021y;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f142011o = displayState.f142024b.a(context).intValue();
        this.f142013q = displayState.f142025c;
        this.f142014r = displayState.f142030h;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f142017u.setColor(bs1.c.A(context, displayState.f142026d));
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f142015s = displayState.f142027e.a(context).intValue();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f142016t = displayState.f142028f.a(context).intValue();
        int i13 = 0;
        for (Object obj : displayState.f142023a) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            ((qa2.c) this.f142019w.get(i13)).f103239h = (String) obj;
            i13 = i14;
        }
    }

    public final int i() {
        return this.f142010n;
    }

    public final void j(int i13, String url) {
        z o13;
        Intrinsics.checkNotNullParameter(url, "url");
        qa2.c cVar = (qa2.c) this.f142019w.get(i13);
        if (cVar.c() == null) {
            o13 = ((m) this.f142008l).o(url, false);
            o13.f70086d = true;
            o13.f70087e = this.f142022z;
            o13.f70088f = this.A;
            Bitmap.Config config = Bitmap.Config.RGB_565;
            o13.a(cVar);
        }
    }

    public void k() {
        List list = this.C;
        if (list != null) {
            this.E = new ArrayList(list.size());
            int i13 = this.f128840c;
            List list2 = this.C;
            if (list2 != null) {
                int i14 = 0;
                for (Object obj : list2) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    String str = (String) obj;
                    RectF rectF = new RectF((this.f142022z + this.F) * i14, i13, r5 + this.f142022z, this.A + i13);
                    List list3 = this.E;
                    if (list3 != null) {
                        list3.add(rectF);
                    }
                    j(i14, str);
                    i14 = i15;
                }
            }
            e(this.B);
        }
    }

    public final void l(int i13) {
        this.F = i13;
    }

    public void m(int i13, float f13, int i14) {
        int ceil = (int) Math.ceil((i14 - ((r6 - 1) * this.F)) / this.f142009m);
        this.f142022z = ceil;
        this.A = ceil;
        int i15 = this.F;
        this.B = ceil + i15;
        g(i13 + i15);
        e(this.B);
        f(i14);
    }

    public void n(int i13, int i14) {
        this.f142010n = i13 / (this.f142022z + this.F);
        List list = this.C;
        if (list != null) {
            int size = list.size();
            int i15 = this.f142010n;
            if (i15 < 0 || i15 > size - 1) {
                this.f142010n = this.f142013q ? size - 1 : -1;
            }
        }
    }

    public boolean o(int i13, int i14) {
        return getBounds().contains(i13, i14);
    }

    @Override // wa2.l, android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.D = i13;
    }

    @Override // wa2.l, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.view.View r12, hs1.q r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "imageCache"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            android.content.Context r0 = r12.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.app.Activity r0 = bs1.c.k0(r0)
            r11.<init>(r0)
            r11.f142008l = r13
            r11.f142009m = r14
            r13 = -1
            r11.f142010n = r13
            android.graphics.Paint r13 = new android.graphics.Paint
            r13.<init>()
            r11.f142017u = r13
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r11.f142018v = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r2 = 1
            r0.<init>(r2)
            r11.f142020x = r0
            android.content.Context r2 = r12.getContext()
            r11.f142021y = r2
            android.content.res.Resources r3 = r2.getResources()
            java.lang.String r4 = "getResources(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r3 = 255(0xff, float:3.57E-43)
            r11.D = r3
            int r3 = wa2.l.f128837k
            r11.F = r3
            rm1.d r3 = new rm1.d
            rm1.f r5 = new rm1.f
            rm1.q r4 = rm1.q.ARROW_UP_RIGHT
            rm1.i r6 = rm1.i.XS
            r5.<init>(r4, r6)
            rm1.c r6 = rm1.c.DARK
            r8 = 0
            r9 = 0
            r7 = 0
            r10 = 28
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            android.content.Context r4 = r12.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            android.graphics.drawable.BitmapDrawable r1 = com.bumptech.glide.d.C(r3, r4)
            r11.G = r1
            int r1 = eo1.a.color_white_mochimalist_0_opacity_80
            int r3 = eo1.b.color_themed_transparent
            java.lang.Object r4 = d5.a.f53679a
            int r3 = r2.getColor(r3)
            int r4 = eo1.b.color_gray_500
            int r4 = r2.getColor(r4)
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            int r6 = eo1.a.color_background_dark_opacity_100
            int r6 = dl2.b.x0(r2, r6)
            r0.setColor(r6)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r11.H = r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            int r1 = dl2.b.x0(r2, r1)
            r0.setColor(r1)
            boolean r0 = r11.f142013q
            if (r0 == 0) goto La5
            goto La6
        La5:
            r3 = r4
        La6:
            r13.setColor(r3)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r14)
            r11.f142019w = r13
            r13 = 0
        Lb1:
            if (r13 >= r14) goto Lc0
            qa2.c r0 = new qa2.c
            r0.<init>(r12)
            java.util.ArrayList r1 = r11.f142019w
            r1.add(r0)
            int r13 = r13 + 1
            goto Lb1
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zi1.d.<init>(android.view.View, hs1.q, int):void");
    }
}
