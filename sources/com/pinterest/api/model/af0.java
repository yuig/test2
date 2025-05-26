package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class af0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f35719a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f35720b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("action_type")
    private Integer f35721c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("description")
    private String f35722d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("link")
    private String f35723e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("title")
    private String f35724f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35725g;

    public /* synthetic */ af0(String str, String str2, Integer num, String str3, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, num, str3, str4, str5, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f35719a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        af0 af0Var = (af0) obj;
        return Objects.equals(this.f35721c, af0Var.f35721c) && Objects.equals(this.f35719a, af0Var.f35719a) && Objects.equals(this.f35720b, af0Var.f35720b) && Objects.equals(this.f35722d, af0Var.f35722d) && Objects.equals(this.f35723e, af0Var.f35723e) && Objects.equals(this.f35724f, af0Var.f35724f);
    }

    public final int hashCode() {
        return Objects.hash(this.f35719a, this.f35720b, this.f35721c, this.f35722d, this.f35723e, this.f35724f);
    }

    public final Integer k() {
        Integer num = this.f35721c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String l() {
        return this.f35722d;
    }

    public final String n() {
        return this.f35723e;
    }

    @Override // dl1.s
    public final String o() {
        return this.f35720b;
    }

    public final String q() {
        return this.f35724f;
    }

    public af0() {
        this.f35725g = new boolean[6];
    }

    private af0(@NonNull String str, String str2, Integer num, String str3, String str4, String str5, boolean[] zArr) {
        this.f35719a = str;
        this.f35720b = str2;
        this.f35721c = num;
        this.f35722d = str3;
        this.f35723e = str4;
        this.f35724f = str5;
        this.f35725g = zArr;
    }
}
