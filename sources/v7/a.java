package v7;

import android.net.Uri;
import android.os.SystemClock;
import d7.n0;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f124231a;

    public a(c cVar) {
        this.f124231a = cVar;
    }

    @Override // v7.r
    public final boolean b(Uri uri, k0.a aVar, boolean z13) {
        HashMap hashMap;
        b bVar;
        c cVar = this.f124231a;
        if (cVar.f124257m == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            n nVar = cVar.f124255k;
            int i13 = n0.f53866a;
            List list = nVar.f124332e;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int size = list.size();
                hashMap = cVar.f124248d;
                if (i14 >= size) {
                    break;
                }
                b bVar2 = (b) hashMap.get(((m) list.get(i14)).f124324a);
                if (bVar2 != null && elapsedRealtime < bVar2.f124239h) {
                    i15++;
                }
                i14++;
            }
            l8.q v13 = cVar.f124247c.v(new l8.p(1, 0, cVar.f124255k.f124332e.size(), i15), aVar);
            if (v13 != null && v13.f82080b == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, v13.f82081c);
            }
        }
        return false;
    }

    @Override // v7.r
    public final void d() {
        this.f124231a.f124249e.remove(this);
    }
}
