package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41452a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41453b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("ad_payload")
    private String f41454c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("ad_verifications")
    private zt0 f41455d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("client_type")
    private Integer f41456e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("content_type")
    private String f41457f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("extensions")
    private Map<String, Object> f41458g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("sideswipe_pin")
    private f30 f41459h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f41460i;

    public /* synthetic */ r(String str, String str2, String str3, zt0 zt0Var, Integer num, String str4, Map map, f30 f30Var, boolean[] zArr, int i13) {
        this(str, str2, str3, zt0Var, num, str4, map, f30Var, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return Objects.equals(this.f41456e, rVar.f41456e) && Objects.equals(this.f41452a, rVar.f41452a) && Objects.equals(this.f41453b, rVar.f41453b) && Objects.equals(this.f41454c, rVar.f41454c) && Objects.equals(this.f41455d, rVar.f41455d) && Objects.equals(this.f41457f, rVar.f41457f) && Objects.equals(this.f41458g, rVar.f41458g) && Objects.equals(this.f41459h, rVar.f41459h);
    }

    public final int hashCode() {
        return Objects.hash(this.f41452a, this.f41453b, this.f41454c, this.f41455d, this.f41456e, this.f41457f, this.f41458g, this.f41459h);
    }

    public final String i() {
        return this.f41454c;
    }

    public final zt0 j() {
        return this.f41455d;
    }

    public final Integer k() {
        Integer num = this.f41456e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String l() {
        return this.f41457f;
    }

    public final Map m() {
        return this.f41458g;
    }

    public r() {
        this.f41460i = new boolean[8];
    }

    private r(@NonNull String str, String str2, String str3, zt0 zt0Var, Integer num, String str4, Map<String, Object> map, f30 f30Var, boolean[] zArr) {
        this.f41452a = str;
        this.f41453b = str2;
        this.f41454c = str3;
        this.f41455d = zt0Var;
        this.f41456e = num;
        this.f41457f = str4;
        this.f41458g = map;
        this.f41459h = f30Var;
        this.f41460i = zArr;
    }
}
