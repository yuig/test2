package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class yw implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44134a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44135b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("hair_pattern")
    private cx f44136c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("skin_tone")
    private cx f44137d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f44138e;

    public /* synthetic */ yw(String str, String str2, cx cxVar, cx cxVar2, boolean[] zArr, int i13) {
        this(str, str2, cxVar, cxVar2, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f44134a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yw ywVar = (yw) obj;
        return Objects.equals(this.f44134a, ywVar.f44134a) && Objects.equals(this.f44135b, ywVar.f44135b) && Objects.equals(this.f44136c, ywVar.f44136c) && Objects.equals(this.f44137d, ywVar.f44137d);
    }

    public final cx h() {
        return this.f44136c;
    }

    public final int hashCode() {
        return Objects.hash(this.f44134a, this.f44135b, this.f44136c, this.f44137d);
    }

    public final cx j() {
        return this.f44137d;
    }

    @Override // dl1.s
    public final String o() {
        return this.f44135b;
    }

    public yw() {
        this.f44138e = new boolean[4];
    }

    private yw(@NonNull String str, String str2, cx cxVar, cx cxVar2, boolean[] zArr) {
        this.f44134a = str;
        this.f44135b = str2;
        this.f44136c = cxVar;
        this.f44137d = cxVar2;
        this.f44138e = zArr;
    }
}
