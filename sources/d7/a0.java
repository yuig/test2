package d7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.ProxyChangeListener;

/* loaded from: classes.dex */
public final class a0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53782a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f53783b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var) {
        this(b0Var, 0);
        this.f53782a = 0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        hn.i iVar;
        boolean z13;
        boolean z14;
        int i13 = this.f53782a;
        Object obj = this.f53783b;
        switch (i13) {
            case 0:
                ((Executor) ((b0) obj).f53789c).execute(new e5.k(5, this, context));
                return;
            case 1:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                o7.e eVar = (o7.e) obj;
                eVar.a(o7.b.c(context, intent, eVar.f93041i, eVar.f93040h));
                return;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                rb.a aVar = (rb.a) ((rb.d) obj);
                switch (aVar.f107055g) {
                    case 0:
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        String action = intent.getAction();
                        if (action == null) {
                            return;
                        }
                        kb.b0.e().a(rb.b.f107056a, "Received ".concat(action));
                        switch (action.hashCode()) {
                            case -1886648615:
                                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                    aVar.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case -54942926:
                                if (action.equals("android.os.action.DISCHARGING")) {
                                    aVar.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case 948344062:
                                if (action.equals("android.os.action.CHARGING")) {
                                    aVar.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            case 1019184907:
                                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    aVar.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    case 1:
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        if (intent.getAction() == null) {
                            return;
                        }
                        kb.b0.e().a(rb.c.f107057a, "Received " + intent.getAction());
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            int hashCode = action2.hashCode();
                            if (hashCode == -1980154005) {
                                if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    aVar.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            } else {
                                if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    aVar.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        if (intent.getAction() == null) {
                            return;
                        }
                        kb.b0.e().a(rb.k.f107071a, "Received " + intent.getAction());
                        String action3 = intent.getAction();
                        if (action3 != null) {
                            int hashCode2 = action3.hashCode();
                            if (hashCode2 == -1181163412) {
                                if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    aVar.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            } else {
                                if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    aVar.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                }
            case 3:
                jk.w wVar = (jk.w) ((kk.t) obj);
                wVar.getClass();
                Bundle bundleExtra = intent.getBundleExtra("session_state");
                if (bundleExtra == null) {
                    return;
                }
                jk.d b13 = jk.d.b(bundleExtra);
                wVar.f79898a.b("ListenerRegistryBroadcastReceiver.onReceive: %s", b13);
                jk.p zza = ((jk.s) wVar.f76361h).zza();
                if (b13.f76321b != 3 || zza == null) {
                    wVar.c(b13);
                    return;
                }
                m.h hVar = new m.h(wVar, b13, intent, context);
                kk.d dVar = (kk.d) zza;
                if (ik.a.f72383e.get() == null) {
                    throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
                }
                dVar.f79881d.execute(new s.f(dVar, b13.f76328i, hVar, 19));
                return;
            case 4:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    iVar = (hn.i) obj;
                    z13 = iVar.f69607c;
                    z14 = true;
                } else {
                    if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        return;
                    }
                    iVar = (hn.i) obj;
                    z13 = iVar.f69607c;
                    z14 = false;
                }
                iVar.a(z14, z13);
                iVar.f69606b = z14;
                return;
            default:
                if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                    ((ProxyChangeListener) obj).updateProxyConfigFromConnectivityManager(intent);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ a0(Object obj, int i13) {
        this.f53782a = i13;
        this.f53783b = obj;
    }

    public /* synthetic */ a0(kk.t tVar) {
        this.f53782a = 3;
        this.f53783b = tVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(o7.e eVar) {
        this(eVar, 1);
        this.f53782a = 1;
    }

    public a0(ProxyChangeListener proxyChangeListener) {
        this.f53782a = 5;
        this.f53783b = proxyChangeListener;
    }
}
