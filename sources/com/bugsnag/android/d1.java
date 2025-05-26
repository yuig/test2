package com.bugsnag.android;

import java.io.File;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f29187b;

    public /* synthetic */ d1(g1 g1Var, int i13) {
        this.f29186a = i13;
        this.f29187b = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object next;
        int i13 = this.f29186a;
        g1 g1Var = this.f29187b;
        switch (i13) {
            case 0:
                ArrayList d2 = g1Var.d();
                yn2.i j13 = yn2.c0.j(CollectionsKt.K(d2), new z3.m(g1Var, 6));
                v.j2 comparator = g1.f29233o;
                Intrinsics.checkNotNullParameter(j13, "<this>");
                Intrinsics.checkNotNullParameter(comparator, "comparator");
                yn2.h hVar = new yn2.h(j13);
                if (hVar.hasNext()) {
                    next = hVar.next();
                    while (hVar.hasNext()) {
                        Object next2 = hVar.next();
                        if (comparator.compare(next, next2) < 0) {
                            next = next2;
                        }
                    }
                } else {
                    next = null;
                }
                File file = (File) next;
                if (file != null) {
                    d2.remove(file);
                }
                g1Var.a(d2);
                u1 u1Var = g1Var.f29238k;
                if (file != null) {
                    u1Var.c("Attempting to send the most recent launch crash report");
                    g1Var.m(kotlin.collections.e0.b(file));
                    u1Var.c("Continuing with Bugsnag initialisation");
                } else {
                    u1Var.i("No startupcrash events to flush to Bugsnag.");
                }
                g1Var.n();
                break;
            default:
                ArrayList d13 = g1Var.d();
                if (d13.isEmpty()) {
                    g1Var.f29238k.i("No regular events to flush to Bugsnag.");
                }
                g1Var.m(d13);
                g1Var.n();
                break;
        }
    }
}
