package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class di {

    /* renamed from: a, reason: collision with root package name */
    @om.b("covers_style")
    private Integer f36829a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("max_title_lines")
    private Integer f36830b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("metadata_text_style")
    private Integer f36831c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("show_board_topic")
    private Boolean f36832d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("show_owner_and_collaborators_avatars")
    private Boolean f36833e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("show_owner_and_collaborators_text")
    private Boolean f36834f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("show_pin_count")
    private Boolean f36835g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("show_pinterest_icon")
    private Boolean f36836h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("show_sections")
    private Boolean f36837i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("show_timestamp")
    private Boolean f36838j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("show_upcoming_update_date_text")
    private Boolean f36839k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("show_update_indicator")
    private Boolean f36840l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f36841m;

    public /* synthetic */ di(Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, boolean[] zArr, int i13) {
        this(num, num2, num3, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        di diVar = (di) obj;
        return Objects.equals(this.f36840l, diVar.f36840l) && Objects.equals(this.f36839k, diVar.f36839k) && Objects.equals(this.f36838j, diVar.f36838j) && Objects.equals(this.f36837i, diVar.f36837i) && Objects.equals(this.f36836h, diVar.f36836h) && Objects.equals(this.f36835g, diVar.f36835g) && Objects.equals(this.f36834f, diVar.f36834f) && Objects.equals(this.f36833e, diVar.f36833e) && Objects.equals(this.f36832d, diVar.f36832d) && Objects.equals(this.f36831c, diVar.f36831c) && Objects.equals(this.f36830b, diVar.f36830b) && Objects.equals(this.f36829a, diVar.f36829a);
    }

    public final int hashCode() {
        return Objects.hash(this.f36829a, this.f36830b, this.f36831c, this.f36832d, this.f36833e, this.f36834f, this.f36835g, this.f36836h, this.f36837i, this.f36838j, this.f36839k, this.f36840l);
    }

    public final Integer m() {
        Integer num = this.f36829a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer n() {
        Integer num = this.f36830b;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer o() {
        Integer num = this.f36831c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean p() {
        Boolean bool = this.f36832d;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean q() {
        Boolean bool = this.f36833e;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean r() {
        Boolean bool = this.f36834f;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean s() {
        Boolean bool = this.f36835g;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean t() {
        Boolean bool = this.f36836h;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean u() {
        Boolean bool = this.f36837i;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean v() {
        Boolean bool = this.f36838j;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean w() {
        Boolean bool = this.f36839k;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean x() {
        Boolean bool = this.f36840l;
        return bool == null ? Boolean.FALSE : bool;
    }

    public di() {
        this.f36841m = new boolean[12];
    }

    private di(Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, boolean[] zArr) {
        this.f36829a = num;
        this.f36830b = num2;
        this.f36831c = num3;
        this.f36832d = bool;
        this.f36833e = bool2;
        this.f36834f = bool3;
        this.f36835g = bool4;
        this.f36836h = bool5;
        this.f36837i = bool6;
        this.f36838j = bool7;
        this.f36839k = bool8;
        this.f36840l = bool9;
        this.f36841m = zArr;
    }
}
