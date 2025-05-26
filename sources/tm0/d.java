package tm0;

import com.pinterest.api.model.v7;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import o82.z;
import om0.n;
import qm0.a2;
import qm0.c2;

/* loaded from: classes5.dex */
public final class d implements z {

    /* renamed from: a, reason: collision with root package name */
    public final n f118127a;

    public d(n collaborators) {
        Intrinsics.checkNotNullParameter(collaborators, "collaborators");
        this.f118127a = collaborators;
    }

    @Override // o82.z
    public final ArrayList a(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList(g0.q(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            qm0.a aVar = (qm0.a) it.next();
            if (!(aVar instanceof a2)) {
                if (!(aVar instanceof c2)) {
                    throw new NoWhenBranchMatchedException();
                }
                v7 board = ((c2) aVar).f104253a;
                Intrinsics.checkNotNullParameter(board, "board");
                n collaboratorState = this.f118127a;
                Intrinsics.checkNotNullParameter(collaboratorState, "collaboratorState");
                aVar = new c2(board, collaboratorState);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && Intrinsics.d(((d) obj).f118127a, this.f118127a);
    }

    public final int hashCode() {
        return this.f118127a.hashCode();
    }
}
