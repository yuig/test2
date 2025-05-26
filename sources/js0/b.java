package js0;

import com.pinterest.hairball.network.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class b extends e {
    @Override // com.pinterest.hairball.network.e
    public final com.pinterest.hairball.network.d getBuilder(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new qx.b(this, params);
    }
}
