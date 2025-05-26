package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class rs {

    /* renamed from: a, reason: collision with root package name */
    @om.b("badge_details")
    private List<js> f41653a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("business_diversity_labels")
    private List<String> f41654b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("inspirational_badge_selection")
    private ns f41655c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("is_eligible_for_storefront_badges")
    private Boolean f41656d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("is_inspirational")
    private Boolean f41657e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("profile_badges")
    private List<String> f41658f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("review_labels")
    private List<String> f41659g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f41660h;

    public /* synthetic */ rs(List list, List list2, ns nsVar, Boolean bool, Boolean bool2, List list3, List list4, boolean[] zArr, int i13) {
        this(list, list2, nsVar, bool, bool2, list3, list4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rs rsVar = (rs) obj;
        return Objects.equals(this.f41657e, rsVar.f41657e) && Objects.equals(this.f41656d, rsVar.f41656d) && Objects.equals(this.f41653a, rsVar.f41653a) && Objects.equals(this.f41654b, rsVar.f41654b) && Objects.equals(this.f41655c, rsVar.f41655c) && Objects.equals(this.f41658f, rsVar.f41658f) && Objects.equals(this.f41659g, rsVar.f41659g);
    }

    public final List h() {
        return this.f41653a;
    }

    public final int hashCode() {
        return Objects.hash(this.f41653a, this.f41654b, this.f41655c, this.f41656d, this.f41657e, this.f41658f, this.f41659g);
    }

    public final List i() {
        return this.f41654b;
    }

    public final ns j() {
        return this.f41655c;
    }

    public final List k() {
        return this.f41658f;
    }

    public final List l() {
        return this.f41659g;
    }

    public rs() {
        this.f41660h = new boolean[7];
    }

    private rs(List<js> list, List<String> list2, ns nsVar, Boolean bool, Boolean bool2, List<String> list3, List<String> list4, boolean[] zArr) {
        this.f41653a = list;
        this.f41654b = list2;
        this.f41655c = nsVar;
        this.f41656d = bool;
        this.f41657e = bool2;
        this.f41658f = list3;
        this.f41659g = list4;
        this.f41660h = zArr;
    }
}
