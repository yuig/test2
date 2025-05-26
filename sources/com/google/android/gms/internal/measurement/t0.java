package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes.dex */
public interface t0 extends IInterface {
    void beginAdUnitExposure(String str, long j13);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j13);

    void endAdUnitExposure(String str, long j13);

    void generateEventId(u0 u0Var);

    void getAppInstanceId(u0 u0Var);

    void getCachedAppInstanceId(u0 u0Var);

    void getConditionalUserProperties(String str, String str2, u0 u0Var);

    void getCurrentScreenClass(u0 u0Var);

    void getCurrentScreenName(u0 u0Var);

    void getGmpAppId(u0 u0Var);

    void getMaxUserProperties(String str, u0 u0Var);

    void getSessionId(u0 u0Var);

    void getTestFlag(u0 u0Var, int i13);

    void getUserProperties(String str, String str2, boolean z13, u0 u0Var);

    void initForTests(Map map);

    void initialize(rh.a aVar, zzdd zzddVar, long j13);

    void isDataCollectionEnabled(u0 u0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z13, boolean z14, long j13);

    void logEventAndBundle(String str, String str2, Bundle bundle, u0 u0Var, long j13);

    void logHealthData(int i13, String str, rh.a aVar, rh.a aVar2, rh.a aVar3);

    void onActivityCreated(rh.a aVar, Bundle bundle, long j13);

    void onActivityDestroyed(rh.a aVar, long j13);

    void onActivityPaused(rh.a aVar, long j13);

    void onActivityResumed(rh.a aVar, long j13);

    void onActivitySaveInstanceState(rh.a aVar, u0 u0Var, long j13);

    void onActivityStarted(rh.a aVar, long j13);

    void onActivityStopped(rh.a aVar, long j13);

    void performAction(Bundle bundle, u0 u0Var, long j13);

    void registerOnMeasurementEventListener(x0 x0Var);

    void resetAnalyticsData(long j13);

    void setConditionalUserProperty(Bundle bundle, long j13);

    void setConsent(Bundle bundle, long j13);

    void setConsentThirdParty(Bundle bundle, long j13);

    void setCurrentScreen(rh.a aVar, String str, String str2, long j13);

    void setDataCollectionEnabled(boolean z13);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(x0 x0Var);

    void setInstanceIdProvider(y0 y0Var);

    void setMeasurementEnabled(boolean z13, long j13);

    void setMinimumSessionDuration(long j13);

    void setSessionTimeoutDuration(long j13);

    void setUserId(String str, long j13);

    void setUserProperty(String str, String str2, rh.a aVar, boolean z13, long j13);

    void unregisterOnMeasurementEventListener(x0 x0Var);
}
