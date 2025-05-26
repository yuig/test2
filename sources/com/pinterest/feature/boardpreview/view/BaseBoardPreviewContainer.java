package com.pinterest.feature.boardpreview.view;

import af2.c;
import an0.g;
import an0.k;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ao2.j0;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.shuffles.scene.composer.t;
import com.pinterest.shuffles.scene.composer.y;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jn0.a;
import jn0.e;
import kh2.g3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b0;
import lh0.a4;
import lh0.g1;
import lh0.u3;
import lh0.z0;
import lh0.z3;
import ll.j;
import n72.m;
import org.jetbrains.annotations.NotNull;
import so.jb;
import so.oa;
import tb0.h;
import x72.b;
import xk2.q;
import xk2.s;
import ye2.o;
import yk1.d;
import yk1.i;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/boardpreview/view/BaseBoardPreviewContainer;", "Landroid/widget/FrameLayout;", "Lyk1/d;", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class BaseBoardPreviewContainer extends FrameLayout implements d, c {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f45326r = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f45327a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45328b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f45329c;

    /* renamed from: d, reason: collision with root package name */
    public final h f45330d;

    /* renamed from: e, reason: collision with root package name */
    public final j f45331e;

    /* renamed from: f, reason: collision with root package name */
    public final u3 f45332f;

    /* renamed from: g, reason: collision with root package name */
    public final m f45333g;

    /* renamed from: h, reason: collision with root package name */
    public x72.j f45334h;

    /* renamed from: i, reason: collision with root package name */
    public y f45335i;

    /* renamed from: j, reason: collision with root package name */
    public t f45336j;

    /* renamed from: k, reason: collision with root package name */
    public t f45337k;

    /* renamed from: l, reason: collision with root package name */
    public an0.o f45338l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f45339m;

    /* renamed from: n, reason: collision with root package name */
    public final Size f45340n;

    /* renamed from: o, reason: collision with root package name */
    public final FrameLayout f45341o;

    /* renamed from: p, reason: collision with root package name */
    public final PinterestLoadingLayout f45342p;

    /* renamed from: q, reason: collision with root package name */
    public final LinearLayout f45343q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseBoardPreviewContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        t tVar = this.f45336j;
        if (tVar != null && (animatorSet2 = tVar.f52153d) != null) {
            animatorSet2.pause();
        }
        t tVar2 = this.f45337k;
        if (tVar2 != null && (animatorSet = tVar2.f52153d) != null) {
            animatorSet.pause();
        }
        x72.j jVar = this.f45334h;
        if (jVar != null) {
            jVar.h(false);
        }
        this.f45339m = true;
    }

    public final void b(g previewConfig) {
        ke2.c f52892h;
        CopyOnWriteArrayList copyOnWriteArrayList;
        Intrinsics.checkNotNullParameter(previewConfig, "previewConfig");
        x72.j jVar = this.f45334h;
        FrameLayout frameLayout = this.f45341o;
        if (jVar != null) {
            try {
                q qVar = s.f135225b;
                frameLayout.removeView(jVar.k());
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                q qVar2 = s.f135225b;
                ue.c.m(th3);
            }
        }
        b bVar = b.f134124d;
        if (bVar == null) {
            Intrinsics.r("current");
            throw null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final x72.j n13 = bVar.n(context);
        TextureView k13 = n13.k();
        Size size = this.f45340n;
        k13.setLayoutParams(new FrameLayout.LayoutParams(size.getWidth(), size.getHeight()));
        ke2.c f52892h2 = n13.getF52892h();
        int B = bs1.c.B(this, eo1.b.color_background_secondary_base);
        id2.c.Companion.getClass();
        id2.c a13 = id2.b.a(B);
        f52892h2.getClass();
        Intrinsics.checkNotNullParameter(a13, "<set-?>");
        f52892h2.f79315g = a13;
        n13.g(new uv.d(this, 3));
        this.f45334h = n13;
        final int i13 = 0;
        frameLayout.addView(n13.k(), 0);
        this.f45336j = new t(n13.getF52892h(), new b0(n13, i13) { // from class: jn0.d

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f77085a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(n13, x72.j.class, "size", "getSize()Landroid/util/Size;", 0);
                this.f77085a = i13;
                if (i13 != 1) {
                } else {
                    super(n13, x72.j.class, "size", "getSize()Landroid/util/Size;", 0);
                }
            }

            @Override // rl2.r
            public final Object get() {
                switch (this.f77085a) {
                }
                return ((x72.j) this.receiver).a();
            }
        });
        final int i14 = 1;
        this.f45337k = new t(n13.getF52892h(), new b0(n13, i14) { // from class: jn0.d

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f77085a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(n13, x72.j.class, "size", "getSize()Landroid/util/Size;", 0);
                this.f77085a = i14;
                if (i14 != 1) {
                } else {
                    super(n13, x72.j.class, "size", "getSize()Landroid/util/Size;", 0);
                }
            }

            @Override // rl2.r
            public final Object get() {
                switch (this.f77085a) {
                }
                return ((x72.j) this.receiver).a();
            }
        });
        x72.j jVar2 = this.f45334h;
        if (jVar2 != null) {
            j0 j0Var = this.f45329c;
            if (j0Var == null) {
                Intrinsics.r("coroutineScope");
                throw null;
            }
            m mVar = this.f45333g;
            if (mVar == null) {
                Intrinsics.r("logger");
                throw null;
            }
            y yVar = new y(jVar2, j0Var, mVar);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            k kVar = new k(context2, previewConfig);
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            yVar.f52036a = kVar;
            yVar.g(new jn0.c(this, previewConfig));
            this.f45335i = yVar;
        }
        List list = previewConfig.f15663k;
        if (!(!list.isEmpty())) {
            an0.o oVar = this.f45338l;
            if (oVar != null) {
                oVar.C();
                return;
            }
            return;
        }
        x72.j jVar3 = this.f45334h;
        if (jVar3 != null && (f52892h = jVar3.getF52892h()) != null && (copyOnWriteArrayList = f52892h.f79314f) != null) {
            copyOnWriteArrayList.clear();
        }
        y yVar2 = this.f45335i;
        if (yVar2 != null) {
            y.r(yVar2, list);
        }
        t tVar = this.f45336j;
        if (tVar != null) {
            tVar.f(g3.I(previewConfig));
        }
        t tVar2 = this.f45337k;
        if (tVar2 != null) {
            tVar2.f(g3.J(previewConfig));
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45327a == null) {
            this.f45327a = new o(this);
        }
        return this.f45327a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45327a == null) {
            this.f45327a = new o(this);
        }
        return this.f45327a.generatedComponent();
    }

    @Override // yk1.d, yk1.n
    public final void setLoadState(i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i13 = a.f77079a[state.ordinal()];
        PinterestLoadingLayout pinterestLoadingLayout = this.f45342p;
        if (i13 == 1) {
            pinterestLoadingLayout.showLoadingSpinner(true);
            bs1.c.U1(pinterestLoadingLayout);
            return;
        }
        if (i13 != 2) {
            return;
        }
        pinterestLoadingLayout.showLoadingSpinner(false);
        bs1.c.X0(pinterestLoadingLayout);
        u3 u3Var = this.f45332f;
        if (u3Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) u3Var.f83488a;
        this.f45343q.setVisibility(true ^ (g1Var.o("android_preview_sharesheet", "enabled", z3Var) || g1Var.l("android_preview_sharesheet")) ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseBoardPreviewContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, null, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBoardPreviewContainer(Context context, AttributeSet attributeSet, int i13, Integer num) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f45328b) {
            this.f45328b = true;
            jb jbVar = (jb) ((e) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f45329c = (j0) oaVar.G0.get();
            this.f45330d = (h) oaVar.f113797m0.get();
            this.f45331e = new j((c72.b0) jbVar.f113485c.f114255d.f113846od.get());
            this.f45332f = new u3((z0) oaVar.D0.get());
            this.f45333g = oaVar.a3();
        }
        float width = r3.getWidth() / r3.getHeight();
        int intValue = num != null ? num.intValue() : new Size(bs1.c.W(this, z52.a.board_preview_width), bs1.c.W(this, z52.a.board_preview_height)).getHeight();
        Size size = new Size(ml2.c.c(intValue * width), intValue);
        this.f45340n = size;
        View.inflate(context, z52.c.share_sheet_board_video_container, this);
        setLayoutParams(new FrameLayout.LayoutParams(size.getWidth(), size.getHeight()));
        View findViewById = findViewById(z52.b.share_board_preview_scene_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45341o = (FrameLayout) findViewById;
        View findViewById2 = findViewById(z52.b.share_board_preview_loading_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45342p = (PinterestLoadingLayout) findViewById2;
        View findViewById3 = findViewById(z52.b.board_preview_badge_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        this.f45343q = linearLayout;
        u3 u3Var = this.f45332f;
        if (u3Var != null) {
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) u3Var.f83488a;
            linearLayout.setVisibility((g1Var.o("android_preview_sharesheet", "enabled", z3Var) || g1Var.l("android_preview_sharesheet")) ? 8 : 0);
            return;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public /* synthetic */ BaseBoardPreviewContainer(Context context, AttributeSet attributeSet, int i13, Integer num, int i14) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? null : num);
    }
}
