package com.pinterest.feature.search.results.view;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47806i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SearchMoreIdeasView f47807j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f47808k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(SearchMoreIdeasView searchMoreIdeasView, String str, int i13) {
        super(1);
        this.f47806i = i13;
        this.f47807j = searchMoreIdeasView;
        this.f47808k = str;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f47806i;
        String str = this.f47808k;
        SearchMoreIdeasView searchMoreIdeasView = this.f47807j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = searchMoreIdeasView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String string = searchMoreIdeasView.getResources().getString(l42.e.search_your_pins_empty_pin_results, str);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(SearchMoreIdeasView.a(context, str, string)), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context2 = searchMoreIdeasView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                String string2 = searchMoreIdeasView.getResources().getString(l42.e.search_your_pins_feed_end_message, str);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(SearchMoreIdeasView.a(context2, str, string2)), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f47806i) {
        }
        return b((rn1.a) obj);
    }
}
