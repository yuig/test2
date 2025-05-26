package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ky {

    /* renamed from: a, reason: collision with root package name */
    public String f39563a;

    /* renamed from: b, reason: collision with root package name */
    public String f39564b;

    /* renamed from: c, reason: collision with root package name */
    public yy f39565c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f39566d;

    public /* synthetic */ ky(int i13) {
        this();
    }

    private ky() {
        this.f39566d = new boolean[3];
    }

    private ky(@NonNull ny nyVar) {
        String str;
        String str2;
        yy yyVar;
        str = nyVar.f40532a;
        this.f39563a = str;
        str2 = nyVar.f40533b;
        this.f39564b = str2;
        yyVar = nyVar.f40534c;
        this.f39565c = yyVar;
        boolean[] zArr = nyVar.f40535d;
        this.f39566d = Arrays.copyOf(zArr, zArr.length);
    }
}
