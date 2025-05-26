package un0;

import h32.d4;
import h32.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import wt1.c0;
import wt1.p;
import x40.b7;
import x40.c7;
import x40.f7;
import x40.g7;
import x40.h7;
import x40.i7;
import x40.j7;
import x40.k7;
import x40.l7;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f122819j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f122820k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f122821l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f122822m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f122823n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f122824o = new b(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122825i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f122825i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b7 b7Var;
        c7 c7Var;
        i7 i7Var;
        List list;
        f7 f7Var;
        switch (this.f122825i) {
            case 0:
                h0 update = (h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67042a = d4.ACTION_SHEET;
                return Unit.f80348a;
            case 1:
                pc.h response = (pc.h) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                l7 l7Var = (l7) response.f99563c;
                ArrayList arrayList = null;
                if (l7Var != null && (b7Var = l7Var.f132705a) != null) {
                    Intrinsics.checkNotNullParameter(b7Var, "<this>");
                    k7 k7Var = b7Var instanceof k7 ? (k7) b7Var : null;
                    if (k7Var != null && (c7Var = k7Var.f132668e) != null) {
                        Intrinsics.checkNotNullParameter(c7Var, "<this>");
                        j7 j7Var = c7Var instanceof j7 ? (j7) c7Var : null;
                        if (j7Var != null && (i7Var = j7Var.f132594b) != null && (list = i7Var.f132543a) != null) {
                            ArrayList Q = CollectionsKt.Q(list);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = Q.iterator();
                            while (it.hasNext()) {
                                g7 g7Var = ((h7) it.next()).f132491a;
                                if (g7Var == null || (f7Var = g7Var.f132436e) == null) {
                                    f7Var = null;
                                } else {
                                    Intrinsics.checkNotNullParameter(f7Var, "<this>");
                                }
                                if (f7Var != null) {
                                    arrayList2.add(f7Var);
                                }
                            }
                            arrayList = arrayList2;
                        }
                    }
                }
                return arrayList == null ? q0.f80391a : arrayList;
            case 2:
                return Unit.f80348a;
            case 3:
                return Unit.f80348a;
            case 4:
                c0 it2 = (c0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(it2 instanceof p);
            default:
                return Unit.f80348a;
        }
    }
}
