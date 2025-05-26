package wi;

import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class h extends k {

    /* renamed from: k, reason: collision with root package name */
    public final String f129942k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String adUnitId, LinkedHashSet categoryExclusions, LinkedHashMap customTargeting, Bundle googleExtrasBundle, HashSet keywords, HashSet neighboringContentUrls, LinkedHashMap adSourceExtrasBundles, String str) {
        super(adUnitId, categoryExclusions, customTargeting, googleExtrasBundle, keywords, neighboringContentUrls, adSourceExtrasBundles, str);
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(categoryExclusions, "categoryExclusions");
        Intrinsics.checkNotNullParameter(customTargeting, "customTargeting");
        Intrinsics.checkNotNullParameter(googleExtrasBundle, "googleExtrasBundle");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        Intrinsics.checkNotNullParameter(neighboringContentUrls, "neighboringContentUrls");
        Intrinsics.checkNotNullParameter(adSourceExtrasBundles, "adSourceExtrasBundles");
        this.f129942k = adUnitId;
    }

    @Override // wi.k
    public final String l() {
        return this.f129942k;
    }
}
