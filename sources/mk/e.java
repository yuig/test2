package mk;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f87312a = new e();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i13 = a.f87285p;
        return file.getName().endsWith(".apk");
    }
}
