package com.google.android.gms.internal.measurement;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.SharedPreferences;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final /* synthetic */ class d5 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ c5 f31356a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        c5 c5Var = this.f31356a;
        synchronized (c5Var.f31322d) {
            c5Var.f31323e = null;
            c5Var.f31320b.run();
        }
        synchronized (c5Var) {
            try {
                Iterator it = c5Var.f31324f.iterator();
                if (it.hasNext()) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                    throw null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
