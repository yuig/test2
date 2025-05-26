package pv1;

import com.pinterest.api.model.g00;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import pe.i;

/* loaded from: classes4.dex */
public final class c implements ov1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f101470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f101471b;

    public c(e eVar, boolean z13) {
        this.f101470a = eVar;
        this.f101471b = z13;
    }

    @Override // ov1.a
    public final void a(g00 updatedModule) {
        Intrinsics.checkNotNullParameter(updatedModule, "updatedModule");
        e eVar = this.f101470a;
        ov1.e eVar2 = eVar.f101476f;
        if (eVar2 == ov1.e.NOT_SELECTABLE) {
            return;
        }
        ov1.e eVar3 = ov1.e.SINGLE_SELECTABLE_ONLY;
        boolean z13 = this.f101471b;
        if (eVar2 != eVar3 || i.Q0(updatedModule)) {
            eVar.R3(updatedModule, z13);
        }
        if (p.O(eVar.f101476f) && i.Q0(updatedModule) && !Intrinsics.d(eVar.f101479i, updatedModule.getUid())) {
            String str = eVar.f101479i;
            if (str != null) {
                g00 D3 = e.D3(eVar, str);
                g00 u13 = D3 != null ? i.u1(D3, false) : null;
                if (u13 != null) {
                    eVar.R3(u13, z13);
                }
            }
            eVar.f101479i = updatedModule.getUid();
        }
        ov1.d dVar = eVar.f101481k;
        if (dVar != null) {
            dVar.t1(eVar.J3());
        }
    }
}
