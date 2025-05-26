package com.pinterest.api.model;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class og {

    /* renamed from: a, reason: collision with root package name */
    @om.b("image_urls")
    private Map<String, Object> f40700a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f40701b;

    public /* synthetic */ og(Map map, boolean[] zArr, int i13) {
        this(map, zArr);
    }

    public final Map b() {
        return this.f40700a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f40700a, ((og) obj).f40700a);
    }

    public final int hashCode() {
        return Objects.hash(this.f40700a);
    }

    public og() {
        this.f40701b = new boolean[1];
    }

    private og(Map<String, Object> map, boolean[] zArr) {
        this.f40700a = map;
        this.f40701b = zArr;
    }
}
