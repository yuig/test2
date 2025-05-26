package r01;

import com.pinterest.api.model.f30;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.o;
import lh0.z3;
import m60.f0;
import tb0.p;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f105691a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f105692b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f105693c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f105694d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f105695e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f105696f;

    /* renamed from: g, reason: collision with root package name */
    public final int f105697g;

    public a(o experimentHelper, f0 devUtils) {
        Intrinsics.checkNotNullParameter(experimentHelper, "experimentHelper");
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        this.f105691a = devUtils;
        String e13 = experimentHelper.e("android_closeup_rabbit_hole_dedup", z3.ACTIVATE_EXPERIMENT);
        boolean z13 = false;
        if (e13 != null && z.p(e13, "enabled", false)) {
            z13 = true;
        }
        this.f105692b = z13;
        this.f105693c = new LinkedList();
        this.f105694d = new LinkedHashSet();
        this.f105695e = new LinkedList();
        this.f105696f = new LinkedHashSet();
        this.f105697g = experimentHelper.j("android_closeup_rabbit_hole_dedup", "count", 9, z3.DO_NOT_ACTIVATE_EXPERIMENT);
    }

    public final void a(int i13, List items) {
        int i14;
        int max;
        int min;
        String A5;
        Intrinsics.checkNotNullParameter(items, "items");
        if (!this.f105692b || i13 - 2 < 0 || (max = Math.max(0, i13 - 6)) > (min = Math.min(items.size() - 1, i14))) {
            return;
        }
        while (true) {
            Object obj = items.get(max);
            f30 f30Var = obj instanceof f30 ? (f30) obj : null;
            if (f30Var != null && (A5 = f30Var.A5()) != null && !z.j(A5)) {
                String A52 = f30Var.A5();
                Intrinsics.f(A52);
                LinkedHashSet linkedHashSet = this.f105696f;
                boolean contains = linkedHashSet.contains(A52);
                LinkedList linkedList = this.f105695e;
                if (contains) {
                    linkedList.removeLastOccurrence(A52);
                } else {
                    linkedHashSet.add(A52);
                }
                linkedList.addLast(A52);
                int size = linkedList.size();
                int i15 = this.f105697g;
                if (size > i15) {
                    String str = (String) linkedList.pollFirst();
                    Intrinsics.f(str);
                    linkedHashSet.remove(str);
                }
                boolean z13 = linkedList.size() <= i15;
                p pVar = p.RELATED_PINS;
                f0 f0Var = this.f105691a;
                f0Var.R(z13, "impressionNearDupSigs size is too big", pVar, new Object[0]);
                f0Var.R(linkedList.size() == linkedHashSet.size(), "We expect the two lists to match", pVar, new Object[0]);
            }
            if (max == min) {
                return;
            } else {
                max++;
            }
        }
    }

    public final void b(f30 f30Var) {
        String A5;
        if (this.f105692b) {
            String A52 = f30Var != null ? f30Var.A5() : null;
            if (A52 == null || z.j(A52) || f30Var == null || (A5 = f30Var.A5()) == null || z.j(A5)) {
                return;
            }
            LinkedHashSet linkedHashSet = this.f105694d;
            boolean contains = linkedHashSet.contains(A52);
            LinkedList linkedList = this.f105693c;
            if (contains) {
                linkedList.remove(A52);
            } else if (linkedList.size() > 0 && linkedList.size() == 5) {
                String str = (String) linkedList.pollFirst();
                Intrinsics.f(str);
                linkedHashSet.remove(str);
            }
            linkedList.addLast(A52);
            linkedHashSet.add(A52);
            boolean z13 = linkedList.size() <= 5;
            p pVar = p.RELATED_PINS;
            f0 f0Var = this.f105691a;
            f0Var.R(z13, "impressionNearDupSigs size is too big", pVar, new Object[0]);
            f0Var.R(linkedList.size() == linkedHashSet.size(), "We expect the two lists to match", pVar, new Object[0]);
        }
    }
}
