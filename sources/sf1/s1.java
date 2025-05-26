package sf1;

import android.view.ViewGroup;
import androidx.media3.ui.AspectRatioFrameLayout;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.wo0;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import so.va;

/* loaded from: classes5.dex */
public final class s1 extends e implements y92.i {
    public static final /* synthetic */ int F = 0;
    public final w0 A;
    public final a.z0 B;
    public final y92.c C;
    public boolean D;
    public dl1.s E;

    /* renamed from: i, reason: collision with root package name */
    public final nx.d0 f112731i;

    /* renamed from: j, reason: collision with root package name */
    public final s0 f112732j;

    /* renamed from: k, reason: collision with root package name */
    public final w0 f112733k;

    /* renamed from: l, reason: collision with root package name */
    public uk1.e f112734l;

    /* renamed from: m, reason: collision with root package name */
    public va f112735m;

    /* renamed from: n, reason: collision with root package name */
    public lh0.w1 f112736n;

    /* renamed from: o, reason: collision with root package name */
    public yk1.j f112737o;

    /* renamed from: p, reason: collision with root package name */
    public a11.d f112738p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f112739q;

    /* renamed from: r, reason: collision with root package name */
    public final s f112740r;

    /* renamed from: s, reason: collision with root package name */
    public rf1.p f112741s;

    /* renamed from: t, reason: collision with root package name */
    public final RoundedCornersLayout f112742t;

    /* renamed from: u, reason: collision with root package name */
    public l1 f112743u;

    /* renamed from: v, reason: collision with root package name */
    public u1 f112744v;

    /* renamed from: w, reason: collision with root package name */
    public final p1 f112745w;

    /* renamed from: x, reason: collision with root package name */
    public final w0 f112746x;

    /* renamed from: y, reason: collision with root package name */
    public final c1 f112747y;

    /* renamed from: z, reason: collision with root package name */
    public final w0 f112748z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s1(android.content.Context r22, nx.d0 r23, sf1.l0 r24, sf1.s0 r25, tf1.d r26, sf1.w0 r27, java.lang.String r28, float r29, java.lang.Integer r30) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sf1.s1.<init>(android.content.Context, nx.d0, sf1.l0, sf1.s0, tf1.d, sf1.w0, java.lang.String, float, java.lang.Integer):void");
    }

    public final void k() {
        w0 w0Var = this.f112733k;
        if (w0Var != null) {
            e1 e1Var = w0Var.f112788a;
            boolean z13 = e1Var.f112544J;
            e1Var.f112544J = false;
            if (z13) {
                PinterestVideoView o13 = this.f112740r.o();
                if (o13 != null) {
                    o13.j(0L, false);
                    o13.play();
                }
                this.D = false;
            }
        }
    }

    public final void l(int i13) {
        AspectRatioFrameLayout aspectRatioFrameLayout;
        s sVar = this.f112740r;
        int b03 = c0.d.b0(sVar.N, i13);
        sVar.f112700g = i13;
        sVar.f112699f = b03;
        ViewGroup.LayoutParams layoutParams = sVar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i13;
        layoutParams.width = b03;
        sVar.setLayoutParams(layoutParams);
        WebImageView webImageView = sVar.L;
        if (webImageView != null) {
            ViewGroup.LayoutParams layoutParams2 = webImageView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = i13;
            layoutParams2.width = b03;
            webImageView.setLayoutParams(layoutParams2);
        }
        PinterestVideoView o13 = sVar.o();
        if (o13 != null && (aspectRatioFrameLayout = o13.E) != null) {
            ViewGroup.LayoutParams layoutParams3 = aspectRatioFrameLayout.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.height = i13;
            layoutParams3.width = b03;
            aspectRatioFrameLayout.setLayoutParams(layoutParams3);
        }
        rf1.p pVar = this.f112741s;
        if (pVar != null) {
            wo0 wo0Var = pVar.f107820r;
            uo0 uo0Var = wo0Var.f43310a;
            List o14 = uo0Var.o();
            int size = o14 != null ? o14.size() : 0;
            if (pVar.f107819q || !pVar.f107821s || size <= 1) {
                return;
            }
            s sVar2 = (s) ((t) pVar.getView());
            PinterestVideoView o15 = sVar2.o();
            if (o15 != null) {
                o15.u0(null);
            }
            try {
                sVar2.removeAllViews();
            } catch (NullPointerException unused) {
            }
            pVar.r3(uo0Var, wo0Var.f43311b, wo0Var.f43320k);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        rf1.p pVar = this.f112741s;
        if (pVar != null) {
            if (pVar.isBound()) {
                pVar.unbind();
            }
            Unit unit = Unit.f80348a;
        }
        this.f112741s = null;
        this.D = false;
        super.onDetachedFromWindow();
    }

    @Override // y92.i
    public final void onViewRecycled() {
        this.E = null;
        s sVar = this.f112740r;
        PinterestVideoView o13 = sVar.o();
        if (o13 != null) {
            o13.u0(null);
        }
        try {
            sVar.removeAllViews();
        } catch (NullPointerException unused) {
        }
        sVar.B = null;
        sVar.C = null;
        yk1.j jVar = this.f112737o;
        if (jVar != null) {
            jVar.e(sVar);
        } else {
            Intrinsics.r("mvpBinder");
            throw null;
        }
    }
}
