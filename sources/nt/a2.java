package nt;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a2 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f91982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f91983c;

    public /* synthetic */ a2(int i13, Object obj, Object obj2) {
        this.f91981a = i13;
        this.f91982b = obj;
        this.f91983c = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i13 = this.f91981a;
        Object obj = this.f91983c;
        Object obj2 = this.f91982b;
        switch (i13) {
            case 0:
                b2 b2Var = (b2) obj2;
                b2Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                View view = (View) obj;
                int height = view.getHeight();
                int i14 = b2Var.D.f92236f;
                if (i14 > height) {
                    height = i14;
                }
                b2Var.C(height);
                b2Var.a(view, b2Var.f91993z, height, cu.f.f53189j);
                cu.a aVar = b2Var.f53211m;
                if (aVar != null) {
                    BaseAdsScrollingModule baseAdsScrollingModule = (BaseAdsScrollingModule) aVar;
                    baseAdsScrollingModule.V1();
                    baseAdsScrollingModule.U1();
                    baseAdsScrollingModule.b2();
                    baseAdsScrollingModule.c2();
                }
                b2Var.f91993z = height;
                return;
            case 1:
                ui0.k kVar = (ui0.k) obj2;
                kVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int height2 = kVar.getHeight();
                ti0.c cVar = ((ti0.a) obj).f117695a;
                if (cVar.isBound()) {
                    ui0.e eVar = (ui0.e) ((ri0.a) cVar.getView());
                    eVar.X8();
                    if (height2 > hf0.b.f69003c - hf0.b.f()) {
                        return;
                    }
                    eVar.W8().x(height2);
                    return;
                }
                return;
            case 2:
                ((com.pinterest.feature.sharesheet.view.previewcarousel.i) obj2).f19717a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ed1.l0 l0Var = (ed1.l0) obj;
                com.pinterest.feature.sharesheet.view.previewcarousel.i a13 = ((com.pinterest.feature.sharesheet.view.previewcarousel.k) l0Var.getView()).a(1);
                View view2 = a13 != null ? a13.f19717a : null;
                if (view2 != null) {
                    view2.postDelayed(new a11.p(11, l0Var, view2), 1000L);
                    return;
                }
                return;
            default:
                mm1.k kVar2 = (mm1.k) obj2;
                ViewGroup viewGroup = kVar2.f87617g;
                if (viewGroup == null) {
                    Intrinsics.r("draggableSheet");
                    throw null;
                }
                viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Context context = ((View) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                double d2 = kVar2.f87620j;
                if (kVar2.f87617g == null) {
                    Intrinsics.r("draggableSheet");
                    throw null;
                }
                int abs = 100 - Math.abs((int) (((d2 - r2.getY()) / kVar2.f87620j) * 100.0d));
                View view3 = kVar2.f87615e;
                if (view3 != null) {
                    view3.setContentDescription(context.getString(hn1.w.content_description_sheet_drag_handle, Integer.valueOf(abs)));
                    return;
                } else {
                    Intrinsics.r("dragHandle");
                    throw null;
                }
        }
    }
}
