package com.bugsnag.android;

import java.io.File;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class a1 implements n1, c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29141a;

    /* renamed from: b, reason: collision with root package name */
    public final hd.h f29142b;

    /* renamed from: c, reason: collision with root package name */
    public x0 f29143c;

    /* renamed from: d, reason: collision with root package name */
    public final File f29144d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f29145e;

    /* renamed from: f, reason: collision with root package name */
    public final c2 f29146f;

    public a1(String str, x0 x0Var, File file, c2 c2Var, hd.h hVar) {
        this.f29141a = str;
        this.f29142b = hVar;
        this.f29143c = x0Var;
        this.f29144d = file;
        c2 c2Var2 = new c2(c2Var.f29176a, c2Var.f29177b, c2Var.f29178c);
        c2Var2.f29179d = CollectionsKt.H0(c2Var.f29179d);
        this.f29146f = c2Var2;
    }

    @Override // com.bugsnag.android.c0
    public final byte[] a() {
        byte[] bArr = this.f29145e;
        if (bArr != null) {
            return bArr;
        }
        byte[] c13 = hd.l.c(this);
        this.f29145e = c13;
        return c13;
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.d();
        o1Var.K("apiKey");
        o1Var.z(this.f29141a);
        o1Var.K("payloadVersion");
        o1Var.z("4.0");
        o1Var.K("notifier");
        o1Var.M(this.f29146f);
        o1Var.K("events");
        o1Var.c();
        x0 x0Var = this.f29143c;
        if (x0Var != null) {
            o1Var.M(x0Var);
        } else {
            File file = this.f29144d;
            if (file != null) {
                o1Var.M(file);
            }
        }
        o1Var.f();
        o1Var.g();
    }
}
