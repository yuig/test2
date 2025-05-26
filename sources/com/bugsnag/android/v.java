package com.bugsnag.android;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class v extends i {

    /* renamed from: a, reason: collision with root package name */
    public String f29661a;

    /* renamed from: b, reason: collision with root package name */
    public String f29662b;

    public final void a() {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        String str = this.f29662b;
        if (str == "__BUGSNAG_MANUAL_CONTEXT__") {
            str = null;
        }
        if (str == null) {
            str = this.f29661a;
        }
        d3 d3Var = new d3(str);
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((hd.m) it.next()).onStateChange(d3Var);
        }
    }
}
