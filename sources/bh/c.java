package bh;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c implements com.google.android.gms.common.api.b {

    /* renamed from: c, reason: collision with root package name */
    public static final c f22800c = new c(new b(0));

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22801a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22802b;

    public c(b bVar) {
        this.f22801a = ((Boolean) bVar.f22798b).booleanValue();
        this.f22802b = (String) bVar.f22799c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return com.bumptech.glide.c.x(null, null) && this.f22801a == cVar.f22801a && com.bumptech.glide.c.x(this.f22802b, cVar.f22802b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f22801a), this.f22802b});
    }
}
