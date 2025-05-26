package y1;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f136573a = new h0();

    public final void a(@NotNull EditorInfo editorInfo, @NotNull i4.c cVar) {
        i4.c cVar2 = i4.c.f71503c;
        if (Intrinsics.d(cVar, i4.c.f71503c)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(cVar, 10));
        Iterator<E> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((i4.b) it.next()).f71502a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
