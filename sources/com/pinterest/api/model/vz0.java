package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class vz0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43114a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43115b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("inspirational_signal")
    private rs f43116c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("merchant_id")
    private String f43117d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("status")
    private a f43118e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f43119f;

    /* loaded from: classes3.dex */
    public enum a {
        UNKNOWN,
        APPLIED,
        IN_REVIEW,
        ACCEPTED,
        NON_COMPLIANT,
        SUSPENDED,
        CANCELLED,
        APPEALED,
        OUTBOUND_LEAD,
        REJECTED,
        REJECTED_AUTO_ENROLL
    }

    public /* synthetic */ vz0(String str, String str2, rs rsVar, String str3, a aVar, boolean[] zArr, int i13) {
        this(str, str2, rsVar, str3, aVar, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f43114a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vz0 vz0Var = (vz0) obj;
        return Objects.equals(this.f43118e, vz0Var.f43118e) && Objects.equals(this.f43114a, vz0Var.f43114a) && Objects.equals(this.f43115b, vz0Var.f43115b) && Objects.equals(this.f43116c, vz0Var.f43116c) && Objects.equals(this.f43117d, vz0Var.f43117d);
    }

    public final int hashCode() {
        return Objects.hash(this.f43114a, this.f43115b, this.f43116c, this.f43117d, this.f43118e);
    }

    public final rs j() {
        return this.f43116c;
    }

    @Override // dl1.s
    public final String o() {
        return this.f43115b;
    }

    public vz0() {
        this.f43119f = new boolean[5];
    }

    private vz0(@NonNull String str, String str2, rs rsVar, @NonNull String str3, a aVar, boolean[] zArr) {
        this.f43114a = str;
        this.f43115b = str2;
        this.f43116c = rsVar;
        this.f43117d = str3;
        this.f43118e = aVar;
        this.f43119f = zArr;
    }
}
