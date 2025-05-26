package ap2;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes4.dex */
public final class b implements FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20327a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20328b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f20327a = i13;
        this.f20328b = obj;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i13 = this.f20327a;
        Object obj = this.f20328b;
        switch (i13) {
            case 0:
                return file.equals((File) obj);
            default:
                return file.getName().endsWith((String) obj);
        }
    }
}
