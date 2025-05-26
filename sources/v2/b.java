package v2;

import android.view.ViewStructure;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f123848a = new b();

    public final int a(@NotNull ViewStructure viewStructure, int i13) {
        return viewStructure.addChildCount(i13);
    }

    public final ViewStructure b(@NotNull ViewStructure viewStructure, int i13) {
        return viewStructure.newChild(i13);
    }

    public final void c(@NotNull ViewStructure viewStructure, int i13, int i14, int i15, int i16, int i17, int i18) {
        viewStructure.setDimens(i13, i14, i15, i16, i17, i18);
    }

    public final void d(@NotNull ViewStructure viewStructure, int i13, String str, String str2, String str3) {
        viewStructure.setId(i13, str, str2, str3);
    }
}
