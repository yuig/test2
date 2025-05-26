package l31;

import com.pinterest.api.model.md0;
import com.pinterest.api.model.v7;
import fk2.m;
import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.s;
import m31.e;
import m60.w;
import nx.d0;
import x02.c2;
import x02.i2;
import yk1.i;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81505i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f81506j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j0 f81507k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j0 j0Var, d dVar) {
        super(1);
        this.f81507k = j0Var;
        this.f81506j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        uj2.b n13;
        fk2.c cVar;
        int i13 = this.f81505i;
        j0 j0Var = this.f81507k;
        d dVar = this.f81506j;
        switch (i13) {
            case 0:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                j0Var.f80434a = board;
                d0 pinalytics = dVar.getPinalytics();
                boolean z13 = dVar.f81518k;
                f1 f1Var = z13 ? f1.AUTO_BOARD_CREATED : f1.BOARD_CREATE;
                String uid = board.getUid();
                HashMap hashMap = new HashMap();
                String str = dVar.f81519l;
                if (str != null) {
                }
                String str2 = dVar.f81521n;
                if (str2 == null) {
                    str2 = ou1.b.UNKNOWN.getValue();
                }
                hashMap.put("source", str2);
                Unit unit = Unit.f80348a;
                d0.B(pinalytics, f1Var, null, uid, hashMap, 18);
                if (z13) {
                    boolean z14 = dVar.f81522o;
                    i2 i2Var = dVar.f81510c;
                    if (z14) {
                        n13 = m.f62459a;
                    } else {
                        String uid2 = board.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                        n13 = c0.d.o(i2Var, dVar.f81517j, uid2, dVar.f81508a);
                    }
                    String str3 = dVar.f81520m;
                    if (str3.length() != 0) {
                        f60.b.Companion.getClass();
                        int i14 = a.f81502a[f60.a.a(str).ordinal()];
                        if (i14 == 1) {
                            cVar = new fk2.c(0, n13, c0.d.n(dVar.f81510c, e0.b(str3), null, board.getUid(), null, false));
                        } else if (i14 == 2) {
                            c2 c2Var = new c2(str3);
                            c2Var.f131300e = board.getUid();
                            cVar = new fk2.c(0, n13, c0.d.B2(i2Var, c2Var, dVar.f81515h).i());
                        }
                        n13 = cVar;
                    }
                } else {
                    n13 = c0.d.n(dVar.f81510c, dVar.f81509b, null, board.getUid(), null, false);
                }
                return n13.q(Unit.f80348a);
            default:
                j31.b bVar = (j31.b) dVar.getViewIfBound();
                if (bVar != null) {
                    ((e) bVar).setLoadState(i.LOADED);
                }
                v7 v7Var = (v7) j0Var.f80434a;
                w wVar = dVar.f81512e;
                if (v7Var != null) {
                    String uid3 = v7Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                    wVar.d(new rp.a(uid3, dVar.f81517j));
                    d.p3(dVar, v7Var);
                }
                wVar.d(new md0());
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, j0 j0Var) {
        super(1);
        this.f81506j = dVar;
        this.f81507k = j0Var;
    }
}
