package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class sg {

    /* renamed from: a, reason: collision with root package name */
    @om.b("background_color")
    private String f41911a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("icon_url")
    private String f41912b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("more_info_url")
    private String f41913c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("owner_id")
    private String f41914d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("signal_id")
    private String f41915e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("signal_message")
    private String f41916f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f41917g;

    public /* synthetic */ sg(String str, String str2, String str3, String str4, String str5, String str6, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sg sgVar = (sg) obj;
        return Objects.equals(this.f41911a, sgVar.f41911a) && Objects.equals(this.f41912b, sgVar.f41912b) && Objects.equals(this.f41913c, sgVar.f41913c) && Objects.equals(this.f41914d, sgVar.f41914d) && Objects.equals(this.f41915e, sgVar.f41915e) && Objects.equals(this.f41916f, sgVar.f41916f);
    }

    public final String g() {
        return this.f41911a;
    }

    public final String h() {
        return this.f41912b;
    }

    public final int hashCode() {
        return Objects.hash(this.f41911a, this.f41912b, this.f41913c, this.f41914d, this.f41915e, this.f41916f);
    }

    public final String i() {
        return this.f41915e;
    }

    public final String j() {
        return this.f41916f;
    }

    public sg() {
        this.f41917g = new boolean[6];
    }

    private sg(String str, String str2, String str3, String str4, String str5, String str6, boolean[] zArr) {
        this.f41911a = str;
        this.f41912b = str2;
        this.f41913c = str3;
        this.f41914d = str4;
        this.f41915e = str5;
        this.f41916f = str6;
        this.f41917g = zArr;
    }
}
