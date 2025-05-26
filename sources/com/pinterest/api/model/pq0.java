package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class pq0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f41058a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("block_style")
    private zk0 f41059b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("type")
    private String f41060c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("video")
    private vq0 f41061d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("video_signature")
    private String f41062e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41063f;

    public /* synthetic */ pq0(Integer num, zk0 zk0Var, String str, vq0 vq0Var, String str2, boolean[] zArr, int i13) {
        this(num, zk0Var, str, vq0Var, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pq0 pq0Var = (pq0) obj;
        return Objects.equals(this.f41058a, pq0Var.f41058a) && Objects.equals(this.f41059b, pq0Var.f41059b) && Objects.equals(this.f41060c, pq0Var.f41060c) && Objects.equals(this.f41061d, pq0Var.f41061d) && Objects.equals(this.f41062e, pq0Var.f41062e);
    }

    public final zk0 f() {
        return this.f41059b;
    }

    public final vq0 g() {
        return this.f41061d;
    }

    public final String h() {
        return this.f41062e;
    }

    public final int hashCode() {
        return Objects.hash(this.f41058a, this.f41059b, this.f41060c, this.f41061d, this.f41062e);
    }

    public pq0() {
        this.f41063f = new boolean[5];
    }

    private pq0(Integer num, zk0 zk0Var, String str, vq0 vq0Var, @NonNull String str2, boolean[] zArr) {
        this.f41058a = num;
        this.f41059b = zk0Var;
        this.f41060c = str;
        this.f41061d = vq0Var;
        this.f41062e = str2;
        this.f41063f = zArr;
    }
}
