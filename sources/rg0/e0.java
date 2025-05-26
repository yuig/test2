package rg0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: g, reason: collision with root package name */
    public static final List f107990g = Collections.unmodifiableList(Arrays.asList(i32.f.NUX_INTEREST_SELECTOR));

    /* renamed from: h, reason: collision with root package name */
    public static final List f107991h = Collections.unmodifiableList(Arrays.asList(i32.f.NUX_END_SCREEN, i32.f.NUX_REVAMP_END_SCREEN));

    /* renamed from: a, reason: collision with root package name */
    public final int f107992a;

    /* renamed from: b, reason: collision with root package name */
    public final String f107993b;

    /* renamed from: c, reason: collision with root package name */
    public final String f107994c;

    /* renamed from: d, reason: collision with root package name */
    public final int f107995d;

    /* renamed from: e, reason: collision with root package name */
    public final String f107996e;

    /* renamed from: f, reason: collision with root package name */
    public final String f107997f;

    public e0(vd0.c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f107992a = json.j(0, "id");
        String o13 = json.o("title_text", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        this.f107993b = o13;
        String o14 = json.o("detailed_text", "");
        Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
        this.f107994c = o14;
        this.f107995d = json.j(0, "num_interests");
        Intrinsics.checkNotNullExpressionValue(json.o("continue_button_text", ""), "optString(...)");
        Boolean h10 = json.h("redo_homefeed", Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
        h10.getClass();
        String o15 = json.o("secondary_title_text", "");
        Intrinsics.checkNotNullExpressionValue(o15, "optString(...)");
        this.f107996e = o15;
        String o16 = json.o("secondary_detailed_text", "");
        Intrinsics.checkNotNullExpressionValue(o16, "optString(...)");
        this.f107997f = o16;
    }

    public final boolean a() {
        return this.f107992a == i32.f.NUX_PIN_PICKER_STEP.getValue();
    }

    public final int b() {
        return this.f107992a;
    }

    public final boolean c() {
        List POSSIBLE_END_SCREENS = f107991h;
        Intrinsics.checkNotNullExpressionValue(POSSIBLE_END_SCREENS, "POSSIBLE_END_SCREENS");
        return d(POSSIBLE_END_SCREENS);
    }

    public final boolean d(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (this.f107992a == ((i32.f) it.next()).getValue()) {
                return true;
            }
        }
        return false;
    }
}
