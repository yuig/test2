package k90;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import ao2.j0;
import c72.b0;
import com.pinterest.shuffles.scene.composer.a1;
import com.pinterest.shuffles.scene.composer.q;
import com.pinterest.shuffles.scene.composer.y;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import ye2.o;
import yk1.n;

/* loaded from: classes5.dex */
public final class e extends FrameLayout implements n, af2.c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f78738k = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f78739a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f78740b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f78741c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f78742d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f78743e;

    /* renamed from: f, reason: collision with root package name */
    public final n72.b f78744f;

    /* renamed from: g, reason: collision with root package name */
    public final tb0.h f78745g;

    /* renamed from: h, reason: collision with root package name */
    public final n72.m f78746h;

    /* renamed from: i, reason: collision with root package name */
    public final y f78747i;

    /* renamed from: j, reason: collision with root package name */
    public float f78748j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, int i13, boolean z13) {
        super(context, null, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = 1;
        if (!this.f78740b) {
            this.f78740b = true;
            jb jbVar = (jb) ((f) generatedComponent());
            jbVar.getClass();
            this.f78742d = a02.e.j4();
            oa oaVar = jbVar.f113483a;
            this.f78743e = (b0) oaVar.f113846od.get();
            this.f78744f = (n72.b) oaVar.f113881qd.get();
            this.f78745g = (tb0.h) oaVar.f113797m0.get();
            this.f78746h = oaVar.a3();
        }
        this.f78741c = z13;
        this.f78748j = 1.0f;
        int W = bs1.c.W(this, a90.a.collages_bottom_sheet_carousel_item_height);
        int W2 = bs1.c.W(this, a90.a.collages_bottom_sheet_carousel_item_width);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setPaddingRelative(i13, i13, i13, i13);
        x72.b bVar = x72.b.f134124d;
        if (bVar == null) {
            Intrinsics.r("current");
            throw null;
        }
        x72.j n13 = bVar.n(context);
        TextureView k13 = n13.k();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(W2, W);
        if (hf0.b.q() && !bs1.c.k0(context).isInMultiWindowMode()) {
            layoutParams.width *= 2;
            layoutParams.height *= 2;
        }
        k13.setLayoutParams(layoutParams);
        n13.k().setOpaque(false);
        ke2.c f52892h = n13.getF52892h();
        id2.c.Companion.getClass();
        id2.c a13 = id2.b.a(0);
        f52892h.getClass();
        Intrinsics.checkNotNullParameter(a13, "<set-?>");
        f52892h.f79315g = a13;
        n13.g(new uv.d(this, i14));
        addView(n13.k());
        j0 j0Var = this.f78742d;
        if (j0Var == null) {
            Intrinsics.r("coroutineScope");
            throw null;
        }
        n72.m mVar = this.f78746h;
        if (mVar == null) {
            Intrinsics.r("coreLogger");
            throw null;
        }
        y yVar = new y(n13, j0Var, mVar);
        a1 a1Var = new a1(true, true, false, false);
        n72.m mVar2 = this.f78746h;
        if (mVar2 == null) {
            Intrinsics.r("coreLogger");
            throw null;
        }
        n72.b bVar2 = this.f78744f;
        if (bVar2 == null) {
            Intrinsics.r("fontManager");
            throw null;
        }
        q qVar = new q(context, a1Var, bVar2, mVar2);
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        yVar.f52036a = qVar;
        this.f78747i = yVar;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f78739a == null) {
            this.f78739a = new o(this);
        }
        return this.f78739a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f78739a == null) {
            this.f78739a = new o(this);
        }
        return this.f78739a.generatedComponent();
    }
}
