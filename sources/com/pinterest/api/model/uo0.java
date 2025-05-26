package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class uo0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("ad")
    private f30 f42606a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("blocks")
    private List<ro0> f42607b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("id")
    private String f42608c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("image")
    private om0 f42609d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("image_adjusted")
    private om0 f42610e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("image_signature")
    private String f42611f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("image_signature_adjusted")
    private String f42612g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("layout")
    private Integer f42613h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("music_attributions")
    private List<hx> f42614i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("should_mute")
    private Boolean f42615j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("style")
    private ep0 f42616k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("type")
    private String f42617l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("video")
    private vq0 f42618m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("video_signature")
    private String f42619n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f42620o;

    public /* synthetic */ uo0(f30 f30Var, List list, String str, om0 om0Var, om0 om0Var2, String str2, String str3, Integer num, List list2, Boolean bool, ep0 ep0Var, String str4, vq0 vq0Var, String str5, boolean[] zArr, int i13) {
        this(f30Var, list, str, om0Var, om0Var2, str2, str3, num, list2, bool, ep0Var, str4, vq0Var, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        uo0 uo0Var = (uo0) obj;
        return Objects.equals(this.f42615j, uo0Var.f42615j) && Objects.equals(this.f42613h, uo0Var.f42613h) && Objects.equals(this.f42606a, uo0Var.f42606a) && Objects.equals(this.f42607b, uo0Var.f42607b) && Objects.equals(this.f42608c, uo0Var.f42608c) && Objects.equals(this.f42609d, uo0Var.f42609d) && Objects.equals(this.f42610e, uo0Var.f42610e) && Objects.equals(this.f42611f, uo0Var.f42611f) && Objects.equals(this.f42612g, uo0Var.f42612g) && Objects.equals(this.f42614i, uo0Var.f42614i) && Objects.equals(this.f42616k, uo0Var.f42616k) && Objects.equals(this.f42617l, uo0Var.f42617l) && Objects.equals(this.f42618m, uo0Var.f42618m) && Objects.equals(this.f42619n, uo0Var.f42619n);
    }

    public final int hashCode() {
        return Objects.hash(this.f42606a, this.f42607b, this.f42608c, this.f42609d, this.f42610e, this.f42611f, this.f42612g, this.f42613h, this.f42614i, this.f42615j, this.f42616k, this.f42617l, this.f42618m, this.f42619n);
    }

    public final List o() {
        return this.f42607b;
    }

    public final om0 p() {
        return this.f42609d;
    }

    public final om0 q() {
        return this.f42610e;
    }

    public final Integer r() {
        Integer num = this.f42613h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final List s() {
        return this.f42614i;
    }

    public final Boolean t() {
        Boolean bool = this.f42615j;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final ep0 u() {
        return this.f42616k;
    }

    public final String v() {
        return this.f42608c;
    }

    public final vq0 w() {
        return this.f42618m;
    }

    public final oo0 x() {
        return new oo0(this, 0);
    }

    public uo0() {
        this.f42620o = new boolean[14];
    }

    private uo0(f30 f30Var, List<ro0> list, String str, om0 om0Var, om0 om0Var2, String str2, String str3, Integer num, List<hx> list2, Boolean bool, ep0 ep0Var, String str4, vq0 vq0Var, String str5, boolean[] zArr) {
        this.f42606a = f30Var;
        this.f42607b = list;
        this.f42608c = str;
        this.f42609d = om0Var;
        this.f42610e = om0Var2;
        this.f42611f = str2;
        this.f42612g = str3;
        this.f42613h = num;
        this.f42614i = list2;
        this.f42615j = bool;
        this.f42616k = ep0Var;
        this.f42617l = str4;
        this.f42618m = vq0Var;
        this.f42619n = str5;
        this.f42620o = zArr;
    }
}
