package y70;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import s.r;
import uj2.v;

/* loaded from: classes.dex */
public final class h implements v {

    /* renamed from: a, reason: collision with root package name */
    public final i f138008a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f138009b;

    public h(i callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f138008a = callback;
        this.f138009b = new AtomicBoolean(false);
    }

    @Override // uj2.v
    public final void a() {
    }

    @Override // uj2.v
    public final void b(xj2.c disposable) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
    }

    @Override // uj2.v
    public final void c(Object obj) {
        z70.b event = (z70.b) obj;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = event instanceof z70.a;
        AtomicBoolean atomicBoolean = this.f138009b;
        i iVar = this.f138008a;
        if (z13) {
            g gVar = (g) iVar;
            gVar.f137997h.f140994c = false;
            c cVar = gVar.f138005p;
            if (cVar != null) {
                cVar.a();
            }
            gVar.f138005p = null;
            atomicBoolean.set(false);
            return;
        }
        if (event instanceof z70.d) {
            iVar.getClass();
            atomicBoolean.set(true);
            return;
        }
        if (event instanceof z70.c) {
            g gVar2 = (g) iVar;
            gVar2.f137997h.getClass();
            e eVar = gVar2.f137999j;
            at1.d dVar = eVar.f137987a;
            if (dVar.f20440e) {
                dVar.e();
                eVar.f137988b.c();
                eVar.f137994h.c(Boolean.TRUE);
                return;
            }
            return;
        }
        if (event instanceof z70.e) {
            String url = ((z70.e) event).a();
            g gVar3 = (g) iVar;
            gVar3.getClass();
            Intrinsics.checkNotNullParameter(url, "url");
            r rVar = gVar3.f138006q;
            if (rVar != null) {
                Uri parse = Uri.parse(url);
                Bundle bundle = new Bundle();
                PendingIntent pendingIntent = rVar.f110288e;
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                try {
                    ((b.c) rVar.f110285b).j(rVar.f110286c, parse, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    @Override // uj2.v
    public final void onError(Throwable e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
    }
}
