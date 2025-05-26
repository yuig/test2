package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class t6 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42101a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42102b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("authors")
    private List<x20> f42103c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("date_published")
    private Date f42104d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("description")
    private String f42105e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("name")
    private String f42106f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f42107g;

    public /* synthetic */ t6(String str, String str2, List list, Date date, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, list, date, str3, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return Objects.equals(this.f42101a, t6Var.f42101a) && Objects.equals(this.f42102b, t6Var.f42102b) && Objects.equals(this.f42103c, t6Var.f42103c) && Objects.equals(this.f42104d, t6Var.f42104d) && Objects.equals(this.f42105e, t6Var.f42105e) && Objects.equals(this.f42106f, t6Var.f42106f);
    }

    public final List g() {
        return this.f42103c;
    }

    public final Date h() {
        return this.f42104d;
    }

    public final int hashCode() {
        return Objects.hash(this.f42101a, this.f42102b, this.f42103c, this.f42104d, this.f42105e, this.f42106f);
    }

    public final String i() {
        return this.f42105e;
    }

    public final String j() {
        return this.f42106f;
    }

    public final String k() {
        return this.f42101a;
    }

    public t6() {
        this.f42107g = new boolean[6];
    }

    private t6(@NonNull String str, String str2, List<x20> list, Date date, String str3, String str4, boolean[] zArr) {
        this.f42101a = str;
        this.f42102b = str2;
        this.f42103c = list;
        this.f42104d = date;
        this.f42105e = str3;
        this.f42106f = str4;
        this.f42107g = zArr;
    }
}
