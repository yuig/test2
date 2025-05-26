package com.bugsnag.android;

import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ MediaRouter2.ControllerCallback i(Object obj) {
        return (MediaRouter2.ControllerCallback) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRouter2 j(Object obj) {
        return (MediaRouter2) obj;
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder k(pk.v2 v2Var) {
        return new RouteDiscoveryPreference.Builder(v2Var, false);
    }

    public static /* synthetic */ void p() {
    }
}
