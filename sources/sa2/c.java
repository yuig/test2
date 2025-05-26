package sa2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.bumptech.glide.d;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sg;
import com.pinterest.ui.grid.LegoPinGridCell;
import hs1.m;
import hs1.q;
import jc0.v;
import jj1.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.u;
import ua2.b1;
import ua2.h0;
import ua2.z0;
import wa2.l;
import zp.t;

/* loaded from: classes4.dex */
public final class c extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f112222h;

    /* renamed from: i, reason: collision with root package name */
    public final b f112223i;

    /* renamed from: j, reason: collision with root package name */
    public final float f112224j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LegoPinGridCell legoGridCell, q imageCache, Function0 getPinImageBottomEdgeYPos) {
        super(legoGridCell, b1.FIXED);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(getPinImageBottomEdgeYPos, "getPinImageBottomEdgeYPos");
        this.f112222h = getPinImageBottomEdgeYPos;
        Context context = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f112223i = new b(context, imageCache);
        this.f112224j = legoGridCell.getContext().getResources().getDimensionPixelSize(r0.margin);
    }

    @Override // ua2.h0
    public final boolean B() {
        f30 S = d.S(this.f121502f);
        if (S == null) {
            return false;
        }
        u.f85943a.d(new v(new t(S), false, 0L, 30));
        return false;
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        int intValue = ((Number) this.f112222h.invoke()).intValue();
        return this.f112223i.f112213r.contains(i13, i14 - ((intValue - r1.f128842e) - this.f112224j));
    }

    public final void E(f displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        F(displayState.f76317a);
    }

    public final void F(sg sgVar) {
        if (sgVar != null) {
            String j13 = sgVar.j();
            b bVar = this.f112223i;
            if (j13 != null) {
                bVar.getClass();
                Intrinsics.checkNotNullParameter(j13, "<set-?>");
                bVar.f112209n = j13;
            }
            String g13 = sgVar.g();
            if (g13 != null) {
                new Paint(1).setColor(Color.parseColor(g13));
            }
            String url = sgVar.h();
            if (url != null) {
                androidx.appcompat.widget.q bitmapListener = new androidx.appcompat.widget.q(this, 2);
                bVar.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(bitmapListener, "bitmapListener");
                bVar.A = true;
                mp0.b bVar2 = new mp0.b(3, bVar, bitmapListener);
                int i13 = (int) bVar.f112215t;
                ((m) bVar.f112207l).k(url, bVar2, Integer.valueOf(i13), Integer.valueOf(i13));
            }
        }
    }

    @Override // ua2.f1
    public final l k() {
        return this.f112223i;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        int intValue = ((Number) this.f112222h.invoke()).intValue();
        b bVar = this.f112223i;
        float f13 = intValue - bVar.f128842e;
        float f14 = this.f112224j;
        canvas.translate(f14, f13 - f14);
        bVar.draw(canvas);
        canvas.restore();
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        b bVar = this.f112223i;
        bVar.g(0);
        bVar.f(i13);
        bVar.e(0);
        int i15 = bVar.f128841d;
        int i16 = bVar.f112208m;
        float f13 = bVar.f112214s;
        int i17 = (int) (2 * f13);
        int i18 = (i15 - (i16 * 2)) - i17;
        CharSequence charSequence = bVar.f112209n;
        StaticLayout z13 = d.z(charSequence, charSequence.length(), bVar.f112210o, i18, Layout.Alignment.ALIGN_NORMAL, TextUtils.TruncateAt.END, i18, 2);
        int height = z13.getHeight() + i17;
        bVar.f128842e = height;
        bVar.f112211p = z13;
        float f14 = i16;
        bVar.f112218w = bVar.A ? bVar.f112216u + f14 : f14 + f13;
        bVar.f112219x = f14 + f13;
        bVar.f112220y = f13;
        return new z0(bVar.f128841d, height);
    }
}
