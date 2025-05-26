package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public interface i {
    Activity E4();

    LifecycleCallback L0(Class cls, String str);

    void q(String str, LifecycleCallback lifecycleCallback);

    void startActivityForResult(Intent intent, int i13);
}
