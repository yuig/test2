package org.chromium.support_lib_boundary;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public interface StaticsBoundaryInterface {
    Uri getSafeBrowsingPrivacyPolicyUrl();

    String getVariationsHeader();

    void initSafeBrowsing(Context context, ValueCallback<Boolean> valueCallback);

    boolean isMultiProcessEnabled();

    void setDefaultTrafficStatsTag(int i13);

    void setDefaultTrafficStatsUid(int i13);

    void setSafeBrowsingAllowlist(Set<String> set, ValueCallback<Boolean> valueCallback);

    void setSafeBrowsingWhitelist(List<String> list, ValueCallback<Boolean> valueCallback);
}
