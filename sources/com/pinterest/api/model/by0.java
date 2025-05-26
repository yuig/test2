package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class by0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36226a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36227b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("owner_account_email")
    private String f36228c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f36229d;

    public /* synthetic */ by0(String str, String str2, String str3, boolean[] zArr, int i13) {
        this(str, str2, str3, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f36226a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        by0 by0Var = (by0) obj;
        return Objects.equals(this.f36226a, by0Var.f36226a) && Objects.equals(this.f36227b, by0Var.f36227b) && Objects.equals(this.f36228c, by0Var.f36228c);
    }

    public final int hashCode() {
        return Objects.hash(this.f36226a, this.f36227b, this.f36228c);
    }

    @Override // dl1.s
    public final String o() {
        return this.f36227b;
    }

    public by0() {
        this.f36229d = new boolean[3];
    }

    private by0(@NonNull String str, String str2, String str3, boolean[] zArr) {
        this.f36226a = str;
        this.f36227b = str2;
        this.f36228c = str3;
        this.f36229d = zArr;
    }
}
