package com.pinterest.feature.todaytab.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.api.model.f30;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.k0;
import h32.y1;
import h32.z1;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.c0;
import nx.d1;
import nx.v;
import org.jetbrains.annotations.NotNull;
import so.jb;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/todaytab/tab/view/TodayTabVideoView;", "Landroid/widget/FrameLayout;", "Lcom/pinterest/feature/todaytab/tab/view/r;", "Lnx/v;", "Lnx/c0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "todayTabLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TodayTabVideoView extends FrameLayout implements r, v, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f48686a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48687b;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f48688c;

    /* renamed from: d, reason: collision with root package name */
    public final PinterestVideoView f48689d;

    /* renamed from: e, reason: collision with root package name */
    public dh1.g f48690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayTabVideoView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f48687b) {
            this.f48687b = true;
            this.f48688c = ((jb) ((s) generatedComponent())).f113508z;
        }
        View.inflate(getContext(), o92.c.today_tab_video_view, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(o92.b.today_tab_video_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        PinterestVideoView pinterestVideoView = (PinterestVideoView) findViewById;
        this.f48689d = pinterestVideoView;
        pinterestVideoView.P(true);
        pinterestVideoView.K0.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f48686a == null) {
            this.f48686a = new ye2.o(this);
        }
        return this.f48686a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f48686a == null) {
            this.f48686a = new ye2.o(this);
        }
        return this.f48686a.generatedComponent();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        c0 c0Var;
        dh1.g gVar = this.f48690e;
        if (gVar == null) {
            return null;
        }
        getMeasuredWidth();
        getMeasuredHeight();
        z1 source = gVar.f55013f;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            z1 z1Var = new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, Long.valueOf(((pb0.g) gVar.f55008a).a()), source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
            HashMap hashMap = gVar.f55012e;
            c0Var = new c0(z1Var, new nx.c(gVar.f55011d, hashMap != null ? bs1.c.o2(hashMap) : null, null, null, 12));
        } else {
            c0Var = null;
        }
        gVar.f55013f = null;
        return c0Var;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        dh1.g gVar = this.f48690e;
        if (gVar != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            z1 z1Var = gVar.f55013f;
            HashMap hashMap = gVar.f55012e;
            if (z1Var != null) {
                return new c0(z1Var, new nx.c(gVar.f55011d, hashMap != null ? bs1.c.o2(hashMap) : null, null, null, 12));
            }
            f30 f30Var = gVar.f55014g;
            if (f30Var != null) {
                y1 y1Var = new y1();
                y1Var.f67433b = Long.valueOf(((pb0.g) gVar.f55008a).a());
                String B0 = bs1.c.B0(f30Var);
                int i13 = gVar.f55015h;
                gVar.f55009b.getClass();
                String a13 = d1.a(f30Var);
                ur.b bVar = (ur.b) gVar.f55010c;
                k0 c13 = es.h.c(bVar.f123060c, f30Var);
                bs1.c.Q1(y1Var, f30Var, B0, -1L, measuredWidth, measuredHeight, i13, a13, null, false, false, false, null, c13, ((es.c) bVar.f123058a).j0(gVar.f55014g) ? new h32.f() : null, null, ((vr.b) bVar.f123059b).g(f30Var), ((es.v) bVar.f123060c).o(gVar.f55014g), null, null, 827136);
                y1Var.f67435c = f30Var.getUid();
                z1 a14 = y1Var.a();
                gVar.f55013f = a14;
                return new c0(a14, new nx.c(gVar.f55011d, hashMap != null ? bs1.c.o2(hashMap) : null, null, null, 12));
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayTabVideoView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f48687b) {
            this.f48687b = true;
            this.f48688c = ((jb) ((s) generatedComponent())).f113508z;
        }
        View.inflate(getContext(), o92.c.today_tab_video_view, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(o92.b.today_tab_video_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        PinterestVideoView pinterestVideoView = (PinterestVideoView) findViewById;
        this.f48689d = pinterestVideoView;
        pinterestVideoView.P(true);
        pinterestVideoView.K0.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
