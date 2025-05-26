package jq;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.um;
import com.pinterest.feature.search.visual.PinchToZoomTransitionContext;
import com.pinterest.ui.imageview.WebImageView;
import i01.f1;
import i01.l0;
import ja.y;
import kh2.b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oq.c0;
import oq.x0;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f77423a;

    /* renamed from: b, reason: collision with root package name */
    public final h f77424b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f77425c;

    /* renamed from: d, reason: collision with root package name */
    public WebImageView f77426d;

    /* renamed from: e, reason: collision with root package name */
    public com.pinterest.feature.pincarouselads.view.l f77427e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f77428f;

    /* renamed from: g, reason: collision with root package name */
    public RecyclerView f77429g;

    /* renamed from: h, reason: collision with root package name */
    public ViewGroup f77430h;

    /* renamed from: i, reason: collision with root package name */
    public RecyclerView f77431i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f77432j;

    /* renamed from: k, reason: collision with root package name */
    public float f77433k;

    /* renamed from: l, reason: collision with root package name */
    public l0 f77434l;

    /* renamed from: m, reason: collision with root package name */
    public v01.a f77435m;

    /* renamed from: n, reason: collision with root package name */
    public View f77436n;

    /* renamed from: o, reason: collision with root package name */
    public float f77437o;

    /* renamed from: p, reason: collision with root package name */
    public float f77438p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f77439q;

    public j(ViewGroup viewGroup, h interactionHandler, f1 f1Var, int i13) {
        viewGroup = (i13 & 1) != 0 ? null : viewGroup;
        f1Var = (i13 & 4) != 0 ? null : f1Var;
        Intrinsics.checkNotNullParameter(interactionHandler, "interactionHandler");
        this.f77423a = viewGroup;
        this.f77424b = interactionHandler;
        this.f77425c = f1Var;
        this.f77432j = new int[2];
        this.f77433k = 1.0f;
    }

    public final void a(boolean z13) {
        Matrix matrix;
        um umVar;
        if (this.f77439q) {
            return;
        }
        c0 originalPinImageContainer = this.f77428f;
        f30 f30Var = (originalPinImageContainer == null || (umVar = originalPinImageContainer.f96997v) == null) ? null : umVar.f42584a;
        boolean z14 = (f30Var == null || !b40.P0(f30Var) || z13) ? false : true;
        if (this.f77426d == null || originalPinImageContainer == null || z14) {
            return;
        }
        float width = r6.getWidth() * this.f77433k;
        float f13 = hf0.b.f69002b;
        h hVar = this.f77424b;
        if ((width >= f13 || r6.getHeight() * this.f77433k >= hf0.b.f69003c) && z13) {
            um pinGalleryItem = originalPinImageContainer.f96997v;
            if (pinGalleryItem != null) {
                Intrinsics.checkNotNullParameter(originalPinImageContainer, "originalPinImageContainer");
                Intrinsics.checkNotNullParameter(pinGalleryItem, "pinGalleryItem");
                int[] iArr = this.f77432j;
                originalPinImageContainer.getLocationOnScreen(iArr);
                float[] fArr = new float[2];
                WebImageView webImageView = this.f77426d;
                if (webImageView != null && (matrix = webImageView.getMatrix()) != null) {
                    matrix.mapPoints(fArr);
                }
                f30 f30Var2 = pinGalleryItem.f42584a;
                String id3 = f30Var2.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                String z43 = f30Var2.z4();
                float f14 = this.f77433k;
                int i13 = iArr[1];
                int height = originalPinImageContainer.getHeight();
                int g13 = originalPinImageContainer.g();
                Float valueOf = Float.valueOf(fArr[0]);
                Float valueOf2 = Float.valueOf(fArr[1]);
                Boolean K4 = f30Var2.K4();
                Intrinsics.checkNotNullExpressionValue(K4, "getIsEligibleForFlashlightShopping(...)");
                hVar.onHandleTransitionFromPinchToZoom(new PinchToZoomTransitionContext(id3, z43, f14, i13, height, g13, false, valueOf, valueOf2, false, false, K4.booleanValue(), false, b0.z0(f30Var2), false, 21504));
            }
        } else {
            hVar.updatePinCloseupViewsFromZoom(true);
        }
        f();
        this.f77426d = null;
    }

    public final void b(Function0 function0) {
        ViewGroup d2;
        if (function0 != null) {
            function0.invoke();
        }
        com.pinterest.feature.pincarouselads.view.l lVar = this.f77427e;
        if (lVar != null) {
            lVar.setScaleX(1.0f);
            lVar.setScaleY(1.0f);
        }
        com.pinterest.feature.pincarouselads.view.l lVar2 = this.f77427e;
        if (lVar2 != null) {
            lVar2.setX(0.0f);
            lVar2.setY(0.0f);
        }
        e();
        com.pinterest.feature.pincarouselads.view.l lVar3 = this.f77427e;
        if (lVar3 != null && lVar3.getParent() == (d2 = d()) && d2 != null) {
            d2.post(new dp.a(4, d2, lVar3));
        }
        l0 l0Var = this.f77434l;
        if (l0Var != null) {
            ((x0) l0Var).setAlpha(1.0f);
        }
        this.f77427e = null;
        this.f77439q = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jq.j.c():void");
    }

    public final ViewGroup d() {
        ViewGroup provideCloseupContainer;
        f1 f1Var = this.f77425c;
        return (f1Var == null || (provideCloseupContainer = f1Var.provideCloseupContainer()) == null) ? this.f77423a : provideCloseupContainer;
    }

    public final void e() {
        View view = this.f77436n;
        if (view != null) {
            view.setAlpha(0.0f);
            ViewGroup d2 = d();
            if (view.getParent() != d2 || d2 == null) {
                return;
            }
            d2.post(new dp.a(3, d2, view));
        }
    }

    public final void f() {
        ViewGroup d2;
        WebImageView webImageView = this.f77426d;
        if (webImageView != null) {
            webImageView.setScaleX(1.0f);
            webImageView.setScaleY(1.0f);
        }
        WebImageView webImageView2 = this.f77426d;
        if (webImageView2 != null) {
            webImageView2.setX(0.0f);
            webImageView2.setY(0.0f);
        }
        e();
        WebImageView webImageView3 = this.f77426d;
        if (webImageView3 != null && webImageView3.getParent() == (d2 = d()) && d2 != null) {
            d2.post(new y(d2, webImageView3, this, 7));
        }
        l0 l0Var = this.f77434l;
        if (l0Var == null) {
            return;
        }
        ((x0) l0Var).setAlpha(1.0f);
    }
}
