package yi1;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;
import com.pinterest.api.model.or;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import ey.g3;
import h32.d4;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m60.q0;
import m60.r0;
import ua2.d1;
import ua2.z0;

/* loaded from: classes2.dex */
public final class s extends d1 implements wi1.a, ui1.a {

    /* renamed from: l, reason: collision with root package name */
    public static final int f139152l = ml2.c.c(420.0f * hf0.b.f69001a);

    /* renamed from: m, reason: collision with root package name */
    public static final int f139153m = ml2.c.c(hf0.b.f69002b * 1.25f);

    /* renamed from: n, reason: collision with root package name */
    public static final int f139154n = ml2.c.c(hf0.b.f69002b * 2.8f);

    /* renamed from: h, reason: collision with root package name */
    public final u50.r f139155h;

    /* renamed from: i, reason: collision with root package name */
    public l f139156i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f139157j;

    /* renamed from: k, reason: collision with root package name */
    public final p f139158k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SbaPinRep pinRepView, ri1.b eventIntake, hs1.q imageCache) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        this.f139155h = eventIntake;
        com.pinterest.feature.pincarouselads.view.k listener = new com.pinterest.feature.pincarouselads.view.k(this, 1);
        p pVar = new p(pinRepView, imageCache);
        Intrinsics.checkNotNullParameter(listener, "listener");
        pVar.f139134v.f103242k = new o(listener, pVar);
        this.f139158k = pVar;
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        pVar.M = eventIntake;
    }

    public final void A(l displayState) {
        List b13;
        int i13;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        l lVar = this.f139156i;
        boolean d2 = Intrinsics.d(lVar != null ? lVar.f139111a : null, displayState.f139111a);
        p pVar = this.f139158k;
        if (!d2) {
            pVar.getClass();
            h0 displayState2 = displayState.f139111a;
            Intrinsics.checkNotNullParameter(displayState2, "displayState");
            View view = pVar.f139124l;
            Context context = view.getContext();
            u50.i iVar = displayState2.f139091a;
            if (iVar != null) {
                Intrinsics.f(context);
                i13 = ((Number) iVar.a(context)).intValue();
            } else {
                i13 = -1;
            }
            if (qb0.b.n(i13)) {
                Intrinsics.f(context);
                i13 = dl2.b.x0(context, eo1.a.color_gray_roboflow_500);
            }
            pVar.f139127o = i13;
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            float intValue = displayState2.f139092b.a(context2).intValue();
            Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            float intValue2 = displayState2.f139093c.a(context3).intValue();
            pVar.I = new float[]{intValue, intValue, intValue, intValue, intValue2, intValue2, intValue2, intValue2};
            pVar.C = displayState2.f139096f;
            pVar.E = displayState2.f139097g;
            pVar.F = displayState2.f139098h;
            pVar.G = displayState2.f139099i;
            pVar.D = displayState2.f139100j;
        }
        l lVar2 = this.f139156i;
        d dVar = lVar2 != null ? lVar2.f139112b : null;
        d dVar2 = displayState.f139112b;
        if (!Intrinsics.d(dVar, dVar2)) {
            if (dVar2 instanceof b) {
                e imageLoadParams = ((b) dVar2).f139071a;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(imageLoadParams, "imageLoadParams");
                qa2.c cVar = pVar.f139134v;
                if (cVar.c() == null || !Intrinsics.d(cVar.f103239h, imageLoadParams.f139081a.a())) {
                    l0 l0Var = imageLoadParams.f139081a;
                    if (!Intrinsics.d(l0Var, i0.f139105a)) {
                        boolean z13 = l0Var instanceof k0;
                        View view2 = pVar.f139124l;
                        if (z13) {
                            g3 g3Var = g3.f60489a;
                            Context context4 = view2.getContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            d4 N1 = bs1.c.N1(context4);
                            u50.r rVar = pVar.M;
                            if (rVar != null) {
                                rVar.a(new e0(N1));
                            }
                            String a13 = l0Var.a();
                            Context context5 = view2.getContext();
                            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                            int intValue3 = imageLoadParams.f139082b.a(context5).intValue();
                            Context context6 = view2.getContext();
                            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                            int intValue4 = imageLoadParams.f139083c.a(context6).intValue();
                            Boolean valueOf = Boolean.valueOf(imageLoadParams.f139084d);
                            int i14 = n.f139119a[imageLoadParams.f139085e.ordinal()];
                            if (i14 == 1) {
                                String a14 = l0Var.a();
                                Context context7 = view2.getContext();
                                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                                int i15 = q0.collages_feed_cutout_border;
                                Object obj = d5.a.f53679a;
                                b13 = kotlin.collections.e0.b(new u72.a(a14, context7.getColor(i15)));
                            } else {
                                if (i14 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                b13 = null;
                            }
                            hs1.q.a(pVar.f139125m, cVar, a13, intValue3, intValue4, null, valueOf, b13, 588);
                            u50.r rVar2 = pVar.M;
                            if (rVar2 != null) {
                                rVar2.a(new d0(N1));
                            }
                        } else if (l0Var instanceof j0) {
                            try {
                                cVar.e(BitmapFactory.decodeResource(view2.getResources(), Integer.parseInt(l0Var.a())));
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else {
                boolean z14 = dVar2 instanceof c;
            }
            if (!Intrinsics.d(dVar2, c.f139077a)) {
                this.f139155h.a(t.f139159a);
            }
        }
        this.f139156i = displayState;
    }

    @Override // ui1.a
    public final ui1.c d(int i13, int i14) {
        return this.f139158k.getBounds().contains(i13, i14) ? ui1.n.f122301a : ui1.b.f122290a;
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f139158k;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f139158k.draw(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        p pVar = this.f139158k;
        pVar.f(i13);
        pVar.H = i14;
        cs.c cVar = pVar.F;
        cs.c cVar2 = cs.c.TWO_BY_TWO;
        View view = pVar.f139124l;
        if (cVar == cVar2 || cVar == cs.c.TWO_BY_THREE) {
            int dimensionPixelSize = (pVar.f128841d - view.getResources().getDimensionPixelSize(r0.lego_grid_cell_chips_spacing_dpa)) / 2;
            pVar.e((int) (dimensionPixelSize / pVar.G));
            pVar.f(dimensionPixelSize);
        } else {
            k kVar = pVar.D;
            if (kVar instanceof h) {
                pVar.e(((h) kVar).e());
            } else if (kVar instanceof f) {
                pVar.e(Math.min(pVar.f139130r, ((f) kVar).e()));
            } else if (kVar instanceof i) {
                int i15 = pVar.f139128p;
                int i16 = pVar.f139129q;
                int i17 = pVar.f128841d;
                or orVar = pVar.C;
                pVar.e(Math.min((int) ((((int) Math.ceil((i16 / i15) * i17)) + 1) * (orVar != null ? com.bumptech.glide.c.Q(orVar) - com.bumptech.glide.c.T(orVar) : 1.0f)), ((i) kVar).f139104a));
            } else if (kVar instanceof j) {
                j jVar = (j) kVar;
                float f13 = jVar.f() * pVar.f128841d;
                u50.n g13 = jVar.g();
                Intrinsics.checkNotNullExpressionValue(view.getContext(), "getContext(...)");
                pVar.e((int) (f13 + g13.a(r1).intValue()));
            }
        }
        pVar.j();
        return new z0(i13, pVar.f128842e);
    }
}
