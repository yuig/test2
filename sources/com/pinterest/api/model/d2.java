package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class d2 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("ad_group_id")
    private String f36616a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("campaign_id")
    private String f36617b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("id")
    private String f36618c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("pin_id")
    private String f36619d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("review_status")
    private String f36620e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("status")
    private String f36621f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("summary_status")
    private String f36622g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f36623h;

    public /* synthetic */ d2(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, str7, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return Objects.equals(this.f36616a, d2Var.f36616a) && Objects.equals(this.f36617b, d2Var.f36617b) && Objects.equals(this.f36618c, d2Var.f36618c) && Objects.equals(this.f36619d, d2Var.f36619d) && Objects.equals(this.f36620e, d2Var.f36620e) && Objects.equals(this.f36621f, d2Var.f36621f) && Objects.equals(this.f36622g, d2Var.f36622g);
    }

    public final int hashCode() {
        return Objects.hash(this.f36616a, this.f36617b, this.f36618c, this.f36619d, this.f36620e, this.f36621f, this.f36622g);
    }

    public d2() {
        this.f36623h = new boolean[7];
    }

    private d2(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean[] zArr) {
        this.f36616a = str;
        this.f36617b = str2;
        this.f36618c = str3;
        this.f36619d = str4;
        this.f36620e = str5;
        this.f36621f = str6;
        this.f36622g = str7;
        this.f36623h = zArr;
    }
}
