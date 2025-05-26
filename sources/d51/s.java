package d51;

import kh2.b0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import wt1.e0;
import yk1.v;

/* loaded from: classes5.dex */
public final class s extends e0 implements nr0.j {

    /* renamed from: h */
    public final c51.e f53720h;

    /* renamed from: i */
    public final boolean f53721i;

    /* renamed from: j */
    public final e51.b f53722j;

    /* renamed from: k */
    public v31.f f53723k;

    public s(c51.e profileSavedTabListener, boolean z13, v viewResources) {
        Intrinsics.checkNotNullParameter(profileSavedTabListener, "profileSavedTabListener");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        this.f53720h = profileSavedTabListener;
        this.f53721i = z13;
        yk1.a aVar = (yk1.a) viewResources;
        e51.b bVar = new e51.b(aVar.f139224a.getString(x0.library_empty_feed_me), new b41.c(1, aVar.f139224a.getString(nz1.f.empty_profile_find_ideas), new r(this, 0)), true);
        this.f53722j = bVar;
        this.f53723k = new v31.f(b0.Z(viewResources, new r(this, 1)));
        o(55, new e51.a());
        o(1234567, new v31.g());
        g(0, z13 ? this.f53723k : bVar);
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        if (i13 == 55 || i13 == 1234567) {
            return true;
        }
        return this instanceof ah1.a;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return this.f53721i ? 1234567 : 55;
    }

    @Override // wt1.e0, wt1.b
    public final void n() {
        clear();
        if (((g51.n) this.f53720h).S3()) {
            g(0, this.f53721i ? this.f53723k : this.f53722j);
        }
        super.n();
    }
}
