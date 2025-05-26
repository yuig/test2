package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class e3 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("images_count")
    private Integer f37057a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("responses_count")
    private Integer f37058b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("user_count")
    private Integer f37059c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("videos_count")
    private Integer f37060d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f37061e;

    public /* synthetic */ e3(Integer num, Integer num2, Integer num3, Integer num4, boolean[] zArr, int i13) {
        this(num, num2, num3, num4, zArr);
    }

    public final Integer e() {
        Integer num = this.f37057a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return Objects.equals(this.f37060d, e3Var.f37060d) && Objects.equals(this.f37059c, e3Var.f37059c) && Objects.equals(this.f37058b, e3Var.f37058b) && Objects.equals(this.f37057a, e3Var.f37057a);
    }

    public final int hashCode() {
        return Objects.hash(this.f37057a, this.f37058b, this.f37059c, this.f37060d);
    }

    public e3() {
        this.f37061e = new boolean[4];
    }

    private e3(Integer num, Integer num2, Integer num3, Integer num4, boolean[] zArr) {
        this.f37057a = num;
        this.f37058b = num2;
        this.f37059c = num3;
        this.f37060d = num4;
        this.f37061e = zArr;
    }
}
