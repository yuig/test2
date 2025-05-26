package tt0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119117i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f119118j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z f119119k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(z zVar, l0 l0Var) {
        super(0);
        this.f119119k = zVar;
        this.f119118j = l0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f119117i) {
            case 0:
                m265invoke();
                break;
            default:
                m265invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l0 l0Var, z zVar) {
        super(0);
        this.f119118j = l0Var;
        this.f119119k = zVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m265invoke() {
        rt0.b bVar;
        ArrayList arrayList;
        int i13 = this.f119117i;
        z zVar = this.f119119k;
        l0 l0Var = this.f119118j;
        switch (i13) {
            case 0:
                rt0.b bVar2 = zVar.f119244i;
                if (bVar2 != null) {
                    bVar2.w(false);
                }
                rt0.b bVar3 = zVar.f119244i;
                if (bVar3 != null) {
                    bVar3.t();
                }
                l0Var.w8();
                if (!l0Var.d8() || (bVar = zVar.f119244i) == null || (arrayList = bVar.f109957i) == null || arrayList.size() != 0) {
                    return;
                }
                l0Var.s8();
                return;
            default:
                fp0.d dVar = l0Var.f119189y0;
                if (dVar == null) {
                    Intrinsics.r("cameraView");
                    throw null;
                }
                if (dVar.k()) {
                    l0Var.h8().k(aq1.h.idea_pin_camera_flash_unavailable_front_facing);
                    return;
                }
                fp0.d dVar2 = l0Var.f119189y0;
                if (dVar2 == null) {
                    Intrinsics.r("cameraView");
                    throw null;
                }
                rt0.b bVar4 = zVar.f119244i;
                dVar2.e(bVar4 != null ? bVar4.f109955g : false, new i0(zVar, l0Var));
                return;
        }
    }
}
