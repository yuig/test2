package pf2;

import android.os.Message;
import lh2.g;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f100018b;

    public /* synthetic */ b(d dVar, int i13) {
        this.f100017a = i13;
        this.f100018b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f100017a;
        d dVar = this.f100018b;
        switch (i13) {
            case 0:
                e eVar = dVar.f100022d;
                a aVar = dVar.f100023e;
                try {
                    if (dVar.f100025g == ((sg2.b) aVar.f100012a).f112881f.b()) {
                        long now = dVar.f100020b.now();
                        if (!eVar.hasMessages(34593)) {
                            eVar.sendMessage(Message.obtain(eVar, 34593));
                        }
                        aVar.a(now);
                        break;
                    } else {
                        dVar.f100019a.b(new b(dVar, 1));
                        break;
                    }
                } catch (Exception e13) {
                    ((lh2.e) dVar.f100024f).b(g.ANR_HEARTBEAT_CHECK_FAIL, e13);
                    return;
                }
            default:
                if (dVar.b()) {
                    dVar.a();
                    break;
                }
                break;
        }
    }
}
