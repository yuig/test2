package qg2;

import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import io.embrace.android.embracesdk.internal.comms.delivery.PendingApiCall;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lb.l0;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final fi2.b f103856a;

    /* renamed from: b, reason: collision with root package name */
    public final xh2.d f103857b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f103858c;

    public e(fi2.b storageService, xh2.d serializer) {
        Intrinsics.checkNotNullParameter(storageService, "storageService");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f103856a = storageService;
        this.f103857b = serializer;
        this.f103858c = new ConcurrentHashMap();
    }

    public final void a(Object obj, String name, Type type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        g(name, new fn1.k(this, obj, type, 24));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[LOOP:1: B:13:0x0052->B:14:0x0054, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r7.c(r8)
            java.lang.String r1 = "findLock(name)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L1e
            int r2 = r0.getReadHoldCount()
            goto L1f
        L1e:
            r2 = r3
        L1f:
            r4 = r3
        L20:
            if (r4 >= r2) goto L28
            r1.unlock()
            int r4 = r4 + 1
            goto L20
        L28:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            xk2.q r4 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L4c
            fi2.b r4 = r7.f103856a     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r5.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "emb_"
            r5.append(r6)     // Catch: java.lang.Throwable -> L4c
            r5.append(r8)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4c
            java.io.File r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L4c
            r4.delete()     // Catch: java.lang.Throwable -> L4c
            goto L52
        L4c:
            r4 = move-exception
            xk2.q r5 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L63
            ue.c.m(r4)     // Catch: java.lang.Throwable -> L63
        L52:
            if (r3 >= r2) goto L5a
            r1.lock()
            int r3 = r3 + 1
            goto L52
        L5a:
            r0.unlock()
            java.util.concurrent.ConcurrentHashMap r0 = r7.f103858c
            r0.remove(r8)
            return
        L63:
            r8 = move-exception
        L64:
            if (r3 >= r2) goto L6c
            r1.lock()
            int r3 = r3 + 1
            goto L64
        L6c:
            r0.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.e.b(java.lang.String):void");
    }

    public final ReentrantReadWriteLock c(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        Object putIfAbsent;
        ReentrantReadWriteLock reentrantReadWriteLock2 = (ReentrantReadWriteLock) this.f103858c.get(str);
        if (reentrantReadWriteLock2 != null) {
            return reentrantReadWriteLock2;
        }
        synchronized (this.f103858c) {
            try {
                ConcurrentHashMap concurrentHashMap = this.f103858c;
                Object obj = concurrentHashMap.get(str);
                if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new ReentrantReadWriteLock()))) != null) {
                    obj = putIfAbsent;
                }
                reentrantReadWriteLock = (ReentrantReadWriteLock) obj;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return reentrantReadWriteLock;
    }

    public final Object d(String name, Type type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        ReentrantReadWriteLock c13 = c(name);
        Intrinsics.checkNotNullExpressionValue(c13, "findLock(name)");
        ReentrantReadWriteLock.ReadLock readLock = c13.readLock();
        readLock.lock();
        try {
            File a13 = this.f103856a.a("emb_".concat(name));
            try {
                q qVar = s.f135225b;
                return this.f103857b.a(new FileInputStream(a13), type);
            } catch (Throwable th3) {
                q qVar2 = s.f135225b;
                ue.c.m(th3);
                readLock.unlock();
                return null;
            }
        } finally {
            readLock.unlock();
        }
    }

    public final List e() {
        Intrinsics.checkNotNullParameter("failed_api_calls.json", "name");
        ReentrantReadWriteLock c13 = c("failed_api_calls.json");
        Intrinsics.checkNotNullExpressionValue(c13, "findLock(name)");
        ReentrantReadWriteLock.ReadLock readLock = c13.readLock();
        readLock.lock();
        try {
            q qVar = s.f135225b;
            File a13 = this.f103856a.a("emb_failed_api_calls.json");
            rl2.d clz = k0.f80436a.b(PendingApiCall.class);
            Intrinsics.checkNotNullParameter(clz, "clz");
            Util$ParameterizedTypeImpl Z = kg.a.Z(List.class, l0.t0(clz));
            Intrinsics.checkNotNullExpressionValue(Z, "newParameterizedType(List::class.java, clz.java)");
            List list = (List) this.f103857b.a(new FileInputStream(a13), Z);
            if (list == null) {
                list = q0.f80391a;
            }
            return list;
        } catch (Throwable th3) {
            try {
                q qVar2 = s.f135225b;
                ue.c.m(th3);
                readLock.unlock();
                return null;
            } finally {
                readLock.unlock();
            }
        }
    }

    public final boolean f(String str, String str2) {
        fi2.b bVar = this.f103856a;
        try {
            File b13 = bVar.b("emb_" + str);
            File b14 = bVar.b(b13.getName() + "-old");
            if (b13.exists()) {
                b13.renameTo(b14);
                b14.delete();
            }
            bVar.b("emb_" + str2).renameTo(b13);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void g(String str, Function1 function1) {
        String str2 = "-new";
        fi2.b bVar = this.f103856a;
        ReentrantReadWriteLock c13 = c(str);
        Intrinsics.checkNotNullExpressionValue(c13, "findLock(name)");
        ReentrantReadWriteLock.ReadLock readLock = c13.readLock();
        int i13 = 0;
        int readHoldCount = c13.getWriteHoldCount() == 0 ? c13.getReadHoldCount() : 0;
        for (int i14 = 0; i14 < readHoldCount; i14++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = c13.writeLock();
        writeLock.lock();
        File file = null;
        try {
            try {
                File b13 = bVar.b("emb_" + str);
                boolean exists = b13.exists();
                file = bVar.b(b13.getName() + "-tmp");
                function1.invoke(file);
                if (exists) {
                    file.renameTo(bVar.b(b13.getName() + "-new"));
                } else {
                    str2 = "-tmp";
                }
                f(str, str + str2);
            } catch (Exception unused) {
                if (file != null) {
                    file.delete();
                }
            }
            while (i13 < readHoldCount) {
                readLock.lock();
                i13++;
            }
            writeLock.unlock();
        } catch (Throwable th3) {
            while (i13 < readHoldCount) {
                readLock.lock();
                i13++;
            }
            writeLock.unlock();
            throw th3;
        }
    }
}
