package kn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bk.f;
import com.pinterest.hairball.receiver.LogDeviceScreenStateWorker;
import fn.e;
import java.util.LinkedHashMap;
import java.util.List;
import kb.e0;
import kb.f0;
import kb.l;
import kb.u0;
import kb.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public final class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80210a;

    public /* synthetic */ c(int i13) {
        this.f80210a = i13;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e eVar;
        List split$default;
        switch (this.f80210a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        eVar = e.NOT_DETECTED;
                    } else if (intExtra == 1) {
                        eVar = e.UNKNOWN;
                    }
                    d.f80211a = eVar;
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                String action = intent.getAction();
                if (action != null) {
                    split$default = StringsKt__StringsKt.split$default(action, new String[]{"."}, false, 0, 6, null);
                    String str = (String) d7.b.j0(split$default);
                    Intrinsics.checkNotNullParameter(LogDeviceScreenStateWorker.class, "workerClass");
                    e0 e0Var = new e0(LogDeviceScreenStateWorker.class);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Intrinsics.checkNotNullParameter("intent_action", "key");
                    linkedHashMap.put("intent_action", str);
                    l lVar = new l(linkedHashMap);
                    f.e0(lVar);
                    f0 f0Var = (f0) ((e0) e0Var.h(lVar)).b();
                    u0 u0Var = w0.f79048a;
                    Context context2 = kb0.a.f79058b;
                    u0Var.a(m60.f0.j0()).d(f0Var);
                    break;
                }
                break;
        }
    }
}
