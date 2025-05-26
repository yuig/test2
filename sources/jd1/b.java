package jd1;

import android.content.Context;
import android.view.ViewGroup;
import com.pinterest.feature.following.carousel.view.ImpressionableUserRep;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import we1.p;
import wg1.r;
import xi0.i;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75504i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f75505j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(0);
        this.f75504i = i13;
        this.f75505j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f75504i;
        d dVar = this.f75505j;
        switch (i13) {
            case 0:
                e i93 = dVar.i9();
                return i93.f75510a.a((a11.e) dVar.N0.getValue());
            case 1:
                return dVar.i9().f75516g;
            case 2:
                e i94 = dVar.i9();
                return i94.f75511b.a(dVar.s7());
            case 3:
                return dVar.i9().f75512c;
            case 4:
                return dVar.i9().f75513d;
            case 5:
                return dVar.i9().f75514e;
            case 6:
                return Boolean.valueOf(dVar.f76941e);
            case 7:
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new r(requireContext, dVar.p9(), new b(dVar, 6));
            case 8:
                Context requireContext2 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new je1.a(requireContext2);
            case 9:
                Context requireContext3 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new i(requireContext3);
            case 10:
                Context requireContext4 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                ImpressionableUserRep impressionableUserRep = new ImpressionableUserRep(requireContext4);
                ze0.a w93 = dVar.w9();
                impressionableUserRep.y1(w93);
                if (w93 == ze0.a.Compact) {
                    impressionableUserRep.r1();
                }
                impressionableUserRep.b1(eo1.b.color_themed_background_dark_opacity_200);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                impressionableUserRep.setPaddingRelative(0, 0, 0, impressionableUserRep.getResources().getDimensionPixelSize(eo1.c.space_200));
                impressionableUserRep.setLayoutParams(layoutParams);
                return impressionableUserRep;
            case 11:
                Context requireContext5 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                return new p(requireContext5);
            default:
                return dVar.i9().f75515f;
        }
    }
}
