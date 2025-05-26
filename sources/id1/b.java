package id1;

import i1.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import n90.i;
import xo0.o;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72140i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f72141j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g gVar, int i13) {
        super(0);
        this.f72140i = i13;
        this.f72141j = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f72140i;
        Object obj = null;
        g gVar = this.f72141j;
        switch (i13) {
            case 0:
                return new o(gVar.getPinalytics(), new pb0.g(), null, null, 60);
            case 1:
                if (gVar.isBound()) {
                    return (gd1.c) gVar.getView();
                }
                return null;
            case 2:
                gVar.getClass();
                d loggingData = new d(gVar);
                gVar.getPresenterPinalytics();
                gVar.getPinalytics();
                h hVar = gVar.f72153a;
                ze1.c navParams = new ze1.c((String) hVar.f72165d.get("source"), (String) hVar.f72165d.get("search_query"));
                d dVar = new d(gVar);
                b boundView = new b(gVar, 1);
                Intrinsics.checkNotNullParameter(navParams, "navParams");
                Intrinsics.checkNotNullParameter(boundView, "boundView");
                i bubbleFeedNavigator = new i(navParams, obj, dVar, boundView, 1);
                Intrinsics.checkNotNullParameter(loggingData, "loggingData");
                Intrinsics.checkNotNullParameter(bubbleFeedNavigator, "bubbleFeedNavigator");
                return new v0(loggingData, obj, null, bubbleFeedNavigator, 1);
            default:
                return new hd1.b(gVar.w3(), gVar.f72153a.f72169h, 12);
        }
    }
}
