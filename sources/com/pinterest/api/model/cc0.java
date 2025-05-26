package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class cc0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36360a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36361b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("answers")
    private List<ma0> f36362c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("cover_image_urls")
    private List<String> f36363d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("format_type")
    private Integer f36364e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("question_string")
    private String f36365f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36366g;

    public /* synthetic */ cc0(String str, String str2, List list, List list2, Integer num, String str3, boolean[] zArr, int i13) {
        this(str, str2, list, list2, num, str3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cc0 cc0Var = (cc0) obj;
        return Objects.equals(this.f36364e, cc0Var.f36364e) && Objects.equals(this.f36360a, cc0Var.f36360a) && Objects.equals(this.f36361b, cc0Var.f36361b) && Objects.equals(this.f36362c, cc0Var.f36362c) && Objects.equals(this.f36363d, cc0Var.f36363d) && Objects.equals(this.f36365f, cc0Var.f36365f);
    }

    public final List g() {
        return this.f36362c;
    }

    public final List h() {
        return this.f36363d;
    }

    public final int hashCode() {
        return Objects.hash(this.f36360a, this.f36361b, this.f36362c, this.f36363d, this.f36364e, this.f36365f);
    }

    public final Integer i() {
        Integer num = this.f36364e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String j() {
        return this.f36365f;
    }

    public final String k() {
        return this.f36360a;
    }

    public cc0() {
        this.f36366g = new boolean[6];
    }

    private cc0(@NonNull String str, String str2, List<ma0> list, List<String> list2, Integer num, String str3, boolean[] zArr) {
        this.f36360a = str;
        this.f36361b = str2;
        this.f36362c = list;
        this.f36363d = list2;
        this.f36364e = num;
        this.f36365f = str3;
        this.f36366g = zArr;
    }
}
