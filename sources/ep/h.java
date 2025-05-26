package ep;

import com.pinterest.api.model.BoardInviteFeed;
import com.pinterest.api.model.k8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kh2.r;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class h extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final h f59880i = new h(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13;
        int i14;
        List contactRequestFeed = (List) obj;
        BoardInviteFeed boardInvites = (BoardInviteFeed) obj2;
        Intrinsics.checkNotNullParameter(contactRequestFeed, "contactRequestFeed");
        Intrinsics.checkNotNullParameter(boardInvites, "boardInvites");
        ArrayList arrayList = new ArrayList();
        int size = contactRequestFeed.size();
        int size2 = boardInvites.q().size();
        if (size > 0 || size2 > 0) {
            int i15 = 0;
            if (size > 0) {
                i13 = 0;
                for (z40.f fVar : contactRequestFeed.subList(0, Math.min(size, 1))) {
                    if (!r.W0(fVar)) {
                        arrayList.add(new pb2.c(fVar));
                        i13++;
                    }
                }
                for (z40.f fVar2 : contactRequestFeed.subList(0, Math.min(size, 1))) {
                    if (r.W0(fVar2)) {
                        arrayList.add(new pb2.b(fVar2));
                        i13++;
                    }
                }
            } else {
                i13 = 0;
            }
            if (i13 < 1 && size2 > 0) {
                for (k8 k8Var : boardInvites.q().subList(0, Math.min(size2, 1 - i13))) {
                    Intrinsics.f(k8Var);
                    arrayList.add(new pb2.a(k8Var));
                }
            }
            if (size + size2 > 1) {
                List list = contactRequestFeed;
                boolean z13 = list instanceof Collection;
                if (z13 && list.isEmpty()) {
                    i14 = 0;
                } else {
                    Iterator it = list.iterator();
                    i14 = 0;
                    while (it.hasNext()) {
                        if ((!r.W0((z40.f) it.next())) && (i14 = i14 + 1) < 0) {
                            f0.o();
                            throw null;
                        }
                    }
                }
                if (!z13 || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (r.W0((z40.f) it2.next()) && (i15 = i15 + 1) < 0) {
                            f0.o();
                            throw null;
                        }
                    }
                }
                arrayList.add(new pb2.j(size2 + i15, i14));
            }
        }
        return arrayList;
    }
}
