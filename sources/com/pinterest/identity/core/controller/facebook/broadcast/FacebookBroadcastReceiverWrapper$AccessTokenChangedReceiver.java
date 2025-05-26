package com.pinterest.identity.core.controller.facebook.broadcast;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import le.j;
import le.v;
import ly1.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/pinterest/identity/core/controller/facebook/broadcast/FacebookBroadcastReceiverWrapper$AccessTokenChangedReceiver", "Lly1/a;", "<init>", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FacebookBroadcastReceiverWrapper$AccessTokenChangedReceiver extends a {
    @Override // ly1.a, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        if (!v.f83119p.get()) {
            v.k(context);
        }
        new j(0).onReceive(context, intent);
    }
}
