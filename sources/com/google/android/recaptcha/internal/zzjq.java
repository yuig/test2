package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzjq {
    public static boolean zza(Collection collection, Iterator it) {
        it.getClass();
        boolean z13 = false;
        while (it.hasNext()) {
            z13 |= collection.add(it.next());
        }
        return z13;
    }
}
