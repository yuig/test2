package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class rt0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41664a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41665b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("homefeed")
    private Integer f41666c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("related_pins")
    private Integer f41667d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("search")
    private Integer f41668e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41669f;

    public /* synthetic */ rt0(String str, String str2, Integer num, Integer num2, Integer num3, boolean[] zArr, int i13) {
        this(str, str2, num, num2, num3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rt0 rt0Var = (rt0) obj;
        return Objects.equals(this.f41668e, rt0Var.f41668e) && Objects.equals(this.f41667d, rt0Var.f41667d) && Objects.equals(this.f41666c, rt0Var.f41666c) && Objects.equals(this.f41664a, rt0Var.f41664a) && Objects.equals(this.f41665b, rt0Var.f41665b);
    }

    public final Integer f() {
        Integer num = this.f41666c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer g() {
        Integer num = this.f41667d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer h() {
        Integer num = this.f41668e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f41664a, this.f41665b, this.f41666c, this.f41667d, this.f41668e);
    }

    public rt0() {
        this.f41669f = new boolean[5];
    }

    private rt0(@NonNull String str, String str2, Integer num, Integer num2, Integer num3, boolean[] zArr) {
        this.f41664a = str;
        this.f41665b = str2;
        this.f41666c = num;
        this.f41667d = num2;
        this.f41668e = num3;
        this.f41669f = zArr;
    }
}
