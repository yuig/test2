package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class wp0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f43325a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("amt")
    private String f43326b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("name")
    private String f43327c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("type")
    private String f43328d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f43329e;

    public /* synthetic */ wp0(Integer num, String str, String str2, String str3, boolean[] zArr, int i13) {
        this(num, str, str2, str3, zArr);
    }

    public final String e() {
        return this.f43326b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wp0 wp0Var = (wp0) obj;
        return Objects.equals(this.f43325a, wp0Var.f43325a) && Objects.equals(this.f43326b, wp0Var.f43326b) && Objects.equals(this.f43327c, wp0Var.f43327c) && Objects.equals(this.f43328d, wp0Var.f43328d);
    }

    public final String f() {
        return this.f43327c;
    }

    public final int hashCode() {
        return Objects.hash(this.f43325a, this.f43326b, this.f43327c, this.f43328d);
    }

    public wp0() {
        this.f43329e = new boolean[4];
    }

    private wp0(Integer num, String str, @NonNull String str2, String str3, boolean[] zArr) {
        this.f43325a = num;
        this.f43326b = str;
        this.f43327c = str2;
        this.f43328d = str3;
        this.f43329e = zArr;
    }
}
