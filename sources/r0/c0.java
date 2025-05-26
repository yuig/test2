package r0;

import a.sc;
import android.util.Range;
import android.util.SparseArray;
import android.view.View;
import androidx.camera.core.impl.v2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.l2;
import com.pinterest.feature.pincarouselads.view.CarouselIndexViewAnimated;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kh2.n3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c0 implements p5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105496a;

    /* renamed from: b, reason: collision with root package name */
    public int f105497b;

    /* renamed from: c, reason: collision with root package name */
    public Object f105498c;

    /* renamed from: d, reason: collision with root package name */
    public Object f105499d;

    /* renamed from: e, reason: collision with root package name */
    public Object f105500e;

    /* renamed from: f, reason: collision with root package name */
    public Object f105501f;

    public c0(int i13) {
        this.f105496a = i13;
        if (i13 == 2) {
            this.f105497b = -1;
            return;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                this.f105500e = lj2.a.f83630a;
                this.f105501f = lj2.b.f83631e;
                this.f105497b = 2000;
            } else {
                this.f105497b = 0;
                this.f105499d = null;
                sc scVar = j0.f105550k0;
                this.f105500e = scVar;
                this.f105501f = scVar;
                this.f105498c = e.a();
            }
        }
    }

    public final void a(CarouselIndexViewAnimated carousel, PinterestRecyclerView recycler) {
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        this.f105500e = recycler.f52535e;
        RecyclerView recyclerView = recycler.f52531a;
        this.f105499d = recyclerView;
        b2 b2Var = recyclerView.f19240m;
        this.f105501f = b2Var;
        this.f105498c = carousel;
        carousel.n(b2Var != null ? b2Var.e() : 0);
        c();
        RecyclerView recyclerView2 = (RecyclerView) this.f105499d;
        if (recyclerView2 != null) {
            recyclerView2.o(new androidx.recyclerview.widget.c0(this, 19));
        }
    }

    public final float b() {
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f105499d;
        float measuredWidth = recyclerView != null ? recyclerView.getMeasuredWidth() : 0;
        if (this.f105497b == 0) {
            RecyclerView recyclerView2 = (RecyclerView) this.f105499d;
            int childCount = recyclerView2 != null ? recyclerView2.getChildCount() : 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                RecyclerView recyclerView3 = (RecyclerView) this.f105499d;
                View childAt = recyclerView3 != null ? recyclerView3.getChildAt(i14) : null;
                if (childAt != null && childAt.getMeasuredWidth() != 0) {
                    i13 = childAt.getMeasuredWidth();
                    this.f105497b = i13;
                    break;
                }
            }
        }
        i13 = this.f105497b;
        return (measuredWidth - i13) / 2;
    }

    public final void c() {
        View view;
        CarouselIndexViewAnimated carouselIndexViewAnimated;
        l2 l2Var = (l2) this.f105500e;
        int E = l2Var != null ? l2Var.E() : 0;
        if (E == 0) {
            view = null;
        } else {
            int i13 = Integer.MAX_VALUE;
            view = null;
            for (int i14 = 0; i14 < E; i14++) {
                l2 l2Var2 = (l2) this.f105500e;
                View D = l2Var2 != null ? l2Var2.D(i14) : null;
                if (((l2) this.f105500e) instanceof LinearLayoutManager) {
                    Integer valueOf = D != null ? Integer.valueOf((int) D.getX()) : null;
                    if (valueOf != null) {
                        if (D.getMeasuredWidth() + valueOf.intValue() < i13) {
                            if (D.getMeasuredWidth() + valueOf.intValue() >= b()) {
                                i13 = valueOf.intValue();
                                view = D;
                            }
                        }
                    }
                }
            }
        }
        if (view == null) {
            return;
        }
        b2 b2Var = (b2) this.f105501f;
        int e13 = b2Var != null ? b2Var.e() : 0;
        Integer valueOf2 = ((RecyclerView) this.f105499d) != null ? Integer.valueOf(RecyclerView.r1(view)) : null;
        if ((valueOf2 != null && valueOf2.intValue() == -1) || valueOf2 == null) {
            return;
        }
        float b13 = (b() - view.getX()) / view.getMeasuredWidth();
        double d2 = b13;
        if (0.0d > d2 || d2 > 1.0d || valueOf2.intValue() >= e13 || (carouselIndexViewAnimated = (CarouselIndexViewAnimated) this.f105498c) == null) {
            return;
        }
        int intValue = valueOf2.intValue();
        SparseArray sparseArray = carouselIndexViewAnimated.f47342u;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        carouselIndexViewAnimated.m(intValue, b13);
        int i15 = carouselIndexViewAnimated.f47343v;
        if (intValue < i15 - 1) {
            carouselIndexViewAnimated.m(intValue + 1, 1 - b13);
        } else if (i15 > 1) {
            carouselIndexViewAnimated.m(0, 1 - b13);
        }
        carouselIndexViewAnimated.invalidate();
        if (carouselIndexViewAnimated.f47343v <= 5) {
            carouselIndexViewAnimated.f47339r = 0.0f;
        } else {
            float f13 = 2;
            carouselIndexViewAnimated.f47339r = ((carouselIndexViewAnimated.f47332k * b13) + carouselIndexViewAnimated.k(intValue)) - (carouselIndexViewAnimated.f47340s / f13);
            float k13 = carouselIndexViewAnimated.k(carouselIndexViewAnimated.f47343v - 3);
            if ((carouselIndexViewAnimated.f47340s / f13) + carouselIndexViewAnimated.f47339r < carouselIndexViewAnimated.k(2)) {
                carouselIndexViewAnimated.f47339r = carouselIndexViewAnimated.k(2) - (carouselIndexViewAnimated.f47340s / f13);
            } else {
                float f14 = carouselIndexViewAnimated.f47339r;
                float f15 = carouselIndexViewAnimated.f47340s / f13;
                if (f14 + f15 > k13) {
                    carouselIndexViewAnimated.f47339r = k13 - f15;
                }
            }
        }
        carouselIndexViewAnimated.invalidate();
    }

    @Override // p5.f
    public final Object get() {
        Range range = ((a) this.f105499d).f105471a;
        kh2.m0.p("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        u0.i iVar = (u0.i) this.f105500e;
        int I0 = n3.I0(156000, iVar.f119772c, 2, iVar.f119771b, 48000, range);
        y0.b bVar = new y0.b();
        bVar.f136260b = -1;
        String str = (String) this.f105498c;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        bVar.f136259a = str;
        bVar.f136260b = Integer.valueOf(this.f105497b);
        v2 v2Var = (v2) this.f105501f;
        if (v2Var == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        bVar.f136261c = v2Var;
        bVar.f136264f = Integer.valueOf(((u0.i) this.f105500e).f119772c);
        bVar.f136263e = Integer.valueOf(((u0.i) this.f105500e).f119771b);
        bVar.f136262d = Integer.valueOf(I0);
        return bVar.a();
    }

    public final String toString() {
        switch (this.f105496a) {
            case 2:
                StringBuilder sb3 = new StringBuilder(200);
                sb3.append("<<\n mode: ");
                sb3.append((cn.b) this.f105498c);
                sb3.append("\n ecLevel: ");
                sb3.append((cn.a) this.f105499d);
                sb3.append("\n version: ");
                sb3.append((cn.c) this.f105500e);
                sb3.append("\n maskPattern: ");
                sb3.append(this.f105497b);
                if (((he.b) this.f105501f) == null) {
                    sb3.append("\n matrix: null\n");
                } else {
                    sb3.append("\n matrix:\n");
                    sb3.append((he.b) this.f105501f);
                }
                sb3.append(">>\n");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public c0(String str, int i13, v2 v2Var, a aVar, u0.i iVar) {
        this.f105496a = 1;
        this.f105498c = str;
        this.f105497b = i13;
        this.f105501f = v2Var;
        this.f105499d = aVar;
        this.f105500e = iVar;
    }
}
