package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class qb {

    /* renamed from: a, reason: collision with root package name */
    public String f41252a;

    /* renamed from: b, reason: collision with root package name */
    public String f41253b;

    /* renamed from: c, reason: collision with root package name */
    public u5 f41254c;

    /* renamed from: d, reason: collision with root package name */
    public k4 f41255d;

    /* renamed from: e, reason: collision with root package name */
    public f30 f41256e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41257f;

    public /* synthetic */ qb(int i13) {
        this();
    }

    private qb() {
        this.f41257f = new boolean[5];
    }

    private qb(@NonNull tb tbVar) {
        String str;
        String str2;
        u5 u5Var;
        k4 k4Var;
        f30 f30Var;
        str = tbVar.f42151a;
        this.f41252a = str;
        str2 = tbVar.f42152b;
        this.f41253b = str2;
        u5Var = tbVar.f42153c;
        this.f41254c = u5Var;
        k4Var = tbVar.f42154d;
        this.f41255d = k4Var;
        f30Var = tbVar.f42155e;
        this.f41256e = f30Var;
        boolean[] zArr = tbVar.f42156f;
        this.f41257f = Arrays.copyOf(zArr, zArr.length);
    }
}
