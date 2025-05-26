package f2;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60883i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f60884j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f60885k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i92.k kVar) {
        super(2);
        this.f60883i = 1;
        this.f60884j = true;
        this.f60885k = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v18, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List list;
        String a13;
        int i13 = this.f60883i;
        boolean z13 = this.f60884j;
        Object obj3 = this.f60885k;
        switch (i13) {
            case 0:
                d3.h hVar = (d3.h) obj;
                long j13 = ((a3.c) obj2).f482a;
                s sVar = s.f60907a;
                d3.h.O(hVar, ((k) obj3).a(z13, true), hVar.l0(s.f60908b) / 2.0f, j13, 0.0f, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
                break;
            case 1:
                v7 board = (v7) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(board, "board");
                if (z13) {
                    ((i92.k) obj3).c(new lr.c(board.getId(), board.j1(), kh2.d.v(board), booleanValue));
                }
                break;
            case 2:
                wy0 user = (wy0) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(user, "user");
                if (booleanValue2) {
                    i92.k kVar = ((nk1.l) obj3).f91144b;
                    String id3 = user.getId();
                    Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                    String Z2 = user.Z2();
                    String l33 = user.l3();
                    String str = l33 == null ? "" : l33;
                    Map k43 = user.k4();
                    kVar.c(new lr.e0(id3, Z2, str, k43 != null ? (List) k43.get("236x") : null, this.f60884j));
                }
                break;
            default:
                z40.y user2 = (z40.y) obj;
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(user2, "user");
                if (booleanValue3) {
                    i92.k kVar2 = ((nk1.l) obj3).f91144b;
                    String a14 = user2.a();
                    String f13 = user2.f();
                    String b13 = user2.b();
                    String str2 = b13 == null ? "" : b13;
                    List n13 = user2.n();
                    if (n13 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : n13) {
                            z40.w wVar = (z40.w) obj4;
                            if (Intrinsics.d(wVar.getType(), "236x") && (a13 = wVar.a()) != null && (!kotlin.text.z.j(a13))) {
                                arrayList.add(obj4);
                            }
                        }
                        list = new ArrayList(g0.q(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String a15 = ((z40.w) it.next()).a();
                            Intrinsics.f(a15);
                            list.add(a15);
                        }
                    } else {
                        list = q0.f80391a;
                    }
                    kVar2.c(new lr.e0(a14, f13, str2, list, this.f60884j));
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, boolean z13, int i13) {
        super(2);
        this.f60883i = i13;
        this.f60885k = obj;
        this.f60884j = z13;
    }
}
