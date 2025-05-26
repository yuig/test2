package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class zi0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44337a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44338b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("labels")
    private List<String> f44339c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f44340d;

    public /* synthetic */ zi0(String str, String str2, List list, boolean[] zArr, int i13) {
        this(str, str2, list, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f44337a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zi0 zi0Var = (zi0) obj;
        return Objects.equals(this.f44337a, zi0Var.f44337a) && Objects.equals(this.f44338b, zi0Var.f44338b) && Objects.equals(this.f44339c, zi0Var.f44339c);
    }

    public final List g() {
        return this.f44339c;
    }

    public final int hashCode() {
        return Objects.hash(this.f44337a, this.f44338b, this.f44339c);
    }

    @Override // dl1.s
    public final String o() {
        return this.f44338b;
    }

    public zi0() {
        this.f44340d = new boolean[3];
    }

    private zi0(@NonNull String str, String str2, List<String> list, boolean[] zArr) {
        this.f44337a = str;
        this.f44338b = str2;
        this.f44339c = list;
        this.f44340d = zArr;
    }
}
