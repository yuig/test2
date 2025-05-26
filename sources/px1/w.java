package px1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.partnerAnalytics.feature.filter.FilterSelectionView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes4.dex */
public final class w extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f101703a;

    /* renamed from: b, reason: collision with root package name */
    public final String f101704b;

    /* renamed from: c, reason: collision with root package name */
    public final int f101705c;

    /* renamed from: d, reason: collision with root package name */
    public final List f101706d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.w f101707e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltText f101708f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltToolbarImpl f101709g;

    /* renamed from: h, reason: collision with root package name */
    public FilterSelectionView f101710h;

    public w(String str, String str2, int i13, List entries, m60.w eventManager) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f101703a = str;
        this.f101704b = str2;
        this.f101705c = i13;
        this.f101706d = entries;
        this.f101707e = eventManager;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        modalViewWrapper.s(com.pinterest.partnerAnalytics.e.nested_selection_modal);
        View findViewById = modalViewWrapper.findViewById(com.pinterest.partnerAnalytics.d.filterSelection);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f101710h = (FilterSelectionView) findViewById;
        View findViewById2 = modalViewWrapper.findViewById(com.pinterest.partnerAnalytics.d.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f101709g = (GestaltToolbarImpl) findViewById2;
        View findViewById3 = modalViewWrapper.findViewById(com.pinterest.partnerAnalytics.d.tvDisclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f101708f = (GestaltText) findViewById3;
        modalViewWrapper.q(false);
        GestaltToolbarImpl gestaltToolbarImpl = this.f101709g;
        if (gestaltToolbarImpl == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        gestaltToolbarImpl.f49713m = new wq1.a(this, 15);
        String str = this.f101703a;
        gestaltToolbarImpl.b0(str);
        GestaltToolbarImpl gestaltToolbarImpl2 = this.f101709g;
        if (gestaltToolbarImpl2 == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        gestaltToolbarImpl2.u().setTint(context.getColor(eo1.b.color_themed_text_default));
        GestaltToolbarImpl gestaltToolbarImpl3 = this.f101709g;
        if (gestaltToolbarImpl3 == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        gestaltToolbarImpl3.m();
        GestaltToolbarImpl gestaltToolbarImpl4 = this.f101709g;
        if (gestaltToolbarImpl4 == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        gestaltToolbarImpl4.e0(vn1.g.BODY_300);
        GestaltText gestaltText = this.f101708f;
        if (gestaltText == null) {
            Intrinsics.r("tvDisclaimer");
            throw null;
        }
        String str2 = this.f101704b;
        if (str2 == null) {
            str2 = "";
        }
        a0.p(gestaltText, str2);
        FilterSelectionView filterSelectionView = this.f101710h;
        if (filterSelectionView == null) {
            Intrinsics.r("filterSelectionView");
            throw null;
        }
        filterSelectionView.c(this.f101706d);
        FilterSelectionView filterSelectionView2 = this.f101710h;
        if (filterSelectionView2 == null) {
            Intrinsics.r("filterSelectionView");
            throw null;
        }
        ex1.n nVar = new ex1.n(this, 9);
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        filterSelectionView2.f50188d = nVar;
        if (str != null) {
            if (this.f101710h == null) {
                Intrinsics.r("filterSelectionView");
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "<set-?>");
        }
        FilterSelectionView filterSelectionView3 = this.f101710h;
        if (filterSelectionView3 != null) {
            filterSelectionView3.h(this.f101705c);
            return modalViewWrapper;
        }
        Intrinsics.r("filterSelectionView");
        throw null;
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -1;
    }
}
