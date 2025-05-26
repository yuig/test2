package com.pinterest.feature.home.view;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.i0;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f45865i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f45866j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i13) {
        super(1);
        this.f45865i = i13;
        this.f45866j = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i0 j23;
        int i13 = this.f45865i;
        Object obj2 = this.f45866j;
        switch (i13) {
            case 0:
                ((l) obj2).q2((f30) obj);
                return Unit.f80348a;
            default:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String str = ((e) obj2).f45860o;
                if (str != null) {
                    j23 = bs1.c.h2(str);
                } else {
                    j23 = bs1.c.j2(new String[0], hz1.c.today_tab_idea_stream_module_view_all);
                }
                return yl1.b.f(it, j23, false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
