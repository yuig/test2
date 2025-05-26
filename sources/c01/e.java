package c01;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.h20;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.o2;
import lh0.z0;
import m60.w;
import nx.d0;
import pk.a0;
import so.jb;
import so.oa;
import ye2.o;
import yk1.n;

/* loaded from: classes5.dex */
public abstract class e extends ConstraintLayout implements n, af2.c {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f24423l = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f24424a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24425b;

    /* renamed from: c, reason: collision with root package name */
    public final w f24426c;

    /* renamed from: d, reason: collision with root package name */
    public final o2 f24427d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f24428e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f24429f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f24430g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f24431h;

    /* renamed from: i, reason: collision with root package name */
    public d0 f24432i;

    /* renamed from: j, reason: collision with root package name */
    public int f24433j;

    /* renamed from: k, reason: collision with root package name */
    public String f24434k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f24425b) {
            this.f24425b = true;
            oa oaVar = ((jb) ((f) generatedComponent())).f113483a;
            this.f24426c = (w) oaVar.f113885r0.get();
            this.f24427d = new o2((z0) oaVar.D0.get());
        }
        this.f24434k = "";
        View.inflate(context, i14, this);
        View findViewById = findViewById(iy1.d.pear_vertical);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f24428e = (GestaltText) findViewById;
        View findViewById2 = findViewById(iy1.d.header_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f24429f = (GestaltText) findViewById2;
        View findViewById3 = findViewById(iy1.d.header_description);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f24430g = (GestaltText) findViewById3;
        View findViewById4 = findViewById(iy1.d.related_styles_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f24431h = (GestaltText) findViewById4;
    }

    public final void L(f1 f1Var, String str, String str2) {
        d0 d0Var = this.f24432i;
        if (d0Var != null) {
            g0 g0Var = g0.PEAR_STYLE_PILLS;
            u0 u0Var = u0.PEAR_STYLE_PILL;
            HashMap x13 = a.a.x("style_name", str, "query", str2);
            Unit unit = Unit.f80348a;
            c0.d.t2(d0Var, f1Var, g0Var, u0Var, x13);
        }
    }

    public abstract void T(List list, ky0.b bVar);

    public final void X(zz0.b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        h20 h20Var = model.f143149c;
        String M = h20Var.M();
        if (M == null) {
            M = "";
        }
        a0.p(this.f24429f, M);
        String D = h20Var.D();
        if (D == null) {
            D = "";
        }
        a0.p(this.f24430g, D);
        a0.k0(this.f24428e);
        a0.k0(this.f24431h);
        L(f1.VIEW, "", "");
        List I = h20Var.I();
        if (I == null) {
            I = q0.f80391a;
        }
        T(I, new ky0.b(3, this, h20Var));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f24424a == null) {
            this.f24424a = new o(this);
        }
        return this.f24424a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f24424a == null) {
            this.f24424a = new o(this);
        }
        return this.f24424a.generatedComponent();
    }
}
