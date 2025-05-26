package xi1;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import hs1.q;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;
import lh0.r2;
import net.quikkly.android.ui.CameraPreview;
import ps0.m;
import ps0.y;
import ua2.d1;
import ua2.z0;
import wa2.l;

/* loaded from: classes2.dex */
public final class c extends d1 implements ui1.a {

    /* renamed from: h, reason: collision with root package name */
    public final i f135036h;

    /* renamed from: i, reason: collision with root package name */
    public qc2.a f135037i;

    /* renamed from: j, reason: collision with root package name */
    public final vn1.c f135038j;

    /* renamed from: k, reason: collision with root package name */
    public final rm1.c f135039k;

    /* renamed from: l, reason: collision with root package name */
    public final int f135040l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f135041m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f135042n;

    /* renamed from: o, reason: collision with root package name */
    public final AnimatorSet f135043o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f135044p;

    /* renamed from: q, reason: collision with root package name */
    public vn1.c f135045q;

    /* renamed from: r, reason: collision with root package name */
    public rm1.c f135046r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View pinRepView, q imageCache, r2 experiments) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        i iVar = new i(pinRepView, imageCache, experiments);
        iVar.f128838a = this.f121494c;
        this.f135036h = iVar;
        m mVar = vn1.h.f126275a;
        this.f135038j = vn1.h.f126277c;
        y yVar = GestaltIcon.f49400b;
        this.f135039k = GestaltIcon.f49405g;
        this.f135040l = bs1.c.B(pinRepView, wy1.a.color_light_gray_chin_cta);
        this.f135043o = new AnimatorSet();
    }

    public final void A(a displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f135041m = false;
        this.f135042n = displayState.f135025a;
        Integer num = displayState.f135026b;
        if (num != null) {
            this.f135044p = Integer.valueOf(num.intValue());
        }
        vn1.c cVar = displayState.f135027c;
        if (cVar != null) {
            this.f135045q = cVar;
        }
        rm1.c cVar2 = displayState.f135028d;
        if (cVar2 != null) {
            this.f135046r = cVar2;
        }
        b bVar = displayState.f135029e;
        i iVar = this.f135036h;
        iVar.h(bVar);
        if (!this.f135042n) {
            if (num != null) {
                iVar.o(num.intValue());
            }
            if (cVar != null) {
                iVar.q(cVar);
            }
            if (cVar2 != null) {
                iVar.p(cVar2);
            }
        }
        if (this.f135042n) {
            C();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float B() {
        View view = this.f121492a;
        ViewParent viewParent = view.getParent();
        while (viewParent != 0 && !(viewParent instanceof RecyclerView)) {
            viewParent = viewParent.getParent();
        }
        Float f13 = null;
        View view2 = viewParent instanceof View ? (View) viewParent : null;
        if (view2 != null) {
            View view3 = view;
            while (!(view3.getParent() instanceof RecyclerView)) {
                Object parent = view3.getParent();
                Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
                view3 = (View) parent;
            }
            qc2.a aVar = this.f135037i;
            if (aVar != null) {
                i iVar = this.f135036h;
                f13 = Float.valueOf(((qc2.d) aVar).c(view3, 0, iVar.f128840c, iVar.f128841d, iVar.f128842e, view2));
            }
            if (f13 != null) {
                return f13.floatValue();
            }
        }
        return 0.0f;
    }

    public final void C() {
        if (B() < 100.0f) {
            l();
            return;
        }
        int[] iArr = new int[2];
        int i13 = this.f135040l;
        iArr[0] = i13;
        Integer num = this.f135044p;
        if (num != null) {
            i13 = num.intValue();
        }
        iArr[1] = i13;
        ValueAnimator ofArgb = ValueAnimator.ofArgb(iArr);
        ofArgb.setDuration(300L);
        ofArgb.addUpdateListener(new androidx.media3.ui.c(this, 16));
        AnimatorSet animatorSet = this.f135043o;
        animatorSet.play(ofArgb);
        animatorSet.setStartDelay(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
        animatorSet.addListener(new ir.b(this, 6));
        animatorSet.start();
    }

    public final void D() {
        if (!this.f135042n || this.f135041m || this.f135043o.isRunning()) {
            return;
        }
        C();
    }

    @Override // ui1.a
    public final ui1.c d(int i13, int i14) {
        return this.f135036h.getBounds().contains(i13, i14) ? ui1.f.f122293a : ui1.b.f122290a;
    }

    @Override // ua2.f1
    public final l k() {
        return this.f135036h;
    }

    public final void l() {
        if (this.f135042n && B() == 0.0f) {
            c3.m0(this.f135043o);
            int i13 = this.f135040l;
            i iVar = this.f135036h;
            iVar.o(i13);
            iVar.q(this.f135038j);
            iVar.p(this.f135039k);
            this.f135041m = false;
            this.f121492a.postInvalidate(iVar.getBounds().left, iVar.getBounds().top, iVar.getBounds().right, iVar.getBounds().bottom);
        }
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f121483f;
        i iVar = this.f135036h;
        iVar.g(i17);
        iVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        i iVar = this.f135036h;
        iVar.f(i13);
        iVar.m();
        return new z0(0, iVar.f128842e);
    }
}
