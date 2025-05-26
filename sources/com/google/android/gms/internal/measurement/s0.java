package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class s0 extends i0 implements t0 {
    public static t0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof t0 ? (t0) queryLocalInterface : new v0(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 2);
    }

    @Override // com.google.android.gms.internal.measurement.i0
    public final boolean j(int i13, Parcel parcel, Parcel parcel2) {
        boolean z13;
        u0 u0Var = null;
        u0 u0Var2 = null;
        u0 u0Var3 = null;
        u0 u0Var4 = null;
        x0 x0Var = null;
        x0 x0Var2 = null;
        x0 x0Var3 = null;
        u0 u0Var5 = null;
        u0 u0Var6 = null;
        u0 u0Var7 = null;
        u0 u0Var8 = null;
        u0 u0Var9 = null;
        u0 u0Var10 = null;
        y0 y0Var = null;
        u0 u0Var11 = null;
        u0 u0Var12 = null;
        u0 u0Var13 = null;
        u0 u0Var14 = null;
        u0 u0Var15 = null;
        switch (i13) {
            case 1:
                rh.a D = rh.b.D(parcel.readStrongBinder());
                zzdd zzddVar = (zzdd) h0.a(parcel, zzdd.CREATOR);
                long readLong = parcel.readLong();
                h0.d(parcel);
                initialize(D, zzddVar, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) h0.a(parcel, Bundle.CREATOR);
                boolean z14 = parcel.readInt() != 0;
                boolean z15 = parcel.readInt() != 0;
                long readLong2 = parcel.readLong();
                h0.d(parcel);
                logEvent(readString, readString2, bundle, z14, z15, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) h0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var = queryLocalInterface instanceof u0 ? (u0) queryLocalInterface : new w0(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                h0.d(parcel);
                logEventAndBundle(readString3, readString4, bundle2, u0Var, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                rh.a D2 = rh.b.D(parcel.readStrongBinder());
                ClassLoader classLoader = h0.f31413a;
                boolean z16 = parcel.readInt() != 0;
                long readLong4 = parcel.readLong();
                h0.d(parcel);
                setUserProperty(readString5, readString6, D2, z16, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = h0.f31413a;
                z13 = parcel.readInt() != 0;
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var15 = queryLocalInterface2 instanceof u0 ? (u0) queryLocalInterface2 : new w0(readStrongBinder2);
                }
                h0.d(parcel);
                getUserProperties(readString7, readString8, z13, u0Var15);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var14 = queryLocalInterface3 instanceof u0 ? (u0) queryLocalInterface3 : new w0(readStrongBinder3);
                }
                h0.d(parcel);
                getMaxUserProperties(readString9, u0Var14);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                h0.d(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) h0.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                h0.d(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) h0.a(parcel, Bundle.CREATOR);
                h0.d(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var13 = queryLocalInterface4 instanceof u0 ? (u0) queryLocalInterface4 : new w0(readStrongBinder4);
                }
                h0.d(parcel);
                getConditionalUserProperties(readString13, readString14, u0Var13);
                break;
            case 11:
                ClassLoader classLoader3 = h0.f31413a;
                z13 = parcel.readInt() != 0;
                long readLong7 = parcel.readLong();
                h0.d(parcel);
                setMeasurementEnabled(z13, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                h0.d(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                h0.d(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                h0.d(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                rh.a D3 = rh.b.D(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                h0.d(parcel);
                setCurrentScreen(D3, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var12 = queryLocalInterface5 instanceof u0 ? (u0) queryLocalInterface5 : new w0(readStrongBinder5);
                }
                h0.d(parcel);
                getCurrentScreenName(u0Var12);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var11 = queryLocalInterface6 instanceof u0 ? (u0) queryLocalInterface6 : new w0(readStrongBinder6);
                }
                h0.d(parcel);
                getCurrentScreenClass(u0Var11);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    y0Var = queryLocalInterface7 instanceof y0 ? (y0) queryLocalInterface7 : new a1(readStrongBinder7);
                }
                h0.d(parcel);
                setInstanceIdProvider(y0Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var10 = queryLocalInterface8 instanceof u0 ? (u0) queryLocalInterface8 : new w0(readStrongBinder8);
                }
                h0.d(parcel);
                getCachedAppInstanceId(u0Var10);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var9 = queryLocalInterface9 instanceof u0 ? (u0) queryLocalInterface9 : new w0(readStrongBinder9);
                }
                h0.d(parcel);
                getAppInstanceId(u0Var9);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var8 = queryLocalInterface10 instanceof u0 ? (u0) queryLocalInterface10 : new w0(readStrongBinder10);
                }
                h0.d(parcel);
                getGmpAppId(u0Var8);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var7 = queryLocalInterface11 instanceof u0 ? (u0) queryLocalInterface11 : new w0(readStrongBinder11);
                }
                h0.d(parcel);
                generateEventId(u0Var7);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                h0.d(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                h0.d(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                rh.a D4 = rh.b.D(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                h0.d(parcel);
                onActivityStarted(D4, readLong14);
                break;
            case 26:
                rh.a D5 = rh.b.D(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                h0.d(parcel);
                onActivityStopped(D5, readLong15);
                break;
            case 27:
                rh.a D6 = rh.b.D(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) h0.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                h0.d(parcel);
                onActivityCreated(D6, bundle5, readLong16);
                break;
            case 28:
                rh.a D7 = rh.b.D(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                h0.d(parcel);
                onActivityDestroyed(D7, readLong17);
                break;
            case 29:
                rh.a D8 = rh.b.D(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                h0.d(parcel);
                onActivityPaused(D8, readLong18);
                break;
            case 30:
                rh.a D9 = rh.b.D(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                h0.d(parcel);
                onActivityResumed(D9, readLong19);
                break;
            case 31:
                rh.a D10 = rh.b.D(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var6 = queryLocalInterface12 instanceof u0 ? (u0) queryLocalInterface12 : new w0(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                h0.d(parcel);
                onActivitySaveInstanceState(D10, u0Var6, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) h0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var5 = queryLocalInterface13 instanceof u0 ? (u0) queryLocalInterface13 : new w0(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                h0.d(parcel);
                performAction(bundle6, u0Var5, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                rh.a D11 = rh.b.D(parcel.readStrongBinder());
                rh.a D12 = rh.b.D(parcel.readStrongBinder());
                rh.a D13 = rh.b.D(parcel.readStrongBinder());
                h0.d(parcel);
                logHealthData(readInt, readString19, D11, D12, D13);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    x0Var3 = queryLocalInterface14 instanceof x0 ? (x0) queryLocalInterface14 : new z0(readStrongBinder14);
                }
                h0.d(parcel);
                setEventInterceptor(x0Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    x0Var2 = queryLocalInterface15 instanceof x0 ? (x0) queryLocalInterface15 : new z0(readStrongBinder15);
                }
                h0.d(parcel);
                registerOnMeasurementEventListener(x0Var2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    x0Var = queryLocalInterface16 instanceof x0 ? (x0) queryLocalInterface16 : new z0(readStrongBinder16);
                }
                h0.d(parcel);
                unregisterOnMeasurementEventListener(x0Var);
                break;
            case 37:
                HashMap readHashMap = parcel.readHashMap(h0.f31413a);
                h0.d(parcel);
                initForTests(readHashMap);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var4 = queryLocalInterface17 instanceof u0 ? (u0) queryLocalInterface17 : new w0(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                h0.d(parcel);
                getTestFlag(u0Var4, readInt2);
                break;
            case 39:
                ClassLoader classLoader4 = h0.f31413a;
                z13 = parcel.readInt() != 0;
                h0.d(parcel);
                setDataCollectionEnabled(z13);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var3 = queryLocalInterface18 instanceof u0 ? (u0) queryLocalInterface18 : new w0(readStrongBinder18);
                }
                h0.d(parcel);
                isDataCollectionEnabled(u0Var3);
                break;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) h0.a(parcel, Bundle.CREATOR);
                h0.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                h0.d(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) h0.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                h0.d(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) h0.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                h0.d(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    u0Var2 = queryLocalInterface19 instanceof u0 ? (u0) queryLocalInterface19 : new w0(readStrongBinder19);
                }
                h0.d(parcel);
                getSessionId(u0Var2);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
