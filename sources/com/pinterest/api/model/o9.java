package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class o9 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40645a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40646b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("content")
    private String f40647c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("item_type")
    private Integer f40648d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("status")
    private Integer f40649e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f40650f;

    public /* synthetic */ o9(String str, String str2, String str3, Integer num, Integer num2, boolean[] zArr, int i13) {
        this(str, str2, str3, num, num2, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f40645a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return Objects.equals(this.f40649e, o9Var.f40649e) && Objects.equals(this.f40648d, o9Var.f40648d) && Objects.equals(this.f40645a, o9Var.f40645a) && Objects.equals(this.f40646b, o9Var.f40646b) && Objects.equals(this.f40647c, o9Var.f40647c);
    }

    public final int hashCode() {
        return Objects.hash(this.f40645a, this.f40646b, this.f40647c, this.f40648d, this.f40649e);
    }

    @Override // dl1.s
    public final String o() {
        return this.f40646b;
    }

    public o9() {
        this.f40650f = new boolean[5];
    }

    private o9(@NonNull String str, String str2, String str3, Integer num, Integer num2, boolean[] zArr) {
        this.f40645a = str;
        this.f40646b = str2;
        this.f40647c = str3;
        this.f40648d = num;
        this.f40649e = num2;
        this.f40650f = zArr;
    }
}
