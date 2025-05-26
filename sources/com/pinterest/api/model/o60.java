package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class o60 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40627a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40628b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("icon_url")
    private String f40629c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("l1_category_name")
    private String f40630d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("name")
    private String f40631e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f40632f;

    public /* synthetic */ o60(String str, String str2, String str3, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o60 o60Var = (o60) obj;
        return Objects.equals(this.f40627a, o60Var.f40627a) && Objects.equals(this.f40628b, o60Var.f40628b) && Objects.equals(this.f40629c, o60Var.f40629c) && Objects.equals(this.f40630d, o60Var.f40630d) && Objects.equals(this.f40631e, o60Var.f40631e);
    }

    public final int hashCode() {
        return Objects.hash(this.f40627a, this.f40628b, this.f40629c, this.f40630d, this.f40631e);
    }

    public o60() {
        this.f40632f = new boolean[5];
    }

    private o60(@NonNull String str, String str2, String str3, String str4, String str5, boolean[] zArr) {
        this.f40627a = str;
        this.f40628b = str2;
        this.f40629c = str3;
        this.f40630d = str4;
        this.f40631e = str5;
        this.f40632f = zArr;
    }
}
