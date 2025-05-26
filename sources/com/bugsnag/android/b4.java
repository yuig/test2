package com.bugsnag.android;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b4 extends i {

    /* renamed from: a, reason: collision with root package name */
    public a4 f29171a;

    public b4(a4 a4Var) {
        this.f29171a = a4Var;
    }

    public final void a() {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        i3 i3Var = new i3(this.f29171a);
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((hd.m) it.next()).onStateChange(i3Var);
        }
    }
}
