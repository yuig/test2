package fn2;

import am2.i1;
import dm2.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.g0;

/* loaded from: classes2.dex */
public final class a implements wn2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f62724a = new a();

    @Override // wn2.a
    public final Iterable a(Object obj) {
        int i13 = d.f62727a;
        Collection h10 = ((b1) ((i1) obj)).h();
        ArrayList arrayList = new ArrayList(g0.q(h10, 10));
        Iterator it = ((ArrayList) h10).iterator();
        while (it.hasNext()) {
            arrayList.add(((b1) ((i1) it.next())).o0());
        }
        return arrayList;
    }
}
