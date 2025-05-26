package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.chromium.base.TraceEvent;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.build.annotations.UsedByReflection;

@UsedByReflection
/* loaded from: classes2.dex */
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ProxyChangeListener";
    private static boolean sEnabled = true;
    private Delegate mDelegate;
    private final Handler mHandler;
    private final Looper mLooper;
    private long mNativePtr;
    private ProxyReceiver mProxyReceiver;
    private BroadcastReceiver mRealProxyReceiver;

    /* loaded from: classes4.dex */
    public interface Delegate {
        void proxySettingsChanged();
    }

    @UsedByReflection
    public class ProxyReceiver extends BroadcastReceiver {
        public ProxyReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        @UsedByReflection
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.runOnThread(new qg2.f(10, this, intent));
            }
        }
    }

    private ProxyChangeListener() {
        Looper myLooper = Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new Handler(myLooper);
    }

    private void assertOnThread() {
    }

    @CalledByNative
    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v extractNewProxy(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return v.a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
    }

    @CalledByNative
    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    private v getProxyConfig(Intent intent) {
        v a13 = v.a(((ConnectivityManager) so.a.f113317a.getSystemService("connectivity")).getDefaultProxy());
        if (a13 == null) {
            return v.f97467e;
        }
        if (Build.VERSION.SDK_INT < 29 || !a13.f97468a.equals("localhost") || a13.f97469b != -1) {
            return a13;
        }
        v extractNewProxy = extractNewProxy(intent);
        dp2.e.f(TAG, "configFromConnectivityManager = %s, configFromIntent = %s", a13, extractNewProxy);
        if (extractNewProxy == null) {
            return null;
        }
        return new v(extractNewProxy.f97468a, extractNewProxy.f97469b, a13.f97470c, a13.f97471d);
    }

    private /* synthetic */ void lambda$setDelegateForTesting$0(Delegate delegate) {
        this.mDelegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateProxyConfigFromConnectivityManager$1(Intent intent) {
        proxySettingsChanged(getProxyConfig(intent));
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proxySettingsChanged(v vVar) {
        assertOnThread();
        if (sEnabled) {
            Delegate delegate = this.mDelegate;
            if (delegate != null) {
                delegate.proxySettingsChanged();
            }
            if (this.mNativePtr == 0) {
                return;
            }
            if (vVar == null) {
                g4.u.j0().w0(this.mNativePtr, this);
                return;
            }
            g4.u.j0().x0(this.mNativePtr, this, vVar.f97468a, vVar.f97469b, vVar.f97470c, vVar.f97471d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r1 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void registerBroadcastReceiver() {
        /*
            r8 = this;
            r8.assertOnThread()
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.PROXY_CHANGE"
            r0.addAction(r1)
            org.chromium.net.ProxyChangeListener$ProxyReceiver r1 = new org.chromium.net.ProxyChangeListener$ProxyReceiver
            r1.<init>()
            r8.mProxyReceiver = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L20
            boolean r1 = androidx.appcompat.app.d0.h()
            if (r1 != 0) goto L2f
        L20:
            android.content.Context r2 = so.a.f113317a
            org.chromium.net.ProxyChangeListener$ProxyReceiver r3 = r8.mProxyReceiver
            android.content.IntentFilter r4 = new android.content.IntentFilter
            r4.<init>()
            r7 = 4
            r5 = 0
            r6 = 0
            r2.registerReceiver(r3, r4, r5, r6, r7)
        L2f:
            d7.a0 r1 = new d7.a0
            r1.<init>(r8)
            r8.mRealProxyReceiver = r1
            android.content.Context r2 = so.a.f113317a
            so.a.h(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.ProxyChangeListener.registerBroadcastReceiver():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    public static void setEnabled(boolean z13) {
        sEnabled = z13;
    }

    private void unregisterBroadcastReceiver() {
        assertOnThread();
        so.a.f113317a.unregisterReceiver(this.mProxyReceiver);
        BroadcastReceiver broadcastReceiver = this.mRealProxyReceiver;
        if (broadcastReceiver != null) {
            so.a.f113317a.unregisterReceiver(broadcastReceiver);
        }
        this.mProxyReceiver = null;
        this.mRealProxyReceiver = null;
    }

    public void setDelegateForTesting(Delegate delegate) {
        this.mDelegate = delegate;
    }

    @CalledByNative
    public void start(long j13) {
        TraceEvent c13 = TraceEvent.c("ProxyChangeListener.start");
        try {
            assertOnThread();
            this.mNativePtr = j13;
            registerBroadcastReceiver();
            if (c13 != null) {
                c13.close();
            }
        } catch (Throwable th3) {
            if (c13 != null) {
                try {
                    c13.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @CalledByNative
    public void stop() {
        assertOnThread();
        this.mNativePtr = 0L;
        unregisterBroadcastReceiver();
    }

    public void updateProxyConfigFromConnectivityManager(Intent intent) {
        runOnThread(new qg2.f(8, this, intent));
    }
}
