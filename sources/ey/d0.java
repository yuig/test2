package ey;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f60468a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final SortedMap f60469b = Collections.synchronizedSortedMap(new TreeMap());

    /* renamed from: c, reason: collision with root package name */
    public static final List f60470c = Collections.synchronizedList(new ArrayList());

    public static void a(c0 task, boolean z13) {
        Intrinsics.checkNotNullParameter(task, "task");
        m60.t a13 = task.a();
        b0 b0Var = task.f60451b;
        synchronized (a13) {
            m60.w wVar = m60.u.f85943a;
            if (wVar.c(a13)) {
                wVar.j(a13);
                f60468a.add(b0Var);
                if (task.b()) {
                    SortedMap scheduledTasks = f60469b;
                    Intrinsics.checkNotNullExpressionValue(scheduledTasks, "scheduledTasks");
                    if (!scheduledTasks.isEmpty()) {
                        f60470c.add(task);
                        return;
                    }
                }
                c(task, z13);
                if (task.f60455f) {
                    b(10000L, new androidx.activity.d(b0Var, 28), Thread.currentThread() == Looper.getMainLooper().getThread());
                } else {
                    d(b0Var);
                }
            }
        }
    }

    public static void b(long j13, Runnable runnable, boolean z13) {
        int i13 = 1;
        if (j13 == 0) {
            if ((Thread.currentThread() == Looper.getMainLooper().getThread()) == z13) {
                runnable.run();
                return;
            }
        }
        if (z13) {
            new Handler(Looper.getMainLooper()).postDelayed(new vo.m(1, runnable), j13);
        } else {
            new vo.o(runnable, hb0.a.PRIORITY_BACKGROUND, i13).d(j13);
        }
    }

    public static void c(c0 c0Var, boolean z13) {
        Runnable runnable = c0Var.f60450a;
        HashSet hashSet = tb0.h.f117076w;
        tb0.h hVar = tb0.g.f117075a;
        b0 b0Var = c0Var.f60451b;
        int type = b0Var.getType();
        String str = c0Var.b() ? "lowPri" : "highPri";
        String str2 = z13 ? "[upon timeout] " : "";
        boolean z14 = c0Var.f60452c;
        String str3 = z14 ? "main" : "background";
        int size = f60469b.size();
        int size2 = f60470c.size();
        StringBuilder sb3 = new StringBuilder("EventCompleteTaskScheduler execute job ");
        sb3.append(b0Var);
        sb3.append(" (");
        sb3.append(type);
        sb3.append(")[");
        a.a.B(sb3, str, "] ", str2, " in thread ");
        sb3.append(str3);
        sb3.append(" HighPriRemain[");
        sb3.append(size);
        sb3.append("] LowPriRemain [");
        sb3.append(size2);
        sb3.append("]");
        hVar.h(sb3.toString());
        b(0L, runnable, z14);
    }

    public static void d(b0 tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        SortedMap sortedMap = f60469b;
        sortedMap.remove(tag);
        if (sortedMap.isEmpty()) {
            List lowPriorityTasks = f60470c;
            Intrinsics.checkNotNullExpressionValue(lowPriorityTasks, "lowPriorityTasks");
            synchronized (lowPriorityTasks) {
                try {
                    Intrinsics.checkNotNullExpressionValue(lowPriorityTasks, "lowPriorityTasks");
                    Iterator it = CollectionsKt.H0(lowPriorityTasks).iterator();
                    while (it.hasNext()) {
                        c0 c0Var = (c0) it.next();
                        Intrinsics.f(c0Var);
                        c(c0Var, false);
                    }
                    f60470c.clear();
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
