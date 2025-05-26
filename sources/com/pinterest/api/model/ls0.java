package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ls0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39874a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39875b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("board_title_slots_id")
    private List<String> f39876c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("username_slots_id")
    private List<String> f39877d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f39878e;

    public /* synthetic */ ls0(String str, String str2, List list, List list2, boolean[] zArr, int i13) {
        this(str, str2, list, list2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ls0 ls0Var = (ls0) obj;
        return Objects.equals(this.f39874a, ls0Var.f39874a) && Objects.equals(this.f39875b, ls0Var.f39875b) && Objects.equals(this.f39876c, ls0Var.f39876c) && Objects.equals(this.f39877d, ls0Var.f39877d);
    }

    public final int hashCode() {
        return Objects.hash(this.f39874a, this.f39875b, this.f39876c, this.f39877d);
    }

    public ls0() {
        this.f39878e = new boolean[4];
    }

    private ls0(@NonNull String str, String str2, @NonNull List<String> list, @NonNull List<String> list2, boolean[] zArr) {
        this.f39874a = str;
        this.f39875b = str2;
        this.f39876c = list;
        this.f39877d = list2;
        this.f39878e = zArr;
    }
}
