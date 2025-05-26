package com.bugsnag.android;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y1 extends i {

    /* renamed from: a, reason: collision with root package name */
    public final x1 f29700a;

    public y1(x1 x1Var) {
        this.f29700a = x1Var;
    }

    public final void a(String str, String str2) {
        if (str2 == null) {
            if (getObservers$bugsnag_android_core_release().isEmpty()) {
                return;
            }
            x2 x2Var = new x2(str);
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((hd.m) it.next()).onStateChange(x2Var);
            }
            return;
        }
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        y2 y2Var = new y2(str, str2);
        Iterator<T> it2 = getObservers$bugsnag_android_core_release().iterator();
        while (it2.hasNext()) {
            ((hd.m) it2.next()).onStateChange(y2Var);
        }
    }

    public final void b(String str, String str2, Object obj) {
        if (obj == null) {
            a(str, str2);
            return;
        }
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        Map map = (Map) this.f29700a.f29687a.get(str);
        v2 v2Var = new v2(str, str2, map == null ? null : map.get(str2));
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((hd.m) it.next()).onStateChange(v2Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1) && Intrinsics.d(this.f29700a, ((y1) obj).f29700a);
    }

    public final int hashCode() {
        return this.f29700a.f29687a.hashCode();
    }

    public final String toString() {
        return "MetadataState(metadata=" + this.f29700a + ')';
    }
}
