package ln1;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.ads.AdSize;
import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import oi.o6;

/* loaded from: classes5.dex */
public final class k extends Drawable implements Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f84021a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f84022b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f84023c;

    /* renamed from: d, reason: collision with root package name */
    public final int f84024d;

    /* renamed from: e, reason: collision with root package name */
    public final float f84025e;

    /* renamed from: f, reason: collision with root package name */
    public final float f84026f;

    /* renamed from: g, reason: collision with root package name */
    public float f84027g;

    /* renamed from: h, reason: collision with root package name */
    public final ArgbEvaluator f84028h;

    /* renamed from: i, reason: collision with root package name */
    public float f84029i;

    /* renamed from: j, reason: collision with root package name */
    public final List f84030j;

    /* renamed from: k, reason: collision with root package name */
    public final int f84031k;

    /* renamed from: l, reason: collision with root package name */
    public final int f84032l;

    /* renamed from: m, reason: collision with root package name */
    public final float f84033m;

    /* renamed from: n, reason: collision with root package name */
    public float f84034n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f84035o;

    /* renamed from: p, reason: collision with root package name */
    public float f84036p;

    /* renamed from: q, reason: collision with root package name */
    public final int f84037q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f84038r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f84039s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f84040t;

    /* renamed from: u, reason: collision with root package name */
    public float f84041u;

    /* renamed from: v, reason: collision with root package name */
    public final int f84042v;

    /* renamed from: w, reason: collision with root package name */
    public final o6 f84043w;

    public k(Context context, ArrayList colors) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f84021a = context;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f84022b = paint;
        int Q = j1.Q(context, 56);
        this.f84024d = Q;
        float f13 = Q / 2.0f;
        this.f84025e = f13;
        this.f84026f = f13;
        this.f84028h = new ArgbEvaluator();
        this.f84030j = q0.f80391a;
        this.f84031k = 900;
        this.f84032l = 2700;
        this.f84033m = j1.Q(context, 16) * 0.5f;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 3; i13++) {
            arrayList.add(Float.valueOf(0.0f));
        }
        this.f84035o = arrayList;
        this.f84037q = 900;
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 0; i14 < 3; i14++) {
            arrayList2.add(f0.j(Float.valueOf(this.f84025e), Float.valueOf(this.f84026f)));
        }
        this.f84038r = arrayList2;
        List<List> j13 = f0.j(f0.j(14, 36), f0.j(28, 12), f0.j(42, 36));
        ArrayList arrayList3 = new ArrayList(g0.q(j13, 10));
        for (List list : j13) {
            ArrayList arrayList4 = new ArrayList(g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList4.add(Float.valueOf(j1.Q(this.f84021a, ((Number) it.next()).intValue())));
            }
            arrayList3.add(arrayList4);
        }
        this.f84039s = arrayList3;
        ArrayList arrayList5 = this.f84038r;
        ArrayList arrayList6 = new ArrayList(g0.q(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(CollectionsKt.H0((List) it2.next()));
        }
        this.f84040t = arrayList6;
        this.f84042v = AdSize.WIDE_SKYSCRAPER_HEIGHT;
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f84030j = colors;
        this.f84022b.setColor(a());
        invalidateSelf();
        this.f84043w = new o6(this, colors, 15);
    }

    public final int a() {
        if (this.f84030j.isEmpty()) {
            throw new IllegalStateException("No colors provided for spinner animation");
        }
        if (this.f84030j.size() == 1) {
            return ((Number) this.f84030j.get(0)).intValue();
        }
        float f13 = this.f84029i;
        float f14 = AdSize.WIDE_SKYSCRAPER_HEIGHT;
        int i13 = (int) (f13 / f14);
        int intValue = ((Number) this.f84030j.get(i13)).intValue();
        List list = this.f84030j;
        Object evaluate = this.f84028h.evaluate((this.f84029i % f14) / f14, Integer.valueOf(intValue), Integer.valueOf(((Number) list.get((i13 + 1) % list.size())).intValue()));
        Intrinsics.g(evaluate, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) evaluate).intValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int save = canvas.save();
        canvas.rotate(this.f84027g, this.f84025e, this.f84026f);
        for (int i13 = 0; i13 < 3; i13++) {
            ArrayList arrayList = this.f84040t;
            canvas.drawCircle(((Number) ((List) arrayList.get(i13)).get(0)).floatValue(), ((Number) ((List) arrayList.get(i13)).get(1)).floatValue(), ((Number) this.f84035o.get(i13)).floatValue(), this.f84022b);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f84024d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f84024d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f84023c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        throw new xk2.o(null, 1, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new xk2.o(null, 1, null);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f84023c) {
            return;
        }
        this.f84023c = true;
        if (this.f84023c) {
            scheduleSelf(this.f84043w, SystemClock.uptimeMillis() + 20);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f84023c) {
            this.f84023c = false;
            unscheduleSelf(this.f84043w);
            this.f84027g = 0.0f;
            this.f84034n = 0.0f;
            this.f84029i = 0.0f;
            for (int i13 = 0; i13 < 3; i13++) {
                ArrayList arrayList = this.f84040t;
                List list = (List) arrayList.get(i13);
                ArrayList arrayList2 = this.f84038r;
                list.set(0, ((List) arrayList2.get(i13)).get(0));
                ((List) arrayList.get(i13)).set(1, ((List) arrayList2.get(i13)).get(1));
            }
            for (int i14 = 0; i14 < 3; i14++) {
                this.f84035o.set(i14, Float.valueOf(0.0f));
            }
            this.f84036p = 0.0f;
            this.f84041u = 0.0f;
        }
    }
}
