package com.bugsnag.android;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Writer;

/* loaded from: classes3.dex */
public final class o1 extends p1 {

    /* renamed from: h, reason: collision with root package name */
    public final e2 f29397h;

    /* renamed from: i, reason: collision with root package name */
    public final Writer f29398i;

    public o1(Writer writer) {
        super(writer);
        this.f29412f = false;
        this.f29398i = writer;
        this.f29397h = new e2();
    }

    public final void K(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f29411e != null) {
            throw new IllegalStateException();
        }
        if (this.f29409c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f29411e = str;
    }

    public final void L(File file) {
        Throwable th3;
        BufferedReader bufferedReader;
        if (file == null || file.length() <= 0) {
            return;
        }
        flush();
        a();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            try {
                char[] cArr = new char[4096];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    Writer writer = this.f29398i;
                    if (-1 == read) {
                        kh2.m2.q0(bufferedReader);
                        writer.flush();
                        return;
                    }
                    writer.write(cArr, 0, read);
                }
            } catch (Throwable th4) {
                th3 = th4;
                kh2.m2.q0(bufferedReader);
                throw th3;
            }
        } catch (Throwable th5) {
            th3 = th5;
            bufferedReader = null;
        }
    }

    public final void M(Object obj) {
        if (obj instanceof File) {
            L((File) obj);
        } else if (obj instanceof n1) {
            ((n1) obj).toStream(this);
        } else {
            this.f29397h.a(obj, this, false);
        }
    }

    public o1(o1 o1Var, e2 e2Var) {
        super(o1Var.f29398i);
        this.f29412f = o1Var.f29412f;
        this.f29398i = o1Var.f29398i;
        this.f29397h = e2Var;
    }
}
