package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ea0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("options")
    private List<s00> f37218a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("question_id")
    private Integer f37219b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("question_text")
    private String f37220c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f37221d;

    public /* synthetic */ ea0(List list, Integer num, String str, boolean[] zArr, int i13) {
        this(list, num, str, zArr);
    }

    public final List d() {
        return this.f37218a;
    }

    public final Integer e() {
        Integer num = this.f37219b;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ea0 ea0Var = (ea0) obj;
        return Objects.equals(this.f37219b, ea0Var.f37219b) && Objects.equals(this.f37218a, ea0Var.f37218a) && Objects.equals(this.f37220c, ea0Var.f37220c);
    }

    public final String f() {
        return this.f37220c;
    }

    public final int hashCode() {
        return Objects.hash(this.f37218a, this.f37219b, this.f37220c);
    }

    public ea0() {
        this.f37221d = new boolean[3];
    }

    private ea0(List<s00> list, Integer num, String str, boolean[] zArr) {
        this.f37218a = list;
        this.f37219b = num;
        this.f37220c = str;
        this.f37221d = zArr;
    }
}
