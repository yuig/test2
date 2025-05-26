package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class u8 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42465a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42466b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("action")
    private dk0 f42467c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("board_id")
    private String f42468d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("board_name")
    private String f42469e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("header_text")
    private String f42470f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("image_dominant_color_rgb")
    private List<Integer> f42471g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("images")
    private Map<String, List<sr>> f42472h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f42473i;

    public /* synthetic */ u8(String str, String str2, dk0 dk0Var, String str3, String str4, String str5, List list, Map map, boolean[] zArr, int i13) {
        this(str, str2, dk0Var, str3, str4, str5, list, map, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getPath() {
        return this.f42465a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return Objects.equals(this.f42465a, u8Var.f42465a) && Objects.equals(this.f42466b, u8Var.f42466b) && Objects.equals(this.f42467c, u8Var.f42467c) && Objects.equals(this.f42468d, u8Var.f42468d) && Objects.equals(this.f42469e, u8Var.f42469e) && Objects.equals(this.f42470f, u8Var.f42470f) && Objects.equals(this.f42471g, u8Var.f42471g) && Objects.equals(this.f42472h, u8Var.f42472h);
    }

    public final int hashCode() {
        return Objects.hash(this.f42465a, this.f42466b, this.f42467c, this.f42468d, this.f42469e, this.f42470f, this.f42471g, this.f42472h);
    }

    public final dk0 n() {
        return this.f42467c;
    }

    @Override // dl1.s
    public final String o() {
        return this.f42466b;
    }

    public final String q() {
        return this.f42468d;
    }

    public final String s() {
        return this.f42469e;
    }

    public final String u() {
        return this.f42470f;
    }

    public final List v() {
        return this.f42471g;
    }

    public final Map w() {
        return this.f42472h;
    }

    public u8() {
        this.f42473i = new boolean[8];
    }

    private u8(@NonNull String str, String str2, dk0 dk0Var, @NonNull String str3, @NonNull String str4, String str5, List<Integer> list, Map<String, List<sr>> map, boolean[] zArr) {
        this.f42465a = str;
        this.f42466b = str2;
        this.f42467c = dk0Var;
        this.f42468d = str3;
        this.f42469e = str4;
        this.f42470f = str5;
        this.f42471g = list;
        this.f42472h = map;
        this.f42473i = zArr;
    }
}
