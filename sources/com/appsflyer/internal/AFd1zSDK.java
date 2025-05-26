package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class AFd1zSDK {
    public static Uri s_(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1cSDK aFj1cSDK = new AFj1cSDK(intent);
        Uri uri = (Uri) aFj1cSDK.J_("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String monetizationNetwork = aFj1cSDK.getMonetizationNetwork("android.intent.extra.REFERRER_NAME");
        if (monetizationNetwork != null) {
            return Uri.parse(monetizationNetwork);
        }
        return null;
    }
}
