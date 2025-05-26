package le;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83055a;

    public /* synthetic */ j(int i13) {
        this.f83055a = i13;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f83055a) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                break;
            default:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra != 0) {
                        if (intExtra == 1) {
                            u2.f79715a = 2;
                            break;
                        }
                    } else {
                        u2.f79715a = 1;
                        break;
                    }
                }
                break;
        }
    }
}
