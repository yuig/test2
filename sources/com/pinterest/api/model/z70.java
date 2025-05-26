package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class z70 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("additional_images")
    private List<i40> f44240a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f44241b;

    public /* synthetic */ z70(List list, boolean[] zArr, int i13) {
        this(list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f44240a, ((z70) obj).f44240a);
    }

    public final int hashCode() {
        return Objects.hash(this.f44240a);
    }

    public z70() {
        this.f44241b = new boolean[1];
    }

    private z70(List<i40> list, boolean[] zArr) {
        this.f44240a = list;
        this.f44241b = zArr;
    }
}
