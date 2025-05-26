package com.pinterest.adFormatsLibrary.analytics.logger;

import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "Lcom/pinterest/analytics/kibana/e;", "Lwr/b;", "adFormatKey", "Lwr/b;", "getAdFormatKey", "()Lwr/b;", "<init>", "(Lwr/b;)V", "adFormatsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class BaseAdsPayload implements e {

    @b("ad_formats_key")
    @NotNull
    private final wr.b adFormatKey;

    public BaseAdsPayload(@NotNull wr.b adFormatKey) {
        Intrinsics.checkNotNullParameter(adFormatKey, "adFormatKey");
        this.adFormatKey = adFormatKey;
    }

    @NotNull
    public wr.b getAdFormatKey() {
        return this.adFormatKey;
    }
}
