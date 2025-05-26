package r52;

import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106258i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f106259j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l82.e f106260k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(c0 c0Var, l82.e eVar, int i13) {
        super(1);
        this.f106258i = i13;
        this.f106259j = c0Var;
        this.f106260k = eVar;
    }

    public final g b(g it) {
        int i13 = this.f106258i;
        l82.e eVar = this.f106260k;
        c0 c0Var = this.f106259j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return g.e(it, null, c0.h(c0Var, eVar), false, 5);
    }

    public final d0 e(d0 it) {
        int i13 = this.f106258i;
        c0 c0Var = this.f106259j;
        l82.e eVar = this.f106260k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList g13 = c0.g(c0Var, (g) eVar.f82218a);
                ArrayList arrayList = new ArrayList(g0.q(g13, 10));
                Iterator it2 = g13.iterator();
                while (it2.hasNext()) {
                    String uid = ((f30) it2.next()).getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    arrayList.add(uid);
                }
                return d0.b(it, null, null, null, arrayList, 63);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList g14 = c0.g(c0Var, (g) eVar.f82218a);
                ArrayList arrayList2 = new ArrayList(g0.q(g14, 10));
                Iterator it3 = g14.iterator();
                while (it3.hasNext()) {
                    String uid2 = ((f30) it3.next()).getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    arrayList2.add(uid2);
                }
                return d0.b(it, null, null, null, arrayList2, 63);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f106258i) {
            case 0:
                return e((d0) obj);
            case 1:
                return b((g) obj);
            case 2:
                return b((g) obj);
            default:
                return e((d0) obj);
        }
    }
}
