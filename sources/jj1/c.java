package jj1;

import android.content.Context;
import android.graphics.Canvas;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import pk.a0;
import ua2.b1;
import ua2.f1;
import ua2.z0;
import wa2.l;

/* loaded from: classes5.dex */
public final class c extends f1 implements e {

    /* renamed from: f, reason: collision with root package name */
    public final va2.f f76311f;

    /* renamed from: g, reason: collision with root package name */
    public int f76312g;

    /* renamed from: h, reason: collision with root package name */
    public int f76313h;

    /* renamed from: i, reason: collision with root package name */
    public int f76314i;

    /* renamed from: j, reason: collision with root package name */
    public final int f76315j;

    /* renamed from: k, reason: collision with root package name */
    public final int f76316k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SbaPinRep pinRepView) {
        super(pinRepView, b1.FIXED);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Context context = pinRepView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f76311f = new va2.f(context);
        int dimensionPixelSize = pinRepView.getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_analytics_height);
        int dimensionPixelSize2 = pinRepView.getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_analytics_padding);
        this.f76315j = dimensionPixelSize2;
        this.f76316k = (dimensionPixelSize2 * 2) + dimensionPixelSize;
    }

    public final void A(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        if (!displayState.f76310a.isEmpty()) {
            va2.f fVar = this.f76311f;
            fVar.getClass();
            List<a> statsState = displayState.f76310a;
            Intrinsics.checkNotNullParameter(statsState, "statsState");
            ArrayList arrayList = fVar.f125345q;
            arrayList.clear();
            for (a aVar : statsState) {
                va2.b bVar = new va2.b(fVar.f125340l, new va2.c(rm1.c.LIGHT, aVar.f76308a, vn1.c.LIGHT), fVar.f128838a, statsState.size() < 3);
                Integer num = aVar.f76309b;
                if (num != null) {
                    bVar.b(num.intValue());
                } else {
                    bVar.d();
                }
                arrayList.add(bVar);
            }
            fVar.invalidateSelf();
        }
    }

    public final void B(boolean z13) {
        a0.x(this.f121492a, this.f76311f, z13, 80);
    }

    @Override // jj1.e
    public final void b(int i13, int i14, int i15) {
        this.f76312g = i13;
        this.f76313h = i14;
        this.f76314i = i15;
    }

    @Override // ua2.f1
    public final l k() {
        return this.f76311f;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f76313h > 0) {
            float f13 = this.f76314i + (r2 - this.f76316k);
            va2.f fVar = this.f76311f;
            fVar.f125346r = f13;
            fVar.draw(canvas);
        }
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        int i15 = this.f76312g;
        va2.f fVar = this.f76311f;
        fVar.f(i15);
        fVar.e(this.f76316k);
        fVar.f125341m = this.f76315j;
        fVar.h();
        return new z0(fVar.f128841d, fVar.f128842e);
    }
}
