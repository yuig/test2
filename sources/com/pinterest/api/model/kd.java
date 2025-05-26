package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class kd {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39396a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39397b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("mask")
    private String f39398c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("offset")
    private List<Double> f39399d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("rotation")
    private Double f39400e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("scale")
    private Double f39401f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f39402g;

    public /* synthetic */ kd(String str, String str2, String str3, List list, Double d2, Double d13, boolean[] zArr, int i13) {
        this(str, str2, str3, list, d2, d13, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kd kdVar = (kd) obj;
        return Objects.equals(this.f39401f, kdVar.f39401f) && Objects.equals(this.f39400e, kdVar.f39400e) && Objects.equals(this.f39396a, kdVar.f39396a) && Objects.equals(this.f39397b, kdVar.f39397b) && Objects.equals(this.f39398c, kdVar.f39398c) && Objects.equals(this.f39399d, kdVar.f39399d);
    }

    public final int hashCode() {
        return Objects.hash(this.f39396a, this.f39397b, this.f39398c, this.f39399d, this.f39400e, this.f39401f);
    }

    public kd() {
        this.f39402g = new boolean[6];
    }

    private kd(@NonNull String str, String str2, String str3, List<Double> list, Double d2, Double d13, boolean[] zArr) {
        this.f39396a = str;
        this.f39397b = str2;
        this.f39398c = str3;
        this.f39399d = list;
        this.f39400e = d2;
        this.f39401f = d13;
        this.f39402g = zArr;
    }
}
