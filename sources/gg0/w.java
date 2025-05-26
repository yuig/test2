package gg0;

import android.content.Context;
import com.pinterest.education.view.EducationNewContainerView;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64964i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hh0.e f64965j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ rg0.n f64966k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EducationNewContainerView f64967l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(hh0.e eVar, rg0.n nVar, EducationNewContainerView educationNewContainerView, int i13) {
        super(1);
        this.f64964i = i13;
        this.f64965j = eVar;
        this.f64966k = nVar;
        this.f64967l = educationNewContainerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        int i13 = this.f64964i;
        rg0.n nVar = this.f64966k;
        EducationNewContainerView educationNewContainerView = this.f64967l;
        hh0.e eVar = this.f64965j;
        switch (i13) {
            case 0:
                wl1.o it = (wl1.o) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                gh0.a aVar = ((fh0.f) eVar.f69143e).f62162e;
                if (aVar != null && (str = aVar.f64995b) != null) {
                    Context context = educationNewContainerView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.h hVar = tb0.g.f117075a;
                    Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
                    f0.h.P(context, str, hVar);
                }
                nVar.a(null, null);
                HashSet hashSet2 = EducationNewContainerView.A;
                educationNewContainerView.m();
                break;
            default:
                wl1.p it2 = (wl1.p) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                gh0.a aVar2 = ((fh0.f) eVar.f69143e).f62163f;
                if (aVar2 != null && (str2 = aVar2.f64995b) != null) {
                    Context context2 = educationNewContainerView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    HashSet hashSet3 = tb0.h.f117076w;
                    tb0.h hVar2 = tb0.g.f117075a;
                    Intrinsics.checkNotNullExpressionValue(hVar2, "getInstance(...)");
                    f0.h.P(context2, str2, hVar2);
                }
                nVar.c(null, null);
                HashSet hashSet4 = EducationNewContainerView.A;
                educationNewContainerView.m();
                break;
        }
        return Unit.f80348a;
    }
}
