package com.pinterest.gestalt.headerBar;

import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import ek.e;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Map f49384i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTabLayout f49385j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Map map, GestaltTabLayout gestaltTabLayout) {
        super(1);
        this.f49384i = map;
        this.f49385j = gestaltTabLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        e eVar = (e) this.f49384i.get(Integer.valueOf(intValue));
        if (eVar == null) {
            throw new GestaltHeaderBar.GestaltHeaderBarException(a.a.e("Tab index ", intValue, " out-of-bounds."));
        }
        this.f49385j.u(eVar, true);
        return Unit.f80348a;
    }
}
