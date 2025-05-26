package hh;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;

/* loaded from: classes3.dex */
public final class h extends i {
    @Override // hh.i
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new zzq("Invalid response to one way request", null));
        }
    }

    @Override // hh.i
    public final boolean b() {
        return true;
    }
}
