package is1;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g1;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final lb0.q f73588a;

    public g(lb0.q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f73588a = prefsManagerPersisted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Set] */
    public final void a() {
        Date date = new Date();
        String valueOf = String.valueOf(date.getTime());
        s0 s0Var = s0.f80394a;
        lb0.q qVar = this.f73588a;
        ?? h10 = qVar.h("CLOSEUP_SESSION_KEY", s0Var);
        if (h10 != 0) {
            s0Var = h10;
        }
        int i13 = 0;
        if (s0Var.isEmpty()) {
            qVar.j("CLOSEUP_SESSION_KEY", g1.b(valueOf));
            qVar.k("VISUAL_SEARCH_CTA_IN_COOLDOWN_KEY", false);
            return;
        }
        s0 s0Var2 = s0Var;
        String str = (String) CollectionsKt.c0(s0Var2);
        Date date2 = new Date(str != null ? Long.parseLong(str) : 0L);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        if (calendar.get(6) != calendar2.get(6) || calendar.get(1) != calendar2.get(1)) {
            qVar.j("CLOSEUP_SESSION_KEY", g1.b(valueOf));
            qVar.k("VISUAL_SEARCH_CTA_IN_COOLDOWN_KEY", false);
            return;
        }
        if (s0Var.size() + 1 <= 2) {
            LinkedHashSet I0 = CollectionsKt.I0(s0Var2);
            I0.add(valueOf);
            qVar.j("CLOSEUP_SESSION_KEY", I0);
            qVar.k("VISUAL_SEARCH_CTA_IN_COOLDOWN_KEY", false);
            return;
        }
        int size = s0Var.size() - 1;
        HashSet hashSet = new HashSet();
        for (Object obj : s0Var2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            String str2 = (String) obj;
            if (i13 == size) {
                str2 = valueOf;
            }
            hashSet.add(str2);
            i13 = i14;
        }
        qVar.j("CLOSEUP_SESSION_KEY", hashSet);
        qVar.k("VISUAL_SEARCH_CTA_IN_COOLDOWN_KEY", true);
    }
}
