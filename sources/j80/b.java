package j80;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f74929a = new LinkedHashMap();

    public final int a(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Integer num = (Integer) this.f74929a.get(pin.getUid());
        return num != null ? num.intValue() : b40.z(pin);
    }

    public final void b(int i13, String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f74929a.put(pin, Integer.valueOf(i13));
    }
}
