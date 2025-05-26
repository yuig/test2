package ly1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kg.t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        t.P();
    }
}
