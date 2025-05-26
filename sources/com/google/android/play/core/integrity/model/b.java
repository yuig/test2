package com.google.android.play.core.integrity.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f33498a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f33499b;

    static {
        HashMap hashMap = new HashMap();
        f33498a = hashMap;
        HashMap hashMap2 = new HashMap();
        f33499b = hashMap2;
        hashMap.put(-1, "Standard Integrity API is not available.\nStandard Integrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure to be allowlisted to use Standard Integrity API.\n2) Make sure that Integrity API is enabled in Google Play Console.\n3) Ask the user to update Play Store.\n");
        hashMap.put(-2, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
        hashMap.put(-3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n");
        hashMap.put(-5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        hashMap.put(-6, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n");
        hashMap.put(-7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        hashMap.put(-8, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n");
        hashMap.put(-9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
        hashMap.put(-12, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        hashMap.put(-14, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
        hashMap.put(-15, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n");
        hashMap.put(-16, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
        hashMap.put(-17, "The provided request hash is too long. The request hash length must be less than 500 bytes.\nRetry with a shorter request hash.");
        hashMap.put(-18, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
        hashMap.put(-19, "The StandardIntegrityTokenProvider is invalid (e.g. it is outdated).\nRequest a new integrity token provider by calling StandardIntegrityManager#prepareIntegrityToken.");
        hashMap.put(-100, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        hashMap2.put(-1, "API_NOT_AVAILABLE");
        hashMap2.put(-3, "NETWORK_ERROR");
        hashMap2.put(-2, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-14, "PLAY_STORE_VERSION_OUTDATED");
        hashMap2.put(-5, "APP_NOT_INSTALLED");
        hashMap2.put(-6, "PLAY_SERVICES_NOT_FOUND");
        hashMap2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        hashMap2.put(-7, "APP_UID_MISMATCH");
        hashMap2.put(-8, "TOO_MANY_REQUESTS");
        hashMap2.put(-9, "CANNOT_BIND_TO_SERVICE");
        hashMap2.put(-16, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        hashMap2.put(-17, "REQUEST_HASH_TOO_LONG");
        hashMap2.put(-12, "GOOGLE_SERVER_UNAVAILABLE");
        hashMap2.put(-18, "CLIENT_TRANSIENT_ERROR");
        hashMap2.put(-19, "INTEGRITY_TOKEN_PROVIDER_INVALID");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i13) {
        Map map = f33498a;
        Integer valueOf = Integer.valueOf(i13);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        Map map2 = f33499b;
        return !map2.containsKey(valueOf) ? "" : a.a.l((String) map.get(valueOf), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#", (String) map2.get(valueOf), ")");
    }
}
