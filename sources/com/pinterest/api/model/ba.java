package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ba implements fl1.d, dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36024a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36025b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("board")
    private v7 f36026c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("description")
    private String f36027d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("eligible_pin_type_filters")
    private List<b60> f36028e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("pin_count")
    private Integer f36029f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("preview_pins")
    private List<f30> f36030g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("sensitivity")
    private lh0 f36031h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    @om.b("title")
    private String f36032i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("user")
    private wy0 f36033j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f36034k;

    public /* synthetic */ ba(String str, String str2, v7 v7Var, String str3, List list, Integer num, List list2, lh0 lh0Var, String str4, wy0 wy0Var, boolean[] zArr, int i13) {
        this(str, str2, v7Var, str3, list, num, list2, lh0Var, str4, wy0Var, zArr);
    }

    public final String A() {
        return this.f36032i;
    }

    public final wy0 B() {
        return this.f36033j;
    }

    @Override // fl1.d
    public final dl1.s a(dl1.s sVar) {
        ba baVar = (ba) sVar;
        if (this == baVar) {
            return this;
        }
        aa aaVar = new aa(this, 0);
        aaVar.b(baVar);
        return aaVar.a();
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f36024a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ba baVar = (ba) obj;
        return Objects.equals(this.f36029f, baVar.f36029f) && Objects.equals(this.f36024a, baVar.f36024a) && Objects.equals(this.f36025b, baVar.f36025b) && Objects.equals(this.f36026c, baVar.f36026c) && Objects.equals(this.f36027d, baVar.f36027d) && Objects.equals(this.f36028e, baVar.f36028e) && Objects.equals(this.f36030g, baVar.f36030g) && Objects.equals(this.f36031h, baVar.f36031h) && Objects.equals(this.f36032i, baVar.f36032i) && Objects.equals(this.f36033j, baVar.f36033j);
    }

    public final int hashCode() {
        return Objects.hash(this.f36024a, this.f36025b, this.f36026c, this.f36027d, this.f36028e, this.f36029f, this.f36030g, this.f36031h, this.f36032i, this.f36033j);
    }

    @Override // dl1.s
    public final String o() {
        return this.f36025b;
    }

    public final v7 u() {
        return this.f36026c;
    }

    public final String v() {
        return this.f36027d;
    }

    public final List w() {
        return this.f36028e;
    }

    public final Integer x() {
        Integer num = this.f36029f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final List y() {
        return this.f36030g;
    }

    public final lh0 z() {
        return this.f36031h;
    }

    public ba() {
        this.f36034k = new boolean[10];
    }

    private ba(@NonNull String str, String str2, v7 v7Var, String str3, List<b60> list, Integer num, List<f30> list2, lh0 lh0Var, @NonNull String str4, wy0 wy0Var, boolean[] zArr) {
        this.f36024a = str;
        this.f36025b = str2;
        this.f36026c = v7Var;
        this.f36027d = str3;
        this.f36028e = list;
        this.f36029f = num;
        this.f36030g = list2;
        this.f36031h = lh0Var;
        this.f36032i = str4;
        this.f36033j = wy0Var;
        this.f36034k = zArr;
    }
}
