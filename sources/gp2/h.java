package gp2;

import J.N;
import android.util.Pair;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kh2.e3;
import org.chromium.base.task.PostTask;

/* loaded from: classes4.dex */
public class h implements f {

    /* renamed from: j, reason: collision with root package name */
    public static final ReferenceQueue f65948j = new ReferenceQueue();

    /* renamed from: k, reason: collision with root package name */
    public static final HashSet f65949k = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final int f65950a;

    /* renamed from: b, reason: collision with root package name */
    public final String f65951b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65952c;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f65953d;

    /* renamed from: e, reason: collision with root package name */
    public final e3 f65954e = new e3(this, 5);

    /* renamed from: f, reason: collision with root package name */
    public final Object f65955f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public boolean f65956g;

    /* renamed from: h, reason: collision with root package name */
    public LinkedList f65957h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f65958i;

    public h(int i13, int i14, String str) {
        this.f65950a = i13;
        this.f65951b = str.concat(".PreNativeTask.run");
        this.f65952c = i14;
    }

    public static void a() {
        while (true) {
            g gVar = (g) f65948j.poll();
            if (gVar == null) {
                return;
            }
            N.MERCiIV8(gVar.f65947a);
            HashSet hashSet = f65949k;
            synchronized (hashSet) {
                hashSet.remove(gVar);
            }
        }
    }

    public final void b() {
        long M5_IQXaH = N.M5_IQXaH(this.f65952c, this.f65950a);
        synchronized (this.f65955f) {
            try {
                LinkedList linkedList = this.f65957h;
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        Runnable runnable = (Runnable) it.next();
                        N.MGnQU$47(M5_IQXaH, runnable, 0L, runnable.getClass().getName());
                    }
                    this.f65957h = null;
                }
                ArrayList arrayList = this.f65958i;
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Pair pair = (Pair) it2.next();
                        N.MGnQU$47(M5_IQXaH, (Runnable) pair.first, ((Long) pair.second).longValue(), pair.getClass().getName());
                    }
                    this.f65958i = null;
                }
                this.f65953d = M5_IQXaH;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        HashSet hashSet = f65949k;
        synchronized (hashSet) {
            hashSet.add(new g(this));
        }
        a();
    }

    public final void c() {
        if (this.f65956g) {
            return;
        }
        this.f65956g = true;
        synchronized (PostTask.f97324a) {
            ArrayList arrayList = PostTask.f97325b;
            if (arrayList == null) {
                b();
                return;
            }
            arrayList.add(this);
            this.f65957h = new LinkedList();
            this.f65958i = new ArrayList();
        }
    }

    public final void d(Runnable runnable) {
        if (this.f65953d != 0) {
            N.MGnQU$47(this.f65953d, runnable, 0L, runnable.getClass().getName());
            return;
        }
        synchronized (this.f65955f) {
            try {
                c();
                if (this.f65953d != 0) {
                    N.MGnQU$47(this.f65953d, runnable, 0L, runnable.getClass().getName());
                } else {
                    this.f65957h.add(runnable);
                    e();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void e() {
        PostTask.f97327d.execute(this.f65954e);
    }
}
