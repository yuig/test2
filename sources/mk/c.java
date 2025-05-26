package mk;

import com.google.android.gms.internal.measurement.x;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f87303c;

    /* renamed from: a, reason: collision with root package name */
    public final Integer f87304a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f87305b;

    static {
        x xVar = new x(9);
        xVar.f31694b = new HashMap();
        f87303c = xVar.x();
    }

    public c(Integer num, Map map) {
        this.f87304a = num;
        this.f87305b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f87304a;
            if (num != null ? num.equals(cVar.f87304a) : cVar.f87304a == null) {
                if (this.f87305b.equals(cVar.f87305b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f87304a;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f87305b.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.f87304a + ", splitInstallErrorCodeByModule=" + String.valueOf(this.f87305b) + "}";
    }
}
