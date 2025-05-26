package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zk {

    /* renamed from: a, reason: collision with root package name */
    public String f44367a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f44368b;

    /* renamed from: c, reason: collision with root package name */
    public wy0 f44369c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f44370d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f44371e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f44372f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f44373g;

    public /* synthetic */ zk(int i13) {
        this();
    }

    private zk() {
        this.f44373g = new boolean[6];
    }

    private zk(@NonNull cl clVar) {
        String str;
        Integer num;
        wy0 wy0Var;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        str = clVar.f36459a;
        this.f44367a = str;
        num = clVar.f36460b;
        this.f44368b = num;
        wy0Var = clVar.f36461c;
        this.f44369c = wy0Var;
        bool = clVar.f36462d;
        this.f44370d = bool;
        bool2 = clVar.f36463e;
        this.f44371e = bool2;
        bool3 = clVar.f36464f;
        this.f44372f = bool3;
        boolean[] zArr = clVar.f36465g;
        this.f44373g = Arrays.copyOf(zArr, zArr.length);
    }
}
