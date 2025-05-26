package h7;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x extends j {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f67945g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f67946h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f67947i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d1, code lost:
    
        if (r16.renameTo(r1) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h7.x b(java.io.File r16, long r17, long r19, androidx.appcompat.widget.x r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.x.b(java.io.File, long, long, androidx.appcompat.widget.x):h7.x");
    }

    public static File c(File file, int i13, long j13, long j14) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i13);
        sb3.append(".");
        sb3.append(j13);
        sb3.append(".");
        return new File(file, a.a.o(sb3, j14, ".v3.exo"));
    }
}
