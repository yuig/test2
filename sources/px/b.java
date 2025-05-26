package px;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.yc0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f101542j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f101543k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f101544l = new b(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101545i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f101545i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f101545i;
        switch (i13) {
            case 0:
                yc0 it = (yc0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(it, "<this>");
                List list = it.f44010k;
                if (list == null) {
                    Intrinsics.r("pins");
                    throw null;
                }
                List<f30> list2 = list;
                ArrayList arrayList = new ArrayList(g0.q(list2, 10));
                for (f30 f30Var : list2) {
                    v7 D3 = f30Var.D3();
                    Intrinsics.f(D3);
                    wy0 I5 = f30Var.I5();
                    Intrinsics.f(I5);
                    String id3 = D3.getId();
                    Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                    String j13 = D3.j1();
                    Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                    String b13 = D3.b1();
                    String C1 = D3.C1();
                    String Z2 = I5.Z2();
                    String l33 = I5.l3();
                    Integer l13 = D3.l1();
                    Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
                    int intValue = l13.intValue();
                    Integer q13 = D3.q1();
                    Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
                    int intValue2 = q13.intValue();
                    Integer q23 = I5.q2();
                    Intrinsics.checkNotNullExpressionValue(q23, "getAvatarColorIndex(...)");
                    int intValue3 = q23.intValue();
                    String id4 = I5.getId();
                    Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                    arrayList.add(new sx.a(id3, j13, b13, C1, Z2, l33, intValue, intValue2, intValue3, id4));
                }
                return arrayList;
            case 1:
                f it2 = (f) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.name();
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.name();
                }
            default:
                f it3 = (f) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return it3.name();
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return it3.name();
                }
        }
    }
}
