package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class uc {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42503a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42504b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("background_item")
    private kd f42505c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("items")
    private List<kd> f42506d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("pin")
    private f30 f42507e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42508f;

    public /* synthetic */ uc(String str, String str2, kd kdVar, List list, f30 f30Var, boolean[] zArr, int i13) {
        this(str, str2, kdVar, list, f30Var, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        uc ucVar = (uc) obj;
        return Objects.equals(this.f42503a, ucVar.f42503a) && Objects.equals(this.f42504b, ucVar.f42504b) && Objects.equals(this.f42505c, ucVar.f42505c) && Objects.equals(this.f42506d, ucVar.f42506d) && Objects.equals(this.f42507e, ucVar.f42507e);
    }

    public final int hashCode() {
        return Objects.hash(this.f42503a, this.f42504b, this.f42505c, this.f42506d, this.f42507e);
    }

    public uc() {
        this.f42508f = new boolean[5];
    }

    private uc(@NonNull String str, String str2, kd kdVar, List<kd> list, f30 f30Var, boolean[] zArr) {
        this.f42503a = str;
        this.f42504b = str2;
        this.f42505c = kdVar;
        this.f42506d = list;
        this.f42507e = f30Var;
        this.f42508f = zArr;
    }
}
