package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.wz;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes.dex */
public final class vz {

    /* renamed from: a, reason: collision with root package name */
    public String f43101a;

    /* renamed from: b, reason: collision with root package name */
    public wz.a f43102b;

    /* renamed from: c, reason: collision with root package name */
    public wz.b f43103c;

    /* renamed from: d, reason: collision with root package name */
    public String f43104d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f43105e;

    /* renamed from: f, reason: collision with root package name */
    public String f43106f;

    /* renamed from: g, reason: collision with root package name */
    public String f43107g;

    /* renamed from: h, reason: collision with root package name */
    public String f43108h;

    /* renamed from: i, reason: collision with root package name */
    public String f43109i;

    /* renamed from: j, reason: collision with root package name */
    public Date f43110j;

    /* renamed from: k, reason: collision with root package name */
    public Date f43111k;

    /* renamed from: l, reason: collision with root package name */
    public String f43112l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f43113m;

    public /* synthetic */ vz(int i13) {
        this();
    }

    public final void a(String str) {
        this.f43101a = str;
        boolean[] zArr = this.f43113m;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void b(String str) {
        this.f43106f = str;
        boolean[] zArr = this.f43113m;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void c(String str) {
        this.f43107g = str;
        boolean[] zArr = this.f43113m;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    public final void d(Date date) {
        this.f43110j = date;
        boolean[] zArr = this.f43113m;
        if (zArr.length > 9) {
            zArr[9] = true;
        }
    }

    public final void e(Date date) {
        this.f43111k = date;
        boolean[] zArr = this.f43113m;
        if (zArr.length > 10) {
            zArr[10] = true;
        }
    }

    private vz() {
        this.f43113m = new boolean[12];
    }

    private vz(@NonNull wz wzVar) {
        String str;
        wz.a aVar;
        wz.b bVar;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        String str6;
        Date date;
        Date date2;
        String str7;
        str = wzVar.f43502a;
        this.f43101a = str;
        aVar = wzVar.f43503b;
        this.f43102b = aVar;
        bVar = wzVar.f43504c;
        this.f43103c = bVar;
        str2 = wzVar.f43505d;
        this.f43104d = str2;
        bool = wzVar.f43506e;
        this.f43105e = bool;
        str3 = wzVar.f43507f;
        this.f43106f = str3;
        str4 = wzVar.f43508g;
        this.f43107g = str4;
        str5 = wzVar.f43509h;
        this.f43108h = str5;
        str6 = wzVar.f43510i;
        this.f43109i = str6;
        date = wzVar.f43511j;
        this.f43110j = date;
        date2 = wzVar.f43512k;
        this.f43111k = date2;
        str7 = wzVar.f43513l;
        this.f43112l = str7;
        boolean[] zArr = wzVar.f43514m;
        this.f43113m = Arrays.copyOf(zArr, zArr.length);
    }
}
