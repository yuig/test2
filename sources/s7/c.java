package s7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import d7.n0;
import java.util.Iterator;
import java.util.Set;
import pk.c1;
import pk.y0;

/* loaded from: classes3.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f111263a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Looper looper) {
        super(looper);
        this.f111263a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Set set;
        Set set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i13 = message.what;
        if (i13 == 1) {
            d dVar = this.f111263a;
            if (obj == dVar.f111288y) {
                if (dVar.f111279p == 2 || dVar.i()) {
                    dVar.f111288y = null;
                    boolean z13 = obj2 instanceof Exception;
                    androidx.appcompat.app.d dVar2 = dVar.f111266c;
                    if (z13) {
                        dVar2.I((Exception) obj2, false);
                        return;
                    }
                    try {
                        dVar.f111265b.f((byte[]) obj2);
                        dVar2.f15967c = null;
                        c1 r13 = c1.r((Set) dVar2.f15966b);
                        ((Set) dVar2.f15966b).clear();
                        y0 listIterator = r13.listIterator(0);
                        while (listIterator.hasNext()) {
                            d dVar3 = (d) listIterator.next();
                            if (dVar3.l()) {
                                dVar3.h(true);
                            }
                        }
                        return;
                    } catch (Exception e13) {
                        dVar2.I(e13, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i13 != 2) {
            return;
        }
        d dVar4 = this.f111263a;
        if (obj == dVar4.f111287x && dVar4.i()) {
            dVar4.f111287x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                dVar4.k(false, (Throwable) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (dVar4.f111268e == 3) {
                    v vVar = dVar4.f111265b;
                    byte[] bArr2 = dVar4.f111286w;
                    int i14 = n0.f53866a;
                    vVar.k(bArr2, bArr);
                    d7.j jVar = dVar4.f111272i;
                    synchronized (jVar.f53830a) {
                        set2 = jVar.f53832c;
                    }
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        ((m) it.next()).b();
                    }
                    return;
                }
                byte[] k13 = dVar4.f111265b.k(dVar4.f111285v, bArr);
                int i15 = dVar4.f111268e;
                if ((i15 == 2 || (i15 == 0 && dVar4.f111286w != null)) && k13 != null && k13.length != 0) {
                    dVar4.f111286w = k13;
                }
                dVar4.f111279p = 4;
                d7.j jVar2 = dVar4.f111272i;
                synchronized (jVar2.f53830a) {
                    set = jVar2.f53832c;
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((m) it2.next()).a();
                }
            } catch (Exception e14) {
                e = e14;
                dVar4.k(true, e);
            } catch (NoSuchMethodError e15) {
                e = e15;
                dVar4.k(true, e);
            }
        }
    }
}
