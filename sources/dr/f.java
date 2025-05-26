package dr;

import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.feature.sharesheet.view.ContactSearchListCell;
import com.pinterest.gestalt.text.GestaltText;

/* loaded from: classes3.dex */
public final class f extends i {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ContactSearchListCell f56172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GestaltText f56173f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f56174g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, TypeAheadItem typeAheadItem, int i13, ContactSearchListCell contactSearchListCell, GestaltText gestaltText) {
        super(kVar, typeAheadItem, i13);
        this.f56174g = kVar;
        this.f56172e = contactSearchListCell;
        this.f56173f = gestaltText;
    }

    @Override // dr.i
    public final void a() {
        super.a();
        k kVar = this.f56174g;
        kVar.getClass();
        this.f56172e.a(false);
        this.f56173f.i(new cp.i(kVar, 4));
    }
}
