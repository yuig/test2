package com.bugsnag.android;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class w1 extends i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29676a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f29677b;

    public final void a() {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        g3 g3Var = new g3(b(), this.f29676a);
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((hd.m) it.next()).onStateChange(g3Var);
        }
    }

    public final String b() {
        Integer num = this.f29677b;
        if (num == null) {
            return "None";
        }
        if (num.intValue() == 80) {
            return "Complete";
        }
        if (num.intValue() == 60) {
            return "Moderate";
        }
        if (num.intValue() == 40) {
            return "Background";
        }
        if (num.intValue() == 20) {
            return "UI hidden";
        }
        if (num.intValue() == 15) {
            return "Running critical";
        }
        if (num.intValue() == 10) {
            return "Running low";
        }
        if (num.intValue() == 5) {
            return "Running moderate";
        }
        return "Unknown (" + num + ')';
    }
}
