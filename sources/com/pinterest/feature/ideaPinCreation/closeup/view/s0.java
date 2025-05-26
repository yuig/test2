package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.uq;
import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 extends FrameLayout implements fu0.i, g1, b, a, m1, l1 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f46298x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final qq f46299a;

    /* renamed from: b, reason: collision with root package name */
    public final dl1.s f46300b;

    /* renamed from: c, reason: collision with root package name */
    public final float f46301c;

    /* renamed from: d, reason: collision with root package name */
    public final float f46302d;

    /* renamed from: e, reason: collision with root package name */
    public final v1 f46303e;

    /* renamed from: f, reason: collision with root package name */
    public final yt0.e f46304f;

    /* renamed from: g, reason: collision with root package name */
    public final o1 f46305g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f46306h;

    /* renamed from: i, reason: collision with root package name */
    public final yt0.f f46307i;

    /* renamed from: j, reason: collision with root package name */
    public final o0 f46308j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f46309k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f46310l;

    /* renamed from: m, reason: collision with root package name */
    public final String f46311m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f46312n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.v f46313o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f46314p;

    /* renamed from: q, reason: collision with root package name */
    public float f46315q;

    /* renamed from: r, reason: collision with root package name */
    public String f46316r;

    /* renamed from: s, reason: collision with root package name */
    public String f46317s;

    /* renamed from: t, reason: collision with root package name */
    public final View f46318t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f46319u;

    /* renamed from: v, reason: collision with root package name */
    public final gi2.b f46320v;

    /* renamed from: w, reason: collision with root package name */
    public final xj2.b f46321w;

    public /* synthetic */ s0(Context context, qq qqVar, dl1.s sVar, float f13, float f14, RectF rectF) {
        this(context, qqVar, sVar, f13, f14, null, null, null, rectF, null, null);
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.a
    public final RectF C() {
        return this.f46306h;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.a
    public final float D() {
        return this.f46302d;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.b
    public final void H1(String str, String str2, dl1.s sVar) {
        this.f46317s = str;
        this.f46316r = str2;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final Path I0() {
        return (Path) this.f46312n.getValue();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.b
    public final dl1.s L() {
        return this.f46300b;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final String L0() {
        qq qqVar = this.f46299a;
        boolean z13 = qqVar instanceof mq;
        dl1.s sVar = this.f46300b;
        if (z13) {
            Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Pin");
            String r43 = ((f30) sVar).r4();
            return r43 == null ? "" : r43;
        }
        if (!(qqVar instanceof jq)) {
            return "";
        }
        Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Board");
        String j13 = ((v7) sVar).j1();
        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
        return j13;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.m1
    public final float S0(float f13, Matrix viewMatrix) {
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        float b03 = ig1.b.b0(viewMatrix);
        return ql2.s.f(f13 * b03, 0.75f, Math.min(1.75f, this.f46315q)) / b03;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.a
    public final float T() {
        return this.f46301c;
    }

    @Override // fu0.i
    public final boolean T0() {
        return true;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final String X1() {
        return this.f46311m;
    }

    public final n1 a() {
        return (n1) this.f46313o.getValue();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final uq a0() {
        return this.f46299a.getConfig().getType();
    }

    @Override // fu0.i
    public final void d0() {
        a().g();
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.l1
    public final void d2(Matrix viewMatrix) {
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        this.f46314p.set(viewMatrix);
    }

    @Override // fu0.i
    public final void e(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        a().b(ev2);
    }

    @Override // fu0.i
    public final void i(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        a().c(ev2);
    }

    @Override // fu0.i
    public final void l(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        a().d(ev2);
    }

    @Override // fu0.i
    public final boolean n(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        return getVisibility() == 0 && a().j(ev2);
    }

    @Override // fu0.i
    public final void o(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        a().e(ev2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f46321w.f135163b) {
            return;
        }
        this.f46321w.dispose();
    }

    @Override // fu0.i
    public final void q(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        a().f(ev2);
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final qq r0() {
        return this.f46299a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF r1(float r7, float r8, android.graphics.Matrix r9) {
        /*
            r6 = this;
            java.lang.String r0 = "viewMatrix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r9)
            r0.postTranslate(r7, r8)
            android.graphics.Path r9 = r6.I0()
            android.graphics.RectF r9 = kh2.p2.S(r0, r9)
            float r0 = r9.left
            android.graphics.RectF r1 = r6.f46306h
            float r2 = r1.left
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 0
            if (r3 >= 0) goto L22
        L20:
            float r2 = r2 - r0
            goto L2c
        L22:
            float r0 = r9.right
            float r2 = r1.right
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L2b
            goto L20
        L2b:
            r2 = r4
        L2c:
            float r0 = r9.top
            float r3 = r1.top
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L37
            float r4 = r3 - r0
            goto L41
        L37:
            float r9 = r9.bottom
            float r0 = r1.bottom
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 <= 0) goto L41
            float r4 = r0 - r9
        L41:
            android.graphics.PointF r9 = new android.graphics.PointF
            float r7 = r7 + r2
            float r8 = r8 + r4
            r9.<init>(r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.closeup.view.s0.r1(float, float, android.graphics.Matrix):android.graphics.PointF");
    }

    @Override // fu0.i
    public final boolean t() {
        return true;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.g1
    public final void t1(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f46319u.setImageMatrix(matrix);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s0(Context context, qq overlayBlock, dl1.s sVar, float f13, float f14, v1 v1Var, yt0.e eVar, o1 o1Var, RectF tagMovementBounds, yt0.f fVar, o0 o0Var) {
        super(context);
        View view;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overlayBlock, "overlayBlock");
        Intrinsics.checkNotNullParameter(tagMovementBounds, "tagMovementBounds");
        this.f46299a = overlayBlock;
        this.f46300b = sVar;
        this.f46301c = f13;
        this.f46302d = f14;
        this.f46303e = v1Var;
        this.f46304f = eVar;
        this.f46305g = o1Var;
        this.f46306h = tagMovementBounds;
        this.f46307i = fVar;
        this.f46308j = o0Var;
        this.f46309k = xk2.m.b(l0.f46220k);
        String id3 = overlayBlock.getConfig().getId();
        this.f46311m = id3;
        int i13 = 0;
        this.f46312n = xk2.m.b(new p0(this, i13));
        int i14 = 1;
        this.f46313o = xk2.m.b(new p0(this, i14));
        this.f46314p = new Matrix();
        if (overlayBlock instanceof jq) {
            Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Board");
            view = new m0(context, (v7) sVar, ((jq) overlayBlock).getVariantType(), new n0(this, i13));
        } else if (overlayBlock instanceof mq) {
            Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Pin");
            view = new x0(context, (f30) sVar, new n0(this, i14));
        } else {
            view = new View(context);
        }
        this.f46318t = view;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        this.f46319u = imageView;
        this.f46321w = new xj2.b();
        this.f46320v = new gi2.b();
        setTag(aq1.d.idea_pin_tag_id, id3);
        String colorHex = overlayBlock.getConfig().getColorHex();
        if (view instanceof u1) {
            String V0 = kh2.m2.V0(colorHex);
            int parseColor = Color.parseColor(colorHex);
            int parseColor2 = Color.parseColor(V0);
            u1 u1Var = (u1) view;
            u1Var.a(Integer.valueOf(parseColor).intValue(), Integer.valueOf(parseColor2).intValue());
        }
        addView(imageView);
        n0 n0Var = new n0(this, 2);
        KeyEvent.Callback callback = this.f46318t;
        Intrinsics.g(callback, "null cannot be cast to non-null type com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinStickerRepView");
        ((u1) callback).b(new l0.d(this, callback, n0Var, 16));
    }
}
