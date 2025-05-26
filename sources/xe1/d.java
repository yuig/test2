package xe1;

import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f134691a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f134692b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f134693c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f134694d;

    static {
        h hVar = h.BACKGROUND;
        h hVar2 = h.AVATAR_STACK;
        h hVar3 = h.TITLE;
        h hVar4 = h.BUTTON;
        f134691a = kotlin.collections.f0.j(hVar, hVar2, hVar3, hVar4);
        f134692b = kotlin.collections.f0.j(hVar, hVar3);
        f134693c = kotlin.collections.f0.j(hVar, hVar3, h.ICON);
        f134694d = kotlin.collections.f0.j(hVar, hVar4);
    }

    public static final f a(re1.e action, float f13, a aVar) {
        g gVar;
        int i13;
        g gVar2;
        Intrinsics.checkNotNullParameter(action, "action");
        z32.o style = action.f107574b;
        String buttonText = action.f107573a;
        if (buttonText != null) {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(style, "style");
            h hVar = h.BUTTON;
            Intrinsics.checkNotNullParameter(style, "<this>");
            int[] iArr = c.f134683b;
            int i14 = iArr[style.ordinal()] == 3 ? v.f134792g : v.f134794i;
            int i15 = v.f134803r;
            lm1.b bVar = v.f134782a;
            Intrinsics.checkNotNullParameter(style, "<this>");
            gVar = new g(hVar, buttonText, i14, i15, bVar, iArr[style.ordinal()] == 3 ? v.f134791f : v.f134795j);
        } else {
            gVar = null;
        }
        if (style == z32.o.AVATAR_STACK_CARD) {
            buttonText = action.f107578f;
        }
        String str = buttonText;
        Integer valueOf = Integer.valueOf(aVar.f134669e);
        int i16 = v.f134793h;
        if (valueOf.intValue() == i16) {
            i13 = v.f134794i;
        } else {
            i13 = valueOf.intValue() == v.f134788d ? v.f134790e : v.f134799n;
        }
        if (str != null) {
            h hVar2 = h.TITLE;
            int i17 = v.f134800o;
            lm1.b FONT_BOLD = te0.i.f117497d;
            Intrinsics.checkNotNullExpressionValue(FONT_BOLD, "FONT_BOLD");
            gVar2 = new g(hVar2, str, i13, i17, FONT_BOLD, i16);
        } else {
            gVar2 = null;
        }
        e eVar = new e(f13, style, action.f107575c, action.f107576d, action.f107577e);
        int i18 = c.f134683b[action.f107574b.ordinal()];
        if (i18 != 1) {
            if (i18 == 2) {
                if (gVar2 != null) {
                    return new d0(eVar, gVar2, aVar);
                }
                return null;
            }
            if (i18 == 3) {
                if (gVar2 == null || gVar == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = action.f107579g;
                if (hashMap != null) {
                    Iterator it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        String str2 = (String) ((HashMap) ((Map.Entry) it.next()).getValue()).get("75");
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                }
                return new i(eVar, new j(arrayList), gVar2, gVar, aVar);
            }
            if (i18 == 4) {
                if (action.f107575c == z32.l.HEADER_AND_END_OVERFLOW) {
                    return new l(eVar, gVar, aVar);
                }
                return new m(eVar, gVar2, new b(i13 != v.f134794i ? rm1.c.LIGHT : GestaltIcon.f49405g));
            }
            if (i18 != 5) {
                return null;
            }
        }
        return new l(eVar, gVar, aVar);
    }
}
