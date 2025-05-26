package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class l2 implements dl1.s {

    /* renamed from: a */
    @NonNull
    @om.b("id")
    private String f39620a;

    /* renamed from: b */
    @om.b("node_id")
    private String f39621b;

    /* renamed from: c */
    @om.b("board")
    private v7 f39622c;

    /* renamed from: d */
    @om.b("creator_analytics")
    private Map<String, bg> f39623d;

    /* renamed from: e */
    @om.b("images")
    private Map<String, sr> f39624e;

    /* renamed from: f */
    @om.b("title")
    private String f39625f;

    /* renamed from: g */
    public final boolean[] f39626g;

    public /* synthetic */ l2(String str, String str2, v7 v7Var, Map map, Map map2, String str3, boolean[] zArr, int i13) {
        this(str, str2, v7Var, map, map2, str3, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f39620a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return Objects.equals(this.f39620a, l2Var.f39620a) && Objects.equals(this.f39621b, l2Var.f39621b) && Objects.equals(this.f39622c, l2Var.f39622c) && Objects.equals(this.f39623d, l2Var.f39623d) && Objects.equals(this.f39624e, l2Var.f39624e) && Objects.equals(this.f39625f, l2Var.f39625f);
    }

    public final int hashCode() {
        return Objects.hash(this.f39620a, this.f39621b, this.f39622c, this.f39623d, this.f39624e, this.f39625f);
    }

    @Override // dl1.s
    public final String o() {
        return this.f39621b;
    }

    public l2() {
        this.f39626g = new boolean[6];
    }

    private l2(@NonNull String str, String str2, v7 v7Var, Map<String, bg> map, Map<String, sr> map2, String str3, boolean[] zArr) {
        this.f39620a = str;
        this.f39621b = str2;
        this.f39622c = v7Var;
        this.f39623d = map;
        this.f39624e = map2;
        this.f39625f = str3;
        this.f39626g = zArr;
    }
}
