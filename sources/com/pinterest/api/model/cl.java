package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class cl {

    /* renamed from: a, reason: collision with root package name */
    @om.b("board_subtitle")
    private String f36459a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("board_tag")
    private Integer f36460b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("curator")
    private wy0 f36461c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("has_expanded_sections")
    private Boolean f36462d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("is_sponsored_content")
    private Boolean f36463e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("show_curator_attribution_on_slp")
    private Boolean f36464f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36465g;

    public /* synthetic */ cl(String str, Integer num, wy0 wy0Var, Boolean bool, Boolean bool2, Boolean bool3, boolean[] zArr, int i13) {
        this(str, num, wy0Var, bool, bool2, bool3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cl clVar = (cl) obj;
        return Objects.equals(this.f36464f, clVar.f36464f) && Objects.equals(this.f36463e, clVar.f36463e) && Objects.equals(this.f36462d, clVar.f36462d) && Objects.equals(this.f36460b, clVar.f36460b) && Objects.equals(this.f36459a, clVar.f36459a) && Objects.equals(this.f36461c, clVar.f36461c);
    }

    public final String g() {
        return this.f36459a;
    }

    public final Integer h() {
        Integer num = this.f36460b;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f36459a, this.f36460b, this.f36461c, this.f36462d, this.f36463e, this.f36464f);
    }

    public final wy0 i() {
        return this.f36461c;
    }

    public final Boolean j() {
        Boolean bool = this.f36462d;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean k() {
        Boolean bool = this.f36464f;
        return bool == null ? Boolean.FALSE : bool;
    }

    public cl() {
        this.f36465g = new boolean[6];
    }

    private cl(String str, Integer num, wy0 wy0Var, Boolean bool, Boolean bool2, Boolean bool3, boolean[] zArr) {
        this.f36459a = str;
        this.f36460b = num;
        this.f36461c = wy0Var;
        this.f36462d = bool;
        this.f36463e = bool2;
        this.f36464f = bool3;
        this.f36465g = zArr;
    }
}
