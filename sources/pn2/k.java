package pn2;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100808i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f100809j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i13) {
        super(1);
        this.f100808i = i13;
        this.f100809j = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection c13;
        int i13 = this.f100808i;
        l currentTypeConstructor = this.f100809j;
        switch (i13) {
            case 0:
                b1 it = (b1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                currentTypeConstructor.getClass();
                l lVar = it instanceof l ? (l) it : null;
                if (lVar != null) {
                    c13 = CollectionsKt.l0(lVar.i(), ((i) lVar.f100814b.invoke()).f100797a);
                } else {
                    c13 = it.c();
                    Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
                }
                break;
            case 1:
                b0 it2 = (b0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                currentTypeConstructor.o(it2);
                break;
            default:
                i supertypes = (i) obj;
                Intrinsics.checkNotNullParameter(supertypes, "supertypes");
                am2.a1 j13 = currentTypeConstructor.j();
                Collection superTypes = supertypes.f100797a;
                k neighbors = new k(currentTypeConstructor, 0);
                k reportLoop = new k(currentTypeConstructor, 1);
                ((am2.z0) j13).getClass();
                Intrinsics.checkNotNullParameter(currentTypeConstructor, "currentTypeConstructor");
                Intrinsics.checkNotNullParameter(superTypes, "superTypes");
                Intrinsics.checkNotNullParameter(neighbors, "neighbors");
                Intrinsics.checkNotNullParameter(reportLoop, "reportLoop");
                boolean isEmpty = superTypes.isEmpty();
                Collection collection = superTypes;
                if (isEmpty) {
                    b0 g13 = currentTypeConstructor.g();
                    Collection b13 = g13 != null ? kotlin.collections.e0.b(g13) : null;
                    if (b13 == null) {
                        b13 = kotlin.collections.q0.f80391a;
                    }
                    collection = b13;
                }
                List list = collection instanceof List ? (List) collection : null;
                if (list == null) {
                    list = CollectionsKt.F0(collection);
                }
                List n13 = currentTypeConstructor.n(list);
                Intrinsics.checkNotNullParameter(n13, "<set-?>");
                supertypes.f100798b = n13;
                break;
        }
        return Unit.f80348a;
    }
}
