package b82;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.z;
import ao2.j0;
import c72.b0;
import com.pinterest.api.model.f30;
import com.pinterest.shuffles.scene.composer.a1;
import com.pinterest.shuffles.scene.composer.t;
import com.pinterest.shuffles.scene.composer.y;
import dv0.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.k0;
import lu.a0;
import m60.w;
import nx.d0;
import r72.u1;
import r72.z1;

/* loaded from: classes4.dex */
public final class k extends a0 {
    public static final /* synthetic */ int C = 0;
    public final a82.j A;
    public boolean B;

    /* renamed from: d, reason: collision with root package name */
    public final z f22196d;

    /* renamed from: e, reason: collision with root package name */
    public final f30 f22197e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22198f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f22199g;

    /* renamed from: h, reason: collision with root package name */
    public final l f22200h;

    /* renamed from: i, reason: collision with root package name */
    public b0 f22201i;

    /* renamed from: j, reason: collision with root package name */
    public q f22202j;

    /* renamed from: k, reason: collision with root package name */
    public j0 f22203k;

    /* renamed from: l, reason: collision with root package name */
    public w f22204l;

    /* renamed from: m, reason: collision with root package name */
    public n72.g f22205m;

    /* renamed from: n, reason: collision with root package name */
    public n72.b f22206n;

    /* renamed from: o, reason: collision with root package name */
    public tb0.h f22207o;

    /* renamed from: p, reason: collision with root package name */
    public n72.m f22208p;

    /* renamed from: q, reason: collision with root package name */
    public k0 f22209q;

    /* renamed from: r, reason: collision with root package name */
    public es.a f22210r;

    /* renamed from: s, reason: collision with root package name */
    public es.h f22211s;

    /* renamed from: t, reason: collision with root package name */
    public nx.k f22212t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f22213u;

    /* renamed from: v, reason: collision with root package name */
    public final x72.j f22214v;

    /* renamed from: w, reason: collision with root package name */
    public final y f22215w;

    /* renamed from: x, reason: collision with root package name */
    public final t f22216x;

    /* renamed from: y, reason: collision with root package name */
    public final float f22217y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22218z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, z lifecycleOwner, f30 f30Var, int i13, d0 pinalytics, l openCutoutUrlListener) {
        super(context, null, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(openCutoutUrlListener, "openCutoutUrlListener");
        this.f22196d = lifecycleOwner;
        this.f22197e = f30Var;
        this.f22198f = i13;
        this.f22199g = pinalytics;
        this.f22200h = openCutoutUrlListener;
        this.f22217y = 0.5625f;
        int i14 = (int) ((i13 / 9.0f) * 16.0f);
        x72.b bVar = x72.b.f134124d;
        if (bVar == null) {
            Intrinsics.r("current");
            throw null;
        }
        x72.j n13 = bVar.n(context);
        n13.k().setLayoutParams(new FrameLayout.LayoutParams(i13, i14));
        addView(n13.k());
        this.f22214v = n13;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i13, i14));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        com.bumptech.glide.b.g(imageView).a(Drawable.class).K(f30Var != null ? bs1.c.B0(f30Var) : null).G(imageView);
        addView(imageView);
        this.f22213u = imageView;
        n13.g(new uv.d(this, 6));
        this.f22216x = new t(n13.getF52894a(), new c(n13, x72.j.class, "size", "getSize()Landroid/util/Size;", 0));
        a82.j jVar = new a82.j(n13, imageView, bf.b.S(lifecycleOwner), new s12.a(this, 23), d.f22186a, e.f22187i);
        this.A = jVar;
        j0 j0Var = this.f22203k;
        if (j0Var == null) {
            Intrinsics.r("coroutineScope");
            throw null;
        }
        n72.m mVar = this.f22208p;
        if (mVar == null) {
            Intrinsics.r("shuffleCoreLogger");
            throw null;
        }
        y yVar = new y(n13, j0Var, mVar);
        a1 a1Var = new a1(true, true, false, false);
        n72.m mVar2 = this.f22208p;
        if (mVar2 == null) {
            Intrinsics.r("shuffleCoreLogger");
            throw null;
        }
        n72.b bVar2 = this.f22206n;
        if (bVar2 == null) {
            Intrinsics.r("fontManager");
            throw null;
        }
        com.pinterest.shuffles.scene.composer.q qVar = new com.pinterest.shuffles.scene.composer.q(context, a1Var, bVar2, mVar2);
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        yVar.f52036a = qVar;
        yVar.g(jVar);
        yVar.g(new b(this));
        this.f22215w = yVar;
        a82.g gVar = new a82.g(n13);
        h hVar = new h(this);
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        gVar.f1538b = hVar;
        n13.k().setOnTouchListener(gVar);
        if (f30Var != null) {
            k(f30Var);
        }
    }

    public static final boolean g(k kVar, z1 z1Var) {
        bn0.a aVar;
        List list;
        kVar.getClass();
        u1 u1Var = z1Var instanceof u1 ? (u1) z1Var : null;
        boolean z13 = false;
        if (u1Var != null && (aVar = u1Var.f106686r) != null && (list = (List) aVar.f23561d) != null && list.contains("not_template")) {
            z13 = true;
        }
        return !z13;
    }

    public final k0 i() {
        k0 k0Var = this.f22209q;
        if (k0Var != null) {
            return k0Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(com.pinterest.api.model.f30 r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            r7 = this;
            r0 = 0
            if (r11 == 0) goto L1a
            com.pinterest.api.model.g r1 = r8.t3()
            if (r1 == 0) goto Le
            java.lang.Boolean r1 = r1.f0()
            goto Lf
        Le:
            r1 = r0
        Lf:
            if (r1 != 0) goto L12
            goto L1a
        L12:
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            m60.w r2 = r7.f22204l
            if (r2 == 0) goto La1
            lh0.k0 r0 = r7.i()
            lh0.z3 r3 = lh0.a4.f83298b
            lh0.z0 r0 = r0.f83401a
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r4 = "android_collage_cutout_closeup_refresh_ui"
            java.lang.String r5 = "enabled"
            boolean r6 = r0.o(r4, r5, r3)
            if (r6 != 0) goto L5a
            boolean r0 = r0.l(r4)
            if (r0 == 0) goto L3a
            goto L5a
        L3a:
            lh0.k0 r0 = r7.i()
            lh0.z0 r0 = r0.f83401a
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r4 = "android_collage_cutout_closeup_refresh"
            boolean r3 = r0.o(r4, r5, r3)
            if (r3 != 0) goto L5a
            boolean r0 = r0.l(r4)
            if (r0 == 0) goto L51
            goto L5a
        L51:
            xk2.v r0 = com.pinterest.screens.t0.f51370a
            java.lang.Object r0 = r0.getValue()
            com.pinterest.framework.screens.ScreenLocation r0 = (com.pinterest.framework.screens.ScreenLocation) r0
            goto L62
        L5a:
            xk2.v r0 = com.pinterest.screens.t0.f51371b
            java.lang.Object r0 = r0.getValue()
            com.pinterest.framework.screens.ScreenLocation r0 = (com.pinterest.framework.screens.ScreenLocation) r0
        L62:
            java.lang.String r3 = r8.getUid()
            ml1.b r4 = ml1.b.NO_TRANSITION
            int r4 = r4.getValue()
            com.pinterest.navigation.NavigationImpl r0 = com.pinterest.navigation.Navigation.L(r0, r3, r4)
            int r3 = r7.f22198f
            java.lang.String r4 = "EXTRA_COLLAGES_SHUFFLE_WIDTH"
            r0.z(r3, r4)
            java.lang.String r3 = "EXTRA_COLLAGES_SHUFFLE_ITEM_ID"
            r0.m0(r3, r9)
            java.lang.String r9 = "EXTRA_COLLAGES_SHUFFLE_ITEM_ASSET_ID"
            r0.m0(r9, r10)
            java.lang.String r9 = "EXTRA_COLLAGES_SHUFFLE_ITEM_IS_COLLAGE_AD"
            r0.Y1(r9, r11)
            java.lang.String r9 = "EXTRA_COLLAGES_ROOT_PIN_ID"
            java.lang.String r10 = r8.i6()
            r0.m0(r9, r10)
            java.lang.String r9 = "EXTRA_COLLAGES_ROOT_PIN_UID"
            java.lang.String r8 = r8.getUid()
            r0.m0(r9, r8)
            java.lang.String r8 = "EXTRA_COLLAGE_PIN_SINGLE_DEST"
            r0.Y1(r8, r1)
            r2.d(r0)
            return
        La1:
            java.lang.String r8 = "eventManager"
            kotlin.jvm.internal.Intrinsics.r(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b82.k.j(com.pinterest.api.model.f30, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.pinterest.api.model.f30 r18) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b82.k.k(com.pinterest.api.model.f30):void");
    }
}
