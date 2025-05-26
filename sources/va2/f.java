package va2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.c1;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes2.dex */
public final class f extends wa2.l {

    /* renamed from: l, reason: collision with root package name */
    public final Context f125340l;

    /* renamed from: m, reason: collision with root package name */
    public int f125341m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f125342n;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f125343o;

    /* renamed from: p, reason: collision with root package name */
    public final float f125344p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f125345q;

    /* renamed from: r, reason: collision with root package name */
    public float f125346r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f125340l = context;
        Paint paint = new Paint();
        paint.setColor(dl2.b.x0(context, eo1.a.color_background_dark_opacity_300));
        this.f125342n = paint;
        this.f125343o = new RectF();
        this.f125344p = context.getResources().getDimension(r0.lego_grid_cell_analytics_radius);
        this.f125345q = new ArrayList();
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        this.f125345q.clear();
        this.f125346r = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ArrayList arrayList = this.f125345q;
        if (arrayList.isEmpty()) {
            return;
        }
        float f13 = this.f125346r;
        int save = canvas.save();
        canvas.translate(0.0f, f13);
        try {
            RectF rectF = this.f125343o;
            float f14 = this.f125344p;
            canvas.drawRoundRect(rectF, f14, f14, this.f125342n);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).draw(canvas);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.collections.c1] */
    public final void h() {
        ArrayList<b> arrayList = this.f125345q;
        if (!arrayList.isEmpty()) {
            int i13 = this.f125341m;
            int i14 = this.f128841d - i13;
            int i15 = this.f128842e - i13;
            float f13 = i13;
            this.f125343o.set(f13, f13, i14, i15);
            int size = (this.f128841d - (this.f125341m * 2)) / arrayList.size();
            int i16 = this.f125341m;
            int i17 = i13 + i16;
            boolean z13 = this.f128838a;
            int i18 = (i16 * (z13 ? -2 : 2)) + i13;
            int i19 = i18 + size;
            if (z13) {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                arrayList = new c1(arrayList);
            }
            for (b bVar : arrayList) {
                bVar.c(this.f128838a);
                bVar.setBounds(i18, i17, i19, i15);
                i18 += size;
                i19 += size;
            }
        }
    }

    public final void i(ArrayList statsState) {
        Intrinsics.checkNotNullParameter(statsState, "statsState");
        ArrayList arrayList = this.f125345q;
        arrayList.clear();
        Iterator it = statsState.iterator();
        while (it.hasNext()) {
            ua2.b bVar = (ua2.b) it.next();
            b bVar2 = new b(this.f125340l, new c(rm1.c.LIGHT, bVar.f121419a, vn1.c.LIGHT), this.f128838a, statsState.size() < 3);
            bVar2.a(bVar.f121420b);
            arrayList.add(bVar2);
        }
        invalidateSelf();
    }
}
