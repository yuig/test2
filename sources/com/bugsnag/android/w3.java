package com.bugsnag.android;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w3 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f29679a;

    public w3(Throwable th3, boolean z13, hd.h hVar) {
        Collection collection;
        u1 u1Var;
        u1 u1Var2;
        Collection collection2;
        w3 w3Var;
        ArrayList arrayList;
        int i13 = hVar.f68830v;
        Thread currentThread = Thread.currentThread();
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        Intrinsics.f(threadGroup);
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        Thread[] threadArr = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threadArr);
        ArrayList A = kotlin.collections.c0.A(threadArr);
        v3 v3Var = v3.ALWAYS;
        v3 v3Var2 = hVar.f68813e;
        if (v3Var2 == v3Var || (v3Var2 == v3.UNHANDLED_ONLY && z13)) {
            List x03 = CollectionsKt.x0(A, new b4.f(2));
            int e13 = kotlin.collections.f0.e(0, Math.min(i13, x03.size()), x03, new z3.m(currentThread, 7));
            List y03 = CollectionsKt.y0(x03, e13 >= 0 ? i13 : Math.max(i13 - 1, 0));
            ArrayList arrayList2 = new ArrayList(i13);
            long elapsedRealtime = SystemClock.elapsedRealtime() + hVar.f68832x;
            Iterator it = y03.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                collection = hVar.f68816h;
                u1Var = hVar.f68826r;
                if (!hasNext) {
                    break;
                }
                Thread thread = (Thread) it.next();
                if (SystemClock.elapsedRealtime() >= elapsedRealtime) {
                    break;
                } else {
                    arrayList2.add(a(currentThread, th3, z13, collection, u1Var, thread));
                }
            }
            if (e13 < 0) {
                int i14 = (-e13) - 1;
                if (i14 >= arrayList2.size()) {
                    u1Var2 = u1Var;
                    collection2 = collection;
                    arrayList2.add(a(currentThread, th3, z13, collection, u1Var, currentThread));
                } else {
                    u1Var2 = u1Var;
                    collection2 = collection;
                    arrayList2.add(i14, a(currentThread, th3, z13, collection2, u1Var, currentThread));
                }
            } else {
                u1Var2 = u1Var;
                collection2 = collection;
                if (e13 >= arrayList2.size()) {
                    arrayList2.add(a(currentThread, th3, z13, collection2, u1Var2, currentThread));
                }
            }
            if (A.size() > i13) {
                arrayList2.add(new s3("", "[" + (A.size() - i13) + " threads omitted as the maxReportedThreads limit (" + i13 + ") was exceeded]", ErrorType.UNKNOWN, false, r3.UNKNOWN, new s2(new StackTraceElement[]{new StackTraceElement("", "", "-", 0)}, collection2, u1Var2)));
            }
            w3Var = this;
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList();
            w3Var = this;
        }
        w3Var.f29679a = arrayList;
    }

    public static final s3 a(Thread thread, Throwable th3, boolean z13, Collection collection, u1 u1Var, Thread thread2) {
        boolean z14 = thread2.getId() == thread.getId();
        return new s3(String.valueOf(thread2.getId()), thread2.getName(), ErrorType.ANDROID, z14, r3.forThread(thread2), new s2(z14 ? (th3 == null || !z13) ? thread.getStackTrace() : th3.getStackTrace() : thread2.getStackTrace(), collection, u1Var));
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.c();
        Iterator it = this.f29679a.iterator();
        while (it.hasNext()) {
            o1Var.M((s3) it.next());
        }
        o1Var.f();
    }
}
