package fh;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class g extends h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f62143k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c0 c0Var, int i13) {
        super(c0Var);
        this.f62143k = i13;
        com.bumptech.glide.d.u(c0Var, "GoogleApiClient must not be null");
        com.bumptech.glide.d.u(bh.a.f22795a, "Api must not be null");
    }

    @Override // fh.h
    public final void D0(com.google.android.gms.common.api.c cVar) {
        switch (this.f62143k) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.getService();
                f fVar = new f(0, this);
                Parcel C = kVar.C();
                int i13 = ai.l.f15231a;
                C.writeStrongBinder(fVar);
                ai.l.c(C, eVar.f62140e);
                kVar.D(C, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE);
                break;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.getService();
                f fVar2 = new f(1, this);
                Parcel C2 = kVar2.C();
                int i14 = ai.l.f15231a;
                C2.writeStrongBinder(fVar2);
                ai.l.c(C2, eVar2.f62140e);
                kVar2.D(C2, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE);
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.k z0(Status status) {
        return status;
    }
}
