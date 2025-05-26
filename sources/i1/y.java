package i1;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70937i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f70938j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(List list, int i13) {
        super(1);
        this.f70937i = i13;
        this.f70938j = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70937i;
        List pieceDisplayStates = this.f70938j;
        switch (i13) {
            case 0:
                q3.b1 b1Var = (q3.b1) obj;
                int size = pieceDisplayStates.size();
                for (int i14 = 0; i14 < size; i14++) {
                    q3.b1.d(b1Var, (q3.c1) pieceDisplayStates.get(i14), 0, 0);
                }
                return Unit.f80348a;
            case 1:
                int size2 = pieceDisplayStates.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    ((Function1) pieceDisplayStates.get(i15)).invoke(obj);
                }
                return Unit.f80348a;
            case 2:
                ni1.u0 it = (ni1.u0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ni1.u0.e(it, 0, null, null, false, new ni1.r0(pieceDisplayStates), null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 2097119);
            case 3:
                ck1.a state = (ck1.a) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                state.getClass();
                Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
                return new ck1.a(pieceDisplayStates);
            case 4:
                h32.y1 update = (h32.y1) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67459q = pieceDisplayStates;
                return Unit.f80348a;
            case 5:
                gk1.l it2 = (gk1.l) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return gk1.l.e(it2, null, new gk1.j((oi1.u) ((Pair) CollectionsKt.b0(pieceDisplayStates)).f80346a, ((Boolean) ((Pair) CollectionsKt.b0(pieceDisplayStates)).f80347b).booleanValue()), null, 5);
            case 6:
                gk1.x0 it3 = (gk1.x0) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return gk1.x0.b(it3, false, false, false, null, 0, false, null, null, false, null, false, this.f70938j, false, false, false, null, null, false, false, null, -536870913, 255);
            default:
                tn1.b it4 = (tn1.b) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return tn1.b.a(it4, null, null, this.f70938j, null, 11);
        }
    }
}
