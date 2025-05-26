package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class cc {

    /* renamed from: a, reason: collision with root package name */
    @om.b("carousel_slots")
    private List<l30> f36356a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("id")
    private String f36357b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("index")
    private Integer f36358c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f36359d;

    public /* synthetic */ cc(List list, String str, Integer num, boolean[] zArr, int i13) {
        this(list, str, num, zArr);
    }

    public final List d() {
        return this.f36356a;
    }

    public final Integer e() {
        Integer num = this.f36358c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cc ccVar = (cc) obj;
        return Objects.equals(this.f36358c, ccVar.f36358c) && Objects.equals(this.f36356a, ccVar.f36356a) && Objects.equals(this.f36357b, ccVar.f36357b);
    }

    public final String f() {
        return this.f36357b;
    }

    public final int hashCode() {
        return Objects.hash(this.f36356a, this.f36357b, this.f36358c);
    }

    public cc() {
        this.f36359d = new boolean[3];
    }

    private cc(List<l30> list, String str, Integer num, boolean[] zArr) {
        this.f36356a = list;
        this.f36357b = str;
        this.f36358c = num;
        this.f36359d = zArr;
    }
}
