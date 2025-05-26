package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f30782a;

    /* renamed from: b, reason: collision with root package name */
    public final x92.b f30783b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.b f30784c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30785d;

    public a(x92.b bVar, com.google.android.gms.common.api.b bVar2, String str) {
        this.f30783b = bVar;
        this.f30784c = bVar2;
        this.f30785d = str;
        this.f30782a = Arrays.hashCode(new Object[]{bVar, bVar2, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return com.bumptech.glide.c.x(this.f30783b, aVar.f30783b) && com.bumptech.glide.c.x(this.f30784c, aVar.f30784c) && com.bumptech.glide.c.x(this.f30785d, aVar.f30785d);
    }

    public final int hashCode() {
        return this.f30782a;
    }
}
