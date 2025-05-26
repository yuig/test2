package ae;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class o implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f15024a;

    public o(s sVar) {
        this.f15024a = sVar;
    }

    @Override // ae.a
    public final void a(boolean z13) {
        ArrayList arrayList;
        he.n.a();
        synchronized (this.f15024a) {
            arrayList = new ArrayList((Set) this.f15024a.f15034d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z13);
        }
    }
}
