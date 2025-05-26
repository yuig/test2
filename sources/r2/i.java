package r2;

import androidx.compose.foundation.lazy.layout.u0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import i2.u;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class i implements d {

    /* renamed from: d, reason: collision with root package name */
    public static final s f106048d;

    /* renamed from: a, reason: collision with root package name */
    public final Map f106049a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f106050b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public k f106051c;

    static {
        e eVar = e.f106042i;
        f fVar = f.f106043i;
        s sVar = t.f106065a;
        f106048d = new s(eVar, fVar);
    }

    public i(Map map) {
        this.f106049a = map;
    }

    @Override // r2.d
    public final void a(Object obj) {
        h hVar = (h) this.f106050b.get(obj);
        if (hVar != null) {
            hVar.f106046b = false;
        } else {
            this.f106049a.remove(obj);
        }
    }

    @Override // r2.d
    public final void e(Object obj, Function2 function2, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1198538093);
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(obj) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.j(function2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar.j(this) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.Z(obj);
            Object J2 = sVar.J();
            am.d dVar = i2.n.f71185a;
            if (J2 == dVar) {
                k kVar = this.f106051c;
                if (kVar != null && !kVar.b(obj)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                J2 = new h(this, obj);
                sVar.g0(J2);
            }
            h hVar = (h) J2;
            com.bumptech.glide.d.a(o.f106060a.c(hVar.f106047c), function2, sVar, (i14 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8);
            Unit unit = Unit.f80348a;
            boolean j13 = sVar.j(this) | sVar.j(obj) | sVar.j(hVar);
            Object J3 = sVar.J();
            if (j13 || J3 == dVar) {
                J3 = new e.f(this, obj, hVar, 10);
                sVar.g0(J3);
            }
            u.b(unit, (Function1) J3, sVar);
            if (sVar.f71288x && sVar.F.f71326i == sVar.f71289y) {
                sVar.f71289y = -1;
                sVar.f71288x = false;
            }
            sVar.r(false);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new u0(this, obj, function2, i13, 5);
        }
    }
}
