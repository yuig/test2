package com.pinterest.api.model;

import java.util.Date;
import java.util.Objects;

/* loaded from: classes.dex */
public class ke0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("resurrection_dt")
    private Date f39421a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f39422b;

    public /* synthetic */ ke0(Date date, boolean[] zArr, int i13) {
        this(date, zArr);
    }

    public final Date b() {
        return this.f39421a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f39421a, ((ke0) obj).f39421a);
    }

    public final int hashCode() {
        return Objects.hash(this.f39421a);
    }

    public ke0() {
        this.f39422b = new boolean[1];
    }

    private ke0(Date date, boolean[] zArr) {
        this.f39421a = date;
        this.f39422b = zArr;
    }
}
