package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class z90 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44249a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44250b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("creator_analytics")
    private Map<String, bg> f44251c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("questions")
    private List<ea0> f44252d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("results")
    private List<ge0> f44253e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f44254f;

    public /* synthetic */ z90(String str, String str2, Map map, List list, List list2, boolean[] zArr, int i13) {
        this(str, str2, map, list, list2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z90 z90Var = (z90) obj;
        return Objects.equals(this.f44249a, z90Var.f44249a) && Objects.equals(this.f44250b, z90Var.f44250b) && Objects.equals(this.f44251c, z90Var.f44251c) && Objects.equals(this.f44252d, z90Var.f44252d) && Objects.equals(this.f44253e, z90Var.f44253e);
    }

    public final List f() {
        return this.f44252d;
    }

    public final List g() {
        return this.f44253e;
    }

    public final int hashCode() {
        return Objects.hash(this.f44249a, this.f44250b, this.f44251c, this.f44252d, this.f44253e);
    }

    public z90() {
        this.f44254f = new boolean[5];
    }

    private z90(@NonNull String str, String str2, Map<String, bg> map, List<ea0> list, List<ge0> list2, boolean[] zArr) {
        this.f44249a = str;
        this.f44250b = str2;
        this.f44251c = map;
        this.f44252d = list;
        this.f44253e = list2;
        this.f44254f = zArr;
    }
}
