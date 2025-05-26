package a;

import ads_mobile_sdk.eg0;
import ads_mobile_sdk.fe2;
import ads_mobile_sdk.tg0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class td extends tg0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(eg0 flagDataStore, fe2 sdkCoreDataStore, ads_mobile_sdk.jf appSettingsDataStore) {
        super(flagDataStore, sdkCoreDataStore, appSettingsDataStore);
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        Intrinsics.checkNotNullParameter(sdkCoreDataStore, "sdkCoreDataStore");
        Intrinsics.checkNotNullParameter(appSettingsDataStore, "appSettingsDataStore");
    }
}
