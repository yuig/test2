package h7;

import java.io.File;

/* loaded from: classes.dex */
public abstract class j implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f67892a;

    /* renamed from: b, reason: collision with root package name */
    public final long f67893b;

    /* renamed from: c, reason: collision with root package name */
    public final long f67894c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f67895d;

    /* renamed from: e, reason: collision with root package name */
    public final File f67896e;

    /* renamed from: f, reason: collision with root package name */
    public final long f67897f;

    public j(String str, long j13, long j14, long j15, File file) {
        this.f67892a = str;
        this.f67893b = j13;
        this.f67894c = j14;
        this.f67895d = file != null;
        this.f67896e = file;
        this.f67897f = j15;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        String str = jVar.f67892a;
        String str2 = this.f67892a;
        if (!str2.equals(str)) {
            return str2.compareTo(jVar.f67892a);
        }
        long j13 = this.f67893b - jVar.f67893b;
        if (j13 == 0) {
            return 0;
        }
        return j13 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(this.f67893b);
        sb3.append(", ");
        return a.a.o(sb3, this.f67894c, "]");
    }
}
