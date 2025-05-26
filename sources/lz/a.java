package lz;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.h;
import cz.j;
import cz.n;
import h32.g0;
import java.util.Map;
import jz.c;
import jz.d;
import jz.e;
import jz.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f85172a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f85173b;

    static {
        String type = j.INLINE.getType();
        g0 g0Var = g0.ANKET_INLINE_SURVEY;
        Pair pair = new Pair(type, g0Var);
        String type2 = j.MODAL.getType();
        g0 g0Var2 = g0.ANKET_MODAL_SURVEY;
        f85172a = z0.g(pair, new Pair(type2, g0Var2));
        f85173b = z0.g(new Pair(g0Var, n.INLINE), new Pair(g0Var2, n.MODAL));
    }

    public static final ScreenLocation a(f page) {
        Intrinsics.checkNotNullParameter(page, "page");
        if (!(page instanceof d)) {
            if (page instanceof e) {
                return (ScreenLocation) h.f50866g.getValue();
            }
            if (page instanceof c) {
                return (ScreenLocation) h.f50861b.getValue();
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = ((d) page).f77740b;
        if (Intrinsics.d(str, cz.f.EMOJI.getType())) {
            return (ScreenLocation) h.f50860a.getValue();
        }
        if (Intrinsics.d(str, cz.f.SCALE.getType())) {
            return (ScreenLocation) h.f50864e.getValue();
        }
        if (Intrinsics.d(str, cz.f.LIKE.getType())) {
            return (ScreenLocation) h.f50862c.getValue();
        }
        if (Intrinsics.d(str, cz.f.SINGLE.getType())) {
            return (ScreenLocation) h.f50865f.getValue();
        }
        if (Intrinsics.d(str, cz.f.MULTIPLE.getType())) {
            return (ScreenLocation) h.f50863d.getValue();
        }
        if (Intrinsics.d(str, cz.f.TEXT.getType())) {
            return (ScreenLocation) h.f50867h.getValue();
        }
        if (Intrinsics.d(str, cz.f.VERTICAL_SCALE.getType())) {
            return (ScreenLocation) h.f50868i.getValue();
        }
        return null;
    }

    public static final g0 b(String str) {
        return (g0) f85172a.getOrDefault(str, g0.ANKET_MODAL_SURVEY);
    }
}
