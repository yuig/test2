package v;

import a.ig;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.camera.core.CameraControl$OperationCanceledException;
import com.pinterest.activity.sendapin.ui.ProgressSpinnerListCell;
import com.pinterest.design.progress.SmallLoadingView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.ProductFilterIconV2;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f123645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f123646c;

    public /* synthetic */ s(Object obj, boolean z13, int i13) {
        this.f123644a = i13;
        this.f123646c = obj;
        this.f123645b = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5.g2 h10;
        switch (this.f123644a) {
            case 0:
                d0 d0Var = (d0) this.f123646c;
                boolean z13 = this.f123645b;
                d0Var.D = z13;
                if (z13 && d0Var.f123400e == z.PENDING_OPEN) {
                    d0Var.I(false);
                    break;
                }
                break;
            case 1:
                b0.c cVar = (b0.c) this.f123646c;
                boolean z14 = cVar.f20713b;
                boolean z15 = this.f123645b;
                if (z14 != z15) {
                    cVar.f20713b = z15;
                    if (!z15) {
                        CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("The camera control has became inactive.");
                        r4.i iVar = (r4.i) cVar.f20718g;
                        if (iVar != null) {
                            iVar.d(cameraControl$OperationCanceledException);
                            cVar.f20718g = null;
                            break;
                        }
                    } else if (cVar.f20714c) {
                        n nVar = (n) cVar.f20715d;
                        nVar.getClass();
                        g0.m.f(com.bumptech.glide.d.L(new a.z0(nVar, 3))).d(new ig(cVar, 16), (Executor) cVar.f20712a);
                        cVar.f20714c = false;
                        break;
                    }
                }
                break;
            case 2:
                gc.c cVar2 = (gc.c) this.f123646c;
                int i13 = u0.h.f119756n;
                boolean z16 = this.f123645b;
                u0.e eVar = (u0.e) cVar2.f64764b;
                eVar.f119748q = z16;
                if (eVar.f119738g == u0.d.STARTED) {
                    eVar.a();
                    break;
                }
                break;
            case 3:
                m7.i0 i0Var = (m7.i0) ((qq2.c) this.f123646c).f104884c;
                int i14 = d7.n0.f53866a;
                m7.l0 l0Var = i0Var.f86205a;
                boolean z17 = l0Var.f86258d0;
                boolean z18 = this.f123645b;
                if (z17 != z18) {
                    l0Var.f86258d0 = z18;
                    l0Var.f86277n.m(23, new m7.g0(z18, r1));
                    break;
                }
                break;
            case 4:
                View view = (View) this.f123646c;
                if (this.f123645b && (h10 = q5.v0.h(view)) != null) {
                    h10.f102441a.l();
                    break;
                } else {
                    Context context = view.getContext();
                    Object obj = d5.a.f53679a;
                    ((InputMethodManager) context.getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                    break;
                }
                break;
            case 5:
                dr.k kVar = (dr.k) this.f123646c;
                int i15 = dr.k.H;
                if (!this.f123645b) {
                    kVar.d().f35167a.setVisibility(8);
                    break;
                } else {
                    ProgressSpinnerListCell d2 = kVar.d();
                    r1 = kVar.f56200o.size() != 0 ? 0 : 1;
                    int i16 = d2.f35168b;
                    if (r1 == 0) {
                        i16 /= 2;
                    }
                    SmallLoadingView smallLoadingView = d2.f35167a;
                    com.bumptech.glide.c.a1((FrameLayout.LayoutParams) smallLoadingView.getLayoutParams(), 0, i16, 0, 0);
                    smallLoadingView.setVisibility(0);
                    break;
                }
            case 6:
                s71.l this$0 = (s71.l) this.f123646c;
                int i17 = s71.l.f111371x;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!this.f123645b) {
                    if (!this$0.f111383l) {
                        this$0.b().f2();
                        break;
                    } else {
                        this$0.c().d();
                        break;
                    }
                } else {
                    this$0.f();
                    break;
                }
            case 7:
                id1.g this$02 = (id1.g) this.f123646c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (this$02.isBound()) {
                    yk1.n view2 = this$02.getView();
                    Intrinsics.g(view2, "null cannot be cast to non-null type com.pinterest.feature.shopping.baseshoppingfeed.BaseShoppingFeedContract.BaseShoppingFeedView.ShoppingProductFilterView");
                    jd1.d dVar = (jd1.d) ((gd1.b) view2);
                    boolean z19 = this.f123645b;
                    if (z19) {
                        nx.d0 d0Var2 = dVar.p9().f122379a;
                        Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                        d0Var2.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.RENDER, (r18 & 2) != 0 ? null : h32.u0.FILTER_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ProductFilterIconV2 productFilterIconV2 = dVar.W0;
                        if (productFilterIconV2 != null) {
                            bs1.c.R1(productFilterIconV2, z19);
                            break;
                        }
                    }
                }
                break;
            default:
                yv1.j this$03 = (yv1.j) this.f123646c;
                List list = yv1.j.f140235j;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Context context2 = this$03.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                com.pinterest.feature.search.results.view.h hVar = new com.pinterest.feature.search.results.view.h(context2, this$03.getWidth(), this$03.getHeight(), this$03.getResources().getColor(eo1.b.color_themed_text_default, this$03.getContext().getTheme()), this$03.getResources().getDimensionPixelOffset(eo1.c.lego_brick_quarter), this$03.getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_large), this.f123645b);
                this$03.f140237e = hVar;
                hVar.setAlpha(1.0f);
                this$03.addView(this$03.f140237e, new FrameLayout.LayoutParams(this$03.getWidth(), this$03.getHeight()));
                break;
        }
    }

    public /* synthetic */ s(s71.l lVar, boolean z13) {
        this.f123644a = 6;
        this.f123645b = z13;
        this.f123646c = lVar;
    }
}
