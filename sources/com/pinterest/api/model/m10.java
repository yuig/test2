package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class m10 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39964a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39965b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("generations")
    private List<cn> f39966c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f39967d;

    public /* synthetic */ m10(String str, String str2, List list, boolean[] zArr, int i13) {
        this(str, str2, list, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f39964a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m10 m10Var = (m10) obj;
        return Objects.equals(this.f39964a, m10Var.f39964a) && Objects.equals(this.f39965b, m10Var.f39965b) && Objects.equals(this.f39966c, m10Var.f39966c);
    }

    public final int hashCode() {
        return Objects.hash(this.f39964a, this.f39965b, this.f39966c);
    }

    @Override // dl1.s
    public final String o() {
        return this.f39965b;
    }

    public m10() {
        this.f39967d = new boolean[3];
    }

    private m10(@NonNull String str, String str2, List<cn> list, boolean[] zArr) {
        this.f39964a = str;
        this.f39965b = str2;
        this.f39966c = list;
        this.f39967d = zArr;
    }
}
