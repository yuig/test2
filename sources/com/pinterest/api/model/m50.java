package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class m50 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40005a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40006b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("rounds")
    private List<e50> f40007c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f40008d;

    public /* synthetic */ m50(String str, String str2, List list, boolean[] zArr, int i13) {
        this(str, str2, list, zArr);
    }

    public final List d() {
        return this.f40007c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m50 m50Var = (m50) obj;
        return Objects.equals(this.f40005a, m50Var.f40005a) && Objects.equals(this.f40006b, m50Var.f40006b) && Objects.equals(this.f40007c, m50Var.f40007c);
    }

    public final int hashCode() {
        return Objects.hash(this.f40005a, this.f40006b, this.f40007c);
    }

    public m50() {
        this.f40008d = new boolean[3];
    }

    private m50(@NonNull String str, String str2, List<e50> list, boolean[] zArr) {
        this.f40005a = str;
        this.f40006b = str2;
        this.f40007c = list;
        this.f40008d = zArr;
    }
}
