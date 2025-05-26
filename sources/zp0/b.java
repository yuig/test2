package zp0;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.a4;
import h32.g0;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import nx.j0;
import nx.m;
import up0.l;
import x02.l2;

/* loaded from: classes5.dex */
public final class b extends jc0.b implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final SpannableStringBuilder f142589a;

    /* renamed from: b, reason: collision with root package name */
    public final int f142590b;

    /* renamed from: c, reason: collision with root package name */
    public final l f142591c;

    /* renamed from: d, reason: collision with root package name */
    public final l2 f142592d;

    /* renamed from: e, reason: collision with root package name */
    public final uk1.e f142593e;

    /* renamed from: f, reason: collision with root package name */
    public final wp0.f f142594f;

    /* renamed from: g, reason: collision with root package name */
    public final h f142595g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f142596h;

    /* renamed from: i, reason: collision with root package name */
    public final a4 f142597i;

    /* renamed from: j, reason: collision with root package name */
    public final g0 f142598j;

    /* renamed from: k, reason: collision with root package name */
    public f f142599k;

    /* renamed from: l, reason: collision with root package name */
    public final j0 f142600l;

    public /* synthetic */ b(SpannableStringBuilder spannableStringBuilder, int i13, l lVar, l2 l2Var, uk1.e eVar, f0 f0Var, wp0.f fVar, h hVar, Boolean bool, g0 g0Var, int i14) {
        this(spannableStringBuilder, i13, lVar, l2Var, eVar, f0Var, fVar, hVar, (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? Boolean.FALSE : bool, (a4) null, (i14 & 1024) != 0 ? null : g0Var);
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        f fVar = new f(context, this.f142589a, this.f142590b, this.f142591c, this.f142592d, this.f142593e, this.f142594f, this.f142596h, this.f142597i, this.f142598j);
        this.f142599k = fVar;
        modalViewWrapper.t(fVar);
        modalViewWrapper.j(new a(this, 0));
        return modalViewWrapper;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(this.f142594f.getViewType(), this.f142597i, null, this.f142598j, null, null);
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -1;
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
        f fVar = this.f142599k;
        if (fVar == null) {
            Intrinsics.r("atMentionModalView");
            throw null;
        }
        GestaltTextField gestaltTextField = fVar.f142617k;
        if (gestaltTextField == null) {
            Intrinsics.r("mentionEditText");
            throw null;
        }
        Editable z03 = gestaltTextField.z0();
        Intrinsics.g(z03, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
        h hVar = this.f142595g;
        hVar.Y((SpannableStringBuilder) z03);
        hVar.n6();
    }

    public b(SpannableStringBuilder currentText, int i13, l typeaheadTextUtility, l2 typeaheadRepository, uk1.e presenterPinalyticsFactory, f0 pinalyticsFactory, wp0.f mentionSurface, h atMentionUpdateListener, Boolean bool, a4 a4Var, g0 g0Var) {
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        Intrinsics.checkNotNullParameter(typeaheadTextUtility, "typeaheadTextUtility");
        Intrinsics.checkNotNullParameter(typeaheadRepository, "typeaheadRepository");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(mentionSurface, "mentionSurface");
        Intrinsics.checkNotNullParameter(atMentionUpdateListener, "atMentionUpdateListener");
        this.f142589a = currentText;
        this.f142590b = i13;
        this.f142591c = typeaheadTextUtility;
        this.f142592d = typeaheadRepository;
        this.f142593e = presenterPinalyticsFactory;
        this.f142594f = mentionSurface;
        this.f142595g = atMentionUpdateListener;
        this.f142596h = bool;
        this.f142597i = a4Var;
        this.f142598j = g0Var;
        this.f142600l = ((m) pinalyticsFactory).a(this);
    }
}
