package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class km {

    /* renamed from: a, reason: collision with root package name */
    public Map f39489a;

    /* renamed from: b, reason: collision with root package name */
    public String f39490b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39491c;

    public /* synthetic */ km(int i13) {
        this();
    }

    private km() {
        this.f39491c = new boolean[2];
    }

    private km(@NonNull mm mmVar) {
        Map map;
        String str;
        map = mmVar.f40161a;
        this.f39489a = map;
        str = mmVar.f40162b;
        this.f39490b = str;
        boolean[] zArr = mmVar.f40163c;
        this.f39491c = Arrays.copyOf(zArr, zArr.length);
    }
}
