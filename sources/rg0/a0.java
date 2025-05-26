package rg0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final String f107956c;

    /* renamed from: d, reason: collision with root package name */
    public final String f107957d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f107958e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(vd0.c json) {
        super(null, null);
        Intrinsics.checkNotNullParameter(json, "json");
        this.f107958e = new ArrayList();
        this.f15163a = json.o("title", "");
        String o13 = json.o("subtitle", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        this.f107956c = o13;
        vd0.a k13 = json.k("images");
        Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = k13.iterator();
        while (it.hasNext()) {
            vd0.c m13 = ((vd0.c) it.next()).m("170x");
            String o14 = m13 != null ? m13.o("url", "") : null;
            if (o14 != null) {
                arrayList.add(o14);
            }
        }
        this.f107958e = arrayList;
        String o15 = json.o("button_text", "");
        Intrinsics.checkNotNullExpressionValue(o15, "optString(...)");
        this.f107957d = o15;
    }
}
