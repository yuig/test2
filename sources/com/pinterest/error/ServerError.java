package com.pinterest.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import og0.d;
import v.f1;
import xk2.m;
import xk2.v;
import yb2.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/error/ServerError;", "Lcom/pinterest/error/NetworkResponseError;", "<init>", "()V", "networking_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ServerError extends NetworkResponseError {

    /* renamed from: b, reason: collision with root package name */
    public boolean f45045b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45046c;

    /* renamed from: d, reason: collision with root package name */
    public final v f45047d;

    /* renamed from: e, reason: collision with root package name */
    public final v f45048e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerError(f1 response, String urlMessage) {
        super(response);
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(urlMessage, "urlMessage");
        this.f45047d = m.b(new d(this, 0));
        this.f45048e = m.b(new d(this, 1));
        this.f45046c = urlMessage;
    }

    public static final String a(ServerError serverError, boolean z13) {
        String str;
        f1 f1Var = serverError.f45043a;
        String str2 = null;
        qz.d c13 = a.c((f1Var != null ? (byte[]) f1Var.f123451d : null) != null ? new String((byte[]) f1Var.f123451d, Charsets.UTF_8) : "");
        if (z13) {
            String str3 = c13.f105384d;
            if ((str3 != null && str3.length() != 0) || ((str = c13.f105385e) != null && str.length() != 0)) {
                String str4 = c13.f105384d;
                if (str4 == null || str4.length() == 0) {
                    str2 = c13.f105385e;
                } else {
                    String str5 = c13.f105385e;
                    str2 = (str5 == null || str5.length() == 0) ? c13.f105384d : a.a.D(c13.f105384d, " ", c13.f105385e);
                }
            }
        } else {
            String str6 = c13.f105384d;
            if (str6 != null && str6.length() != 0) {
                str2 = c13.f105384d;
            }
        }
        return str2 == null ? serverError.getMessage() : str2;
    }

    public final String b() {
        return (String) this.f45047d.getValue();
    }

    public final void c() {
        this.f45045b = true;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        f1 f1Var = this.f45043a;
        String str = this.f45046c;
        if (str == null) {
            return f1Var != null ? f1Var.toString() : null;
        }
        if (f1Var == null) {
            return str;
        }
        return str + ", " + f1Var;
    }

    public ServerError() {
        super((f1) null);
        this.f45047d = m.b(new d(this, 0));
        this.f45048e = m.b(new d(this, 1));
    }
}
