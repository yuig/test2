package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class a40 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f35646a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f35647b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("is_realtime")
    private Boolean f35648c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("latest_available_timestamp")
    private Double f35649d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f35650e;

    public /* synthetic */ a40(String str, String str2, Boolean bool, Double d2, boolean[] zArr, int i13) {
        this(str, str2, bool, d2, zArr);
    }

    public final Boolean e() {
        Boolean bool = this.f35648c;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a40 a40Var = (a40) obj;
        return Objects.equals(this.f35649d, a40Var.f35649d) && Objects.equals(this.f35648c, a40Var.f35648c) && Objects.equals(this.f35646a, a40Var.f35646a) && Objects.equals(this.f35647b, a40Var.f35647b);
    }

    public final Double f() {
        Double d2 = this.f35649d;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f35646a, this.f35647b, this.f35648c, this.f35649d);
    }

    public a40() {
        this.f35650e = new boolean[4];
    }

    private a40(@NonNull String str, String str2, Boolean bool, Double d2, boolean[] zArr) {
        this.f35646a = str;
        this.f35647b = str2;
        this.f35648c = bool;
        this.f35649d = d2;
        this.f35650e = zArr;
    }
}
