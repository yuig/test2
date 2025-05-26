package com.pinterest.api.model;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class dt {

    /* renamed from: a, reason: collision with root package name */
    @om.b("cover_images")
    private Map<String, sr> f36950a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("description")
    private String f36951b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("id")
    private String f36952c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("l1_interest")
    private zs f36953d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("title")
    private String f36954e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f36955f;

    public /* synthetic */ dt(Map map, String str, String str2, zs zsVar, String str3, boolean[] zArr, int i13) {
        this(map, str, str2, zsVar, str3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dt dtVar = (dt) obj;
        return Objects.equals(this.f36950a, dtVar.f36950a) && Objects.equals(this.f36951b, dtVar.f36951b) && Objects.equals(this.f36952c, dtVar.f36952c) && Objects.equals(this.f36953d, dtVar.f36953d) && Objects.equals(this.f36954e, dtVar.f36954e);
    }

    public final int hashCode() {
        return Objects.hash(this.f36950a, this.f36951b, this.f36952c, this.f36953d, this.f36954e);
    }

    public dt() {
        this.f36955f = new boolean[5];
    }

    private dt(Map<String, sr> map, String str, String str2, zs zsVar, String str3, boolean[] zArr) {
        this.f36950a = map;
        this.f36951b = str;
        this.f36952c = str2;
        this.f36953d = zsVar;
        this.f36954e = str3;
        this.f36955f = zArr;
    }
}
