package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class v0 extends ai.a implements t0 {
    @Override // com.google.android.gms.internal.measurement.t0
    public final void beginAdUnitExposure(String str, long j13) {
        Parcel j14 = j();
        j14.writeString(str);
        j14.writeLong(j13);
        H(j14, 23);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel j13 = j();
        j13.writeString(str);
        j13.writeString(str2);
        h0.c(j13, bundle);
        H(j13, 9);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void endAdUnitExposure(String str, long j13) {
        Parcel j14 = j();
        j14.writeString(str);
        j14.writeLong(j13);
        H(j14, 24);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void generateEventId(u0 u0Var) {
        Parcel j13 = j();
        h0.b(j13, u0Var);
        H(j13, 22);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void getCachedAppInstanceId(u0 u0Var) {
        Parcel j13 = j();
        h0.b(j13, u0Var);
        H(j13, 19);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void getConditionalUserProperties(String str, String str2, u0 u0Var) {
        Parcel j13 = j();
        j13.writeString(str);
        j13.writeString(str2);
        h0.b(j13, u0Var);
        H(j13, 10);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void getCurrentScreenClass(u0 u0Var) {
        Parcel j13 = j();
        h0.b(j13, u0Var);
        H(j13, 17);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void getCurrentScreenName(u0 u0Var) {
        Parcel j13 = j();
        h0.b(j13, u0Var);
        H(j13, 16);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void getGmpAppId(u0 u0Var) {
        Parcel j13 = j();
        h0.b(j13, u0Var);
        H(j13, 21);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void getMaxUserProperties(String str, u0 u0Var) {
        Parcel j13 = j();
        j13.writeString(str);
        h0.b(j13, u0Var);
        H(j13, 6);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void getUserProperties(String str, String str2, boolean z13, u0 u0Var) {
        Parcel j13 = j();
        j13.writeString(str);
        j13.writeString(str2);
        ClassLoader classLoader = h0.f31413a;
        j13.writeInt(z13 ? 1 : 0);
        h0.b(j13, u0Var);
        H(j13, 5);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void initialize(rh.a aVar, zzdd zzddVar, long j13) {
        Parcel j14 = j();
        h0.b(j14, aVar);
        h0.c(j14, zzddVar);
        j14.writeLong(j13);
        H(j14, 1);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z13, boolean z14, long j13) {
        Parcel j14 = j();
        j14.writeString(str);
        j14.writeString(str2);
        h0.c(j14, bundle);
        j14.writeInt(z13 ? 1 : 0);
        j14.writeInt(z14 ? 1 : 0);
        j14.writeLong(j13);
        H(j14, 2);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void logHealthData(int i13, String str, rh.a aVar, rh.a aVar2, rh.a aVar3) {
        Parcel j13 = j();
        j13.writeInt(i13);
        j13.writeString(str);
        h0.b(j13, aVar);
        h0.b(j13, aVar2);
        h0.b(j13, aVar3);
        H(j13, 33);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void onActivityCreated(rh.a aVar, Bundle bundle, long j13) {
        Parcel j14 = j();
        h0.b(j14, aVar);
        h0.c(j14, bundle);
        j14.writeLong(j13);
        H(j14, 27);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void onActivityDestroyed(rh.a aVar, long j13) {
        Parcel j14 = j();
        h0.b(j14, aVar);
        j14.writeLong(j13);
        H(j14, 28);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void onActivityPaused(rh.a aVar, long j13) {
        Parcel j14 = j();
        h0.b(j14, aVar);
        j14.writeLong(j13);
        H(j14, 29);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void onActivityResumed(rh.a aVar, long j13) {
        Parcel j14 = j();
        h0.b(j14, aVar);
        j14.writeLong(j13);
        H(j14, 30);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void onActivitySaveInstanceState(rh.a aVar, u0 u0Var, long j13) {
        Parcel j14 = j();
        h0.b(j14, aVar);
        h0.b(j14, u0Var);
        j14.writeLong(j13);
        H(j14, 31);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void onActivityStarted(rh.a aVar, long j13) {
        Parcel j14 = j();
        h0.b(j14, aVar);
        j14.writeLong(j13);
        H(j14, 25);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void onActivityStopped(rh.a aVar, long j13) {
        Parcel j14 = j();
        h0.b(j14, aVar);
        j14.writeLong(j13);
        H(j14, 26);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void setConditionalUserProperty(Bundle bundle, long j13) {
        Parcel j14 = j();
        h0.c(j14, bundle);
        j14.writeLong(j13);
        H(j14, 8);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void setConsentThirdParty(Bundle bundle, long j13) {
        Parcel j14 = j();
        h0.c(j14, bundle);
        j14.writeLong(j13);
        H(j14, 45);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void setCurrentScreen(rh.a aVar, String str, String str2, long j13) {
        Parcel j14 = j();
        h0.b(j14, aVar);
        j14.writeString(str);
        j14.writeString(str2);
        j14.writeLong(j13);
        H(j14, 15);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void setDataCollectionEnabled(boolean z13) {
        Parcel j13 = j();
        ClassLoader classLoader = h0.f31413a;
        j13.writeInt(z13 ? 1 : 0);
        H(j13, 39);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void setUserProperty(String str, String str2, rh.a aVar, boolean z13, long j13) {
        Parcel j14 = j();
        j14.writeString(str);
        j14.writeString(str2);
        h0.b(j14, aVar);
        j14.writeInt(z13 ? 1 : 0);
        j14.writeLong(j13);
        H(j14, 4);
    }
}
