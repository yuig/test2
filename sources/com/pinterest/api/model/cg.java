package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class cg {

    /* renamed from: a, reason: collision with root package name */
    public Integer f36412a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f36413b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f36414c;

    public /* synthetic */ cg(int i13) {
        this();
    }

    private cg() {
        this.f36414c = new boolean[2];
    }

    private cg(@NonNull fg fgVar) {
        Integer num;
        Integer num2;
        num = fgVar.f37659a;
        this.f36412a = num;
        num2 = fgVar.f37660b;
        this.f36413b = num2;
        boolean[] zArr = fgVar.f37661c;
        this.f36414c = Arrays.copyOf(zArr, zArr.length);
    }
}
