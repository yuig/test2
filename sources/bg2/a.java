package bg2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import lh2.g;
import qg2.k;
import xk2.m;

/* loaded from: classes4.dex */
public final class a extends BroadcastReceiver implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f22784h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22785a;

    /* renamed from: b, reason: collision with root package name */
    public final ki2.a f22786b;

    /* renamed from: c, reason: collision with root package name */
    public final lh2.b f22787c;

    /* renamed from: d, reason: collision with root package name */
    public final ConnectivityManager f22788d;

    /* renamed from: e, reason: collision with root package name */
    public final IntentFilter f22789e;

    /* renamed from: f, reason: collision with root package name */
    public k f22790f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f22791g;

    public a(Context context, ki2.a backgroundWorker, lh2.b logger, ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f22785a = context;
        this.f22786b = backgroundWorker;
        this.f22787c = logger;
        this.f22788d = connectivityManager;
        this.f22789e = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        this.f22790f = k.UNKNOWN;
        this.f22791g = new ArrayList();
        m.b(new nd2.a(this, 15));
    }

    public final void a(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f22791g.add(listener);
        listener.d(this.f22790f);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22785a.unregisterReceiver(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        k kVar;
        lh2.b bVar = this.f22787c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            try {
                ConnectivityManager connectivityManager = this.f22788d;
                NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    kVar = k.NOT_REACHABLE;
                } else {
                    int type = activeNetworkInfo.getType();
                    kVar = type != 0 ? type != 1 ? k.UNKNOWN : k.WIFI : k.WAN;
                }
            } catch (Exception e13) {
                ((lh2.e) bVar).b(g.NETWORK_STATUS_CAPTURE_FAIL, e13);
                kVar = k.UNKNOWN;
            }
            if (this.f22790f != kVar) {
                this.f22790f = kVar;
                Iterator it = this.f22791g.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).d(kVar);
                }
            }
        } catch (Exception e14) {
            ((lh2.e) bVar).b(g.NETWORK_STATUS_CAPTURE_FAIL, e14);
        }
    }
}
