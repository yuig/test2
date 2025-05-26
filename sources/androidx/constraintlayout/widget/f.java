package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public final class f implements v4.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17728a;

    /* renamed from: b, reason: collision with root package name */
    public int f17729b;

    /* renamed from: c, reason: collision with root package name */
    public int f17730c;

    /* renamed from: d, reason: collision with root package name */
    public int f17731d;

    /* renamed from: e, reason: collision with root package name */
    public int f17732e;

    /* renamed from: f, reason: collision with root package name */
    public int f17733f;

    /* renamed from: g, reason: collision with root package name */
    public int f17734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f17735h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f17735h = constraintLayout;
        this.f17728a = constraintLayout2;
    }

    public static boolean a(int i13, int i14, int i15) {
        if (i13 == i14) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i13);
        View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i15 == size;
        }
        return false;
    }

    public final void b(u4.h hVar, v4.b bVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z13;
        int measuredHeight;
        int baseline;
        int i18;
        int i19;
        if (hVar == null) {
            return;
        }
        if (hVar.f120213i0 == 8 && !hVar.G()) {
            bVar.f123973e = 0;
            bVar.f123974f = 0;
            bVar.f123975g = 0;
            return;
        }
        if (hVar.V == null) {
            return;
        }
        u4.g gVar = bVar.f123969a;
        u4.g gVar2 = bVar.f123970b;
        int i23 = bVar.f123971c;
        int i24 = bVar.f123972d;
        int i25 = this.f17729b + this.f17730c;
        int i26 = this.f17731d;
        View view = (View) hVar.f120211h0;
        int[] iArr = d.f17726a;
        int i27 = iArr[gVar.ordinal()];
        if (i27 == 1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23, 1073741824);
        } else if (i27 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f17733f, i26, -2);
        } else if (i27 == 3) {
            int i28 = this.f17733f;
            u4.e eVar = hVar.f120195J;
            int i29 = eVar != null ? eVar.f120190g : 0;
            u4.e eVar2 = hVar.L;
            if (eVar2 != null) {
                i29 += eVar2.f120190g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i28, i26 + i29, -1);
        } else if (i27 != 4) {
            makeMeasureSpec = 0;
        } else {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f17733f, i26, -2);
            boolean z14 = hVar.f120230r == 1;
            int i33 = bVar.f123978j;
            if (i33 == 1 || i33 == 2) {
                boolean z15 = view.getMeasuredHeight() == hVar.o();
                if (bVar.f123978j == 2 || !z14 || ((z14 && z15) || (view instanceof Placeholder) || hVar.J())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hVar.y(), 1073741824);
                }
            }
        }
        int i34 = iArr[gVar2.ordinal()];
        if (i34 == 1) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i24, 1073741824);
        } else if (i34 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f17734g, i25, -2);
        } else if (i34 == 3) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f17734g, hVar.x() + i25, -1);
        } else if (i34 != 4) {
            makeMeasureSpec2 = 0;
        } else {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f17734g, i25, -2);
            boolean z16 = hVar.f120232s == 1;
            int i35 = bVar.f123978j;
            if (i35 == 1 || i35 == 2) {
                boolean z17 = view.getMeasuredWidth() == hVar.y();
                if (bVar.f123978j == 2 || !z16 || ((z16 && z17) || (view instanceof Placeholder) || hVar.K())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hVar.o(), 1073741824);
                }
            }
        }
        u4.i iVar = (u4.i) hVar.V;
        ConstraintLayout constraintLayout = this.f17735h;
        if (iVar != null) {
            i19 = constraintLayout.mOptimizationLevel;
            if (u4.p.b(i19, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) && view.getMeasuredWidth() == hVar.y() && view.getMeasuredWidth() < iVar.y() && view.getMeasuredHeight() == hVar.o() && view.getMeasuredHeight() < iVar.o() && view.getBaseline() == hVar.f120201c0 && !hVar.I() && a(hVar.p(), makeMeasureSpec, hVar.y()) && a(hVar.q(), makeMeasureSpec2, hVar.o())) {
                bVar.f123973e = hVar.y();
                bVar.f123974f = hVar.o();
                bVar.f123975g = hVar.f120201c0;
                return;
            }
        }
        u4.g gVar3 = u4.g.MATCH_CONSTRAINT;
        boolean z18 = gVar == gVar3;
        boolean z19 = gVar2 == gVar3;
        u4.g gVar4 = u4.g.MATCH_PARENT;
        boolean z23 = gVar2 == gVar4 || gVar2 == u4.g.FIXED;
        boolean z24 = gVar == gVar4 || gVar == u4.g.FIXED;
        boolean z25 = z18 && hVar.Y > 0.0f;
        boolean z26 = z19 && hVar.Y > 0.0f;
        if (view == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        int i36 = bVar.f123978j;
        if (i36 != 1 && i36 != 2 && z18 && hVar.f120230r == 0 && z19 && hVar.f120232s == 0) {
            z13 = false;
            i18 = -1;
            measuredHeight = 0;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof VirtualLayout) && (hVar instanceof u4.r)) {
                ((VirtualLayout) view).y((u4.r) hVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            hVar.H = makeMeasureSpec;
            hVar.I = makeMeasureSpec2;
            hVar.f120208g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i37 = hVar.f120236u;
            max = i37 > 0 ? Math.max(i37, measuredWidth) : measuredWidth;
            int i38 = hVar.f120238v;
            if (i38 > 0) {
                max = Math.min(i38, max);
            }
            int i39 = hVar.f120240x;
            if (i39 > 0) {
                i14 = Math.max(i39, measuredHeight2);
                i13 = makeMeasureSpec;
            } else {
                i13 = makeMeasureSpec;
                i14 = measuredHeight2;
            }
            int i43 = hVar.f120241y;
            if (i43 > 0) {
                i14 = Math.min(i43, i14);
            }
            i15 = constraintLayout.mOptimizationLevel;
            if (!u4.p.b(i15, 1)) {
                if (z25 && z23) {
                    max = (int) ((i14 * hVar.Y) + 0.5f);
                } else if (z26 && z24) {
                    i14 = (int) ((max / hVar.Y) + 0.5f);
                }
            }
            if (measuredWidth == max && measuredHeight2 == i14) {
                measuredHeight = i14;
                baseline = baseline2;
                z13 = false;
            } else {
                if (measuredWidth != max) {
                    i16 = 1073741824;
                    i17 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                } else {
                    i16 = 1073741824;
                    i17 = i13;
                }
                if (measuredHeight2 != i14) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, i16);
                }
                view.measure(i17, makeMeasureSpec2);
                hVar.H = i17;
                hVar.I = makeMeasureSpec2;
                z13 = false;
                hVar.f120208g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredWidth2;
            }
            i18 = -1;
        }
        boolean z27 = baseline != i18 ? true : z13;
        if (max != bVar.f123971c || measuredHeight != bVar.f123972d) {
            z13 = true;
        }
        bVar.f123977i = z13;
        boolean z28 = layoutParams.f17660c0 ? true : z27;
        if (z28 && baseline != -1 && hVar.f120201c0 != baseline) {
            bVar.f123977i = true;
        }
        bVar.f123973e = max;
        bVar.f123974f = measuredHeight;
        bVar.f123976h = z28;
        bVar.f123975g = baseline;
    }
}
