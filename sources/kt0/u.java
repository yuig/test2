package kt0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.z1;
import so.oa;

/* loaded from: classes5.dex */
public final /* synthetic */ class u implements wk2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80858a;

    public /* synthetic */ u(int i13) {
        this.f80858a = i13;
    }

    @Override // wk2.a
    public final Object get() {
        switch (this.f80858a) {
            case 0:
                return (ScreenLocation) z1.f51668e.getValue();
            case 1:
                return (ScreenLocation) z1.f51670g.getValue();
            case 2:
                return (ScreenLocation) z1.f51664a.getValue();
            case 3:
                r41.k kVar = r41.k.f106176a;
                return ((oa) ((r41.c) r41.k.f106177b.getValue())).G2();
            default:
                r41.k kVar2 = r41.k.f106176a;
                return ((oa) ((r41.c) r41.k.f106177b.getValue())).l2();
        }
    }
}
