package org.chromium.support_lib_boundary;

import java.util.Set;

/* loaded from: classes4.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z13);

    void setAllowFileAccess(boolean z13);

    void setBlockNetworkLoads(boolean z13);

    void setCacheMode(int i13);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
