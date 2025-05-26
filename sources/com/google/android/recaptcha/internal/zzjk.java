package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class zzjk implements Iterable {
    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb3 = new StringBuilder("[");
        boolean z13 = true;
        while (it.hasNext()) {
            if (!z13) {
                sb3.append(", ");
            }
            sb3.append(it.next());
            z13 = false;
        }
        sb3.append(']');
        return sb3.toString();
    }
}
