package jh;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class o implements com.google.android.gms.common.api.b {

    /* renamed from: b, reason: collision with root package name */
    public static final o f76185b = new o(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f76186a;

    public /* synthetic */ o(String str) {
        this.f76186a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return com.bumptech.glide.c.x(this.f76186a, ((o) obj).f76186a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76186a});
    }
}
