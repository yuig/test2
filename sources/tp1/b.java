package tp1;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.feature.pin.edit.view.AttributeBasicsListView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import h32.f1;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.d0;
import nx.f0;
import nx.j0;
import nx.m;
import rq.c2;
import x02.l2;

/* loaded from: classes5.dex */
public final class b extends jc0.b implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final SpannableStringBuilder f118774a;

    /* renamed from: b, reason: collision with root package name */
    public final int f118775b;

    /* renamed from: c, reason: collision with root package name */
    public final l2 f118776c;

    /* renamed from: d, reason: collision with root package name */
    public final uk1.e f118777d;

    /* renamed from: e, reason: collision with root package name */
    public final g f118778e;

    /* renamed from: f, reason: collision with root package name */
    public e f118779f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f118780g;

    public b(SpannableStringBuilder currentText, int i13, l2 typeaheadRepository, uk1.e presenterPinalyticsFactory, f0 pinalyticsFactory, AttributeBasicsListView hashtagUpdateListener) {
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        Intrinsics.checkNotNullParameter(typeaheadRepository, "typeaheadRepository");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(hashtagUpdateListener, "hashtagUpdateListener");
        this.f118774a = currentText;
        this.f118775b = i13;
        this.f118776c = typeaheadRepository;
        this.f118777d = presenterPinalyticsFactory;
        this.f118778e = hashtagUpdateListener;
        this.f118780g = ((m) pinalyticsFactory).a(this);
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        e eVar = new e(context, this.f118774a, this.f118775b, this.f118776c, this.f118777d);
        this.f118779f = eVar;
        modalViewWrapper.t(eVar);
        GestaltText gestaltText = modalViewWrapper.f44750b;
        if (gestaltText != null) {
            gestaltText.i(new c2(gestaltText, 24));
            gestaltText.setPaddingRelative(context.getResources().getDimensionPixelSize(r0.margin_quadruple), 0, 0, 0);
        }
        modalViewWrapper.o(false);
        GestaltButton gestaltButton = modalViewWrapper.f44752d;
        if (gestaltButton != null) {
            gestaltButton.d(a.f118770j);
            gestaltButton.setOnClickListener(new oq.m(10));
        }
        d0.B(this.f118780g, f1.VIEW, null, null, null, 30);
        return modalViewWrapper;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.STORY_PIN_DETAILS_HASHTAGS_TYPEAHEAD, null, null, null, null, null);
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -1;
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
        e eVar = this.f118779f;
        if (eVar == null) {
            Intrinsics.r("hashtagModalView");
            throw null;
        }
        Editable z03 = eVar.f118790h.z0();
        Intrinsics.g(z03, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
        g gVar = this.f118778e;
        ((AttributeBasicsListView) gVar).Y((SpannableStringBuilder) z03);
        ((AttributeBasicsListView) gVar).n6();
    }
}
