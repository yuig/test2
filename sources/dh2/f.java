package dh2;

import android.content.Context;
import jg2.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xk2.k;
import xk2.m;

/* loaded from: classes4.dex */
public enum f {
    PAYLOAD("embrace_payloads"),
    CACHE("embrace_cache"),
    NATIVE("embrace_native"),
    ENVELOPE("embrace_envelopes");


    @NotNull
    private final String dir;

    f(String str) {
        this.dir = str;
    }

    @NotNull
    public final k asFile(@NotNull Context ctx, @NotNull lh2.b logger) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return m.b(new h(ctx, this, logger, 4));
    }
}
