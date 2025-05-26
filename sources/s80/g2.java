package s80;

import com.pinterest.api.model.go;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final w80.x1 f111543a = new w80.x1(null, null, null, null, null, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final w80.b f111544b = new w80.b();

    /* renamed from: c, reason: collision with root package name */
    public static final h f111545c = new h(false, false);

    /* renamed from: d, reason: collision with root package name */
    public static final t6 f111546d = new t6(ra0.h0.f106944p, false);

    /* renamed from: e, reason: collision with root package name */
    public static final v6 f111547e;

    /* renamed from: f, reason: collision with root package name */
    public static final w80.d1 f111548f;

    /* renamed from: g, reason: collision with root package name */
    public static final z6 f111549g;

    /* renamed from: h, reason: collision with root package name */
    public static final w6 f111550h;

    /* renamed from: i, reason: collision with root package name */
    public static final f7 f111551i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f111552j;

    /* renamed from: k, reason: collision with root package name */
    public static final i f111553k;

    /* renamed from: l, reason: collision with root package name */
    public static final LinkedHashMap f111554l;

    static {
        b3.w wVar = (b3.w) CollectionsKt.firstOrNull(ra0.h0.f106943o);
        f111547e = new v6(kotlin.jvm.internal.r.s0(wVar != null ? wVar.f21392a : b3.w.f21387k), go.MARKER, false);
        f111548f = new w80.d1(null);
        f111549g = new z6(b7.None, new y6(null, null, null, null, null, 511), false);
        t80.d dVar = new t80.d();
        int i13 = l7.empty_state_carousel_dismissal_button_label;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        f111550h = new w6(dVar, new u50.k0(i13, new ArrayList(0)), false);
        f111551i = f7.f111538c;
        f111552j = kotlin.jvm.internal.r.s0(b3.w.f21382f);
        f111553k = new i(0.0f, 0.0f, false);
        List j13 = kotlin.collections.f0.j(new p62.a(h62.n.composer_action_menu_delete, l7.composer_action_delete, h7.ic_composer_action_delete), new p62.a(h62.n.composer_action_menu_duplicate, l7.composer_action_duplicate, h7.ic_composer_action_duplicate));
        int a13 = kotlin.collections.y0.a(kotlin.collections.g0.q(j13, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (Object obj : j13) {
            linkedHashMap.put(Integer.valueOf(((p62.a) obj).f98924a), obj);
        }
        f111554l = linkedHashMap;
    }
}
