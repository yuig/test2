package rq;

import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.p20;
import com.pinterest.feature.pearlibrary.view.PearStyleTagsScrollView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class w1 extends PinCloseupBaseModule {

    /* renamed from: a, reason: collision with root package name */
    public boolean f109611a;

    /* renamed from: b, reason: collision with root package name */
    public PearStyleTagsScrollView f109612b;

    /* renamed from: c, reason: collision with root package name */
    public PearStyleTagsScrollView f109613c;

    /* renamed from: d, reason: collision with root package name */
    public nx.d0 f109614d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
    }

    public final PearStyleTagsScrollView b() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PearStyleTagsScrollView pearStyleTagsScrollView = new PearStyleTagsScrollView(context);
        pearStyleTagsScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int W = bs1.c.W(pearStyleTagsScrollView, eo1.c.space_400);
        pearStyleTagsScrollView.setPaddingRelative(W, pearStyleTagsScrollView.getPaddingTop(), W, bs1.c.W(pearStyleTagsScrollView, eo1.c.space_200));
        f30 pin = getPin();
        String uid = pin != null ? pin.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        Intrinsics.checkNotNullParameter(uid, "<set-?>");
        pearStyleTagsScrollView.f46883f = uid;
        pearStyleTagsScrollView.f46881d = this.f109614d;
        addView(pearStyleTagsScrollView);
        return pearStyleTagsScrollView;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        setOrientation(1);
        this.f109612b = b();
        this.f109613c = b();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PEAR_STYLE_PILLS;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        f30 pin = getPin();
        List D5 = pin != null ? pin.D5() : null;
        return !(D5 == null || D5.isEmpty());
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109611a) {
            return;
        }
        this.f109611a = true;
        jb jbVar = (jb) ((x1) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        kh2.r.u(this.f109612b, "PinCloseupPearStylesModule.styleTagsView");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return hasContent();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePinalytics(nx.d0 d0Var) {
        super.updatePinalytics(d0Var);
        this.f109614d = d0Var;
        PearStyleTagsScrollView pearStyleTagsScrollView = this.f109612b;
        if (pearStyleTagsScrollView != null) {
            pearStyleTagsScrollView.f46881d = d0Var;
        }
        PearStyleTagsScrollView pearStyleTagsScrollView2 = this.f109613c;
        if (pearStyleTagsScrollView2 == null) {
            return;
        }
        pearStyleTagsScrollView2.f46881d = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        List D5;
        ?? r43;
        List D52;
        List D53;
        p20 p20Var;
        String k13;
        super.updateView();
        f30 pin = getPin();
        int i13 = 0;
        if (!com.bumptech.glide.d.o0((pin == null || (D53 = pin.D5()) == null || (p20Var = (p20) CollectionsKt.firstOrNull(D53)) == null || (k13 = p20Var.k()) == null) ? null : Boolean.valueOf(kotlin.text.z.p(k13, "pinny", false)))) {
            PearStyleTagsScrollView pearStyleTagsScrollView = this.f109612b;
            if (pearStyleTagsScrollView != null) {
                f30 pin2 = getPin();
                r2 = pin2 != null ? pin2.D5() : null;
                if (r2 == null) {
                    r2 = kotlin.collections.q0.f80391a;
                }
                PearStyleTagsScrollView.d(pearStyleTagsScrollView, r2);
            }
            PearStyleTagsScrollView pearStyleTagsScrollView2 = this.f109613c;
            if (pearStyleTagsScrollView2 != null) {
                bs1.c.X0(pearStyleTagsScrollView2);
                return;
            }
            return;
        }
        PearStyleTagsScrollView pearStyleTagsScrollView3 = this.f109612b;
        if (pearStyleTagsScrollView3 != null) {
            f30 pin3 = getPin();
            if (pin3 == null || (D52 = pin3.D5()) == null) {
                r43 = 0;
            } else {
                r43 = new ArrayList();
                int i14 = 0;
                for (Object obj : D52) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    if (i14 % 2 == 0) {
                        r43.add(obj);
                    }
                    i14 = i15;
                }
            }
            if (r43 == 0) {
                r43 = kotlin.collections.q0.f80391a;
            }
            PearStyleTagsScrollView.d(pearStyleTagsScrollView3, r43);
        }
        PearStyleTagsScrollView pearStyleTagsScrollView4 = this.f109613c;
        if (pearStyleTagsScrollView4 != null) {
            f30 pin4 = getPin();
            if (pin4 != null && (D5 = pin4.D5()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : D5) {
                    int i16 = i13 + 1;
                    if (i13 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    if (i13 % 2 == 1) {
                        arrayList.add(obj2);
                    }
                    i13 = i16;
                }
                r2 = arrayList;
            }
            if (r2 == null) {
                r2 = kotlin.collections.q0.f80391a;
            }
            PearStyleTagsScrollView.d(pearStyleTagsScrollView4, r2);
        }
    }
}
