package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class qz implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41442a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41443b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("background_color")
    private String f41444c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("display_name")
    private String f41445d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("pin")
    private f30 f41446e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    @om.b("pins")
    private List<f30> f41447f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f41448g;

    public /* synthetic */ qz(String str, String str2, String str3, String str4, f30 f30Var, List list, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, f30Var, list, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f41442a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qz qzVar = (qz) obj;
        return Objects.equals(this.f41442a, qzVar.f41442a) && Objects.equals(this.f41443b, qzVar.f41443b) && Objects.equals(this.f41444c, qzVar.f41444c) && Objects.equals(this.f41445d, qzVar.f41445d) && Objects.equals(this.f41446e, qzVar.f41446e) && Objects.equals(this.f41447f, qzVar.f41447f);
    }

    public final int hashCode() {
        return Objects.hash(this.f41442a, this.f41443b, this.f41444c, this.f41445d, this.f41446e, this.f41447f);
    }

    public final String k() {
        return this.f41444c;
    }

    public final String l() {
        return this.f41445d;
    }

    public final f30 n() {
        return this.f41446e;
    }

    @Override // dl1.s
    public final String o() {
        return this.f41443b;
    }

    public final List q() {
        return this.f41447f;
    }

    public qz() {
        this.f41448g = new boolean[6];
    }

    private qz(@NonNull String str, String str2, @NonNull String str3, @NonNull String str4, f30 f30Var, @NonNull List<f30> list, boolean[] zArr) {
        this.f41442a = str;
        this.f41443b = str2;
        this.f41444c = str3;
        this.f41445d = str4;
        this.f41446e = f30Var;
        this.f41447f = list;
        this.f41448g = zArr;
    }
}
