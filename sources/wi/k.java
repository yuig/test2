package wi;

import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f129954a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f129955b;

    /* renamed from: c, reason: collision with root package name */
    public final String f129956c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f129957d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f129958e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f129959f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f129960g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f129961h;

    /* renamed from: i, reason: collision with root package name */
    public final String f129962i;

    /* renamed from: j, reason: collision with root package name */
    public final String f129963j;

    public k(String str, LinkedHashSet categoryExclusions, LinkedHashMap customTargeting, Bundle googleExtrasBundle, HashSet keywords, HashSet neighboringContentUrls, LinkedHashMap adSourceExtrasBundles, String str2) {
        Intrinsics.checkNotNullParameter(categoryExclusions, "categoryExclusions");
        Intrinsics.checkNotNullParameter(customTargeting, "customTargeting");
        Intrinsics.checkNotNullParameter(googleExtrasBundle, "googleExtrasBundle");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        Intrinsics.checkNotNullParameter(neighboringContentUrls, "neighboringContentUrls");
        Intrinsics.checkNotNullParameter(adSourceExtrasBundles, "adSourceExtrasBundles");
        this.f129954a = str;
        this.f129955b = categoryExclusions;
        this.f129956c = null;
        this.f129957d = customTargeting;
        this.f129958e = googleExtrasBundle;
        this.f129959f = keywords;
        this.f129960g = neighboringContentUrls;
        this.f129961h = adSourceExtrasBundles;
        this.f129962i = null;
        this.f129963j = str2;
    }

    public String l() {
        return this.f129954a;
    }
}
