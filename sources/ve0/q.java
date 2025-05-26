package ve0;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import kh2.p2;
import pk.a0;

/* loaded from: classes.dex */
public final class q extends f {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f125739m = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f125740i;

    /* renamed from: j, reason: collision with root package name */
    public final int f125741j;

    /* renamed from: k, reason: collision with root package name */
    public int f125742k;

    /* renamed from: l, reason: collision with root package name */
    public Path f125743l;

    public q(Resources resources, int i13, d dVar) {
        super(i13, dVar, -1);
        this.f125742k = 0;
        int K = a0.K(8, resources);
        this.f125740i = K;
        this.f125741j = a0.K(16, resources) + K;
    }

    @Override // ve0.f
    public final void b(Rect rect) {
        if (this.f125694h == null) {
            this.f125694h = new e(this.f125687a, this.f125688b, this.f125693g);
        }
        this.f125694h.b(rect);
        this.f125694h.e(this.f125691e);
        this.f125694h.d(this.f125692f);
        f(this.f125690d);
    }

    @Override // ve0.f
    public final void c(b bVar) {
        b bVar2 = this.f125690d;
        this.f125690d = bVar;
        if (bVar2 != bVar) {
            f(bVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        e eVar = this.f125694h;
        if (eVar != null) {
            eVar.c(canvas);
            Path path = this.f125743l;
            if (path != null) {
                canvas.drawPath(path, this.f125687a);
            }
        }
    }

    public final void f(b bVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        float centerY;
        int i24;
        e eVar = this.f125694h;
        if (eVar == null || eVar.a() == null || bVar == b.NONE) {
            return;
        }
        Rect rect = new Rect();
        this.f125694h.a().round(rect);
        int i25 = p.f125738a[bVar.ordinal()];
        int i26 = this.f125740i;
        int i27 = this.f125741j;
        switch (i25) {
            case 1:
                i13 = rect.top;
                i14 = i13 - i26;
                i15 = i27;
                i16 = i13;
                i17 = i14;
                i18 = i26;
                break;
            case 2:
                int i28 = rect.left;
                i27 = a.a.b(rect.right, i28, 2, i28);
                i13 = rect.top;
                i14 = i13 - i26;
                i15 = i27;
                i16 = i13;
                i17 = i14;
                i18 = i26;
                break;
            case 3:
                i27 = rect.right - i27;
                i13 = rect.top;
                i14 = i13 - i26;
                i15 = i27;
                i16 = i13;
                i17 = i14;
                i18 = i26;
                break;
            case 4:
                i13 = rect.bottom;
                i14 = i13 + i26;
                i15 = i27;
                i16 = i13;
                i17 = i14;
                i18 = i26;
                break;
            case 5:
                int i29 = rect.left;
                i27 = a.a.b(rect.right, i29, 2, i29);
                i13 = rect.bottom;
                i14 = i13 + i26;
                i15 = i27;
                i16 = i13;
                i17 = i14;
                i18 = i26;
                break;
            case 6:
                i27 = rect.right - i27;
                i13 = rect.bottom;
                i14 = i13 + i26;
                i15 = i27;
                i16 = i13;
                i17 = i14;
                i18 = i26;
                break;
            case 7:
                i19 = (int) this.f125694h.a().left;
                i23 = i19 - i26;
                centerY = this.f125694h.a().centerY();
                int i33 = (int) centerY;
                i15 = i23;
                i16 = i26;
                i18 = i19;
                i17 = i33;
                break;
            case 8:
                i19 = (int) this.f125694h.a().right;
                i23 = i19 + i26;
                centerY = this.f125694h.a().centerY();
                int i332 = (int) centerY;
                i15 = i23;
                i16 = i26;
                i18 = i19;
                i17 = i332;
                break;
            default:
                i17 = 0;
                i18 = i26;
                i15 = i27;
                i16 = i18;
                break;
        }
        if (b.HORIZONTAL_ANCHOR_POSITIONS.contains(bVar) && (i24 = this.f125742k) != 0) {
            int i34 = i26 * 3;
            i15 = p2.U(i15 + i24, rect.left + i34, rect.right - i34);
        }
        if (b.VERTICAL_ANCHOR_POSITIONS.contains(bVar)) {
            Path path = new Path();
            this.f125743l = path;
            float f13 = i15;
            float f14 = i17;
            path.moveTo(f13, f14);
            float f15 = i18;
            this.f125743l.lineTo(f15, i17 + i26);
            this.f125743l.lineTo(f15, i17 - i26);
            this.f125743l.lineTo(f13, f14);
            this.f125743l.close();
        } else {
            Path path2 = new Path();
            this.f125743l = path2;
            float f16 = i15;
            float f17 = i17;
            path2.moveTo(f16, f17);
            float f18 = i16;
            this.f125743l.lineTo(i15 + i26, f18);
            this.f125743l.lineTo(i15 - i26, f18);
            this.f125743l.lineTo(f16, f17);
            this.f125743l.close();
        }
        invalidateSelf();
    }

    @Override // ve0.f, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        super.getPadding(rect);
        int i13 = p.f125738a[this.f125690d.ordinal()];
        int i14 = this.f125740i;
        switch (i13) {
            case 1:
            case 2:
            case 3:
                rect.top += i14;
                break;
            case 4:
            case 5:
            case 6:
                rect.bottom += i14;
                break;
        }
        return true;
    }

    @Override // ve0.f, android.graphics.drawable.Drawable
    public final void setBounds(int i13, int i14, int i15, int i16) {
        int i17 = p.f125738a[this.f125690d.ordinal()];
        int i18 = this.f125740i;
        switch (i17) {
            case 1:
            case 2:
            case 3:
                i14 += i18;
                break;
            case 4:
            case 5:
            case 6:
                i16 -= i18;
                break;
        }
        super.setBounds(i13, i14, i15, i16);
    }

    public q(Resources resources, int i13, d dVar, int i14) {
        super(i13, dVar, i14);
        this.f125742k = 0;
        int K = a0.K(8, resources);
        this.f125740i = K;
        this.f125741j = a0.K(16, resources) + K;
    }
}
