package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class si0 {

    /* renamed from: a, reason: collision with root package name */
    public String f41921a;

    /* renamed from: b, reason: collision with root package name */
    public String f41922b;

    /* renamed from: c, reason: collision with root package name */
    public wy0 f41923c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41924d;

    public /* synthetic */ si0(int i13) {
        this();
    }

    private si0() {
        this.f41924d = new boolean[3];
    }

    private si0(@NonNull vi0 vi0Var) {
        String str;
        String str2;
        wy0 wy0Var;
        str = vi0Var.f42880a;
        this.f41921a = str;
        str2 = vi0Var.f42881b;
        this.f41922b = str2;
        wy0Var = vi0Var.f42882c;
        this.f41923c = wy0Var;
        boolean[] zArr = vi0Var.f42883d;
        this.f41924d = Arrays.copyOf(zArr, zArr.length);
    }
}
