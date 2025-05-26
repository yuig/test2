package df;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54750a;

    public /* synthetic */ f0(int i13) {
        this.f54750a = i13;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String filename) {
        switch (this.f54750a) {
            case 0:
                Intrinsics.checkNotNullExpressionValue(filename, "filename");
                return !kotlin.text.z.p(filename, "buffer", false);
            case 1:
                Intrinsics.checkNotNullExpressionValue(filename, "filename");
                return kotlin.text.z.p(filename, "buffer", false);
            case 2:
                Intrinsics.checkNotNullExpressionValue(filename, "name");
                return new Regex(t3.s1.d(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3, "^(%s|%s|%s)[0-9]+.json$", "java.lang.String.format(format, *args)")).e(filename);
            case 3:
                Intrinsics.checkNotNullExpressionValue(filename, "name");
                return new Regex(t3.s1.d(new Object[]{"anr_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).e(filename);
            case 4:
                Intrinsics.checkNotNullExpressionValue(filename, "name");
                return new Regex(t3.s1.d(new Object[]{"analysis_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).e(filename);
            case 5:
                Intrinsics.checkNotNullExpressionValue(filename, "name");
                return new Regex(t3.s1.d(new Object[]{"error_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).e(filename);
            case 6:
                HashMap hashMap = rw0.f.f110112b;
                return rw0.e.f110111b.matcher(filename).matches();
            case 7:
                Intrinsics.checkNotNullExpressionValue(filename, "name");
                return kotlin.text.z.p(filename, "emb_last_session", false);
            default:
                return true;
        }
    }
}
