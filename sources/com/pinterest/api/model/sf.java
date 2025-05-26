package com.pinterest.api.model;

import com.appsflyer.AdRevenueScheme;
import java.util.Objects;

/* loaded from: classes.dex */
public class sf {

    /* renamed from: a, reason: collision with root package name */
    @om.b("code")
    private String f41888a;

    /* renamed from: b, reason: collision with root package name */
    @om.b(AdRevenueScheme.COUNTRY)
    private String f41889b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("country_native")
    private String f41890c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("phone_code")
    private String f41891d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("phone_code_label")
    private String f41892e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41893f;

    public /* synthetic */ sf(String str, String str2, String str3, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sf sfVar = (sf) obj;
        return Objects.equals(this.f41888a, sfVar.f41888a) && Objects.equals(this.f41889b, sfVar.f41889b) && Objects.equals(this.f41890c, sfVar.f41890c) && Objects.equals(this.f41891d, sfVar.f41891d) && Objects.equals(this.f41892e, sfVar.f41892e);
    }

    public final String f() {
        return this.f41888a;
    }

    public final String g() {
        return this.f41891d;
    }

    public final String h() {
        return this.f41892e;
    }

    public final int hashCode() {
        return Objects.hash(this.f41888a, this.f41889b, this.f41890c, this.f41891d, this.f41892e);
    }

    public sf() {
        this.f41893f = new boolean[5];
    }

    private sf(String str, String str2, String str3, String str4, String str5, boolean[] zArr) {
        this.f41888a = str;
        this.f41889b = str2;
        this.f41890c = str3;
        this.f41891d = str4;
        this.f41892e = str5;
        this.f41893f = zArr;
    }
}
