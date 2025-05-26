package ny;

import ey.b2;
import ey.u1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends u1 implements b2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f92510c;

    /* renamed from: d, reason: collision with root package name */
    public final String f92511d;

    public b(String _parentMetricName, int i13) {
        this.f92510c = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(_parentMetricName, "_parentMetricName");
            this.f92511d = _parentMetricName;
        } else {
            Intrinsics.checkNotNullParameter(_parentMetricName, "_parentMetricName");
            this.f92511d = _parentMetricName;
        }
    }

    @Override // ey.u1
    public final String e() {
        switch (this.f92510c) {
            case 0:
                return "api_conn_warmup";
            default:
                return "image_conn_warmup";
        }
    }

    @Override // ey.u1
    public final String g() {
        return this.f92511d;
    }
}
