package kd;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f79192a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f79193b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f79194c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f79195d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f79196e;

    /* renamed from: f, reason: collision with root package name */
    public m7.c f79197f;

    /* renamed from: g, reason: collision with root package name */
    public long f79198g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f79199h;

    public c(d dVar, String str) {
        this.f79199h = dVar;
        this.f79192a = str;
        int i13 = dVar.f79206g;
        this.f79193b = new long[i13];
        this.f79194c = new File[i13];
        this.f79195d = new File[i13];
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append('.');
        int length = sb3.length();
        for (int i14 = 0; i14 < dVar.f79206g; i14++) {
            sb3.append(i14);
            File[] fileArr = this.f79194c;
            String sb4 = sb3.toString();
            File file = dVar.f79200a;
            fileArr[i14] = new File(file, sb4);
            sb3.append(".tmp");
            this.f79195d[i14] = new File(file, sb3.toString());
            sb3.setLength(length);
        }
    }

    public static void b(String[] strArr) {
        throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
    }

    public final String a() {
        StringBuilder sb3 = new StringBuilder();
        for (long j13 : this.f79193b) {
            sb3.append(' ');
            sb3.append(j13);
        }
        return sb3.toString();
    }
}
