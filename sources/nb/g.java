package nb;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import kb.b0;
import ub.j;
import ub.l;

/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90138a;

    /* renamed from: b, reason: collision with root package name */
    public final i f90139b;

    public /* synthetic */ g(i iVar, int i13) {
        this.f90138a = i13;
        this.f90139b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb.a aVar;
        g gVar;
        boolean z13;
        boolean isEmpty;
        int i13 = 1;
        switch (this.f90138a) {
            case 0:
                synchronized (this.f90139b.f90147g) {
                    i iVar = this.f90139b;
                    iVar.f90148h = (Intent) iVar.f90147g.get(0);
                }
                Intent intent = this.f90139b.f90148h;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f90139b.f90148h.getIntExtra("KEY_START_ID", 0);
                    b0 e13 = b0.e();
                    String str = i.f90140k;
                    e13.a(str, "Processing command " + this.f90139b.f90148h + ", " + intExtra);
                    PowerManager.WakeLock a13 = l.a(this.f90139b.f90141a, action + " (" + intExtra + ")");
                    try {
                        b0.e().a(str, "Acquiring operation wake lock (" + action + ") " + a13);
                        a13.acquire();
                        i iVar2 = this.f90139b;
                        iVar2.f90146f.a(iVar2.f90148h, intExtra, iVar2);
                        b0.e().a(str, "Releasing operation wake lock (" + action + ") " + a13);
                        a13.release();
                        i iVar3 = this.f90139b;
                        aVar = iVar3.f90142b.f125447d;
                        gVar = new g(iVar3, i13);
                    } catch (Throwable th3) {
                        try {
                            b0 e14 = b0.e();
                            String str2 = i.f90140k;
                            e14.d(str2, "Unexpected error in onHandleIntent", th3);
                            b0.e().a(str2, "Releasing operation wake lock (" + action + ") " + a13);
                            a13.release();
                            i iVar4 = this.f90139b;
                            aVar = iVar4.f90142b.f125447d;
                            gVar = new g(iVar4, i13);
                        } catch (Throwable th4) {
                            b0.e().a(i.f90140k, "Releasing operation wake lock (" + action + ") " + a13);
                            a13.release();
                            i iVar5 = this.f90139b;
                            iVar5.f90142b.f125447d.execute(new g(iVar5, i13));
                            throw th4;
                        }
                    }
                    aVar.execute(gVar);
                    return;
                }
                return;
            default:
                i iVar6 = this.f90139b;
                iVar6.getClass();
                b0 e15 = b0.e();
                String str3 = i.f90140k;
                e15.a(str3, "Checking if commands are complete.");
                i.c();
                synchronized (iVar6.f90147g) {
                    try {
                        if (iVar6.f90148h != null) {
                            b0.e().a(str3, "Removing command " + iVar6.f90148h);
                            if (!((Intent) iVar6.f90147g.remove(0)).equals(iVar6.f90148h)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            iVar6.f90148h = null;
                        }
                        j jVar = iVar6.f90142b.f125444a;
                        b bVar = iVar6.f90146f;
                        synchronized (bVar.f90112c) {
                            z13 = !bVar.f90111b.isEmpty();
                        }
                        if (!z13 && iVar6.f90147g.isEmpty()) {
                            synchronized (jVar.f121668d) {
                                isEmpty = true ^ jVar.f121665a.isEmpty();
                            }
                            if (!isEmpty) {
                                b0.e().a(str3, "No more commands & intents.");
                                h hVar = iVar6.f90149i;
                                if (hVar != null) {
                                    ((SystemAlarmService) hVar).a();
                                }
                            }
                        }
                        if (!iVar6.f90147g.isEmpty()) {
                            iVar6.d();
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return;
        }
    }
}
