package ub;

import androidx.work.impl.WorkDatabase;
import java.util.HashSet;
import kb.b0;
import lb.j0;
import lb.l0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f121645a = b0.h("EnqueueRunnable");

    public static void a(lb.b0 b0Var) {
        if (lb.b0.l(b0Var, new HashSet())) {
            throw new IllegalStateException("WorkContinuation has cycles (" + b0Var + ")");
        }
        j0 j0Var = b0Var.f82574b;
        WorkDatabase workDatabase = j0Var.f82607d;
        workDatabase.c();
        try {
            l0.G(workDatabase, j0Var.f82606c, b0Var);
            boolean b13 = b(b0Var);
            workDatabase.r();
            if (b13) {
                lb.s.b(j0Var.f82606c, j0Var.f82607d, j0Var.f82609f);
            }
        } finally {
            workDatabase.m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e2  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(lb.b0 r23) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.b.b(lb.b0):boolean");
    }
}
