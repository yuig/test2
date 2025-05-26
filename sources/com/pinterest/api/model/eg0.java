package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class eg0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37263a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37264b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("action_button_text")
    private String f37265c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("action_button_type")
    private Integer f37266d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("action_title_text")
    private String f37267e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("action_title_type")
    private Integer f37268f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("key")
    private String f37269g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("text_content")
    private List<lf0> f37270h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f37271i;

    public /* synthetic */ eg0(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, List list, boolean[] zArr, int i13) {
        this(str, str2, str3, num, str4, num2, str5, list, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f37263a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        eg0 eg0Var = (eg0) obj;
        return Objects.equals(this.f37268f, eg0Var.f37268f) && Objects.equals(this.f37266d, eg0Var.f37266d) && Objects.equals(this.f37263a, eg0Var.f37263a) && Objects.equals(this.f37264b, eg0Var.f37264b) && Objects.equals(this.f37265c, eg0Var.f37265c) && Objects.equals(this.f37267e, eg0Var.f37267e) && Objects.equals(this.f37269g, eg0Var.f37269g) && Objects.equals(this.f37270h, eg0Var.f37270h);
    }

    public final int hashCode() {
        return Objects.hash(this.f37263a, this.f37264b, this.f37265c, this.f37266d, this.f37267e, this.f37268f, this.f37269g, this.f37270h);
    }

    public final String n() {
        return this.f37267e;
    }

    @Override // dl1.s
    public final String o() {
        return this.f37264b;
    }

    public final List q() {
        return this.f37270h;
    }

    public eg0() {
        this.f37271i = new boolean[8];
    }

    private eg0(@NonNull String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, List<lf0> list, boolean[] zArr) {
        this.f37263a = str;
        this.f37264b = str2;
        this.f37265c = str3;
        this.f37266d = num;
        this.f37267e = str4;
        this.f37268f = num2;
        this.f37269g = str5;
        this.f37270h = list;
        this.f37271i = zArr;
    }
}
