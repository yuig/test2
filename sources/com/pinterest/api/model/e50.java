package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class e50 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37182a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37183b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("options")
    private List<i50> f37184c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f37185d;

    public /* synthetic */ e50(String str, String str2, List list, boolean[] zArr, int i13) {
        this(str, str2, list, zArr);
    }

    public final List d() {
        return this.f37184c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e50 e50Var = (e50) obj;
        return Objects.equals(this.f37182a, e50Var.f37182a) && Objects.equals(this.f37183b, e50Var.f37183b) && Objects.equals(this.f37184c, e50Var.f37184c);
    }

    public final int hashCode() {
        return Objects.hash(this.f37182a, this.f37183b, this.f37184c);
    }

    public e50() {
        this.f37185d = new boolean[3];
    }

    private e50(@NonNull String str, String str2, List<i50> list, boolean[] zArr) {
        this.f37182a = str;
        this.f37183b = str2;
        this.f37184c = list;
        this.f37185d = zArr;
    }
}
