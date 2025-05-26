package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class yd0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_style")
    private ud0 f44013a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("style")
    private ce0 f44014b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("text")
    private String f44015c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("type")
    private Integer f44016d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f44017e;

    public /* synthetic */ yd0(ud0 ud0Var, ce0 ce0Var, String str, Integer num, boolean[] zArr, int i13) {
        this(ud0Var, ce0Var, str, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yd0 yd0Var = (yd0) obj;
        return Objects.equals(this.f44016d, yd0Var.f44016d) && Objects.equals(this.f44013a, yd0Var.f44013a) && Objects.equals(this.f44014b, yd0Var.f44014b) && Objects.equals(this.f44015c, yd0Var.f44015c);
    }

    public final int hashCode() {
        return Objects.hash(this.f44013a, this.f44014b, this.f44015c, this.f44016d);
    }

    public yd0() {
        this.f44017e = new boolean[4];
    }

    private yd0(ud0 ud0Var, ce0 ce0Var, String str, Integer num, boolean[] zArr) {
        this.f44013a = ud0Var;
        this.f44014b = ce0Var;
        this.f44015c = str;
        this.f44016d = num;
        this.f44017e = zArr;
    }
}
