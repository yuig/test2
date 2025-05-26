package com.bugsnag.android;

import com.bugsnag.android.ndk.NativeBridge;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b4\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00022\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b$\u0010#J!\u0010'\u001a\u00020\u00022\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020%0\u0019¢\u0006\u0004\b'\u0010 R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010.R(\u00100\u001a\u0004\u0018\u00010\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/bugsnag/android/NdkPlugin;", "Lcom/bugsnag/android/h2;", "", "enableCrashReporting", "()V", "disableCrashReporting", "", "getBinaryArch", "()Ljava/lang/String;", "Lcom/bugsnag/android/o;", "client", "Lcom/bugsnag/android/ndk/NativeBridge;", "initNativeBridge", "(Lcom/bugsnag/android/o;)Lcom/bugsnag/android/ndk/NativeBridge;", "performOneTimeSetup", "(Lcom/bugsnag/android/o;)V", "load", "unload", "", "enabled", "setInternalMetricsEnabled", "(Z)V", "", "getSignalUnwindStackFunction", "()J", "", "", "getCurrentCallbackSetCounts", "()Ljava/util/Map;", "getCurrentNativeApiCallUsage", "counts", "initCallbackCounts", "(Ljava/util/Map;)V", "callback", "notifyAddCallback", "(Ljava/lang/String;)V", "notifyRemoveCallback", "", "data", "setStaticData", "Lcom/bugsnag/android/t1;", "libraryLoader", "Lcom/bugsnag/android/t1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oneTimeSetupPerformed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/bugsnag/android/o;", "<set-?>", "nativeBridge", "Lcom/bugsnag/android/ndk/NativeBridge;", "getNativeBridge", "()Lcom/bugsnag/android/ndk/NativeBridge;", "<init>", "Companion", "com/bugsnag/android/a2", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class NdkPlugin implements h2 {

    @NotNull
    private static final a2 Companion = new a2();

    @Deprecated
    @NotNull
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report NDK errors. See https://docs.bugsnag.com/platforms/android/ndk-link-errors";
    private o client;
    private NativeBridge nativeBridge;

    @NotNull
    private final t1 libraryLoader = new t1();

    @NotNull
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);

    private final native void disableCrashReporting();

    private final native void enableCrashReporting();

    private final native String getBinaryArch();

    private final NativeBridge initNativeBridge(o client) {
        Set<Map.Entry> entrySet;
        NativeBridge nativeBridge = new NativeBridge(client.f29392z);
        client.f29368b.addObserver(nativeBridge);
        client.f29378l.addObserver(nativeBridge);
        client.f29381o.addObserver(nativeBridge);
        client.f29386t.addObserver(nativeBridge);
        ((b4) client.f29373g.get()).addObserver(nativeBridge);
        client.f29371e.addObserver(nativeBridge);
        client.f29385s.addObserver(nativeBridge);
        client.f29391y.addObserver(nativeBridge);
        client.f29379m.addObserver(nativeBridge);
        client.f29369c.addObserver(nativeBridge);
        if (((Boolean) client.f29392z.c(hd.n.IO, new y6.d(client, 1)).get()).booleanValue()) {
            String absolutePath = client.f29390x.f29463a.getAbsolutePath();
            q1 q1Var = client.f29389w;
            int i13 = 0;
            int i14 = q1Var != null ? q1Var.f29422a : 0;
            q qVar = client.f29386t;
            hd.h hVar = client.f29367a;
            if (!qVar.getObservers$bugsnag_android_core_release().isEmpty()) {
                String str = hVar.f68809a;
                boolean z13 = hVar.f68811c.f29673b;
                id.c cVar = hVar.f68819k;
                if (cVar != null) {
                }
                a3 a3Var = new a3(str, z13, absolutePath, i14, hVar.f68813e, hVar.f68827s);
                Iterator<T> it = qVar.getObservers$bugsnag_android_core_release().iterator();
                while (it.hasNext()) {
                    ((hd.m) it.next()).onStateChange(a3Var);
                }
            }
            y1 y1Var = client.f29368b;
            x1 x1Var = y1Var.f29700a;
            for (String str2 : x1Var.f29687a.keySet()) {
                Map map = (Map) x1Var.f29687a.get(str2);
                if (map != null && (entrySet = map.entrySet()) != null) {
                    for (Map.Entry entry : entrySet) {
                        y1Var.b(str2, (String) entry.getKey(), entry.getValue());
                    }
                }
            }
            client.f29371e.a();
            ((b4) client.f29373g.get()).a();
            client.f29379m.a();
            j1 j1Var = client.f29369c;
            i1[] i1VarArr = j1Var.f29285a.f29317a;
            ArrayList arrayList = new ArrayList(i1VarArr.length);
            int length = i1VarArr.length;
            while (i13 < length) {
                i1 i1Var = i1VarArr[i13];
                i13++;
                arrayList.add(new i1(i1Var.f29271a, i1Var.f29272b));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                i1 i1Var2 = (i1) it2.next();
                String str3 = i1Var2.f29271a;
                String str4 = i1Var2.f29272b;
                if (!j1Var.getObservers$bugsnag_android_core_release().isEmpty()) {
                    u2 u2Var = new u2(str3, str4);
                    Iterator<T> it3 = j1Var.getObservers$bugsnag_android_core_release().iterator();
                    while (it3.hasNext()) {
                        ((hd.m) it3.next()).onStateChange(u2Var);
                    }
                }
            }
            q qVar2 = client.f29386t;
            if (!qVar2.getObservers$bugsnag_android_core_release().isEmpty()) {
                z2 z2Var = z2.f29737a;
                Iterator<T> it4 = qVar2.getObservers$bugsnag_android_core_release().iterator();
                while (it4.hasNext()) {
                    ((hd.m) it4.next()).onStateChange(z2Var);
                }
            }
            return nativeBridge;
        }
        client.f29383q.f("Failed to setup NDK directory.");
        return nativeBridge;
    }

    private final void performOneTimeSetup(o client) {
        this.libraryLoader.a("bugsnag-ndk", client, new c(1));
        if (!this.libraryLoader.f29643b) {
            client.f29383q.h(LOAD_ERR_MSG);
        } else {
            client.f29377k.f29227h = getBinaryArch();
            this.nativeBridge = initNativeBridge(client);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performOneTimeSetup$lambda-0, reason: not valid java name */
    public static final boolean m88performOneTimeSetup$lambda0(x0 x0Var) {
        t0 t0Var = (t0) x0Var.f29685a.f29727l.get(0);
        x0Var.a("LinkError", "errorClass", t0Var.f29640a.f29655a);
        u0 u0Var = t0Var.f29640a;
        x0Var.a("LinkError", "errorMessage", u0Var.f29656b);
        u0Var.f29655a = "NdkLinkError";
        u0Var.f29656b = LOAD_ERR_MSG;
        return true;
    }

    @NotNull
    public final Map<String, Integer> getCurrentCallbackSetCounts() {
        NativeBridge nativeBridge = this.nativeBridge;
        Map<String, Integer> currentCallbackSetCounts = nativeBridge == null ? null : nativeBridge.getCurrentCallbackSetCounts();
        return currentCallbackSetCounts == null ? kotlin.collections.z0.d() : currentCallbackSetCounts;
    }

    @NotNull
    public final Map<String, Boolean> getCurrentNativeApiCallUsage() {
        NativeBridge nativeBridge = this.nativeBridge;
        Map<String, Boolean> currentNativeApiCallUsage = nativeBridge == null ? null : nativeBridge.getCurrentNativeApiCallUsage();
        return currentNativeApiCallUsage == null ? kotlin.collections.z0.d() : currentNativeApiCallUsage;
    }

    public final NativeBridge getNativeBridge() {
        return this.nativeBridge;
    }

    public final long getSignalUnwindStackFunction() {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge == null) {
            return 0L;
        }
        return nativeBridge.getSignalUnwindStackFunction();
    }

    public final void initCallbackCounts(@NotNull Map<String, Integer> counts) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge == null) {
            return;
        }
        nativeBridge.initCallbackCounts(counts);
    }

    @Override // com.bugsnag.android.h2
    public void load(@NotNull o client) {
        this.client = client;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(client);
        }
        if (this.libraryLoader.f29643b) {
            enableCrashReporting();
            client.f29383q.c("Initialised NDK Plugin");
        }
    }

    public final void notifyAddCallback(@NotNull String callback) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge == null) {
            return;
        }
        nativeBridge.notifyAddCallback(callback);
    }

    public final void notifyRemoveCallback(@NotNull String callback) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge == null) {
            return;
        }
        nativeBridge.notifyRemoveCallback(callback);
    }

    public final void setInternalMetricsEnabled(boolean enabled) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge == null) {
            return;
        }
        nativeBridge.setInternalMetricsEnabled(enabled);
    }

    public final void setStaticData(@NotNull Map<String, ? extends Object> data) {
        StringWriter stringWriter = new StringWriter();
        try {
            o1 o1Var = new o1(stringWriter);
            try {
                o1Var.M(data);
                Unit unit = Unit.f80348a;
                dl2.b.J(o1Var, null);
                dl2.b.J(stringWriter, null);
                String stringWriter2 = stringWriter.toString();
                NativeBridge nativeBridge = this.nativeBridge;
                if (nativeBridge == null) {
                    return;
                }
                nativeBridge.setStaticJsonData(stringWriter2);
            } finally {
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                dl2.b.J(stringWriter, th3);
                throw th4;
            }
        }
    }

    @Override // com.bugsnag.android.h2
    public void unload() {
        o oVar;
        if (this.libraryLoader.f29643b) {
            disableCrashReporting();
            NativeBridge nativeBridge = this.nativeBridge;
            if (nativeBridge == null || (oVar = this.client) == null) {
                return;
            }
            oVar.f29368b.removeObserver(nativeBridge);
            oVar.f29378l.removeObserver(nativeBridge);
            oVar.f29381o.removeObserver(nativeBridge);
            oVar.f29386t.removeObserver(nativeBridge);
            ((b4) oVar.f29373g.get()).removeObserver(nativeBridge);
            oVar.f29371e.removeObserver(nativeBridge);
            oVar.f29385s.removeObserver(nativeBridge);
            oVar.f29391y.removeObserver(nativeBridge);
            oVar.f29379m.removeObserver(nativeBridge);
            oVar.f29369c.removeObserver(nativeBridge);
        }
    }
}
