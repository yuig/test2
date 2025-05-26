package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class g6 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("height")
    private Integer f37967a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("thumbnail_url")
    private String f37968b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("type")
    private String f37969c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("width")
    private Integer f37970d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f37971e;

    public /* synthetic */ g6(Integer num, String str, String str2, Integer num2, boolean[] zArr, int i13) {
        this(num, str, str2, num2, zArr);
    }

    public final Integer e() {
        Integer num = this.f37967a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g6 g6Var = (g6) obj;
        return Objects.equals(this.f37970d, g6Var.f37970d) && Objects.equals(this.f37967a, g6Var.f37967a) && Objects.equals(this.f37968b, g6Var.f37968b) && Objects.equals(this.f37969c, g6Var.f37969c);
    }

    public final Integer f() {
        Integer num = this.f37970d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f37967a, this.f37968b, this.f37969c, this.f37970d);
    }

    public g6() {
        this.f37971e = new boolean[4];
    }

    private g6(Integer num, String str, String str2, Integer num2, boolean[] zArr) {
        this.f37967a = num;
        this.f37968b = str;
        this.f37969c = str2;
        this.f37970d = num2;
        this.f37971e = zArr;
    }
}
