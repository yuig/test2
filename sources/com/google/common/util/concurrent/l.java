package com.google.common.util.concurrent;

import com.google.common.util.concurrent.b;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import kh2.c3;

/* loaded from: classes3.dex */
public abstract class l extends b.i {

    /* renamed from: e, reason: collision with root package name */
    public static final c3 f33573e;

    /* renamed from: f, reason: collision with root package name */
    public static final b0 f33574f = new b0(l.class);
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th3;
        c3 kVar;
        try {
            kVar = new j(AtomicReferenceFieldUpdater.newUpdater(l.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(l.class, "remaining"));
            th3 = null;
        } catch (Throwable th4) {
            th3 = th4;
            kVar = new k();
        }
        f33573e = kVar;
        if (th3 != null) {
            f33574f.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th3);
        }
    }

    public l(int i13) {
        this.remaining = i13;
    }

    public static /* synthetic */ int B(l lVar) {
        int i13 = lVar.remaining - 1;
        lVar.remaining = i13;
        return i13;
    }

    public abstract void C(Set set);

    public final void D() {
        this.seenExceptions = null;
    }

    public final Set E() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C(newSetFromMap);
        f33573e.r((i) this, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        Objects.requireNonNull(set2);
        return set2;
    }
}
