package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class b60 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f35997a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f35998b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("pin_type")
    private Integer f35999c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("text")
    private String f36000d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f36001e;

    public /* synthetic */ b60(String str, String str2, Integer num, String str3, boolean[] zArr, int i13) {
        this(str, str2, num, str3, zArr);
    }

    public final Integer e() {
        Integer num = this.f35999c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b60 b60Var = (b60) obj;
        return Objects.equals(this.f35999c, b60Var.f35999c) && Objects.equals(this.f35997a, b60Var.f35997a) && Objects.equals(this.f35998b, b60Var.f35998b) && Objects.equals(this.f36000d, b60Var.f36000d);
    }

    public final String f() {
        return this.f36000d;
    }

    public final int hashCode() {
        return Objects.hash(this.f35997a, this.f35998b, this.f35999c, this.f36000d);
    }

    public b60() {
        this.f36001e = new boolean[4];
    }

    private b60(@NonNull String str, String str2, Integer num, String str3, boolean[] zArr) {
        this.f35997a = str;
        this.f35998b = str2;
        this.f35999c = num;
        this.f36000d = str3;
        this.f36001e = zArr;
    }
}
