package z;

import androidx.camera.core.impl.z0;
import java.util.Iterator;
import java.util.List;
import kh2.m0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f140499a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f140500b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f140501c;

    public final void a(List list) {
        if ((this.f140499a || this.f140500b || this.f140501c) && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((z0) it.next()).a();
            }
            m0.p("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
