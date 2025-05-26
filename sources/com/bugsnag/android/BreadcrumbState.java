package com.bugsnag.android;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/bugsnag/android/BreadcrumbState;", "Lcom/bugsnag/android/i;", "Lcom/bugsnag/android/n1;", "", "getBreadcrumbIndex", "()I", "Lcom/bugsnag/android/Breadcrumb;", "breadcrumb", "", "add", "(Lcom/bugsnag/android/Breadcrumb;)V", "", "copy", "()Ljava/util/List;", "Lcom/bugsnag/android/o1;", "writer", "toStream", "(Lcom/bugsnag/android/o1;)V", "maxBreadcrumbs", "I", "Lcom/bugsnag/android/m;", "callbackState", "Lcom/bugsnag/android/m;", "Lcom/bugsnag/android/u1;", "logger", "Lcom/bugsnag/android/u1;", "validIndexMask", "", "store", "[Lcom/bugsnag/android/Breadcrumb;", "Ljava/util/concurrent/atomic/AtomicInteger;", "index", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "(ILcom/bugsnag/android/m;Lcom/bugsnag/android/u1;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class BreadcrumbState extends i implements n1 {

    @NotNull
    private final m callbackState;

    @NotNull
    private final u1 logger;
    private final int maxBreadcrumbs;

    @NotNull
    private final Breadcrumb[] store;
    private final int validIndexMask = Integer.MAX_VALUE;

    @NotNull
    private final AtomicInteger index = new AtomicInteger(0);

    public BreadcrumbState(int i13, @NotNull m mVar, @NotNull u1 u1Var) {
        this.maxBreadcrumbs = i13;
        this.callbackState = mVar;
        this.logger = u1Var;
        this.store = new Breadcrumb[i13];
    }

    private final int getBreadcrumbIndex() {
        int i13;
        do {
            i13 = this.index.get() & this.validIndexMask;
        } while (!this.index.compareAndSet(i13, (i13 + 1) % this.maxBreadcrumbs));
        return i13;
    }

    public final void add(@NotNull Breadcrumb breadcrumb) {
        if (this.maxBreadcrumbs != 0) {
            m mVar = this.callbackState;
            u1 u1Var = this.logger;
            Collection collection = mVar.f29334b;
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                    try {
                        throw null;
                    } catch (Throwable th3) {
                        u1Var.a("OnBreadcrumbCallback threw an Exception", th3);
                    }
                }
            }
            this.store[getBreadcrumbIndex()] = breadcrumb;
            if (getObservers$bugsnag_android_core_release().isEmpty()) {
                return;
            }
            j jVar = breadcrumb.impl;
            String str = jVar.f29279a;
            BreadcrumbType breadcrumbType = jVar.f29280b;
            String b13 = hd.e.b(jVar.f29282d);
            Map map = breadcrumb.impl.f29281c;
            if (map == null) {
                map = new LinkedHashMap();
            }
            t2 t2Var = new t2(str, breadcrumbType, b13, map);
            Iterator<T> it2 = getObservers$bugsnag_android_core_release().iterator();
            while (it2.hasNext()) {
                ((hd.m) it2.next()).onStateChange(t2Var);
            }
        }
    }

    @NotNull
    public final List<Breadcrumb> copy() {
        if (this.maxBreadcrumbs == 0) {
            return kotlin.collections.q0.f80391a;
        }
        int i13 = -1;
        while (i13 == -1) {
            i13 = this.index.getAndSet(-1);
        }
        try {
            int i14 = this.maxBreadcrumbs;
            Breadcrumb[] breadcrumbArr = new Breadcrumb[i14];
            kotlin.collections.z.h(0, i13, i14, this.store, breadcrumbArr);
            kotlin.collections.z.h(this.maxBreadcrumbs - i13, 0, i13, this.store, breadcrumbArr);
            return kotlin.collections.c0.A(breadcrumbArr);
        } finally {
            this.index.set(i13);
        }
    }

    @Override // com.bugsnag.android.n1
    public void toStream(@NotNull o1 writer) {
        List<Breadcrumb> copy = copy();
        writer.c();
        Iterator<T> it = copy.iterator();
        while (it.hasNext()) {
            ((Breadcrumb) it.next()).toStream(writer);
        }
        writer.f();
    }
}
