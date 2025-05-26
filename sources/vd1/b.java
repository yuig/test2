package vd1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import es.v;
import h32.a0;
import h32.c1;
import h32.f1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import kotlin.text.z;
import ls1.e;
import n60.o;
import pe.i;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125626i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f125627j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(1);
        this.f125626i = i13;
        this.f125627j = dVar;
    }

    public final void b(f30 f30Var) {
        String j13;
        int i13 = this.f125626i;
        d dVar = this.f125627j;
        switch (i13) {
            case 0:
                Boolean e53 = f30Var.e5();
                Intrinsics.checkNotNullExpressionValue(e53, "getIsRepin(...)");
                if (e53.booleanValue()) {
                    String z43 = f30Var.z4();
                    String uid = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    Long h03 = StringsKt.h0(uid);
                    String str = dVar.f125631j;
                    String r53 = f30Var.r5();
                    a0 a0Var = new a0(h03, z43, null, null, str, r53 != null ? StringsKt.h0(r53) : null);
                    Boolean bool = Boolean.FALSE;
                    dVar.getPinalytics().u(f1.COLLECTION_ITEM_REPIN, f30Var.getUid(), new c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, a0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, false);
                    break;
                }
                break;
            default:
                boolean B = o.B(f30Var, "getIsPromoted(...)");
                v vVar = (v) dVar.f125634m;
                lh0.d dVar2 = dVar.f125633l;
                e eVar = new e(vVar.t(f30Var, dVar2), B);
                dVar.f125636o = eVar;
                dVar.f125632k.f(eVar);
                if (i.O0(f30Var)) {
                    dVar.f125635n = true;
                    hd1.d dVar3 = (hd1.d) dVar.f125637p.getValue();
                    ArrayList<f30> t13 = ((v) dVar.f125634m).t(f30Var, dVar2);
                    dVar3.getClass();
                    if (t13 != null) {
                        for (f30 f30Var2 : t13) {
                            Map A4 = f30Var2.A4();
                            sr srVar = A4 != null ? (sr) A4.get("345x") : null;
                            if (srVar != null && (j13 = srVar.j()) != null) {
                                z.n(j13, "345x", "236x");
                            }
                            Map A42 = f30Var2.A4();
                            if (A42 != null) {
                            }
                        }
                    }
                    if (t13 != null) {
                        dVar3.a0(t13);
                    }
                }
                Boolean N5 = f30Var.N5();
                Intrinsics.checkNotNullExpressionValue(N5, "getPromotedIsAutoAssembled(...)");
                N5.getClass();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f125626i) {
            case 0:
                b((f30) obj);
                break;
            default:
                b((f30) obj);
                break;
        }
        return Unit.f80348a;
    }
}
