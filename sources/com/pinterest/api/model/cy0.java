package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class cy0 {

    /* renamed from: a, reason: collision with root package name */
    public String f36567a;

    /* renamed from: b, reason: collision with root package name */
    public String f36568b;

    /* renamed from: c, reason: collision with root package name */
    public d f36569c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f36570d;

    /* renamed from: e, reason: collision with root package name */
    public d f36571e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f36572f;

    public /* synthetic */ cy0(int i13) {
        this();
    }

    private cy0() {
        this.f36572f = new boolean[5];
    }

    private cy0(@NonNull fy0 fy0Var) {
        String str;
        String str2;
        d dVar;
        Boolean bool;
        d dVar2;
        str = fy0Var.f37854a;
        this.f36567a = str;
        str2 = fy0Var.f37855b;
        this.f36568b = str2;
        dVar = fy0Var.f37856c;
        this.f36569c = dVar;
        bool = fy0Var.f37857d;
        this.f36570d = bool;
        dVar2 = fy0Var.f37858e;
        this.f36571e = dVar2;
        boolean[] zArr = fy0Var.f37859f;
        this.f36572f = Arrays.copyOf(zArr, zArr.length);
    }
}
