package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* loaded from: classes3.dex */
public final class AFb1ySDK {

    public static final class AFa1vSDK {
        private final boolean getCurrencyIso4217Code;
        public final String getRevenue;

        public AFa1vSDK(String str, boolean z13) {
            this.getRevenue = str;
            this.getCurrencyIso4217Code = z13;
        }

        public final boolean getRevenue() {
            return this.getCurrencyIso4217Code;
        }
    }

    public static final class AFa1ySDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> getMediationNetwork = new LinkedBlockingQueue<>(1);
        boolean getCurrencyIso4217Code = false;

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.getMediationNetwork.put(iBinder);
            } catch (InterruptedException e13) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e13);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static final class AFa1zSDK implements IInterface {
        private final IBinder getMediationNetwork;

        public AFa1zSDK(IBinder iBinder) {
            this.getMediationNetwork = iBinder;
        }

        public final String AFAdRevenueData() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.getMediationNetwork.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.getMediationNetwork;
        }

        public final boolean getRevenue() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.getMediationNetwork.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static AFa1vSDK getMonetizationNetwork(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1ySDK aFa1ySDK = new AFa1ySDK();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1ySDK, 1)) {
                context.unbindService(aFa1ySDK);
                throw new IOException("Google Play connection failed");
            }
            if (aFa1ySDK.getCurrencyIso4217Code) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1ySDK.getCurrencyIso4217Code = true;
            IBinder poll = aFa1ySDK.getMediationNetwork.poll(10L, TimeUnit.SECONDS);
            if (poll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1zSDK aFa1zSDK = new AFa1zSDK(poll);
            return new AFa1vSDK(aFa1zSDK.AFAdRevenueData(), aFa1zSDK.getRevenue());
        } finally {
            context.unbindService(aFa1ySDK);
        }
    }
}
