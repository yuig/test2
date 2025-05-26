package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class z5 extends h5 {

    /* renamed from: a, reason: collision with root package name */
    public final a6 f31717a;

    /* renamed from: b, reason: collision with root package name */
    public a6 f31718b;

    public z5(a6 a6Var) {
        this.f31717a = a6Var;
        if (a6Var.q()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f31718b = (a6) a6Var.g(4);
    }

    public final z5 a(a6 a6Var) {
        a6 a6Var2 = this.f31717a;
        if (a6Var2.equals(a6Var)) {
            return this;
        }
        if (!this.f31718b.q()) {
            a6 a6Var3 = (a6) a6Var2.g(4);
            a6 a6Var4 = this.f31718b;
            j7 j7Var = j7.f31480c;
            j7Var.getClass();
            j7Var.a(a6Var3.getClass()).a(a6Var3, a6Var4);
            this.f31718b = a6Var3;
        }
        a6 a6Var5 = this.f31718b;
        j7 j7Var2 = j7.f31480c;
        j7Var2.getClass();
        j7Var2.a(a6Var5.getClass()).a(a6Var5, a6Var);
        return this;
    }

    public final a6 b() {
        a6 c13 = c();
        c13.getClass();
        if (a6.k(c13, true)) {
            return c13;
        }
        throw new zzlx("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final a6 c() {
        if (!this.f31718b.q()) {
            return this.f31718b;
        }
        this.f31718b.o();
        return this.f31718b;
    }

    public final /* synthetic */ Object clone() {
        z5 z5Var = (z5) this.f31717a.g(5);
        z5Var.f31718b = c();
        return z5Var;
    }

    public final void g() {
        if (this.f31718b.q()) {
            return;
        }
        a6 a6Var = (a6) this.f31717a.g(4);
        a6 a6Var2 = this.f31718b;
        j7 j7Var = j7.f31480c;
        j7Var.getClass();
        j7Var.a(a6Var.getClass()).a(a6Var, a6Var2);
        this.f31718b = a6Var;
    }

    public final void h(byte[] bArr, int i13, r5 r5Var) {
        if (!this.f31718b.q()) {
            a6 a6Var = (a6) this.f31717a.g(4);
            a6 a6Var2 = this.f31718b;
            j7 j7Var = j7.f31480c;
            j7Var.getClass();
            j7Var.a(a6Var.getClass()).a(a6Var, a6Var2);
            this.f31718b = a6Var;
        }
        try {
            j7 j7Var2 = j7.f31480c;
            a6 a6Var3 = this.f31718b;
            j7Var2.getClass();
            j7Var2.a(a6Var3.getClass()).e(this.f31718b, bArr, 0, i13, new l7.v(r5Var));
        } catch (zzji e13) {
            throw e13;
        } catch (IOException e14) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e14);
        } catch (IndexOutOfBoundsException unused) {
            throw zzji.d();
        }
    }
}
