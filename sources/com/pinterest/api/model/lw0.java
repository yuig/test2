package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class lw0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("results")
    private List<fw0> f39931a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("unread")
    private Integer f39932b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39933c;

    public /* synthetic */ lw0(List list, Integer num, boolean[] zArr, int i13) {
        this(list, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lw0 lw0Var = (lw0) obj;
        return Objects.equals(this.f39932b, lw0Var.f39932b) && Objects.equals(this.f39931a, lw0Var.f39931a);
    }

    public final int hashCode() {
        return Objects.hash(this.f39931a, this.f39932b);
    }

    public lw0() {
        this.f39933c = new boolean[2];
    }

    private lw0(@NonNull List<fw0> list, Integer num, boolean[] zArr) {
        this.f39931a = list;
        this.f39932b = num;
        this.f39933c = zArr;
    }
}
