package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class c00 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36263a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36264b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("background_color_hex")
    private List<String> f36265c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("icon_type")
    private Integer f36266d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("type")
    private String f36267e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f36268f;

    public /* synthetic */ c00(String str, String str2, List list, Integer num, String str3, boolean[] zArr, int i13) {
        this(str, str2, list, num, str3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c00 c00Var = (c00) obj;
        return Objects.equals(this.f36266d, c00Var.f36266d) && Objects.equals(this.f36263a, c00Var.f36263a) && Objects.equals(this.f36264b, c00Var.f36264b) && Objects.equals(this.f36265c, c00Var.f36265c) && Objects.equals(this.f36267e, c00Var.f36267e);
    }

    public final int hashCode() {
        return Objects.hash(this.f36263a, this.f36264b, this.f36265c, this.f36266d, this.f36267e);
    }

    public c00() {
        this.f36268f = new boolean[5];
    }

    private c00(@NonNull String str, String str2, List<String> list, Integer num, String str3, boolean[] zArr) {
        this.f36263a = str;
        this.f36264b = str2;
        this.f36265c = list;
        this.f36266d = num;
        this.f36267e = str3;
        this.f36268f = zArr;
    }
}
