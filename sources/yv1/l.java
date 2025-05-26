package yv1;

import android.widget.FrameLayout;
import com.pinterest.ui.view.descriptors.VisualSearchPill;
import dl1.i0;
import en1.a0;
import en1.b0;
import h32.u1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nx.v;
import vv1.n;
import ye2.o;

/* loaded from: classes4.dex */
public final class l extends FrameLayout implements vv1.i, v, af2.c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f140242e = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f140243a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f140244b;

    /* renamed from: c, reason: collision with root package name */
    public VisualSearchPill f140245c;

    /* renamed from: d, reason: collision with root package name */
    public xv1.l f140246d;

    @Override // vv1.i
    public final void B2(boolean z13) {
    }

    @Override // vv1.i
    public final void D1(ArrayList avatarsUrlUidPairs) {
        Intrinsics.checkNotNullParameter(avatarsUrlUidPairs, "avatarsUrlUidPairs");
    }

    @Override // vv1.i
    public final void F(String str) {
    }

    @Override // vv1.i
    public final void F4(Integer num, Integer num2) {
    }

    @Override // vv1.i
    public final void G3(List backgroundColors, List textColors) {
        Intrinsics.checkNotNullParameter(backgroundColors, "backgroundColors");
        Intrinsics.checkNotNullParameter(textColors, "textColors");
        boolean z13 = !backgroundColors.isEmpty();
        VisualSearchPill visualSearchPill = this.f140245c;
        if (z13) {
            visualSearchPill.a(new fn1.k(backgroundColors, this, textColors, 7));
        } else {
            visualSearchPill.a(c.f140221k);
        }
    }

    @Override // vv1.i
    public final void H6(boolean z13) {
        this.f140245c.a(new mm1.i(z13, 24));
    }

    @Override // vv1.i
    public final void J6(int[] iArr) {
    }

    @Override // vv1.i
    public final void K4(q42.c cVar) {
    }

    @Override // vv1.i
    public final void Q4(a0 skinTone) {
        Intrinsics.checkNotNullParameter(skinTone, "skinTone");
    }

    @Override // vv1.i
    public final void Z4(Integer num, Integer num2) {
        this.f140245c.a(new xm1.k(28, num, num2));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f140243a == null) {
            this.f140243a = new o(this);
        }
        return this.f140243a;
    }

    @Override // vv1.i
    public final void d1(q42.f fVar) {
        if (fVar != null) {
            this.f140245c.a(new b(fVar, 1));
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f140243a == null) {
            this.f140243a = new o(this);
        }
        return this.f140243a.generatedComponent();
    }

    @Override // vv1.i
    public final void i1(String contentDescription) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f140245c.a(new i0(contentDescription, 26));
    }

    @Override // vv1.i
    public final void l0(String displayText) {
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        this.f140245c.a(new i0(displayText, 27));
    }

    @Override // vv1.i
    public final void l4() {
    }

    @Override // vv1.i
    public final void l5(xv1.l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f140246d = listener;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        xv1.l lVar = this.f140246d;
        if (lVar != null) {
            return lVar.s3();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        u1 t33;
        xv1.l lVar = this.f140246d;
        if (lVar == null || (t33 = lVar.t3()) == null) {
            return null;
        }
        return new n(t33, null);
    }

    @Override // vv1.i
    public final void n3(int i13, q42.c cVar, boolean z13, b0 b0Var) {
    }

    @Override // vv1.i
    public final void n4(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f140245c.a(new i0(tag, 28));
    }

    @Override // vv1.i
    public final void r6(boolean z13) {
    }

    @Override // vv1.i
    public final void s3(boolean z13, boolean z14) {
        this.f140245c.a(new mm1.i(z13, 23));
    }

    @Override // android.view.View, vv1.i
    public final void setEnabled(boolean z13) {
        this.f140245c.a(new mm1.i(z13, 22));
    }

    @Override // vv1.i
    public final void v2(int i13) {
        this.f140245c.a(new pn1.g(i13, 9));
    }

    @Override // vv1.i
    public final void y2(boolean z13) {
    }
}
