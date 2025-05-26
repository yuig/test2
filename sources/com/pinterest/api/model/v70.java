package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class v70 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("items")
    private List<z70> f42777a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f42778b;

    public /* synthetic */ v70(List list, boolean[] zArr, int i13) {
        this(list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f42777a, ((v70) obj).f42777a);
    }

    public final int hashCode() {
        return Objects.hash(this.f42777a);
    }

    public v70() {
        this.f42778b = new boolean[1];
    }

    private v70(List<z70> list, boolean[] zArr) {
        this.f42777a = list;
        this.f42778b = zArr;
    }
}
