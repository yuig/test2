package sd;

import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class e implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112308a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f112309b;

    public /* synthetic */ e(Serializable serializable, int i13) {
        this.f112308a = i13;
        this.f112309b = serializable;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i13 = this.f112308a;
        Serializable serializable = this.f112309b;
        switch (i13) {
            case 0:
                return ((Pattern) serializable).matcher(str).matches();
            case 1:
                return ((Pattern) serializable).matcher(str).matches();
            default:
                return str.endsWith((String) serializable);
        }
    }

    public e(Pattern pattern) {
        this.f112308a = 1;
        pattern.getClass();
        this.f112309b = pattern;
    }
}
