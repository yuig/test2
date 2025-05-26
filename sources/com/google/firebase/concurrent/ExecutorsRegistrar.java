package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import c3.e;
import com.google.firebase.components.ComponentRegistrar;
import dl2.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import rl.a;
import rl.c;
import rl.d;
import sl.g;
import sl.m;
import sl.q;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final m f33721a = new m(new g(2));

    /* renamed from: b, reason: collision with root package name */
    public static final m f33722b = new m(new g(3));

    /* renamed from: c, reason: collision with root package name */
    public static final m f33723c = new m(new g(4));

    /* renamed from: d, reason: collision with root package name */
    public static final m f33724d = new m(new g(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(a.class, ExecutorService.class), new q(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            b.H(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        sl.b bVar = new sl.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new e(0), hashSet3);
        q qVar3 = new q(rl.b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(rl.b.class, ExecutorService.class), new q(rl.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            b.H(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        sl.b bVar2 = new sl.b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new e(1), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            b.H(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        sl.b bVar3 = new sl.b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new e(2), hashSet9);
        sl.a b13 = sl.b.b(new q(d.class, Executor.class));
        b13.f113125f = new e(3);
        return Arrays.asList(bVar, bVar2, bVar3, b13.b());
    }
}
