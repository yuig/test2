package ac2;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class u extends j7.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, OkHttpClient okHttpClient) {
        super(okHttpClient);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f74832c = w.a(context);
        c((Map) w.f2069d.getValue());
    }
}
