package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes3.dex */
final class ar extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f33426a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.f33426a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i13, Bundle bundle) {
        if (i13 == 1) {
            this.f33426a.f33427a.trySetResult(3);
        } else if (i13 == 2) {
            this.f33426a.f33427a.trySetResult(2);
        } else {
            if (i13 != 3) {
                return;
            }
            this.f33426a.f33427a.trySetResult(1);
        }
    }
}
