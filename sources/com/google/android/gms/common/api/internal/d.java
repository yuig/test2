package com.google.android.gms.common.api.internal;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public final class d extends bi.f {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i13 = message.what;
        if (i13 != 1) {
            if (i13 != 2) {
                Log.wtf("BasePendingResult", a.a.d("Don't know how to handle message: ", i13), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).A0(Status.f30749m);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(pair.first);
        try {
            throw null;
        } catch (RuntimeException e13) {
            a.g gVar = BasePendingResult.f30772j;
            throw e13;
        }
    }
}
