package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.measurement.q4;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f30786a;

    /* renamed from: b, reason: collision with root package name */
    public final Feature f30787b;

    public /* synthetic */ a0(a aVar, Feature feature) {
        this.f30786a = aVar;
        this.f30787b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof a0)) {
            a0 a0Var = (a0) obj;
            if (com.bumptech.glide.c.x(this.f30786a, a0Var.f30786a) && com.bumptech.glide.c.x(this.f30787b, a0Var.f30787b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30786a, this.f30787b});
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(this.f30786a, "key");
        q4Var.m(this.f30787b, "feature");
        return q4Var.toString();
    }
}
