package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class lb {

    /* renamed from: a, reason: collision with root package name */
    @om.b("action_type")
    private Integer f39686a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("board_id")
    private String f39687b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39688c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("is_origin")
    private Boolean f39689d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("progress")
    private Double f39690e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("section_id")
    private String f39691f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f39692g;

    public /* synthetic */ lb(Integer num, String str, String str2, Boolean bool, Double d2, String str3, boolean[] zArr, int i13) {
        this(num, str, str2, bool, d2, str3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lb lbVar = (lb) obj;
        return Objects.equals(this.f39690e, lbVar.f39690e) && Objects.equals(this.f39689d, lbVar.f39689d) && Objects.equals(this.f39686a, lbVar.f39686a) && Objects.equals(this.f39687b, lbVar.f39687b) && Objects.equals(this.f39688c, lbVar.f39688c) && Objects.equals(this.f39691f, lbVar.f39691f);
    }

    public final Integer g() {
        Integer num = this.f39686a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String h() {
        return this.f39687b;
    }

    public final int hashCode() {
        return Objects.hash(this.f39686a, this.f39687b, this.f39688c, this.f39689d, this.f39690e, this.f39691f);
    }

    public final String i() {
        return this.f39691f;
    }

    public lb() {
        this.f39692g = new boolean[6];
    }

    private lb(Integer num, String str, @NonNull String str2, Boolean bool, Double d2, String str3, boolean[] zArr) {
        this.f39686a = num;
        this.f39687b = str;
        this.f39688c = str2;
        this.f39689d = bool;
        this.f39690e = d2;
        this.f39691f = str3;
        this.f39692g = zArr;
    }
}
