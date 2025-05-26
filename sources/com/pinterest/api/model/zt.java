package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zt {

    /* renamed from: a, reason: collision with root package name */
    public String f44453a;

    /* renamed from: b, reason: collision with root package name */
    public String f44454b;

    /* renamed from: c, reason: collision with root package name */
    public String f44455c;

    /* renamed from: d, reason: collision with root package name */
    public String f44456d;

    /* renamed from: e, reason: collision with root package name */
    public String f44457e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f44458f;

    public /* synthetic */ zt(int i13) {
        this();
    }

    private zt() {
        this.f44458f = new boolean[5];
    }

    private zt(@NonNull cu cuVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        str = cuVar.f36525a;
        this.f44453a = str;
        str2 = cuVar.f36526b;
        this.f44454b = str2;
        str3 = cuVar.f36527c;
        this.f44455c = str3;
        str4 = cuVar.f36528d;
        this.f44456d = str4;
        str5 = cuVar.f36529e;
        this.f44457e = str5;
        boolean[] zArr = cuVar.f36530f;
        this.f44458f = Arrays.copyOf(zArr, zArr.length);
    }
}
