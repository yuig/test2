package zp;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y01.n1;

/* loaded from: classes3.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142514i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f30 f142515j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i13, f30 f30Var) {
        super(1);
        this.f142514i = i13;
        this.f142515j = f30Var;
    }

    public final f30 b(Unit it) {
        int i13 = this.f142514i;
        f30 f30Var = this.f142515j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return f30Var;
    }

    public final Boolean e(f30 it) {
        int i13 = this.f142514i;
        f30 f30Var = this.f142515j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Boolean.valueOf(Intrinsics.d(it.getUid(), f30Var.getUid()));
    }

    public final pq.b f(pq.b it) {
        switch (this.f142514i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return pq.b.e(it, this.f142515j, qq.e.VIRTUAL_TRY_ON, null, false, false, false, false, false, null, false, false, 2044);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return pq.b.e(it, this.f142515j, null, qq.a.CUTOUT_SCISSORS, false, false, false, false, false, null, false, false, 2042);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return pq.b.e(it, this.f142515j, qq.e.VIRTUAL_TRY_ON, null, false, false, false, false, false, null, false, false, 2044);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142514i;
        f30 f30Var = this.f142515j;
        switch (i13) {
            case 0:
                on1.k it = (on1.k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.k.e(it, on1.b.e(it.f96740a, b40.L0(f30Var), false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 1:
                return f((pq.b) obj);
            case 2:
                return f((pq.b) obj);
            case 3:
                return f((pq.b) obj);
            case 4:
                return e((f30) obj);
            case 5:
                return e((f30) obj);
            case 6:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                String z63 = f30Var.z6();
                if (z63 == null) {
                    z63 = "";
                }
                return rn1.a.y(it2, ep.b.x(z63, "string", z63), null, null, null, null, 0, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2097022);
            case 7:
                return b((Unit) obj);
            case 8:
                return b((Unit) obj);
            case 9:
                n1 it3 = (n1) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return n1.b(it3, null, null, false, null, 0, 0, this.f142515j, 16383);
            case 10:
                IndexedValue it4 = (IndexedValue) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return Boolean.valueOf(Intrinsics.d(((dl1.s) it4.f80350b).getUid(), f30Var.getUid()));
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj, "it");
                return f30Var;
            case 12:
                return b((Unit) obj);
            case 13:
                bk1.o it5 = (bk1.o) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                String uid = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                bk1.h hVar = new bk1.h(uid);
                it5.getClass();
                return bk1.o.e(hVar);
            case 14:
                fk1.w it6 = (fk1.w) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                String uid2 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                return fk1.w.b(it6, null, 0, null, uid2, false, null, null, false, false, false, false, null, 16776959);
            default:
                hk1.v it7 = (hk1.v) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                Boolean o43 = f30Var.o4();
                Intrinsics.checkNotNullExpressionValue(o43, "getFavoritedByMe(...)");
                return hk1.v.b(it7, null, o43.booleanValue(), false, false, null, 991);
        }
    }
}
