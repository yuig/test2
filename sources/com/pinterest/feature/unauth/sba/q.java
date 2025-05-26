package com.pinterest.feature.unauth.sba;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48858i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f48859j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(w wVar, int i13) {
        super(0);
        this.f48858i = i13;
        this.f48859j = wVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m119invoke() {
        int i13 = this.f48858i;
        w wVar = this.f48859j;
        switch (i13) {
            case 0:
                int i14 = w.I0;
                wVar.b9().f48869e.e().a(k.f48835a);
                break;
            default:
                int i15 = w.I0;
                wVar.b9().f48869e.e().a(l.f48837a);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f48858i;
        w wVar = this.f48859j;
        switch (i13) {
            case 0:
                m119invoke();
                return Unit.f80348a;
            case 1:
                m119invoke();
                return Unit.f80348a;
            case 2:
                Context requireContext = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                g gVar = new g(requireContext);
                gVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                Context context = gVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                new GestaltText(6, context, (AttributeSet) null).i(v.f48874j);
                return gVar;
            case 3:
                Context requireContext2 = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                h hVar = new h(requireContext2);
                hVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                hVar.setPaddingRelative(0, 0, 0, 16);
                return hVar;
            case 4:
                Context requireContext3 = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                TitleHeader titleHeader = new TitleHeader(requireContext3);
                titleHeader.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                titleHeader.setPaddingRelative(0, 6, 0, 6);
                return titleHeader;
            case 5:
                Context requireContext4 = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                d dVar = new d(requireContext4);
                dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                Context context2 = dVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                new GestaltText(6, context2, (AttributeSet) null).i(v.f48875k);
                return dVar;
            default:
                Context context3 = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context3, "context");
                a aVar = new a(context3);
                View.inflate(aVar.getContext(), vq1.c.header_text, aVar);
                View findViewById = aVar.findViewById(vq1.b.header);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return aVar;
        }
    }
}
