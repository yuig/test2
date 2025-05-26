package kt;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.f;
import kotlin.jvm.internal.Intrinsics;
import nl1.d;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final il1.a f80789a;

    public a(il1.a fragmentFactory) {
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        this.f80789a = fragmentFactory;
    }

    public final d a() {
        return (d) this.f80789a.e(f.a());
    }

    public final d b() {
        return (d) this.f80789a.e((ScreenLocation) f.f50743e.getValue());
    }
}
