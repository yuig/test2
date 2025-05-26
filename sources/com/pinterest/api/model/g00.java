package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class g00 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37889a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37890b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("action")
    private k00 f37891c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("animation")
    private Integer f37892d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("aux_data")
    private Map<String, Object> f37893e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("display")
    private o00 f37894f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("module_type")
    private Integer f37895g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("tracking_params")
    private String f37896h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("type")
    private String f37897i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f37898j;

    public /* synthetic */ g00(String str, String str2, k00 k00Var, Integer num, Map map, o00 o00Var, Integer num2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, k00Var, num, map, o00Var, num2, str3, str4, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f37889a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g00 g00Var = (g00) obj;
        return Objects.equals(this.f37895g, g00Var.f37895g) && Objects.equals(this.f37892d, g00Var.f37892d) && Objects.equals(this.f37889a, g00Var.f37889a) && Objects.equals(this.f37890b, g00Var.f37890b) && Objects.equals(this.f37891c, g00Var.f37891c) && Objects.equals(this.f37893e, g00Var.f37893e) && Objects.equals(this.f37894f, g00Var.f37894f) && Objects.equals(this.f37896h, g00Var.f37896h) && Objects.equals(this.f37897i, g00Var.f37897i);
    }

    public final int hashCode() {
        return Objects.hash(this.f37889a, this.f37890b, this.f37891c, this.f37892d, this.f37893e, this.f37894f, this.f37895g, this.f37896h, this.f37897i);
    }

    @Override // dl1.s
    public final String o() {
        return this.f37890b;
    }

    public final k00 q() {
        return this.f37891c;
    }

    public final Integer s() {
        Integer num = this.f37892d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Map u() {
        return this.f37893e;
    }

    public final o00 v() {
        return this.f37894f;
    }

    public final Integer w() {
        Integer num = this.f37895g;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String x() {
        return this.f37896h;
    }

    public final String y() {
        return this.f37897i;
    }

    public final d00 z() {
        return new d00(this, 0);
    }

    public g00() {
        this.f37898j = new boolean[9];
    }

    private g00(@NonNull String str, String str2, k00 k00Var, Integer num, Map<String, Object> map, o00 o00Var, Integer num2, String str3, String str4, boolean[] zArr) {
        this.f37889a = str;
        this.f37890b = str2;
        this.f37891c = k00Var;
        this.f37892d = num;
        this.f37893e = map;
        this.f37894f = o00Var;
        this.f37895g = num2;
        this.f37896h = str3;
        this.f37897i = str4;
        this.f37898j = zArr;
    }
}
