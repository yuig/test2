package wl2;

import im2.d0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import ym2.c;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f130214a;

    /* renamed from: b, reason: collision with root package name */
    public static final ym2.b f130215b;

    static {
        List j13 = f0.j(d0.f72701a, d0.f72708h, d0.f72709i, d0.f72703c, d0.f72704d, d0.f72706f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = j13.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ym2.b.j((c) it.next()));
        }
        f130214a = linkedHashSet;
        ym2.b j14 = ym2.b.j(d0.f72707g);
        Intrinsics.checkNotNullExpressionValue(j14, "topLevel(...)");
        f130215b = j14;
    }
}
