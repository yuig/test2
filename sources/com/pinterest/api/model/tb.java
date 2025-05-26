package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class tb implements dl1.s {

    /* renamed from: a */
    @NonNull
    @om.b("id")
    private String f42151a;

    /* renamed from: b */
    @om.b("node_id")
    private String f42152b;

    /* renamed from: c */
    @om.b("metadata")
    private u5 f42153c;

    /* renamed from: d */
    @om.b("metrics")
    private k4 f42154d;

    /* renamed from: e */
    @om.b("pin")
    private f30 f42155e;

    /* renamed from: f */
    public final boolean[] f42156f;

    public /* synthetic */ tb(String str, String str2, u5 u5Var, k4 k4Var, f30 f30Var, boolean[] zArr, int i13) {
        this(str, str2, u5Var, k4Var, f30Var, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f42151a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tb tbVar = (tb) obj;
        return Objects.equals(this.f42151a, tbVar.f42151a) && Objects.equals(this.f42152b, tbVar.f42152b) && Objects.equals(this.f42153c, tbVar.f42153c) && Objects.equals(this.f42154d, tbVar.f42154d) && Objects.equals(this.f42155e, tbVar.f42155e);
    }

    public final int hashCode() {
        return Objects.hash(this.f42151a, this.f42152b, this.f42153c, this.f42154d, this.f42155e);
    }

    public final u5 j() {
        return this.f42153c;
    }

    public final k4 k() {
        return this.f42154d;
    }

    public final f30 l() {
        return this.f42155e;
    }

    @Override // dl1.s
    public final String o() {
        return this.f42152b;
    }

    public tb() {
        this.f42156f = new boolean[5];
    }

    private tb(@NonNull String str, String str2, u5 u5Var, k4 k4Var, f30 f30Var, boolean[] zArr) {
        this.f42151a = str;
        this.f42152b = str2;
        this.f42153c = u5Var;
        this.f42154d = k4Var;
        this.f42155e = f30Var;
        this.f42156f = zArr;
    }
}
