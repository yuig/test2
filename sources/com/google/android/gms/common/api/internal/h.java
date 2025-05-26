package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f30826a;

    public h(Activity activity) {
        com.bumptech.glide.d.u(activity, "Activity must not be null");
        this.f30826a = activity;
    }

    public final FragmentActivity a() {
        return (FragmentActivity) this.f30826a;
    }
}
