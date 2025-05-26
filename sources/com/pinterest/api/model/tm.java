package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class tm {

    /* renamed from: a, reason: collision with root package name */
    @om.b("text")
    private String f42236a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("text_tags")
    private List<ts0> f42237b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f42238c;

    public /* synthetic */ tm(String str, List list, boolean[] zArr, int i13) {
        this(str, list, zArr);
    }

    public final String c() {
        return this.f42236a;
    }

    public final List d() {
        return this.f42237b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tm tmVar = (tm) obj;
        return Objects.equals(this.f42236a, tmVar.f42236a) && Objects.equals(this.f42237b, tmVar.f42237b);
    }

    public final int hashCode() {
        return Objects.hash(this.f42236a, this.f42237b);
    }

    public tm() {
        this.f42238c = new boolean[2];
    }

    private tm(String str, List<ts0> list, boolean[] zArr) {
        this.f42236a = str;
        this.f42237b = list;
        this.f42238c = zArr;
    }
}
