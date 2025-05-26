package com.google.firebase.messaging;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f33819b;

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.gms.common.api.internal.b0 f33820a;

    public final synchronized u a() {
        String str;
        u uVar;
        com.google.android.gms.common.api.internal.b0 b0Var = this.f33820a;
        synchronized (((ArrayDeque) b0Var.f30792e)) {
            str = (String) ((ArrayDeque) b0Var.f30792e).peek();
        }
        Pattern pattern = u.f33815d;
        uVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                uVar = new u(split[0], split[1]);
            }
        }
        return uVar;
    }
}
