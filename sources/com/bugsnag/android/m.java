package com.bugsnag.android;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Collection f29333a;

    /* renamed from: b, reason: collision with root package name */
    public final Collection f29334b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f29335c;

    /* renamed from: d, reason: collision with root package name */
    public final List f29336d;

    /* renamed from: e, reason: collision with root package name */
    public hd.i f29337e;

    public m() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList();
        this.f29333a = copyOnWriteArrayList;
        this.f29334b = copyOnWriteArrayList2;
        this.f29335c = copyOnWriteArrayList3;
        this.f29336d = copyOnWriteArrayList4;
        this.f29337e = new g4.u();
    }

    public final void a(u1 u1Var) {
        Iterator it = this.f29336d.iterator();
        while (it.hasNext()) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            try {
                throw null;
            } catch (Throwable th3) {
                u1Var.a("OnSendCallback threw an Exception", th3);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f29333a, mVar.f29333a) && Intrinsics.d(this.f29334b, mVar.f29334b) && Intrinsics.d(this.f29335c, mVar.f29335c) && Intrinsics.d(this.f29336d, mVar.f29336d);
    }

    public final int hashCode() {
        return this.f29336d.hashCode() + ((this.f29335c.hashCode() + ((this.f29334b.hashCode() + (this.f29333a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CallbackState(onErrorTasks=");
        sb3.append(this.f29333a);
        sb3.append(", onBreadcrumbTasks=");
        sb3.append(this.f29334b);
        sb3.append(", onSessionTasks=");
        sb3.append(this.f29335c);
        sb3.append(", onSendTasks=");
        return d7.g.k(sb3, this.f29336d, ')');
    }
}
