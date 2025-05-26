package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class uz implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42680a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42681b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("display_name")
    private String f42682c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("pins")
    private List<f30> f42683d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f42684e;

    public /* synthetic */ uz(String str, String str2, String str3, List list, boolean[] zArr, int i13) {
        this(str, str2, str3, list, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f42680a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        uz uzVar = (uz) obj;
        return Objects.equals(this.f42680a, uzVar.f42680a) && Objects.equals(this.f42681b, uzVar.f42681b) && Objects.equals(this.f42682c, uzVar.f42682c) && Objects.equals(this.f42683d, uzVar.f42683d);
    }

    public final List h() {
        return this.f42683d;
    }

    public final int hashCode() {
        return Objects.hash(this.f42680a, this.f42681b, this.f42682c, this.f42683d);
    }

    @Override // dl1.s
    public final String o() {
        return this.f42681b;
    }

    public uz() {
        this.f42684e = new boolean[4];
    }

    private uz(@NonNull String str, String str2, @NonNull String str3, @NonNull List<f30> list, boolean[] zArr) {
        this.f42680a = str;
        this.f42681b = str2;
        this.f42682c = str3;
        this.f42683d = list;
        this.f42684e = zArr;
    }
}
