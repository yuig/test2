package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ay {

    /* renamed from: a, reason: collision with root package name */
    @om.b("actions")
    private List<fy> f35895a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("content_image_url")
    private String f35896b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("description")
    private tm f35897c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("footer")
    private gz f35898d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("image_type")
    private Integer f35899e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("style")
    private Integer f35900f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("suggested_resource")
    private String f35901g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("title")
    private String f35902h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35903i;

    public /* synthetic */ ay(List list, String str, tm tmVar, gz gzVar, Integer num, Integer num2, String str2, String str3, boolean[] zArr, int i13) {
        this(list, str, tmVar, gzVar, num, num2, str2, str3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ay ayVar = (ay) obj;
        return Objects.equals(this.f35900f, ayVar.f35900f) && Objects.equals(this.f35899e, ayVar.f35899e) && Objects.equals(this.f35895a, ayVar.f35895a) && Objects.equals(this.f35896b, ayVar.f35896b) && Objects.equals(this.f35897c, ayVar.f35897c) && Objects.equals(this.f35898d, ayVar.f35898d) && Objects.equals(this.f35901g, ayVar.f35901g) && Objects.equals(this.f35902h, ayVar.f35902h);
    }

    public final int hashCode() {
        return Objects.hash(this.f35895a, this.f35896b, this.f35897c, this.f35898d, this.f35899e, this.f35900f, this.f35901g, this.f35902h);
    }

    public final List i() {
        return this.f35895a;
    }

    public final String j() {
        return this.f35896b;
    }

    public final tm k() {
        return this.f35897c;
    }

    public final gz l() {
        return this.f35898d;
    }

    public final Integer m() {
        Integer num = this.f35899e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer n() {
        Integer num = this.f35900f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String o() {
        return this.f35901g;
    }

    public final String p() {
        return this.f35902h;
    }

    public ay() {
        this.f35903i = new boolean[8];
    }

    private ay(List<fy> list, String str, tm tmVar, gz gzVar, Integer num, Integer num2, String str2, String str3, boolean[] zArr) {
        this.f35895a = list;
        this.f35896b = str;
        this.f35897c = tmVar;
        this.f35898d = gzVar;
        this.f35899e = num;
        this.f35900f = num2;
        this.f35901g = str2;
        this.f35902h = str3;
        this.f35903i = zArr;
    }
}
