package oo0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.api.model.fb;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import m60.e;
import m60.f0;
import pk.a0;
import so.oa;
import yk1.l;
import yk1.m;
import yk1.n;

/* loaded from: classes5.dex */
public final class d extends l implements lo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final fb f96815a;

    /* renamed from: b, reason: collision with root package name */
    public c f96816b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f96817c;

    public d(fb fbVar) {
        this.f96815a = fbVar;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        GestaltText gestaltText = (GestaltText) modalViewWrapper.findViewById(ga2.d.modal_header_title_tv);
        this.f96817c = gestaltText;
        com.bumptech.glide.c.a1((LinearLayout.LayoutParams) gestaltText.getLayoutParams(), a0.K(40, this.f96817c.getResources()) * 3, 0, 0, 0);
        c cVar = new c(context);
        View.inflate(cVar.getContext(), v70.b.view_brand_survey, cVar);
        cVar.setOrientation(1);
        cVar.f96807b = (GestaltButton) cVar.findViewById(v70.a.brand_survey_modal_button);
        cVar.f96806a = (FrameLayout) cVar.findViewById(v70.a.brand_survey_modal_list_container);
        cVar.f96810e = (GestaltText) cVar.findViewById(v70.a.brand_survey_title);
        cVar.f96806a.setVisibility(0);
        this.f96816b = cVar;
        modalViewWrapper.t(cVar);
        return modalViewWrapper;
    }

    @Override // yk1.l
    public final m createPresenter() {
        Context context = kb0.a.f79058b;
        so1.b bVar = (so1.b) a0.M(f0.X(), so1.b.class);
        mo0.a aVar = new mo0.a(new no0.a(this.f96816b.getContext(), (e20.a) ((oa) ((w70.c) ((w70.b) w70.b.f128158b.getValue()).f128159a.getValue())).N9.get()), this.f96815a, com.bumptech.glide.d.E(), this, new hf0.b(), (e) ((oa) bVar).f113920t0.get());
        a aVar2 = new a(aVar);
        c cVar = this.f96816b;
        aVar2.f96803b = cVar;
        cVar.f96812g = aVar;
        cVar.f96807b.d(new b(0));
        cVar.f96807b.e(new yb0.b(aVar, 26));
        c cVar2 = this.f96816b;
        cVar2.f96808c = aVar2;
        cVar2.f96809d = aVar2;
        return aVar;
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -1;
    }

    @Override // yk1.l
    public final n getView() {
        return this.f96816b;
    }
}
