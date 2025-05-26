package com.pinterest.framework.screens;

import androidx.lifecycle.t1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f49219a;

    /* renamed from: b, reason: collision with root package name */
    public final t1 f49220b;

    public p(int i13, t1 viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        this.f49219a = i13;
        this.f49220b = viewModelStore;
    }

    public static p a(p pVar, int i13) {
        t1 viewModelStore = pVar.f49220b;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        return new p(i13, viewModelStore);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f49219a == pVar.f49219a && Intrinsics.d(this.f49220b, pVar.f49220b);
    }

    public final int hashCode() {
        return this.f49220b.hashCode() + (Integer.hashCode(this.f49219a) * 31);
    }

    public final String toString() {
        return "ContextViewModelStore(contextHashCode=" + this.f49219a + ", viewModelStore=" + this.f49220b + ")";
    }
}
