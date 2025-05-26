package oh2;

import io.embrace.android.embracesdk.internal.config.remote.KillSwitchRemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.ndk.jni.JniDelegateImpl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f94607b;

    public /* synthetic */ c(d dVar, int i13) {
        this.f94606a = i13;
        this.f94607b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JniDelegateImpl jniDelegateImpl;
        String checkForOverwrittenHandlers;
        KillSwitchRemoteConfig killSwitchRemoteConfig;
        Boolean bool;
        int i13 = this.f94606a;
        d dVar = this.f94607b;
        switch (i13) {
            case 0:
                try {
                    c0.d.M2("install-native-crash-signal-handlers");
                    dVar.b();
                    Unit unit = Unit.f80348a;
                    return;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } finally {
                        c0.d.N();
                    }
                }
            default:
                tg2.e eVar = ((sg2.b) dVar.f94608a).f112877b;
                RemoteConfig remoteConfig = eVar.f117601b;
                if (!((remoteConfig == null || (killSwitchRemoteConfig = remoteConfig.f73056k) == null || (bool = killSwitchRemoteConfig.f73006a) == null) ? eVar.f117602c.is3rdPartySigHandlerDetectionEnabled() : bool.booleanValue()) || (checkForOverwrittenHandlers = (jniDelegateImpl = dVar.f94611d).checkForOverwrittenHandlers()) == null) {
                    return;
                }
                List b13 = e0.b("libwebviewchromium.so");
                if (!(b13 instanceof Collection) || !b13.isEmpty()) {
                    Iterator it = b13.iterator();
                    while (it.hasNext()) {
                        if (StringsKt.E(checkForOverwrittenHandlers, (CharSequence) it.next(), false)) {
                            return;
                        }
                    }
                }
                jniDelegateImpl.reinstallSignalHandlers();
                return;
        }
    }
}
