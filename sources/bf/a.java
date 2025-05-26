package bf;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22738a;

    public /* synthetic */ a(int i13) {
        this.f22738a = i13;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File pathname) {
        switch (this.f22738a) {
            case 0:
                String name = pathname.getName();
                if (!name.startsWith("cpu")) {
                    return false;
                }
                for (int i13 = 3; i13 < name.length(); i13++) {
                    if (!Character.isDigit(name.charAt(i13))) {
                        return false;
                    }
                }
                return true;
            default:
                Intrinsics.checkNotNullParameter(pathname, "pathname");
                return Pattern.matches("cpu[0-9]", pathname.getName());
        }
    }
}
