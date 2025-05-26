package oq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.um;
import com.pinterest.feature.ideaPinCreation.closeup.view.r1;
import com.pinterest.feature.newshub.view.content.NewsHubColumnImageView;
import com.pinterest.feature.shopping.shoppingstories.views.ShoppingUnitGridImageContainer;
import com.pinterest.feature.shopping.shoppingstories.views.ShoppingUnitThumbnailView;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.ui.imageview.GrayWebImageView;
import com.pinterest.ui.imageview.WebImageView;
import h32.a4;
import h32.d4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f97046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f97047c;

    public h(int i13, Object obj, Object obj2) {
        this.f97045a = i13;
        this.f97046b = obj;
        this.f97047c = obj2;
    }

    @Override // hs1.c
    public final void a(boolean z13) {
        m81.r rVar;
        int i13 = this.f97045a;
        Object obj = this.f97046b;
        Object obj2 = this.f97047c;
        switch (i13) {
            case 0:
                j jVar = (j) obj2;
                jVar.e(true);
                j.a(jVar);
                break;
            case 1:
                r1 r1Var = (r1) obj2;
                kotlin.jvm.internal.r.m0((rq) obj, r1Var, r1Var.C, r1Var.L, r1Var.M, r1Var.T, r1Var.S, r1Var.N, 0.0f, 0.0f);
                break;
            case 2:
                Bitmap bitmap = ((WebImageView) obj).C;
                if (bitmap != null) {
                    ((Function1) obj2).invoke(bitmap);
                    break;
                }
                break;
            case 3:
                ((GrayWebImageView) obj).F0(((NewsHubColumnImageView) obj2).f46816a);
                break;
            case 5:
                Bitmap bitmap2 = ((WebImageView) obj).C;
                if (bitmap2 != null && (rVar = ((u81.r) obj2).X1) != null) {
                    ((s81.p) rVar).L3(bitmap2);
                    break;
                }
                break;
            case 6:
                bb2.j jVar2 = (bb2.j) obj;
                Bitmap c13 = jVar2.getC();
                if (c13 != null) {
                    Intrinsics.checkNotNullParameter(c13, "<this>");
                    if (qb0.b.d(c13)) {
                        ShoppingUnitGridImageContainer shoppingUnitGridImageContainer = (ShoppingUnitGridImageContainer) obj2;
                        int i14 = ShoppingUnitGridImageContainer.f48518d;
                        shoppingUnitGridImageContainer.getClass();
                        Context context = shoppingUnitGridImageContainer.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        jVar2.setColorFilter(new PorterDuffColorFilter(dl2.b.x0(context, eo1.a.color_background_dark_opacity_100), PorterDuff.Mode.SRC_ATOP));
                        break;
                    }
                }
                break;
            case 7:
                WebImageView webImageView = (WebImageView) obj;
                Bitmap bitmap3 = webImageView.C;
                if (bitmap3 != null) {
                    Intrinsics.checkNotNullParameter(bitmap3, "<this>");
                    if (qb0.b.d(bitmap3)) {
                        int i15 = ShoppingUnitThumbnailView.f48522h;
                        ((ShoppingUnitThumbnailView) obj2).getClass();
                        Context context2 = webImageView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        webImageView.setColorFilter(new PorterDuffColorFilter(dl2.b.x0(context2, eo1.a.color_background_dark_opacity_100), PorterDuff.Mode.SRC_ATOP));
                        break;
                    }
                }
                break;
            case 8:
                ((rl1.e0) obj).f108554j.a(z13);
                ((hs1.c) obj2).a(z13);
                break;
        }
    }

    @Override // hs1.c
    public final void c() {
        switch (this.f97045a) {
            case 0:
                j jVar = (j) this.f97047c;
                jVar.e(true);
                j.a(jVar);
                break;
        }
    }

    @Override // hs1.c
    public final void d() {
        int i13 = this.f97045a;
        Object obj = this.f97046b;
        Object obj2 = this.f97047c;
        switch (i13) {
            case 0:
                String pinUid = ((um) obj).f42584a.getUid();
                Intrinsics.checkNotNullExpressionValue(pinUid, "getUid(...)");
                j jVar = (j) obj2;
                d4 d4Var = jVar.f97068n;
                a4 a4Var = jVar.f97069o;
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                new jy.a(a4Var, d4Var, s92.o.ERROR, pinUid).i();
                break;
            case 1:
                Function0 function0 = ((r1) obj2).O;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 4:
                Function0 function02 = ((e81.n) obj2).f57801f;
                if (function02 != null) {
                    function02.invoke();
                    break;
                }
                break;
            case 8:
                ((rl1.e0) obj).f108554j.d();
                ((hs1.c) obj2).d();
                break;
        }
    }

    @Override // hs1.c
    public final void e() {
        WebImageView webImageView;
        c0 c0Var;
        GestaltSpinner gestaltSpinner;
        int i13 = this.f97045a;
        Object obj = this.f97046b;
        Object obj2 = this.f97047c;
        switch (i13) {
            case 0:
                j jVar = (j) obj2;
                e0 e0Var = jVar.f97072r;
                if (e0Var != null && (gestaltSpinner = (c0Var = (c0) e0Var).F) != null) {
                    c0Var.removeView(gestaltSpinner);
                    c0Var.F = null;
                }
                if (!jVar.b() && (webImageView = jVar.f97065k) != null) {
                    webImageView.setBackgroundResource(0);
                }
                e0 e0Var2 = jVar.f97072r;
                if (e0Var2 != null) {
                    ((c0) e0Var2).b();
                    return;
                }
                return;
            case 4:
                z71.f fVar = (z71.f) obj;
                if (fVar.getMatrix() == null) {
                    e81.n nVar = (e81.n) obj2;
                    Bitmap c13 = nVar.getC();
                    RectF rectF = new RectF(0.0f, 0.0f, c13 != null ? c13.getWidth() : 0, nVar.getC() != null ? r5.getHeight() : 0);
                    float f13 = nVar.f57798c;
                    float f14 = nVar.f57806k;
                    float f15 = nVar.f57799d;
                    RectF rectF2 = new RectF((f13 - f14) / 2.0f, (f15 - f14) / 2.0f, (f13 + f14) / 2.0f, (f15 + f14) / 2.0f);
                    Matrix matrix = new Matrix();
                    matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                    Drawable drawable = ((ImageView) nVar.b()).getDrawable();
                    matrix.mapRect(new RectF(), new RectF(drawable != null ? drawable.getBounds() : null));
                    ((ImageView) nVar.b()).setImageMatrix(matrix);
                } else {
                    ((ImageView) ((e81.n) obj2).b()).setImageMatrix(fVar.getMatrix());
                }
                Function0 function0 = ((e81.n) obj2).f57800e;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 5:
                FrameLayout frameLayout = ((u81.r) obj2).f121094y1;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    return;
                } else {
                    Intrinsics.r("imagePreviewContainer");
                    throw null;
                }
            case 8:
                ((rl1.e0) obj).f108554j.e();
                ((hs1.c) obj2).e();
                return;
            default:
                return;
        }
    }

    @Override // hs1.c
    public final void f() {
        switch (this.f97045a) {
            case 8:
                ((rl1.e0) this.f97046b).f108554j.f();
                ((hs1.c) this.f97047c).f();
                break;
        }
    }
}
