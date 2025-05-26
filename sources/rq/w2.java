package rq;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w2 implements d71.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2 f109615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f109616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f109617c;

    public w2(x2 x2Var, boolean z13, String str) {
        this.f109615a = x2Var;
        this.f109616b = z13;
        this.f109617c = str;
    }

    @Override // d71.f
    public final void n() {
        x2 x2Var = this.f109615a;
        x2Var.f109650f = -1;
        if (this.f109616b) {
            x2.b(x2Var, null);
        }
    }

    @Override // d71.f
    public final void o(e71.a skinTone, int i13) {
        w01.z zVar;
        Intrinsics.checkNotNullParameter(skinTone, "skinTone");
        x2 x2Var = this.f109615a;
        lh0.a0 a0Var = x2Var.f109645a;
        if (a0Var != null) {
            a0Var.e();
        }
        x2Var.f109650f = i13;
        if (this.f109616b) {
            x2.b(x2Var, String.valueOf(skinTone.getId()));
            return;
        }
        String selectedFilterApiTerm = skinTone.getTerm();
        if (selectedFilterApiTerm == null || (zVar = x2Var.f109647c) == null) {
            return;
        }
        String query = this.f109617c;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(selectedFilterApiTerm, "selectedFilterApiTerm");
        Pair pair = kotlin.text.z.p(selectedFilterApiTerm, "hair_pattern_id:", false) ? new Pair(selectedFilterApiTerm, null) : new Pair(null, selectedFilterApiTerm);
        zVar.f127136a.d(c71.b0.c(new c71.b0(h61.h.PINS, query, query, null, null, null, null, null, null, "pin_closeup_search_filter", null, null, null, (String) pair.f80347b, (String) pair.f80346a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -787464, 2097151), false, 3));
    }
}
