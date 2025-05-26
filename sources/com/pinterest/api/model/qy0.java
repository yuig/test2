package com.pinterest.api.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class qy0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @om.b("display_type")
    private Integer f41431a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("id")
    private String f41432b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("image_signature")
    private String f41433c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("image_urls")
    private List<String> f41434d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("images")
    private Map<String, sr> f41435e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("key")
    private String f41436f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("label")
    private String f41437g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("recommendation_reason")
    private uy0 f41438h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("subtitle")
    private String f41439i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("title")
    private String f41440j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f41441k;

    public /* synthetic */ qy0(Integer num, String str, String str2, List list, Map map, String str3, String str4, uy0 uy0Var, String str5, String str6, boolean[] zArr, int i13) {
        this(num, str, str2, list, map, str3, str4, uy0Var, str5, str6, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f41432b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qy0 qy0Var = (qy0) obj;
        return Objects.equals(this.f41431a, qy0Var.f41431a) && Objects.equals(this.f41432b, qy0Var.f41432b) && Objects.equals(this.f41433c, qy0Var.f41433c) && Objects.equals(this.f41434d, qy0Var.f41434d) && Objects.equals(this.f41435e, qy0Var.f41435e) && Objects.equals(this.f41436f, qy0Var.f41436f) && Objects.equals(this.f41437g, qy0Var.f41437g) && Objects.equals(this.f41438h, qy0Var.f41438h) && Objects.equals(this.f41439i, qy0Var.f41439i) && Objects.equals(this.f41440j, qy0Var.f41440j);
    }

    public final int hashCode() {
        return Objects.hash(this.f41431a, this.f41432b, this.f41433c, this.f41434d, this.f41435e, this.f41436f, this.f41437g, this.f41438h, this.f41439i, this.f41440j);
    }

    public qy0() {
        this.f41441k = new boolean[10];
    }

    private qy0(Integer num, String str, String str2, List<String> list, Map<String, sr> map, String str3, String str4, uy0 uy0Var, String str5, String str6, boolean[] zArr) {
        this.f41431a = num;
        this.f41432b = str;
        this.f41433c = str2;
        this.f41434d = list;
        this.f41435e = map;
        this.f41436f = str3;
        this.f41437g = str4;
        this.f41438h = uy0Var;
        this.f41439i = str5;
        this.f41440j = str6;
        this.f41441k = zArr;
    }
}
