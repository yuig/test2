package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class vk0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f42910a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f42911b;

    public /* synthetic */ vk0(Integer num, boolean[] zArr, int i13) {
        this(num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f42910a, ((vk0) obj).f42910a);
    }

    public final int hashCode() {
        return Objects.hash(this.f42910a);
    }

    public vk0() {
        this.f42911b = new boolean[1];
    }

    private vk0(Integer num, boolean[] zArr) {
        this.f42910a = num;
        this.f42911b = zArr;
    }
}
