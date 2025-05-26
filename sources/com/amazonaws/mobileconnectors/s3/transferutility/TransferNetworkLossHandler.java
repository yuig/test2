package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.BroadcastReceiver;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

/* loaded from: classes3.dex */
public abstract class TransferNetworkLossHandler extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final Log f28655a = LogFactory.a(TransferNetworkLossHandler.class);

    public static synchronized void a() {
        synchronized (TransferNetworkLossHandler.class) {
            f28655a.c("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
            throw new TransferUtilityException("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
        }
    }
}
