package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class hf {

    /* renamed from: a, reason: collision with root package name */
    public gf f38407a;

    /* renamed from: b, reason: collision with root package name */
    public gf f38408b;

    /* renamed from: c, reason: collision with root package name */
    public gf f38409c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f38410d;

    public /* synthetic */ hf(int i13) {
        this();
    }

    private hf() {
        this.f38410d = new boolean[3];
    }

    private hf(@NonNull kf kfVar) {
        gf gfVar;
        gf gfVar2;
        gf gfVar3;
        gfVar = kfVar.f39423a;
        this.f38407a = gfVar;
        gfVar2 = kfVar.f39424b;
        this.f38408b = gfVar2;
        gfVar3 = kfVar.f39425c;
        this.f38409c = gfVar3;
        boolean[] zArr = kfVar.f39426d;
        this.f38410d = Arrays.copyOf(zArr, zArr.length);
    }
}
