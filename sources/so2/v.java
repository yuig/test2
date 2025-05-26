package so2;

import java.util.Map;
import kh2.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v extends q {

    /* renamed from: h, reason: collision with root package name */
    public String f114823h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f114824i;

    @Override // so2.q, so2.c
    public final ro2.n L() {
        return new ro2.c0((Map) this.f114808g);
    }

    @Override // so2.q, so2.c
    public final void M(String key, ro2.n element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!this.f114824i) {
            Map map = (Map) this.f114808g;
            String str = this.f114823h;
            if (str == null) {
                Intrinsics.r("tag");
                throw null;
            }
            map.put(str, element);
            this.f114824i = true;
            return;
        }
        if (element instanceof ro2.h0) {
            this.f114823h = ((ro2.h0) element).b();
            this.f114824i = false;
        } else {
            if (element instanceof ro2.c0) {
                throw j1.g(ro2.f0.f108987b);
            }
            if (!(element instanceof ro2.e)) {
                throw new NoWhenBranchMatchedException();
            }
            throw j1.g(ro2.h.f108992b);
        }
    }
}
