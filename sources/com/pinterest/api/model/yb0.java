package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class yb0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43995a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43996b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("creator_analytics")
    private Map<String, bg> f43997c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("questions")
    private List<ea0> f43998d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("results")
    private List<ge0> f43999e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f44000f;

    public /* synthetic */ yb0(String str, String str2, Map map, List list, List list2, boolean[] zArr, int i13) {
        this(str, str2, map, list, list2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yb0 yb0Var = (yb0) obj;
        return Objects.equals(this.f43995a, yb0Var.f43995a) && Objects.equals(this.f43996b, yb0Var.f43996b) && Objects.equals(this.f43997c, yb0Var.f43997c) && Objects.equals(this.f43998d, yb0Var.f43998d) && Objects.equals(this.f43999e, yb0Var.f43999e);
    }

    public final int hashCode() {
        return Objects.hash(this.f43995a, this.f43996b, this.f43997c, this.f43998d, this.f43999e);
    }

    public yb0() {
        this.f44000f = new boolean[5];
    }

    private yb0(@NonNull String str, String str2, Map<String, bg> map, List<ea0> list, List<ge0> list2, boolean[] zArr) {
        this.f43995a = str;
        this.f43996b = str2;
        this.f43997c = map;
        this.f43998d = list;
        this.f43999e = list2;
        this.f44000f = zArr;
    }
}
