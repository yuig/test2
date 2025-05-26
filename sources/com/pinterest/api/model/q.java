package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public String f41147a;

    /* renamed from: b, reason: collision with root package name */
    public String f41148b;

    /* renamed from: c, reason: collision with root package name */
    public String f41149c;

    /* renamed from: d, reason: collision with root package name */
    public zt0 f41150d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f41151e;

    /* renamed from: f, reason: collision with root package name */
    public String f41152f;

    /* renamed from: g, reason: collision with root package name */
    public Map f41153g;

    /* renamed from: h, reason: collision with root package name */
    public f30 f41154h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f41155i;

    public /* synthetic */ q(int i13) {
        this();
    }

    private q() {
        this.f41155i = new boolean[8];
    }

    private q(@NonNull r rVar) {
        String str;
        String str2;
        String str3;
        zt0 zt0Var;
        Integer num;
        String str4;
        Map map;
        f30 f30Var;
        str = rVar.f41452a;
        this.f41147a = str;
        str2 = rVar.f41453b;
        this.f41148b = str2;
        str3 = rVar.f41454c;
        this.f41149c = str3;
        zt0Var = rVar.f41455d;
        this.f41150d = zt0Var;
        num = rVar.f41456e;
        this.f41151e = num;
        str4 = rVar.f41457f;
        this.f41152f = str4;
        map = rVar.f41458g;
        this.f41153g = map;
        f30Var = rVar.f41459h;
        this.f41154h = f30Var;
        boolean[] zArr = rVar.f41460i;
        this.f41155i = Arrays.copyOf(zArr, zArr.length);
    }
}
