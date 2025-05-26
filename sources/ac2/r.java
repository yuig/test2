package ac2;

import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public final class r extends i7.d {
    public final g7.s D;
    public final LinkedHashMap E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g7.s defaultRequestProperties, CronetEngine cronetEngine, Executor executor, String str) {
        super(32768, defaultRequestProperties, str, executor, cronetEngine);
        Intrinsics.checkNotNullParameter(defaultRequestProperties, "defaultRequestProperties");
        Intrinsics.checkNotNullParameter(cronetEngine, "cronetEngine");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.D = defaultRequestProperties;
        this.E = new LinkedHashMap();
    }
}
