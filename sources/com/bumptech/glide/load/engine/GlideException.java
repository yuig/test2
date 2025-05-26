package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import nd.a;
import nd.h;
import pd.b0;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public static final StackTraceElement[] f29820f = new StackTraceElement[0];

    /* renamed from: a, reason: collision with root package name */
    public final List f29821a;

    /* renamed from: b, reason: collision with root package name */
    public h f29822b;

    /* renamed from: c, reason: collision with root package name */
    public a f29823c;

    /* renamed from: d, reason: collision with root package name */
    public Class f29824d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29825e;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th3, ArrayList arrayList) {
        if (!(th3 instanceof GlideException)) {
            arrayList.add(th3);
            return;
        }
        Iterator it = ((GlideException) th3).f29821a.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, b0 b0Var) {
        try {
            c(list, b0Var);
        } catch (IOException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static void c(List list, b0 b0Var) {
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            b0Var.append("Cause (");
            int i14 = i13 + 1;
            b0Var.append(String.valueOf(i14));
            b0Var.append(" of ");
            b0Var.append(String.valueOf(size));
            b0Var.append("): ");
            Throwable th3 = (Throwable) list.get(i13);
            if (th3 instanceof GlideException) {
                ((GlideException) th3).f(b0Var);
            } else {
                d(th3, b0Var);
            }
            i13 = i14;
        }
    }

    public static void d(Throwable th3, Appendable appendable) {
        try {
            appendable.append(th3.getClass().toString()).append(": ").append(th3.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th3);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            StringBuilder sb3 = new StringBuilder("Root cause (");
            int i14 = i13 + 1;
            sb3.append(i14);
            sb3.append(" of ");
            sb3.append(size);
            sb3.append(")");
            Log.i("Glide", sb3.toString(), (Throwable) arrayList.get(i13));
            i13 = i14;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f29821a, new b0(appendable));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    public final void g(h hVar, a aVar) {
        this.f29822b = hVar;
        this.f29823c = aVar;
        this.f29824d = null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb3 = new StringBuilder(71);
        sb3.append(this.f29825e);
        String str3 = "";
        if (this.f29824d != null) {
            str = ", " + this.f29824d;
        } else {
            str = "";
        }
        sb3.append(str);
        if (this.f29823c != null) {
            str2 = ", " + this.f29823c;
        } else {
            str2 = "";
        }
        sb3.append(str2);
        if (this.f29822b != null) {
            str3 = ", " + this.f29822b;
        }
        sb3.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb3.toString();
        }
        if (arrayList.size() == 1) {
            sb3.append("\nThere was 1 root cause:");
        } else {
            sb3.append("\nThere were ");
            sb3.append(arrayList.size());
            sb3.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            sb3.append('\n');
            sb3.append(th3.getClass().getName());
            sb3.append('(');
            sb3.append(th3.getMessage());
            sb3.append(')');
        }
        sb3.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb3.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        f(System.err);
    }

    public GlideException(String str, List list) {
        this.f29825e = str;
        setStackTrace(f29820f);
        this.f29821a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}
