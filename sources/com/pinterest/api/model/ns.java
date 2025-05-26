package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ns {

    /* renamed from: a, reason: collision with root package name */
    @om.b("badgeColor")
    private String f40472a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("badgeOptOut")
    private List<String> f40473b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40474c;

    public /* synthetic */ ns(String str, List list, boolean[] zArr, int i13) {
        this(str, list, zArr);
    }

    public final String c() {
        return this.f40472a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ns nsVar = (ns) obj;
        return Objects.equals(this.f40472a, nsVar.f40472a) && Objects.equals(this.f40473b, nsVar.f40473b);
    }

    public final int hashCode() {
        return Objects.hash(this.f40472a, this.f40473b);
    }

    public ns() {
        this.f40474c = new boolean[2];
    }

    private ns(String str, List<String> list, boolean[] zArr) {
        this.f40472a = str;
        this.f40473b = list;
        this.f40474c = zArr;
    }
}
