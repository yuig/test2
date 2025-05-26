package ac2;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends j7.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, vu1.a0 networkClient) {
        super(networkClient);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        this.f74832c = w.a(context);
        c((Map) w.f2069d.getValue());
    }
}
