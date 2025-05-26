package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class dl0 {

    /* renamed from: a */
    @om.b("eligible_for_stela")
    private Boolean f36877a;

    /* renamed from: b */
    @om.b("has_affiliate_products")
    private Boolean f36878b;

    /* renamed from: c */
    @om.b("has_product_pins")
    private Boolean f36879c;

    /* renamed from: d */
    @om.b("is_deleted")
    private Boolean f36880d;

    /* renamed from: e */
    @om.b("mentioned_users")
    private List<wy0> f36881e;

    /* renamed from: f */
    @om.b("metadata")
    private jo0 f36882f;

    /* renamed from: g */
    @om.b("page_count")
    private Integer f36883g;

    /* renamed from: h */
    @om.b("pages")
    private List<uo0> f36884h;

    /* renamed from: i */
    @om.b("pages_preview")
    private List<uo0> f36885i;

    /* renamed from: j */
    @om.b("static_page_count")
    private Integer f36886j;

    /* renamed from: k */
    @om.b("total_video_duration")
    private String f36887k;

    /* renamed from: l */
    @om.b("type")
    private String f36888l;

    /* renamed from: m */
    public final boolean[] f36889m;

    public /* synthetic */ dl0(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list, jo0 jo0Var, Integer num, List list2, List list3, Integer num2, String str, String str2, boolean[] zArr, int i13) {
        this(bool, bool2, bool3, bool4, list, jo0Var, num, list2, list3, num2, str, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dl0 dl0Var = (dl0) obj;
        return Objects.equals(this.f36886j, dl0Var.f36886j) && Objects.equals(this.f36883g, dl0Var.f36883g) && Objects.equals(this.f36880d, dl0Var.f36880d) && Objects.equals(this.f36879c, dl0Var.f36879c) && Objects.equals(this.f36878b, dl0Var.f36878b) && Objects.equals(this.f36877a, dl0Var.f36877a) && Objects.equals(this.f36881e, dl0Var.f36881e) && Objects.equals(this.f36882f, dl0Var.f36882f) && Objects.equals(this.f36884h, dl0Var.f36884h) && Objects.equals(this.f36885i, dl0Var.f36885i) && Objects.equals(this.f36887k, dl0Var.f36887k) && Objects.equals(this.f36888l, dl0Var.f36888l);
    }

    public final int hashCode() {
        return Objects.hash(this.f36877a, this.f36878b, this.f36879c, this.f36880d, this.f36881e, this.f36882f, this.f36883g, this.f36884h, this.f36885i, this.f36886j, this.f36887k, this.f36888l);
    }

    public final Boolean m() {
        Boolean bool = this.f36878b;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean n() {
        Boolean bool = this.f36879c;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean o() {
        Boolean bool = this.f36880d;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List p() {
        return this.f36881e;
    }

    public final jo0 q() {
        return this.f36882f;
    }

    public final Integer r() {
        Integer num = this.f36883g;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final List s() {
        return this.f36884h;
    }

    public final List t() {
        return this.f36885i;
    }

    public final Integer u() {
        Integer num = this.f36886j;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String v() {
        return this.f36887k;
    }

    public final al0 w() {
        return new al0(this, 0);
    }

    public dl0() {
        this.f36889m = new boolean[12];
    }

    private dl0(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<wy0> list, jo0 jo0Var, Integer num, List<uo0> list2, List<uo0> list3, Integer num2, String str, String str2, boolean[] zArr) {
        this.f36877a = bool;
        this.f36878b = bool2;
        this.f36879c = bool3;
        this.f36880d = bool4;
        this.f36881e = list;
        this.f36882f = jo0Var;
        this.f36883g = num;
        this.f36884h = list2;
        this.f36885i = list3;
        this.f36886j = num2;
        this.f36887k = str;
        this.f36888l = str2;
        this.f36889m = zArr;
    }
}
