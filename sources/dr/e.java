package dr;

import android.widget.LinearLayout;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.feature.sharesheet.view.ContactSearchListCell;
import com.pinterest.gestalt.text.GestaltText;
import kh2.k3;
import z40.t;

/* loaded from: classes3.dex */
public final class e extends i {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ContactSearchListCell f56168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GestaltText f56169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f56170g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f56171h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, TypeAheadItem typeAheadItem, int i13, ContactSearchListCell contactSearchListCell, GestaltText gestaltText, LinearLayout linearLayout) {
        super(kVar, typeAheadItem, i13);
        this.f56171h = kVar;
        this.f56168e = contactSearchListCell;
        this.f56169f = gestaltText;
        this.f56170g = linearLayout;
    }

    @Override // dr.i
    public final void b(Throwable th3) {
        super.b(th3);
        this.f56171h.getClass();
        this.f56168e.a(true);
        GestaltText gestaltText = this.f56169f;
        if (gestaltText != null) {
            gestaltText.i(new xo.j(18));
        }
    }

    @Override // dr.i
    public final void c(t tVar) {
        super.c(tVar);
        g91.f fVar = new g91.f();
        k kVar = this.f56171h;
        kVar.C.d(fVar);
        this.f56168e.a(false);
        GestaltText gestaltText = this.f56169f;
        if (gestaltText != null) {
            gestaltText.i(new xo.j(17));
        }
        LinearLayout linearLayout = this.f56170g;
        k3.R1(linearLayout, true);
        linearLayout.setOnClickListener(new co.a(17, kVar, tVar.a()));
    }
}
