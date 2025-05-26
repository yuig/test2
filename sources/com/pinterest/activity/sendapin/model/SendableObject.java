package com.pinterest.activity.sendapin.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs1.b;
import bs1.c;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hk0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.api.model.y40;
import com.pinterest.api.model.zv0;
import dl1.s;
import java.util.ArrayList;
import m60.x0;
import oi.e7;
import p32.i;
import pk.a0;

/* loaded from: classes3.dex */
public final class SendableObject implements Parcelable {
    public static final Parcelable.Creator<SendableObject> CREATOR = new e7(25);

    /* renamed from: a, reason: collision with root package name */
    public String f35127a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f35128b;

    /* renamed from: c, reason: collision with root package name */
    public int f35129c;

    /* renamed from: d, reason: collision with root package name */
    public String f35130d;

    /* renamed from: e, reason: collision with root package name */
    public String f35131e;

    /* renamed from: f, reason: collision with root package name */
    public String f35132f;

    /* renamed from: g, reason: collision with root package name */
    public String f35133g;

    /* renamed from: h, reason: collision with root package name */
    public String f35134h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f35135i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35136j;

    /* renamed from: k, reason: collision with root package name */
    public String f35137k;

    /* renamed from: l, reason: collision with root package name */
    public final String f35138l;

    public SendableObject(String str, int i13) {
        this.f35135i = false;
        this.f35136j = false;
        this.f35137k = null;
        this.f35127a = str;
        this.f35129c = i13;
    }

    public final String a() {
        return this.f35137k;
    }

    public final i b() {
        int i13 = this.f35129c;
        if (i13 == 0) {
            return i.PIN;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                return i.PINNER;
            }
            if (i13 == 3) {
                return i.ARTICLE;
            }
            if (i13 == 4) {
                return i.DID_IT;
            }
            if (i13 == 5) {
                return i.TODAY_ARTICLE;
            }
            if (i13 == 7) {
                return i.SHOPPING_SPOTLIGHT;
            }
            if (i13 != 8) {
                return i13 != 12 ? i13 != 13 ? i.NONE : i.QUIZ_OUTPUT : i.QUIZ;
            }
        }
        return i.BOARD;
    }

    public final String d() {
        String str = this.f35127a;
        return str != null ? str : "";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f35129c == 1;
    }

    public final boolean f() {
        return this.f35129c == 4;
    }

    public final boolean g() {
        return this.f35129c == 0;
    }

    public final boolean h() {
        return this.f35129c == 0 && this.f35135i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f35127a);
        parcel.writeStringList(this.f35128b);
        parcel.writeInt(this.f35129c);
        parcel.writeString(this.f35130d);
        parcel.writeString(this.f35131e);
        parcel.writeString(this.f35132f);
        parcel.writeString(this.f35133g);
        parcel.writeString(this.f35134h);
        parcel.writeByte(this.f35135i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35136j ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f35137k);
    }

    public SendableObject(s sVar) {
        this.f35135i = false;
        this.f35136j = false;
        this.f35137k = null;
        this.f35127a = sVar.getId();
        if (sVar instanceof f30) {
            this.f35129c = 0;
            f30 f30Var = (f30) sVar;
            sr a13 = b.a(f30Var, as1.b.a());
            if (a13 != null) {
                this.f35130d = a13.j();
            }
            String S = b40.S(f30Var);
            this.f35131e = S == null ? "" : S;
            if (f30Var.c4() != null) {
                this.f35133g = f30Var.c4();
            } else {
                this.f35133g = "";
            }
            this.f35133g.getClass();
            if (f30Var.L3() != null) {
                this.f35138l = f30Var.L3().Z2();
            }
            String str = this.f35138l;
            if (str == null || str.isEmpty()) {
                this.f35138l = f30Var.h4();
            }
            this.f35135i = b40.Q0(f30Var);
            this.f35136j = b40.O0(f30Var);
            return;
        }
        if (sVar instanceof v7) {
            this.f35129c = 1;
            v7 v7Var = (v7) sVar;
            this.f35130d = v7Var.a1();
            this.f35132f = v7Var.j1();
            return;
        }
        if (sVar instanceof wy0) {
            this.f35129c = 2;
            return;
        }
        boolean z13 = sVar instanceof vh;
        if (z13 && a0.N(((vh) sVar).q(), "explorearticle")) {
            this.f35129c = 3;
            return;
        }
        if (z13 && a0.N(((vh) sVar).v(), "explorearticle")) {
            this.f35129c = 3;
            return;
        }
        if (sVar instanceof xk) {
            if (((xk) sVar).j().intValue() == hk0.SHOPPING_SPOTLIGHT.getValue()) {
                this.f35129c = 7;
                return;
            } else {
                this.f35129c = 3;
                return;
            }
        }
        if (sVar instanceof az0) {
            this.f35129c = 4;
            return;
        }
        if (sVar instanceof zv0) {
            this.f35129c = 5;
            this.f35134h = c.b2(x0.today_tab_check_out_this_article);
        } else if (sVar instanceof y40) {
            this.f35129c = 14;
        } else {
            throw new UnsupportedOperationException("Model type not supported in SendableObject " + sVar);
        }
    }
}
