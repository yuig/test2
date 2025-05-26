package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.vz0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class uz0 {

    /* renamed from: a, reason: collision with root package name */
    public String f42685a;

    /* renamed from: b, reason: collision with root package name */
    public String f42686b;

    /* renamed from: c, reason: collision with root package name */
    public rs f42687c;

    /* renamed from: d, reason: collision with root package name */
    public String f42688d;

    /* renamed from: e, reason: collision with root package name */
    public vz0.a f42689e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42690f;

    public /* synthetic */ uz0(int i13) {
        this();
    }

    private uz0() {
        this.f42690f = new boolean[5];
    }

    private uz0(@NonNull vz0 vz0Var) {
        String str;
        String str2;
        rs rsVar;
        String str3;
        vz0.a aVar;
        str = vz0Var.f43114a;
        this.f42685a = str;
        str2 = vz0Var.f43115b;
        this.f42686b = str2;
        rsVar = vz0Var.f43116c;
        this.f42687c = rsVar;
        str3 = vz0Var.f43117d;
        this.f42688d = str3;
        aVar = vz0Var.f43118e;
        this.f42689e = aVar;
        boolean[] zArr = vz0Var.f43119f;
        this.f42690f = Arrays.copyOf(zArr, zArr.length);
    }
}
