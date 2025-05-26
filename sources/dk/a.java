package dk;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes3.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i13 = message.what;
        if (i13 == 0) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(message.obj);
            throw null;
        }
        if (i13 != 1) {
            return false;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(message.obj);
        throw null;
    }
}
